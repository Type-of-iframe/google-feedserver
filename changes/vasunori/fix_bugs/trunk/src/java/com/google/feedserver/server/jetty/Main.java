/**
 * Copyright 2007 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.feedserver.server.jetty;

import com.google.feedserver.server.FeedServerProviderManager;
import com.google.feedserver.server.FeedServerServiceContext;
import com.google.feedserver.servlet.MethodOverrideServletFilter;
import com.google.xdp.XdServletFilter;

import org.apache.abdera.protocol.server.servlet.AbderaServlet;
import org.apache.abdera.protocol.server.util.ServerConstants;
import org.mortbay.jetty.Handler;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.jetty.servlet.ServletHolder;

/**
 * Google FeedServer server using Jetty
 * @author jyang825@gmail.com (Jun Yang)
 */
public class Main {
  public static final int DEFAULT_PORT = 8080;
  public static final String OPTION_PORT = "--port";

  public static void main(String[] args) throws Exception {
    // get port number
    int port = DEFAULT_PORT;
    if (args.length == 2 && OPTION_PORT.equals(args[0])) {
      port = Integer.parseInt(args[1]);
    }

    // set up server
    Server server = new Server(port);
    Context context = new Context(server, "/", Context.SESSIONS);
    ServletHolder servletHolder = new ServletHolder(new AbderaServlet());
    servletHolder.setInitParameter(ServerConstants.SERVICE_CONTEXT,
        FeedServerServiceContext.class.getName());
    servletHolder.setInitParameter(ServerConstants.PROVIDER_MANAGER,
        FeedServerProviderManager.class.getName());
    context.addServlet(servletHolder, "/*");
    context.addFilter(MethodOverrideServletFilter.class, "/*",
        Handler.DEFAULT);
    context.addFilter(XdServletFilter.class, "/*", Handler.DEFAULT);

    // start server
    server.start();
    server.join();
  }
}