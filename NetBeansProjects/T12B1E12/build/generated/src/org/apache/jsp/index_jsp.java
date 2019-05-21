package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("            <h1>CALENDEITOR 2.0</h1>\n");
      out.write("            <hr/>\n");
      out.write("            \n");
      out.write("            <br/>\n");
      out.write("            <br/>\n");
      out.write("            <div>\n");
      out.write("                <form action=\"creaMes.jsp\" method=\"POST\">\n");
      out.write("                    <p>Mes:  \n");
      out.write("                    <select name=\"mes\">\n");
      out.write("                        <option>Enero</option>\n");
      out.write("                        <option>Febrero</option>\n");
      out.write("                        <option>Marzo</option>\n");
      out.write("                        <option>Abril</option>\n");
      out.write("                        <option>Mayo</option>\n");
      out.write("                        <option>Junio</option>\n");
      out.write("                        <option>Julio</option>\n");
      out.write("                        <option>Agosto</option>\n");
      out.write("                        <option>Septiembre</option>\n");
      out.write("                        <option>Octubre</option>\n");
      out.write("                        <option>Noviembre</option>\n");
      out.write("                        <option>Diciembre</option>\n");
      out.write("                    </select>\n");
      out.write("                    </p>\n");
      out.write("\n");
      out.write("                    <p>Año:  <input type=\"text\" name=\"anio\" value=\"1998\" /></p>\n");
      out.write("\n");
      out.write("                    <p>Texto:  <input type=\"text\" name=\"texto\"/></p>\n");
      out.write("\n");
      out.write("                    <br/>\n");
      out.write("            \n");
      out.write("                    <input type=\"submit\" value=\"Enviar\" />\n");
      out.write("                    \n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </center>\n");
      out.write("        \n");
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
