package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body bgcolor=\"#E6E6PF\" align=\"center\">\n");
      out.write("        <h1 style=\"color:#9370DB; text-align:center; padding-top: 80px\">EditPage</h1>\n");
      out.write("        ");

            out.println("Welcome " + session.getAttribute("loginame"));
            out.println("                   " + session.getAttribute("accountno") + "<br>");
        
      out.write("\n");
      out.write("        \n");
      out.write("        <form action=\"EditPageDBMS.jsp\" method=\"post\">\n");
      out.write("            <h3 align=\"center\">\n");
      out.write("                Select <select name=\"choice\">\n");
      out.write("                    <option value=\"Name\">Name</option>\n");
      out.write("                    <option value=\"Gender\">Gender</option>\n");
      out.write("                    <option value=\"dob\">Date of Birth</option>\n");
      out.write("                    <option value=\"address\">Address</option>\n");
      out.write("                    <option value=\"mob\">Mobile Number</option>\n");
      out.write("                    <option value=\"sques\">Secret Question</option>\n");
      out.write("                    <option value=\"sans\">Secret Answer</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"text\" name=\"txt1\">\n");
      out.write("                <input type=\"submit\" name=\"b1\" value=\"Edit\">\n");
      out.write("            </h3>\n");
      out.write("        </form>\n");
      out.write("        \n");
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
}
