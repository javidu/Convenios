package org.apache.jsp.Vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class convenios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>        \n");
      out.write("        <header>\n");
      out.write("            <center> <img id=\"banner\" src=\"../Vista/img/Banner-superior.png\" alt=\"imagen\" height=\"100px\" width=\"100%\" ></img></center>\n");
      out.write("        </header> \n");
      out.write("        \n");
      out.write("        <div class=\"ufps-navbar ufps-container \" id=\"menu\" >\n");
      out.write("            <div class=\"ufps-container-fluid\">\n");
      out.write("                <div class=\"ufps-navbar-brand\">\n");
      out.write("                    <div class=\"ufps-btn-menu\" onclick=\"toggleMenu('menu')\">\n");
      out.write("                        <div class=\"ufps-btn-menu-bar\"> </div>\n");
      out.write("                        <div class=\"ufps-btn-menu-bar\"> </div>\n");
      out.write("                        <div class=\"ufps-btn-menu-bar\"> </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ufps-navbar-left nav\">\n");
      out.write("\n");
      out.write("                    <li><a href=\"\" class=\"  ufps-navbar-btn  \" >Home </a></li>\n");
      out.write("                    <li><a href=\"\"  class=\"ufps-navbar-btn  \" >Convenios </a></li>\n");
      out.write("                    <li><a href=\"\"  class=\"ufps-navbar-btn  \" >Actividades </a></li>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ufps-navbar-right nav\">\n");
      out.write("                    <li> <a href=\"\" class=\"ufps-navbar-btn \">Iniciar Sesión </a></li>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"ufps-container ufps-footer \">\n");
      out.write("            <h5>Universidad Francisco de Paula Santander</h5>\n");
      out.write("            <h6>Programa Ingeniería de Sistemas<br>\n");
      out.write("                Desarrollador por: Francisco Javier Duarte García - Heiner Enrique Villamizar Molina</h6>\n");
      out.write("        </div>  \n");
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
