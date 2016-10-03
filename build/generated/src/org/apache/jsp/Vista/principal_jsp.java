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
      out.write("        \n");
      out.write("        <link href=\"Vista/img/favicon.ico\" rel=\"shortcut icon\"  />\n");
      out.write("        <!--Metaetiqueta para el uso del conjunto de caracteres adecuado-->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <!--Metaetiqueta para corregir compatibilidad con navegador Microsft-->\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!--Metaetiqueta para la correcta visualizaciÃ³n en dispositivos moviles-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!--AÃ±ada primero el estilo de la libreria (ufps.css o ufps.min.css) y luego sus estilos propios-->\n");
      out.write("        <link href=\"Vista/css/ufps.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Vista/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--LibrerÃ­as para compatibilidad con versiones antiguas de Internet Explorer-->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <!--Algunos componentes requieren el uso de la librerÃ­a en javascript-->\n");
      out.write("        <script src=\"Vista/js/ufps.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <header>\n");
      out.write("            <center> <img id=\"banner\" src=\"../img/Banner-superior.png\" alt=\"imagen\" height=\"100px\" width=\"100%\" ></img></center>\n");
      out.write("        </header>  \n");
      out.write(" <!--Menu-->\n");
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
      out.write("                      \n");
      out.write("                    <li><a href=\"\" class=\"  ufps-navbar-btn  \" >Home </a></li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"\"  class=\"ufps-navbar-btn  \" >Modulos </a>\n");
      out.write("                        <ul>\n");
      out.write("                            <li> <a href=\"\" class=\"  ufps-navbar-btn item\"  > Proceso de docencia </a></li>\n");
      out.write("                             <li> <a href=\"\" class=\"  ufps-navbar-btn item  \" > Carga academica </a></li>\n");
      out.write("                              <li> <a href=\"\" class=\"  ufps-navbar-btn item  \" > Amigos academicos </a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </li>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"ufps-navbar-right nav\">\n");
      out.write("                    <li> <a href=\"\" class=\"ufps-navbar-btn \">Administrador </a></li>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write(" <!--Contenido-->\n");
      out.write("    </div >\n");
      out.write("    <div  class=\"ufps-container\" id=\"contenido\">\n");
      out.write("       \n");
      out.write("        \n");
      out.write("         <div  class=\"ufps-container modulo\" >\n");
      out.write("             <div id=\"titulo\">\n");
      out.write("                 \n");
      out.write("                 <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\"  ></img>\n");
      out.write("                 \n");
      out.write("     \n");
      out.write("                 <h2>Semilleros de investigación</h2>\n");
      out.write("              \n");
      out.write("\n");
      out.write("             </div>    \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("          <div  class=\"ufps-container modulo\" >\n");
      out.write("             <div id=\"titulo\">\n");
      out.write("                 <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\"  ></img>  <h2>Grupos de investigación</h2>\n");
      out.write("                \n");
      out.write("\n");
      out.write("             </div>    \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("          <div  class=\"ufps-container modulo\" >\n");
      out.write("             <div id=\"titulo\">\n");
      out.write("                 <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\" ></img> <h2>Actividades de formación (Programa a vivencia)<h2>\n");
      out.write("                \n");
      out.write("\n");
      out.write("             </div>    \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("          <div  class=\"ufps-container modulo\" >\n");
      out.write("             <div id=\"titulo\">\n");
      out.write("                 <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\"  ></img> <h2>Docentes : Carga academica , Investigacion y extencion</h2>\n");
      out.write("                \n");
      out.write("\n");
      out.write("             </div>    \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <div  class=\"ufps-container modulo\" >\n");
      out.write("             <div id=\"titulo\">\n");
      out.write("                 <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\"  ></img>  <h2>Proyectos de aulas en clase</h2>\n");
      out.write("                \n");
      out.write("\n");
      out.write("             </div>    \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <div  class=\"ufps-container modulo\" >\n");
      out.write("            \n");
      out.write("              <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\"  ></img>  <h2>Practicas empresariales</h2>\n");
      out.write("                \n");
      out.write("\n");
      out.write("               \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <div  class=\"ufps-container modulo\" >\n");
      out.write("          \n");
      out.write("              <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\"  ></img>  <h2>Internacionalización </h2>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("          <div  class=\"ufps-container modulo\" >\n");
      out.write("           \n");
      out.write("              <img src=\"#\" alt=\"img-modulo\" id=\"img-modulo\"  ></img> <h2>Caracterizacion de estudiante</h2>\n");
      out.write("                \n");
      out.write("\n");
      out.write("             \n");
      out.write("    </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"ufps-container ufps-footer \">\n");
      out.write("        <h3>Universidad Francisco de Paula Santander</h3>\n");
      out.write("        <p>Programa Ingeniería de Sistemas</p>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    </div>   \n");
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
