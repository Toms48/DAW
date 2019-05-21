package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;

public final class creaMes_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <center>\r\n");
      out.write("            <h1>CALENDEITOR 2.0</h1>\r\n");
      out.write("            <hr/>\r\n");
      out.write("            \r\n");
      out.write("            <br/>\r\n");
      out.write("            \r\n");
      out.write("            ");

                int anio = Integer.parseInt(request.getParameter("anio"));
                int mes = Integer.parseInt(request.getParameter("mes"));
                String texto = request.getParameter("texto");

                out.print("<p>" +texto +"</p>");
                out.print("<p><b>" +mes +" - " +anio +"</b></p>");

                
      out.write("\r\n");
      out.write("            \r\n");
      out.write("            <table border=\"2\" cellpadding=\"8\">\r\n");
      out.write("                <tbody>\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>Lunes</td>\r\n");
      out.write("                        <td>Martes</td>\r\n");
      out.write("                        <td>Miércoles</td>\r\n");
      out.write("                        <td>Jueves</td>\r\n");
      out.write("                        <td>Viernes</td>\r\n");
      out.write("                        <td>Sábado</td>\r\n");
      out.write("                        <td>Domingo</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    ");

                        Calendar cal = Calendar.getInstance();
                        cal.set(Calendar.YEAR, anio);
                        cal.set(Calendar.MONTH, mes);
                        //int diaN = Calendar.DAY_OF_WEEK;
                        //out.println(diaN);
                        //int numeroDias = ;
                        
                        boolean empezado = false;
                        int contador = 1;
                        
                        
                        
                        /*while(contador < numeroDias+1){
                            out.println("<tr>");
                            for(int i=1; i<=7 && contador<numeroDias+1; i++){
                                if(i!=diaN && empezado==false){
                                    out.println("<td></td>");
                                    contador--;
                                }
                                else{
                                    out.println("<td>" +contador +"</td>");
                                    empezado=true;
                                }
                                
                                contador++;
                            }
                            out.println("</tr>");
                        }*/
                        
                    
      out.write("\r\n");
      out.write("                </tbody>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("        </center>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
