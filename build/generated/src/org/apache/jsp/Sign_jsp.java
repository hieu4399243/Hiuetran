package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Sign_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Đăng ký tài khoản</title>\n");
      out.write("        <link href=\"css/Sign.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section>\n");
      out.write("        \n");
      out.write("        <div class=\"color\"></div>\n");
      out.write("        <div class=\"color\"></div>\n");
      out.write("        <div class=\"color\"></div>\n");
      out.write("        <div class=\"box\">\n");
      out.write("            <div class=\"square\" style=\"--i:0;\"></div>\n");
      out.write("            <div class=\"square\" style=\"--i:1;\"></div>\n");
      out.write("            <div class=\"square\" style=\"--i:2;\"></div>\n");
      out.write("            <div class=\"square\" style=\"--i:3;\"></div>\n");
      out.write("            <div class=\"square\" style=\"--i:4;\"></div>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"form\">\n");
      out.write("                    <h2>Login Form</h2>\n");
      out.write("                    <form action=\"\">\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                           <input type=\"text\" placeholder=\"Username\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <input type=\"password\" placeholder=\"password\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Phone\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("                            <input type=\"text\" placeholder=\"Email\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"inputBox\">\n");
      out.write("\n");
      out.write("                            <input type=\"submit\" value=\"Login\">\n");
      out.write("                        </div>\n");
      out.write("                        <p class=\"forget\">Forgot Password ? <a href=\"#\">Click Here</a></p>\n");
      out.write("                        <p class=\"forget\">Don't have an account ? <a href=\"#\">Sign up</a></p>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </section>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
