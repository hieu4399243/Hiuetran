package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Food_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_end_begin;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_forEach_var_end_begin.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\" />\n");
      out.write("        <meta\n");
      out.write("            name=\"viewport\"\n");
      out.write("            content=\"width=device-width, initial-scale=1, shrink-to-fit=no\"\n");
      out.write("            />\n");
      out.write("        <meta name=\"description\" content=\"\" />\n");
      out.write("        <meta name=\"author\" content=\"\" />\n");
      out.write("        <title>Gọi và đặt món - Du Lịch  </title>\n");
      out.write("\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"icon\" href=\"./img/brand/icon/favicon.png\" sizes=\"32x32\">\n");
      out.write("        <link rel=\"icon\" href=\"./img/brand/icon/favicon.png\" sizes=\"192x192\">\n");
      out.write("        <link href=\"css/resetcss.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/food.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/responsive.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/base.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/swiper-bundle.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/grid.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\" integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\" crossorigin=\"anonymous\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <main class=\"main\">\n");
      out.write("            <header class=\"header\">\n");
      out.write("                <div class=\"header-container-unfixed hide-on-mobile-tablet\">\n");
      out.write("                    <nav class=\"header-unfixed\">\n");
      out.write("                        <a href=\"\" class=\"header-unfixed__logo\">\n");
      out.write("                            <svg class=\"header-unfixed__logo-img\" xmlns=\"http://www.w3.org/2000/svg\" width=\"360.924\" height=\"377.662\" viewBox=\"0 0 360.924 377.662\">\n");
      out.write("                            <g id=\"Group_1\" data-name=\"Group 1\" transform=\"translate(-780 -352)\">\n");
      out.write("                            <path id=\"Path_1\" data-name=\"Path 1\" d=\"M430.02,451.951a17.843,17.843,0,0,0-12.232-4.277,19.964,19.964,0,0,0-8.957,1.936,6.417,6.417,0,0,0-3.918,6.139,5.257,5.257,0,0,0,1.874,4.339,6.65,6.65,0,0,0,4.327,1.515,6.9,6.9,0,0,0,4.624-1.635,5.158,5.158,0,0,0,1.931-4.094,6.355,6.355,0,0,0-.877-3.1,5.242,5.242,0,0,0-2.4-2.284c.388-.706,1.561-1.053,3.508-1.053a14.206,14.206,0,0,1,9.544,3.456,10.614,10.614,0,0,1,4.037,8.365,9.152,9.152,0,0,1-2.226,5.968q-2.221,2.7-7.841,5.267a82.335,82.335,0,0,1-8.542,3.286q-4.689,1.512-11.708,3.508l-8.314,2.46q-8.071,2.81-12.117,6.964a13.981,13.981,0,0,0-4.038,10.125q0,6.79,4.391,10.244a15.933,15.933,0,0,0,10.13,3.457,17.824,17.824,0,0,0,9.6-2.694,8.311,8.311,0,0,0,4.334-7.38,6.328,6.328,0,0,0-1.7-4.567,6,6,0,0,0-4.51-1.754,6.639,6.639,0,0,0-4.624,1.64,5.705,5.705,0,0,0-1.817,4.448,5.083,5.083,0,0,0,1.64,4.094A8.455,8.455,0,0,0,398,508.194c-.233.781-1.127,1.413-2.688,1.88a15.216,15.216,0,0,1-4.327.7,12.027,12.027,0,0,1-7.323-2.58,8.063,8.063,0,0,1-3.451-6.782A7.612,7.612,0,0,1,382.9,495.5a24.57,24.57,0,0,1,7.613-4.271q4.33-1.64,13.462-4.453,6.909,2.7,9.367,7.494a20.661,20.661,0,0,1,2.454,9.481,16.861,16.861,0,0,1-4.151,11.3,26.7,26.7,0,0,1-11.241,7.494,43.884,43.884,0,0,1-15.4,2.631,41.17,41.17,0,0,1-16.036-2.984,25.523,25.523,0,0,1-11.241-8.718,22.109,22.109,0,0,1-4-11.19c-.063-.78-.1-1.577-.1-2.392q0-14.631,15.221-19.2c1.794.786,3.354,1.406,4.681,1.873a11.481,11.481,0,0,0,3.866.712,4.269,4.269,0,0,0,2.4-.592,1.853,1.853,0,0,0,.877-1.64,2.195,2.195,0,0,0-1.293-1.993,7.053,7.053,0,0,0-3.388-.7,43.69,43.69,0,0,0-7.26.7,17.462,17.462,0,0,1-5.968-13.337q0-6.56,3.747-10.244a13.4,13.4,0,0,1,9.828-3.69,13.975,13.975,0,0,1,5.917,1.116,5.37,5.37,0,0,1,2.984,2.625,6.805,6.805,0,0,0-4.453,2.056,6.083,6.083,0,0,0-1.754,4.39,5.366,5.366,0,0,0,1.816,4.266,6.283,6.283,0,0,0,4.277,1.588,6.8,6.8,0,0,0,4.561-1.7,5.631,5.631,0,0,0,1.993-4.51,9.137,9.137,0,0,0-1.116-4.152,12.738,12.738,0,0,0-3.217-3.923q-4.339-3.51-12.175-3.508a25.685,25.685,0,0,0-10.711,2.05,15.961,15.961,0,0,0-6.788,5.381,12.472,12.472,0,0,0-2.289,7.2,14.1,14.1,0,0,0,3.046,8.542,20.827,20.827,0,0,0,8.781,6.56,37.833,37.833,0,0,0-9.128,3.8,27.048,27.048,0,0,0-8.724,8.074,21.874,21.874,0,0,0-3.8,13.058,24.326,24.326,0,0,0,5.148,15.392A32.911,32.911,0,0,0,364.58,530.26a49.322,49.322,0,0,0,18.911,3.571,42.945,42.945,0,0,0,18.957-3.918,30.72,30.72,0,0,0,12.413-10.358,24.114,24.114,0,0,0,4.328-13.7,22.837,22.837,0,0,0-3.1-11.879,19.939,19.939,0,0,0-9.657-8.017q12.872-3.981,17.322-6.088a21.465,21.465,0,0,0,8.08-6.617,16.1,16.1,0,0,0,3.041-9.777Q434.877,456.225,430.02,451.951Z\" transform=\"translate(592.898 157.092)\" fill=\"#fff\"></path>\n");
      out.write("                            <path id=\"Path_2\" data-name=\"Path 2\" d=\"M526.194,390.13c-11.139-13.6-25.383-23.437-47.512-29.849-.553-.143-2.178-.55-3.628-.9-2.739-.649-3.316-.825-6.215-1.389-4.458-1.054-9.133-1.976-14.059-2.773l-.2-.017v-.536q38.257-11.607,55.953-33.893a78.969,78.969,0,0,0,17.676-50.39q0-34.4-26.394-55.23c-17.618-13.883-42.161-20.244-75.1-20.244-7.756,0-2.505.057-8.61,0l-65.417.376L231.524,427.343c-15.745,24.276-24.412,41.7-44.422,41.7v9.589c9.584-.962,23.33-.325,37.709-.325,16.365,0,31.23.052,47.041.052,7.822,0,10.615,5.244,13.792,9.6,15.694,21.531,29.554,57.588,72.781,74.085v.017c15.568,6.9,43.978,12,64.671,10.113,36.575-3.325,54.769-11,71.488-19.987s30.983-26.36,39.975-42.492q13.461-24.182,13.467-55.526Q548.026,416.792,526.194,390.13ZM391.15,245.19q0-17.433,2.9-26.16t10.421-12.124q7.508-3.374,22.532-3.388c23.889,0,31.132,7.323,39.366,17.79,9.9,12.59,15.335,30.169,15.335,54.4q0,35.857-15.745,57.406c-10.495,14.372-15.882,21.547-42.349,21.547h-2.4v-.005H391.15Zm-36.438-19.2V354.66H285.758Zm55.742,330.487c-.654,0-1.412.006-2.243.012-90.6-4.186-81.225-83.161-75.656-88.731-7.289.023-44.678.188-66.722.188-5.726,0-7.952-2.4-11.526-5.207-6.443-5.07-7.767-11.91-7.767-21.813,0-12.755,5.057-21.992,13.286-37.873l21.485-40.089h73.4v80.143c15.881-6.042,22.584-6.212,36.438-4.664V363.463h29.258q43.2,0,62.941,22.544t19.748,65.97C503.1,516.114,468.361,556.481,410.454,556.481Z\" transform=\"translate(592.898 157.092)\" fill=\"#fff\"></path>\n");
      out.write("                            </g>\n");
      out.write("                            </svg>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"header-unfixed__list\">\n");
      out.write("                            <li class=\"header-unfixed__list-item\">\n");
      out.write("                                <a href=\"Home.jsp\" class=\"header-unfixed__item-link\">Trang chủ</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-unfixed__list-item\">\n");
      out.write("                                <a href=\"Tours.jsp\" class=\"header-unfixed__item-link\">Tours</a>\n");
      out.write("                            </li>   \n");
      out.write("                            <li class=\"header-unfixed__list-item\">\n");
      out.write("                                <a href=\"Food.jsp\" class=\"header-unfixed__item-link\">Ăn uống</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-unfixed__list-item\">\n");
      out.write("                                <a href=\"Home.jsp\" class=\"header-unfixed__item-link\">About us</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"header-unfixed__list-item\">\n");
      out.write("                                <a href=\"Home.jsp\" class=\"header-unfixed__item-link\">Contact Us</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"header-unfixed__search\">\n");
      out.write("                            <li class=\"header-unfixed__search-item\">\n");
      out.write("                                <a href=\"\" class=\"header-unfixed__search-item-link\">\n");
      out.write("                                    <i class=\"far fa-search header-fixed__search-icon\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-unfixed__search-item\">\n");
      out.write("                                <a href=\"\" class=\"header-unfixed__search-item-link\">\n");
      out.write("                                    <i class=\"fal fa-heart header-fixed__search-icon\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header-container-fixed\">\n");
      out.write("                    <nav class=\"header-fixed\">\n");
      out.write("                        <a class=\"header-fixed__logo\">\n");
      out.write("                            <svg class=\"header-fixed__logo-img\" xmlns=\"http://www.w3.org/2000/svg\" width=\"360.924\" height=\"377.662\" viewBox=\"0 0 360.924 377.662\">\n");
      out.write("                            <g id=\"Group_1\" data-name=\"Group 1\" transform=\"translate(-780 -352)\">\n");
      out.write("                            <path id=\"Path_1\" data-name=\"Path 1\" d=\"M430.02,451.951a17.843,17.843,0,0,0-12.232-4.277,19.964,19.964,0,0,0-8.957,1.936,6.417,6.417,0,0,0-3.918,6.139,5.257,5.257,0,0,0,1.874,4.339,6.65,6.65,0,0,0,4.327,1.515,6.9,6.9,0,0,0,4.624-1.635,5.158,5.158,0,0,0,1.931-4.094,6.355,6.355,0,0,0-.877-3.1,5.242,5.242,0,0,0-2.4-2.284c.388-.706,1.561-1.053,3.508-1.053a14.206,14.206,0,0,1,9.544,3.456,10.614,10.614,0,0,1,4.037,8.365,9.152,9.152,0,0,1-2.226,5.968q-2.221,2.7-7.841,5.267a82.335,82.335,0,0,1-8.542,3.286q-4.689,1.512-11.708,3.508l-8.314,2.46q-8.071,2.81-12.117,6.964a13.981,13.981,0,0,0-4.038,10.125q0,6.79,4.391,10.244a15.933,15.933,0,0,0,10.13,3.457,17.824,17.824,0,0,0,9.6-2.694,8.311,8.311,0,0,0,4.334-7.38,6.328,6.328,0,0,0-1.7-4.567,6,6,0,0,0-4.51-1.754,6.639,6.639,0,0,0-4.624,1.64,5.705,5.705,0,0,0-1.817,4.448,5.083,5.083,0,0,0,1.64,4.094A8.455,8.455,0,0,0,398,508.194c-.233.781-1.127,1.413-2.688,1.88a15.216,15.216,0,0,1-4.327.7,12.027,12.027,0,0,1-7.323-2.58,8.063,8.063,0,0,1-3.451-6.782A7.612,7.612,0,0,1,382.9,495.5a24.57,24.57,0,0,1,7.613-4.271q4.33-1.64,13.462-4.453,6.909,2.7,9.367,7.494a20.661,20.661,0,0,1,2.454,9.481,16.861,16.861,0,0,1-4.151,11.3,26.7,26.7,0,0,1-11.241,7.494,43.884,43.884,0,0,1-15.4,2.631,41.17,41.17,0,0,1-16.036-2.984,25.523,25.523,0,0,1-11.241-8.718,22.109,22.109,0,0,1-4-11.19c-.063-.78-.1-1.577-.1-2.392q0-14.631,15.221-19.2c1.794.786,3.354,1.406,4.681,1.873a11.481,11.481,0,0,0,3.866.712,4.269,4.269,0,0,0,2.4-.592,1.853,1.853,0,0,0,.877-1.64,2.195,2.195,0,0,0-1.293-1.993,7.053,7.053,0,0,0-3.388-.7,43.69,43.69,0,0,0-7.26.7,17.462,17.462,0,0,1-5.968-13.337q0-6.56,3.747-10.244a13.4,13.4,0,0,1,9.828-3.69,13.975,13.975,0,0,1,5.917,1.116,5.37,5.37,0,0,1,2.984,2.625,6.805,6.805,0,0,0-4.453,2.056,6.083,6.083,0,0,0-1.754,4.39,5.366,5.366,0,0,0,1.816,4.266,6.283,6.283,0,0,0,4.277,1.588,6.8,6.8,0,0,0,4.561-1.7,5.631,5.631,0,0,0,1.993-4.51,9.137,9.137,0,0,0-1.116-4.152,12.738,12.738,0,0,0-3.217-3.923q-4.339-3.51-12.175-3.508a25.685,25.685,0,0,0-10.711,2.05,15.961,15.961,0,0,0-6.788,5.381,12.472,12.472,0,0,0-2.289,7.2,14.1,14.1,0,0,0,3.046,8.542,20.827,20.827,0,0,0,8.781,6.56,37.833,37.833,0,0,0-9.128,3.8,27.048,27.048,0,0,0-8.724,8.074,21.874,21.874,0,0,0-3.8,13.058,24.326,24.326,0,0,0,5.148,15.392A32.911,32.911,0,0,0,364.58,530.26a49.322,49.322,0,0,0,18.911,3.571,42.945,42.945,0,0,0,18.957-3.918,30.72,30.72,0,0,0,12.413-10.358,24.114,24.114,0,0,0,4.328-13.7,22.837,22.837,0,0,0-3.1-11.879,19.939,19.939,0,0,0-9.657-8.017q12.872-3.981,17.322-6.088a21.465,21.465,0,0,0,8.08-6.617,16.1,16.1,0,0,0,3.041-9.777Q434.877,456.225,430.02,451.951Z\" transform=\"translate(592.898 157.092)\" fill=\"#fff\"></path>\n");
      out.write("                            <path id=\"Path_2\" data-name=\"Path 2\" d=\"M526.194,390.13c-11.139-13.6-25.383-23.437-47.512-29.849-.553-.143-2.178-.55-3.628-.9-2.739-.649-3.316-.825-6.215-1.389-4.458-1.054-9.133-1.976-14.059-2.773l-.2-.017v-.536q38.257-11.607,55.953-33.893a78.969,78.969,0,0,0,17.676-50.39q0-34.4-26.394-55.23c-17.618-13.883-42.161-20.244-75.1-20.244-7.756,0-2.505.057-8.61,0l-65.417.376L231.524,427.343c-15.745,24.276-24.412,41.7-44.422,41.7v9.589c9.584-.962,23.33-.325,37.709-.325,16.365,0,31.23.052,47.041.052,7.822,0,10.615,5.244,13.792,9.6,15.694,21.531,29.554,57.588,72.781,74.085v.017c15.568,6.9,43.978,12,64.671,10.113,36.575-3.325,54.769-11,71.488-19.987s30.983-26.36,39.975-42.492q13.461-24.182,13.467-55.526Q548.026,416.792,526.194,390.13ZM391.15,245.19q0-17.433,2.9-26.16t10.421-12.124q7.508-3.374,22.532-3.388c23.889,0,31.132,7.323,39.366,17.79,9.9,12.59,15.335,30.169,15.335,54.4q0,35.857-15.745,57.406c-10.495,14.372-15.882,21.547-42.349,21.547h-2.4v-.005H391.15Zm-36.438-19.2V354.66H285.758Zm55.742,330.487c-.654,0-1.412.006-2.243.012-90.6-4.186-81.225-83.161-75.656-88.731-7.289.023-44.678.188-66.722.188-5.726,0-7.952-2.4-11.526-5.207-6.443-5.07-7.767-11.91-7.767-21.813,0-12.755,5.057-21.992,13.286-37.873l21.485-40.089h73.4v80.143c15.881-6.042,22.584-6.212,36.438-4.664V363.463h29.258q43.2,0,62.941,22.544t19.748,65.97C503.1,516.114,468.361,556.481,410.454,556.481Z\" transform=\"translate(592.898 157.092)\" fill=\"#fff\"></path>\n");
      out.write("                            </g>\n");
      out.write("                            </svg>\n");
      out.write("                        </a>\n");
      out.write("                        <ul class=\"header-fixed__list hide-on-mobile-tablet\">\n");
      out.write("                            <li class=\"header-fixed__list-item\">\n");
      out.write("                                <a href=\"\" class=\"header-fixed__item-link\">Trang chủ</a>\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-fixed__list-item\">\n");
      out.write("                                <a href=\"\" class=\"header-fixed__item-link\">Tours</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-fixed__list-item\">\n");
      out.write("                                <a href=\"\" class=\"header-fixed__item-link\">Ăn uống</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-fixed__list-item\">\n");
      out.write("                                <a href=\"\" class=\"header-fixed__item-link\">About us</a>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                            <li class=\"header-fixed__list-item\">\n");
      out.write("                                <a href=\"\" class=\"header-fixed__item-link\">Contact Us</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                        <ul class=\"header-fixed__search\">\n");
      out.write("                            <li class=\"header-fixed__search-item\">\n");
      out.write("                                <a href=\"\" class=\"header-fixed__search-item-link\">\n");
      out.write("                                    <i class=\"header-fixed__search-icon far fa-search\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-fixed__search-item  hide-on-mobile-tablet\">\n");
      out.write("                                <a href=\"\" class=\"header-fixed__search-item-link\">\n");
      out.write("                                    <i class=\"header-fixed__search-icon far fa-heart\"></i>\n");
      out.write("                                </a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"header-fixed__search-item\">\n");
      out.write("                                <label for=\"mobile-menu-input\" class=\"header-fixed__search-item-link\">\n");
      out.write("                                    <i class=\"fal fa-bars\"></i>\n");
      out.write("                                </label>\n");
      out.write("                                <input type=\"checkbox\" id=\"mobile-menu-input\">\n");
      out.write("                                <div class=\"mobile-menu\">\n");
      out.write("                                    <label for=\"mobile-menu-input\" class=\"mobile-menu-close\">\n");
      out.write("                                        <i class=\"fal fa-times-circle mobile-menu-close__icon\"></i>\n");
      out.write("                                    </label>\n");
      out.write("                                    <div class=\"mobile-menu-container\">\n");
      out.write("                                        <ul class=\"mobile-menu-list\">\n");
      out.write("                                            <li class=\"mobile-menu-list__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-list__item-link\">Home</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"mobile-menu-list__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-list__item-link\">Tailored Experiences</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"mobile-menu-list__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-list__item-link\">Destinations</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"mobile-menu-list__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-list__item-link\">Private Rentals</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"mobile-menu-list__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-list__item-link\">About us</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"mobile-menu-list__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-list__item-link\">Blog & press</a>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"mobile-menu-list__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-list__item-link\">Contact Us</a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                        <ul class=\"mobile-menu-social\">\n");
      out.write("                                            <li class=\"mobile-menu-social__item\">\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-social__item-link\">\n");
      out.write("                                                    <i class=\"fab fa-facebook-f mobile-menu-social__item-icon\"></i>\n");
      out.write("                                                </a>\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-social__item-link\">\n");
      out.write("                                                    <i class=\"fab fa-twitter mobile-menu-social__item-icon\"></i>\n");
      out.write("                                                </a>\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-social__item-link\">\n");
      out.write("                                                    <i class=\"fab fa-instagram mobile-menu-social__item-icon\"></i>\n");
      out.write("                                                </a>\n");
      out.write("                                                <a href=\"\" class=\"mobile-menu-social__item-link\">\n");
      out.write("                                                    <i class=\"fab fa-linkedin-in mobile-menu-social__item-icon\"></i>\n");
      out.write("                                                </a>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"scroll-top-button\">\n");
      out.write("                    <svg xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" version=\"1.1\" id=\"Layer_1\" x=\"0px\" y=\"0px\" viewBox=\"0 0 19 10.9\" style=\"enable-background:new 0 0 19 10.9;\" xml:space=\"preserve\" class=\"\">\n");
      out.write("                    <style>\n");
      out.write("                        .st0{\n");
      out.write("                            fill:none;\n");
      out.write("                            stroke:#FFFFFF;\n");
      out.write("                            stroke-width:1.5;\n");
      out.write("                        }\n");
      out.write("                    </style>\n");
      out.write("                    <g id=\"Group_16\" transform=\"translate(9.778 18.493) rotate(180)\">\n");
      out.write("                    <path id=\"Path_13\" class=\"st0\" d=\"M-8.7,8.2l9.2,9.2l8.7-9.2\"></path>\n");
      out.write("                    </g>\n");
      out.write("                    </svg>\n");
      out.write("                </button>\n");
      out.write("                <label for=\"close-checkbox\" class=\"btn chat-with-us hide-on-mobile-tablet\">Chat with us</label>\n");
      out.write("                <input id=\"close-checkbox\" class=\"close-input\" type=\"checkbox\">\n");
      out.write("                <div class=\"header-chat-form hide-on-mobile\">\n");
      out.write("                    <div class=\"chat-form-close\">\n");
      out.write("                        <label for=\"close-checkbox\" class=\"chat-form-close__label\">\n");
      out.write("                            Close\n");
      out.write("                            <div class=\"chat-form-close__icon\">\n");
      out.write("                                <i class=\"fal fa-times\"></i>\n");
      out.write("                            </div>\n");
      out.write("                        </label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"chat-form-group\">\n");
      out.write("                        <h4 class=\"chat-form__heading chat-form-animation\">Have a chat with our team</h4>\n");
      out.write("                        <div class=\"chat-form__phone chat-form-animation\">\n");
      out.write("                            <a href=\"tel:1-800-894-5712\" class=\"chat-form__phone-link\">US Toll Free: 1-800-894-5712</a>\n");
      out.write("                            <a href=\"tel:1-800-764-042\" class=\"chat-form__phone-link\">Australia Toll Free:1-800-764-042</a>\n");
      out.write("                            <a href=\"tel:+353-1-288-9355\" class=\"chat-form__phone-link\">Ireland: +353-1-288-9355</a>\n");
      out.write("                        </div>\n");
      out.write("                        <span class=\"chat-form__introduction chat-form-animation\">Or fill in the form below and we'll be in touch</span>\n");
      out.write("                        <form action=\"\" class=\"chat-form__form chat-form-animation\">\n");
      out.write("                            <div class=\"form-input-group\">\n");
      out.write("                                <input type=\"text\" placeholder=\"First Name\" class=\"form-input form-input--first-name\">\n");
      out.write("                                <input type=\"text\" placeholder=\"Last Name\" class=\"form-input form-input--last-name\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-input-group\">\n");
      out.write("                                <input type=\"email\" placeholder=\"Email\" class=\"form-input form-email\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-input-group form-input-group--dark-text\">\n");
      out.write("                                <input id=\"phone\" class=\"form-input form-input--phone\" name=\"phone\" type=\"tel\" autocomplete=\"off\" data-intl-tel-input-id=\"0\" placeholder=\"Phone\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-input-group\">\n");
      out.write("                                <textarea name=\"\" id=\"\" class=\"form-input form-input--message\" cols=\"30\" rows=\"10\" placeholder=\"Where do you like to go?\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-input-group\">\n");
      out.write("                                <input id=\"form-input-agreement\" type=\"checkbox\" class=\"form-input--agree\">\n");
      out.write("                                <label class=\"form-input__agree-text\" for=\"form-input-agreement\">Sign up to receive travel inspiration, exclusive offers & our latest news.</label>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-input--recapcha\">\n");
      out.write("                                <div>   \n");
      out.write("                                    <iframe title=\"reCAPTCHA\" src=\"https://www.google.com/recaptcha/api2/anchor?ar=1&amp;k=6Lcwd9wZAAAAAOY6Kvt50j4iOOele826OztQ7LTA&amp;co=aHR0cHM6Ly93d3cuYWRhbXNhbmRidXRsZXIuY29tOjQ0Mw..&amp;hl=en&amp;v=Eyd0Dt8h04h7r-D86uAD1JP-&amp;theme=light&amp;size=normal&amp;cb=q3vo33l02pxy\" width=\"304\" height=\"78\" role=\"presentation\" name=\"a-s3ql7135gxk0\" frameborder=\"0\" scrolling=\"no\" sandbox=\"allow-forms allow-popups allow-same-origin allow-scripts allow-top-navigation allow-modals allow-popups-to-escape-sandbox\" tabindex=\"7\">\n");
      out.write("                                    </iframe>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"form-input--submit\">\n");
      out.write("                                <buttom href=\"\" class=\"btn form-btn-submit\">\n");
      out.write("                                    Submit\n");
      out.write("                                </buttom>\n");
      out.write("                            </div>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <section class=\"content-heading\">\n");
      out.write("                    <div class=\"content-heading-group\">\n");
      out.write("                        <div class=\"content-heading__background\">\n");
      out.write("                            <video id=\"content-heading__video\" width=\"100%\" height=\"100%\" playsinline=\"\" muted=\"\" autoplay=\"\" loop=\"\">\n");
      out.write("                                <source src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/videos/intro-Vid-V2-No-Sound-copy.mp4\" type=\"video/mp4\">\n");
      out.write("                                Your browser does not support the video tag.\n");
      out.write("                            </video>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"content-heading__foreground\">\n");
      out.write("                            <div class=\"grid wide\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col l-12 m-12 s-12 slow-appear\">\n");
      out.write("                                        <h1 class=\"content-heading__brand\">Du lịch Royal Toàn Châm</h1>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col l-12 m-12 s-12 slow-appear\">\n");
      out.write("                                        <h3 class=\"content-heading__slogan\">Du lịch World</h3>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row no-gutters mt-34\">\n");
      out.write("                                    <div class=\"col l-12 m-12 s-12\">\n");
      out.write("                                        <div class=\"content-heading__nav slow-appear\">\n");
      out.write("                                            <a href=\"\" class=\"content-heading__link\">\n");
      out.write("                                                <span class=\"content-heading-link__name\">Đặt món</span>\n");
      out.write("                                                <span class=\"content-heading-link__icon\">\n");
      out.write("                                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"7.325\" height=\"12.173\" viewBox=\"0 0 7.325 12.173\" class=\"\">\n");
      out.write("                                                    <g id=\"Group_16\" data-name=\"Group 16\" transform=\"translate(9.248 11.643) rotate(180)\">\n");
      out.write("                                                    <path id=\"Path_13\" data-name=\"Path 13\" d=\"M5.718,0,0,5.718,5.718,11.1\" transform=\"translate(3 0)\" fill=\"none\" stroke=\"#fff\" stroke-width=\"1.5\"></path>\n");
      out.write("                                                    </g>\n");
      out.write("                                                    </svg>\n");
      out.write("                                                </span>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"\" class=\"content-heading__link\">\n");
      out.write("                                                <span class=\"content-heading-link__name\">Thưởng thức</span>\n");
      out.write("                                                <span class=\"content-heading-link__icon\">\n");
      out.write("                                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"7.325\" height=\"12.173\" viewBox=\"0 0 7.325 12.173\" class=\"\">\n");
      out.write("                                                    <g id=\"Group_16\" data-name=\"Group 16\" transform=\"translate(9.248 11.643) rotate(180)\">\n");
      out.write("                                                    <path id=\"Path_13\" data-name=\"Path 13\" d=\"M5.718,0,0,5.718,5.718,11.1\" transform=\"translate(3 0)\" fill=\"none\" stroke=\"#fff\" stroke-width=\"1.5\"></path>\n");
      out.write("                                                    </g>\n");
      out.write("                                                    </svg>\n");
      out.write("                                                </span>\n");
      out.write("                                            </a>\n");
      out.write("                                            <a href=\"\" class=\"content-heading__link\">\n");
      out.write("                                                <span class=\"content-heading-link__name\">Đánh giá</span>\n");
      out.write("                                                <span class=\"content-heading-link__icon\">\n");
      out.write("                                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"7.325\" height=\"12.173\" viewBox=\"0 0 7.325 12.173\" class=\"\">\n");
      out.write("                                                    <g id=\"Group_16\" data-name=\"Group 16\" transform=\"translate(9.248 11.643) rotate(180)\">\n");
      out.write("                                                    <path id=\"Path_13\" data-name=\"Path 13\" d=\"M5.718,0,0,5.718,5.718,11.1\" transform=\"translate(3 0)\" fill=\"none\" stroke=\"#fff\" stroke-width=\"1.5\"></path>\n");
      out.write("                                                    </g>\n");
      out.write("                                                    </svg>\n");
      out.write("                                                </span>\n");
      out.write("                                            </a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"grid\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col l-4 ml-4 m-12 s-12 slow-appear content-heading-member__group\">\n");
      out.write("                                        <a href=\"\" class=\"content-heading__member\">\n");
      out.write("                                            <img class=\"content-heading__member-logo content-heading__member--virtuoso\" src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/brand/logo/licenced_footer.svg\" alt=\"Virtuoso Member\">\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col l-8 ml-8 m-12 s-12 slow-appear content-heading-member__group content-heading-member__group--flex-right\">\n");
      out.write("                                        <span class=\"content-heading__member\">\n");
      out.write("                                            <img class=\"content-heading__member-logo content-heading__member--iata\" src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/virtuoso_member_logo_hero.svg\" alt=\"IATA Member\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"content-heading__member\">\n");
      out.write("                                            <img class=\"content-heading__member-logo content-heading__member--alist\" src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/luxury_travel_logo-400x144.png\" alt=\"AList Member\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"content-heading__member\">\n");
      out.write("                                            <img class=\"content-heading__member-logo content-heading__member--luxury-travel\" src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/luxury_travel_logo-400x144.png\" alt=\"Luxury Travel Member\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"content-heading__member\">\n");
      out.write("                                            <img class=\"content-heading__member-logo content-heading__member--condenast\" src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/Conde%CC%81_Nast_logo.svg\" alt=\"Conde Nast Member\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"content-heading__member\">\n");
      out.write("                                            <img class=\"content-heading__member-logo content-heading__member--thenewyorktimes\" src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/Conde%CC%81_Nast_logo.svg\" alt=\"The New York Times Member\">\n");
      out.write("                                        </span>\n");
      out.write("                                        <span class=\"content-heading__member\">\n");
      out.write("                                            <img class=\"content-heading__member-logo content-heading__member--ustravel\" src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/US-TRAVELSPECIALISTS-2021-SEAL-with-wm-01.svg\" alt=\"US Travel Special list Member\">\n");
      out.write("                                        </span>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Section-->\n");
      out.write("        \n");
      out.write("        <form action=\"search\" class=\" d-flex mx-auto\">\n");
      out.write("            \n");
      out.write("            <input type=\"search\" id=\"search\" name=\"keyword\" placeholder=\"Search\" style=\"margin-right: 5px;\n");
      out.write("                   margin-left:600px; margin-top: 100px;padding: 7px 30px;\n");
      out.write("                   border: 2px solid red;\n");
      out.write("                   border-radius: 3px\"><br><br>\n");
      out.write("            \n");
      out.write("            <button class=\"btn btn-outline-success\" type=\"submit\" style=\"margin-top: 100px\">Search</button>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <section class=\"py-5\">\n");
      out.write("            <div class=\"container px-4 px-lg-5 mt-5\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-3 mb-5\">\n");
      out.write("                        <h3 style=\"color:red\">Các món ăn được ưa thích</h3>\n");
      out.write("                        <ul class=\"list-group\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-9\">\n");
      out.write("                        <h3 style=\"color: red; text-align: center; font: 20px\">Đặt món ngay</h3>\n");
      out.write("                        ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        <br><br>\n");
      out.write("                        <div\n");
      out.write("                            class=\"row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 justify-content-center\"\n");
      out.write("                            >\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("        <!-- Footer-->\n");
      out.write("        <footer class=\"footer\">\n");
      out.write("            <section class=\"footer-top\">\n");
      out.write("                <div class=\"grid wide\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col l-12 m-12 s-12\">\n");
      out.write("                            <div class=\"footer-top-slide\">\n");
      out.write("                                <div class=\"footer-top-slide__prev swiper-button-prev-footer\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"10.856\" height=\"19.024\" viewBox=\"0 0 10.856 19.024\" class=\"\">\n");
      out.write("                                    <g id=\"Group_532\" data-name=\"Group 532\" transform=\"translate(10.325 18.478) rotate(180)\">\n");
      out.write("                                    <g id=\"Group_16\" data-name=\"Group 16\" transform=\"translate(9.248 17.947) rotate(180)\">\n");
      out.write("                                    <path id=\"Path_13\" data-name=\"Path 13\" d=\"M9.248,0,0,9.248l9.248,8.7\" transform=\"translate(0)\" fill=\"none\" stroke=\"#fff\" stroke-width=\"1.5\"></path>\n");
      out.write("                                    </g>\n");
      out.write("                                    </g>\n");
      out.write("                                    </svg>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer-top-slide-group\">\n");
      out.write("                                    <div class=\"footer-top-slide__slider swiper-footer\">\n");
      out.write("                                        <div class=\"swiper-wrapper\">\n");
      out.write("                                            <div class=\"footer-top-slide__slide-item swiper-slide\">\n");
      out.write("                                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/brand/logo/licenced_footer.svg\" alt=\"\" class=\"footer-top-slide__img\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer-top-slide__slide-item swiper-slide\">\n");
      out.write("                                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/select_logo.svg\" alt=\"\" class=\"footer-top-slide__img\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer-top-slide__slide-item swiper-slide\">\n");
      out.write("                                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/itaa_logo.svg\" alt=\"\" class=\"footer-top-slide__img\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer-top-slide__slide-item swiper-slide\">\n");
      out.write("                                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/a-list.svg\" alt=\"\" class=\"footer-top-slide__img\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer-top-slide__slide-item swiper-slide\">\n");
      out.write("                                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/green_award_logo.svg\" alt=\"\" class=\"footer-top-slide__img\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer-top-slide__slide-item swiper-slide\">\n");
      out.write("                                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/Founding-member-badge-01-1-1.png\" alt=\"\" class=\"footer-top-slide__img\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"footer-top-slide__slide-item swiper-slide\">\n");
      out.write("                                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/members/about_logo_list_5_2x.svg\" alt=\"\" class=\"footer-top-slide__img\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer-top-slide__next swiper-button-next-footer\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"10.856\" height=\"19.024\" viewBox=\"0 0 10.856 19.024\" class=\"\">\n");
      out.write("                                    <g id=\"Group_533\" data-name=\"Group 533\" transform=\"translate(0.531 0.546)\">\n");
      out.write("                                    <g id=\"Group_16\" data-name=\"Group 16\" transform=\"translate(9.248 17.947) rotate(180)\">\n");
      out.write("                                    <path id=\"Path_13\" data-name=\"Path 13\" d=\"M9.248,0,0,9.248l9.248,8.7\" transform=\"translate(0)\" fill=\"none\" stroke=\"#fff\" stroke-width=\"1.5\"></path>\n");
      out.write("                                    </g>\n");
      out.write("                                    </g>\n");
      out.write("                                    </svg>\n");
      out.write("                                </div>   \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"footer-main\">\n");
      out.write("                <div class=\"grid wide\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col l-9 ml-9 m-0 s-0\">\n");
      out.write("                            <div class=\"footer-nav\">\n");
      out.write("                                <div class=\"footer-nav-item\">\n");
      out.write("                                    <h4 class=\"footer-nav-item__heading\">TRẢI NGHIỆM CÓ LỢI</h4>\n");
      out.write("                                    <ul class=\"footer-nav-item-list\">\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Cuộc phiêu lưu</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Lễ kỷ niệm</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Âmr thực</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Gia đình</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Ultraluxe</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Hành trình</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Chuyên môn</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer-nav-item\">\n");
      out.write("                                    <h4 class=\"footer-nav-item__heading\">Các điểm đến</h4>\n");
      out.write("                                    <ul class=\"footer-nav-item-list\">\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Ireland</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">UK</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Africa</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Classic Europe</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Asia</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">The Americas</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Exotic Islands</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Polar Regions</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Oceania</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer-nav-item\">\n");
      out.write("                                    <h4 class=\"footer-nav-item__heading\">Private rentals</h4>\n");
      out.write("                                    <ul class=\"footer-nav-item-list\">\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Castles</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Estates</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Villas & Houses</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer-nav-item\">\n");
      out.write("                                    <h4 class=\"footer-nav-item__heading\">News & Press</h4>\n");
      out.write("                                    <ul class=\"footer-nav-item-list\">\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">All</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Press</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">News</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Newsletter</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"footer-nav-item\">\n");
      out.write("                                    <h4 class=\"footer-nav-item__heading\">About Us</h4>\n");
      out.write("                                    <ul class=\"footer-nav-item-list\">\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Why choose N&C</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Our Team</a>\n");
      out.write("                                        </li>\n");
      out.write("                                        <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                            <a href=\"\" class=\"footer-nav-item-list__item-link\">Work with us</a>\n");
      out.write("                                        </li>\n");
      out.write("                                    </ul>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col l-3 ml-3 m-12 s-12\">\n");
      out.write("                            <div class=\"footer-brand-info\">\n");
      out.write("                                <div class=\"footer-brand-info__logo\">\n");
      out.write("                                    <svg xmlns=\"http://www.w3.org/2000/svg\" width=\"947.269\" height=\"377.662\" viewBox=\"0 0 947.269 377.662\" class=\"\">\n");
      out.write("                                    <g id=\"Group_3\" data-name=\"Group 3\" transform=\"translate(-187.102 -194.908)\">\n");
      out.write("                                    <g id=\"Group_2\" data-name=\"Group 2\">\n");
      out.write("                                    <path id=\"Path_3\" data-name=\"Path 3\" d=\"M430.02,451.951a17.843,17.843,0,0,0-12.232-4.277,19.964,19.964,0,0,0-8.957,1.936,6.417,6.417,0,0,0-3.918,6.139,5.257,5.257,0,0,0,1.874,4.339,6.65,6.65,0,0,0,4.327,1.515,6.9,6.9,0,0,0,4.624-1.635,5.158,5.158,0,0,0,1.931-4.094,6.355,6.355,0,0,0-.877-3.1,5.242,5.242,0,0,0-2.4-2.284c.388-.706,1.561-1.053,3.508-1.053a14.206,14.206,0,0,1,9.544,3.456,10.614,10.614,0,0,1,4.037,8.365,9.152,9.152,0,0,1-2.226,5.968q-2.221,2.7-7.841,5.267a82.335,82.335,0,0,1-8.542,3.286q-4.689,1.512-11.708,3.508l-8.314,2.46q-8.071,2.81-12.117,6.964a13.981,13.981,0,0,0-4.038,10.125q0,6.79,4.391,10.244a15.933,15.933,0,0,0,10.13,3.457,17.824,17.824,0,0,0,9.6-2.694,8.311,8.311,0,0,0,4.334-7.38,6.328,6.328,0,0,0-1.7-4.567,6,6,0,0,0-4.51-1.754,6.639,6.639,0,0,0-4.624,1.64,5.705,5.705,0,0,0-1.817,4.448,5.083,5.083,0,0,0,1.64,4.094A8.455,8.455,0,0,0,398,508.194c-.233.781-1.127,1.413-2.688,1.88a15.216,15.216,0,0,1-4.327.7,12.027,12.027,0,0,1-7.323-2.58,8.063,8.063,0,0,1-3.451-6.782A7.612,7.612,0,0,1,382.9,495.5a24.57,24.57,0,0,1,7.613-4.271q4.33-1.64,13.462-4.453,6.909,2.7,9.367,7.494a20.661,20.661,0,0,1,2.454,9.481,16.861,16.861,0,0,1-4.151,11.3,26.7,26.7,0,0,1-11.241,7.494,43.884,43.884,0,0,1-15.4,2.631,41.17,41.17,0,0,1-16.036-2.984,25.523,25.523,0,0,1-11.241-8.718,22.109,22.109,0,0,1-4-11.19c-.063-.78-.1-1.577-.1-2.392q0-14.631,15.221-19.2c1.794.786,3.354,1.406,4.681,1.873a11.481,11.481,0,0,0,3.866.712,4.269,4.269,0,0,0,2.4-.592,1.853,1.853,0,0,0,.877-1.64,2.195,2.195,0,0,0-1.293-1.993,7.053,7.053,0,0,0-3.388-.7,43.69,43.69,0,0,0-7.26.7,17.462,17.462,0,0,1-5.968-13.337q0-6.56,3.747-10.244a13.4,13.4,0,0,1,9.828-3.69,13.975,13.975,0,0,1,5.917,1.116,5.37,5.37,0,0,1,2.984,2.625,6.805,6.805,0,0,0-4.453,2.056,6.083,6.083,0,0,0-1.754,4.39,5.366,5.366,0,0,0,1.816,4.266,6.283,6.283,0,0,0,4.277,1.588,6.8,6.8,0,0,0,4.561-1.7,5.631,5.631,0,0,0,1.993-4.51,9.137,9.137,0,0,0-1.116-4.152,12.738,12.738,0,0,0-3.217-3.923q-4.339-3.51-12.175-3.508a25.685,25.685,0,0,0-10.711,2.05,15.961,15.961,0,0,0-6.788,5.381,12.472,12.472,0,0,0-2.289,7.2,14.1,14.1,0,0,0,3.046,8.542,20.827,20.827,0,0,0,8.781,6.56,37.833,37.833,0,0,0-9.128,3.8,27.048,27.048,0,0,0-8.724,8.074,21.874,21.874,0,0,0-3.8,13.058,24.326,24.326,0,0,0,5.148,15.392A32.911,32.911,0,0,0,364.58,530.26a49.322,49.322,0,0,0,18.911,3.571,42.945,42.945,0,0,0,18.957-3.918,30.72,30.72,0,0,0,12.413-10.358,24.114,24.114,0,0,0,4.328-13.7,22.837,22.837,0,0,0-3.1-11.879,19.939,19.939,0,0,0-9.657-8.017q12.872-3.981,17.322-6.088a21.465,21.465,0,0,0,8.08-6.617,16.1,16.1,0,0,0,3.041-9.777Q434.877,456.225,430.02,451.951Z\" fill=\"#fff\"></path>\n");
      out.write("                                    <path id=\"Path_4\" data-name=\"Path 4\" d=\"M526.194,390.13c-11.139-13.6-25.383-23.437-47.512-29.849-.553-.143-2.178-.55-3.628-.9-2.739-.649-3.316-.825-6.215-1.389-4.458-1.054-9.133-1.976-14.059-2.773l-.2-.017v-.536q38.257-11.607,55.953-33.893a78.969,78.969,0,0,0,17.676-50.39q0-34.4-26.394-55.23c-17.618-13.883-42.161-20.244-75.1-20.244-7.756,0-2.505.057-8.61,0l-65.417.376L231.524,427.343c-15.745,24.276-24.412,41.7-44.422,41.7v9.589c9.584-.962,23.33-.325,37.709-.325,16.365,0,31.23.052,47.041.052,7.822,0,10.615,5.244,13.792,9.6,15.694,21.531,29.554,57.588,72.781,74.085v.017c15.568,6.9,43.978,12,64.671,10.113,36.575-3.325,54.769-11,71.488-19.987s30.983-26.36,39.975-42.492q13.461-24.182,13.467-55.526Q548.026,416.792,526.194,390.13ZM391.15,245.19q0-17.433,2.9-26.16t10.421-12.124q7.508-3.374,22.532-3.388c23.889,0,31.132,7.323,39.366,17.79,9.9,12.59,15.335,30.169,15.335,54.4q0,35.857-15.745,57.406c-10.495,14.372-15.882,21.547-42.349,21.547h-2.4v-.005H391.15Zm-36.438-19.2V354.66H285.758Zm55.742,330.487c-.654,0-1.412.006-2.243.012-90.6-4.186-81.225-83.161-75.656-88.731-7.289.023-44.678.188-66.722.188-5.726,0-7.952-2.4-11.526-5.207-6.443-5.07-7.767-11.91-7.767-21.813,0-12.755,5.057-21.992,13.286-37.873l21.485-40.089h73.4v80.143c15.881-6.042,22.584-6.212,36.438-4.664V363.463h29.258q43.2,0,62.941,22.544t19.748,65.97C503.1,516.114,468.361,556.481,410.454,556.481Z\" fill=\"#fff\"></path>\n");
      out.write("                                    </g>\n");
      out.write("\n");
      out.write("                                    </g>\n");
      out.write("                                    </svg>\n");
      out.write("                                </div>\n");
      out.write("                                <ul class=\"footer-nav-item-list\">\n");
      out.write("                                    <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                        <a href=\"mailto:sales@natalieandcharlie.com\" class=\"footer-nav-item-list__item-link\">sales@natalieandcharlie.com</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                        <a href=\"tel:1-800-894-5712\" class=\"footer-nav-item-list__item-link\">US Toll Free: 1-800-894-5712</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                        <a href=\"tel:1-800-764-042\" class=\"footer-nav-item-list__item-link\">Australia Toll Free:1-800-764-042</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"footer-nav-item-list__item\">\n");
      out.write("                                        <a href=\"tel:+353-1-288-9355\" class=\"footer-nav-item-list__item-link\">Ireland: +353-1-288-9355</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <div class=\"footer-brand-info__social\">\n");
      out.write("                                    <a href=\"\" class=\"footer-brand-info__social-link\">\n");
      out.write("                                        <i class=\"footer-brand-info__social-icon fab fa-facebook-f\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"footer-brand-info__social-link\">\n");
      out.write("                                        <i class=\"footer-brand-info__social-icon fab fab fa-twitter \"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"footer-brand-info__social-link\">\n");
      out.write("                                        <i class=\"footer-brand-info__social-icon fab fa-instagram\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                    <a href=\"\" class=\"footer-brand-info__social-link\">\n");
      out.write("                                        <i class=\"footer-brand-info__social-icon fab fa-youtube\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("            <section class=\"footer-bottom\">\n");
      out.write("                <div class=\"grid wide\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"footer-bottom-container\">\n");
      out.write("                            <div class=\"footer-bottom-licence\">\n");
      out.write("                                <img src=\"https://chuong3x.github.io/natalieandcharlie/asset/img/brand/logo/licenced_footer.svg\" alt=\"\" class=\"footer-bottom-licence__img\">\n");
      out.write("                                <span class=\"footer-bottom-licence__text\">Licenced by the Commission for Aviation Regulation, TA 0792</span>\n");
      out.write("                            </div>\n");
      out.write("                            <ul class=\"footer-bottom-legal\">\n");
      out.write("                                <li class=\"footer-bottom-legal__item\">\n");
      out.write("                                    <a href=\"\" class=\"footer-bottom-legal__item-link\">Terms & Conditions</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer-bottom-legal__item\">\n");
      out.write("                                    <a href=\"\" class=\"footer-bottom-legal__item-link\">Sustainability Policy</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer-bottom-legal__item\">\n");
      out.write("                                    <a href=\"\" class=\"footer-bottom-legal__item-link\">Privacy Policy</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer-bottom-legal__item\">\n");
      out.write("                                    <p class=\"footer-bottom-legal__item-link\">Natalie & Charlie ©2021</p>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"footer-bottom-legal__item\">\n");
      out.write("                                    <p class=\"footer-bottom-legal__item-link\">Site by</p>\n");
      out.write("                                    <a href=\"\" class=\"footer-bottom-legal__item-link\">Charlie</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </footer>\n");
      out.write("        <script src=\"js/intlTelInput.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/main.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/swiper-bundle.esm.browser.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/swiper-bundle.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("            var input = document.querySelector(\"#phone\");\n");
      out.write("            window.intlTelInput(input, {\n");
      out.write("                utilsScript: \"build/js/utils.js\",\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script type=\"module\">\n");
      out.write("            import Swiper from 'https://unpkg.com/swiper@7/swiper-bundle.esm.browser.min.js'\n");
      out.write("            const swiperExp = new Swiper('.swiper-exp', {\n");
      out.write("            // Optional parameters\n");
      out.write("            direction: 'horizontal',\n");
      out.write("            loop: true,\n");
      out.write("            slidesPerView: 3,\n");
      out.write("            // Navigation arrows\n");
      out.write("            navigation: {\n");
      out.write("            nextEl: '.swiper-button-next-exp',\n");
      out.write("            prevEl: '.swiper-button-prev-exp',\n");
      out.write("            },\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            const swiperSays = new Swiper('.swiper-says', {\n");
      out.write("            // Optional parameters\n");
      out.write("            direction: 'horizontal',\n");
      out.write("            loop: true,\n");
      out.write("            slidesPerView: 1,\n");
      out.write("            // Navigation arrows\n");
      out.write("            navigation: {\n");
      out.write("            nextEl: '.swiper-button-next-says',\n");
      out.write("            prevEl: '.swiper-button-prev-says',\n");
      out.write("            },\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            const swiperFooter = new Swiper('.swiper-footer', {\n");
      out.write("            // Optional parameters\n");
      out.write("            direction: 'horizontal',\n");
      out.write("            loop: true,\n");
      out.write("            slidesPerView: 5,\n");
      out.write("            // Navigation arrows\n");
      out.write("            navigation: {\n");
      out.write("            nextEl: '.swiper-button-next-footer',\n");
      out.write("            prevEl: '.swiper-button-prev-footer',\n");
      out.write("            },\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script class=\"iti-load-utils\" src=\"lib/utils.js\" type=\"text/javascript\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("        <script src=\"js/Food.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listCategories}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("C");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <li class=\"list-group-item\"><a href=\"categoryfind?categoryID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${C.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProducts==null || listProducts.size()==0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                Not founds\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <nav aria-label=\"Page navigation example\" class=\"d-flex justify-content-center\">\n");
        out.write("                                    <ul class=\"pagination\">\n");
        out.write("                                        <li class=\"page-item\"><a class=\"page-link\" href=\"food?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page-1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Previous</a></li>\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_otherwise_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        <li class=\"page-item\"><a class=\"page-link\" href=\"food?page=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${page+1}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">Next</a></li>\n");
        out.write("                                    </ul>\n");
        out.write("                                </nav>\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_otherwise_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_otherwise_0);
    _jspx_th_c_forEach_1.setBegin(1);
    _jspx_th_c_forEach_1.setEnd(((java.lang.Integer) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${totalPage}", java.lang.Integer.class, (PageContext)_jspx_page_context, null)).intValue());
    _jspx_th_c_forEach_1.setVar("i");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <li class=\"page-item ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i == page?\"active\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><a class=\"page-link\" href=\"food?page=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listProducts}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("P");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                                <div class=\"col mb-5\">\n");
          out.write("\n");
          out.write("                                    <div class=\"card h-100\">\n");
          out.write("                                        <!-- Sale badge-->\n");
          out.write("                                        <div\n");
          out.write("                                            class=\"badge bg-dark text-white position-absolute\"\n");
          out.write("                                            style=\"top: 0.5rem; right: 0.5rem\"\n");
          out.write("                                            >\n");
          out.write("                                            Sale\n");
          out.write("                                        </div>\n");
          out.write("                                        <!-- Product image-->\n");
          out.write("                                        <img\n");
          out.write("                                            class=\"card-img-top\"\n");
          out.write("                                            src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.imageUrl}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"\n");
          out.write("                                            alt=\"...\"\n");
          out.write("                                            />\n");
          out.write("                                        <!-- Product details-->\n");
          out.write("                                        <div class=\"card-body p-4\">\n");
          out.write("                                            <div class=\"text-center\">\n");
          out.write("                                                <!-- Product name-->\n");
          out.write("                                                <h5 class=\"fw-bolder\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5>\n");
          out.write("                                                <!-- Product reviews-->\n");
          out.write("                                                <div\n");
          out.write("                                                    class=\"d-flex justify-content-center small text-warning mb-2\"\n");
          out.write("                                                    >\n");
          out.write("                                                    <div class=\"bi-star-fill\"></div>\n");
          out.write("                                                    <div class=\"bi-star-fill\"></div>\n");
          out.write("                                                    <div class=\"bi-star-fill\"></div>\n");
          out.write("                                                    <div class=\"bi-star-fill\"></div>\n");
          out.write("                                                    <div class=\"bi-star-fill\"></div>\n");
          out.write("                                                </div>\n");
          out.write("                                                <!-- Product price-->\n");
          out.write("                                                <span class=\"text-muted text-decoration-line-through\"\n");
          out.write("                                                      >$20.00</span\n");
          out.write("                                                >\n");
          out.write("                                                $");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${P.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                        <!-- Product actions-->\n");
          out.write("                                        <div class=\"card-footer p-4 pt-0 border-top-0 bg-transparent\">\n");
          out.write("                                            <div class=\"text-center\">\n");
          out.write("                                                <a class=\"btn btn-outline-dark mt-auto\" href=\"#\"\n");
          out.write("                                                   >Đặt món</a\n");
          out.write("                                                >\n");
          out.write("                                            </div>\n");
          out.write("                                        </div>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }
}