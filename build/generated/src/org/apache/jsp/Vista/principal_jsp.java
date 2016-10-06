package org.apache.jsp.Vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class principal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Ingenieria de sistemas</title>\n");
      out.write("\n");
      out.write("        <link href=\"../Vista/img/favicon.ico\" rel=\"shortcut icon\"  />\n");
      out.write("        <!--Metaetiqueta para el uso del conjunto de caracteres adecuado-->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!--Metaetiqueta para corregir compatibilidad con navegador Microsft-->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!--Metaetiqueta para la correcta visualizaciÃ³n en dispositivos moviles-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--AÃ±ada primero el estilo de la libreria (ufps.css o ufps.min.css) y luego sus estilos propios-->\n");
      out.write("        <link href=\"../Vista/css/ufps.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Vista/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"../Vista/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--LibrerÃ­as para compatibilidad con versiones antiguas de Internet Explorer-->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <!--Algunos componentes requieren el uso de la librerÃ­a en javascript-->\n");
      out.write("        \n");
      out.write("        <script src=\"../Vista/js/jquery-3.1.0.min.js\"></script>\n");
      out.write("   \n");
      out.write("        \n");
      out.write("        <script src=\"../Vista/js/ufps.js\"></script>\n");
      out.write("        <script src=\"../Vista/js/ufps.min.js\"></script>\n");
      out.write("        <script src=\"../Vista/js/bootstrap.js\"></script>\n");
      out.write("        <script src=\"../Vista/js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <center> <img id=\"banner\" src=\"../Vista/img/Banner-superior.png\" alt=\"imagen\" height=\"100px\" width=\"100%\" ></img></center>\n");
      out.write("        </header>  \n");
      out.write("        <!--Menu-->\n");
      out.write("\n");
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
      out.write("    \n");
      out.write("        <!--Contenido-->\n");
      out.write("    \n");
      out.write("       \n");
      out.write("    <div  class=\"ufps-container\" id=\"contenido\">\n");
      out.write("        \n");
      out.write("        <!--Carrousel-->\n");
      out.write("        <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("            <!-- Indicators -->\n");
      out.write("            <ol class=\"carousel-indicators\">\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("            </ol>\n");
      out.write("\n");
      out.write("            <!-- Wrapper for slides -->\n");
      out.write("            <div class=\"carousel-inner\" role=\"listbox\">\n");
      out.write("                <div class=\"item active\">\n");
      out.write("                   \n");
      out.write("                    <center><img src=\"img/Banner_120_2016.png\" alt=\"Chania\"></center>\n");
      out.write("                        \n");
      out.write("                    <div class=\"carousel-caption\">\n");
      out.write("                <div class=\"animated fadeInDown\">\n");
      out.write("                    <h3 class=\"h3-responsive\">Light mask</h3>\n");
      out.write("                    <p>Secondary text</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <center><img src=\"img/Banner_124_2016_2.png\" alt=\"Chania\"></center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <center><img src=\"img/Banner_127_2016.png\" alt=\"Flower\"></center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"item\">\n");
      out.write("                    <center><img src=\"img/Banner_131_2016.png\" alt=\"Flower\"></center>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <!-- Left and right controls -->\n");
      out.write("            <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("            </a>\n");
      out.write("            <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("        <div class=\"ufps-modal\" id=\"iniciosesion\">\n");
      out.write("\n");
      out.write("            <div class=\"ufps-modal-header-red\">\n");
      out.write("                <h3>LOGIN</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"ufps-modal-body\">\n");
      out.write("\n");
      out.write("                Usuario: <input type=\"text\" name=\"usuario\">\n");
      out.write("                Contraseña: <input type=\"password\" name=\"password\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <h1>modal</h1>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"ufps-container ufps-footer \">\n");
      out.write("        <h5>Universidad Francisco de Paula Santander</h5>\n");
      out.write("        <h6>Programa Ingeniería de Sistemas<br>\n");
      out.write("            Desarrollador por: Francisco Javier Duarte García - Heiner Enrique Villamizar Molina</h6>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>   \n");
      out.write("</body>\n");
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
