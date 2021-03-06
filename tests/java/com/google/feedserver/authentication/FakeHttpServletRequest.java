/*
 * Copyright 2009 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.feedserver.authentication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletInputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * An implementation of {@link HttpServletRequest} for testing purposes
 * 
 * @author rakeshs101981@gmail.com (Rakesh Shete)
 * 
 */
public class FakeHttpServletRequest implements HttpServletRequest {

  private HashMap<String, String> parameterMap = new HashMap<String, String>();
  private HashMap<String, String> headers = new HashMap<String, String>();
  private String httpMethod;
  private String requestURI;
  public static final String POST_METHOD = "POST";
  public static final String GET_METHOD = "GET";


  @Override
  public String getAuthType() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getContextPath() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Cookie[] getCookies() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public long getDateHeader(String arg0) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getHeader(String arg0) {
    // TODO Auto-generated method stub
    return headers.get(arg0);
  }

  @Override
  public Enumeration getHeaderNames() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Enumeration getHeaders(String arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getIntHeader(String arg0) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getMethod() {
    return httpMethod;
  }

  public void setMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }

  @Override
  public String getPathInfo() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getPathTranslated() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getQueryString() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getRemoteUser() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getRequestURI() {
    return requestURI;
  }

  public void setRequestURI(String requestURI) {
    this.requestURI = requestURI;
  }

  @Override
  public StringBuffer getRequestURL() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getRequestedSessionId() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getServletPath() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public HttpSession getSession() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public HttpSession getSession(boolean arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Principal getUserPrincipal() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean isRequestedSessionIdFromCookie() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isRequestedSessionIdFromURL() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isRequestedSessionIdFromUrl() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isRequestedSessionIdValid() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean isUserInRole(String arg0) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Object getAttribute(String arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Enumeration getAttributeNames() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getCharacterEncoding() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getContentLength() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public String getContentType() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public ServletInputStream getInputStream() throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getLocalAddr() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getLocalName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getLocalPort() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public Locale getLocale() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Enumeration getLocales() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getParameter(String arg0) {
    // TODO Auto-generated method stub
    return parameterMap.get(arg0);
  }

  @Override
  public Map getParameterMap() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Enumeration getParameterNames() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String[] getParameterValues(String arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getProtocol() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public BufferedReader getReader() throws IOException {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getRealPath(String arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getRemoteAddr() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getRemoteHost() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getRemotePort() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public RequestDispatcher getRequestDispatcher(String arg0) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getScheme() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getServerName() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public int getServerPort() {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean isSecure() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void removeAttribute(String arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void setAttribute(String arg0, Object arg1) {
    // TODO Auto-generated method stub

  }

  @Override
  public void setCharacterEncoding(String arg0) throws UnsupportedEncodingException {
    // TODO Auto-generated method stub

  }

  /**
   * Adds a request parameter to the parameter map
   * 
   * @param paramName The parameter name
   * @param paramValue The parameter value
   */
  public void addRequestParameter(String paramName, String paramValue) {
    parameterMap.put(paramName, paramValue);
  }

  /**
   * Adds a request header to the header map
   * 
   * @param headerName The header name
   * @param headerValue The header value
   */
  public void setHeader(String headerName, String headerValue) {
    headers.put(headerName, headerValue);
  }

}
