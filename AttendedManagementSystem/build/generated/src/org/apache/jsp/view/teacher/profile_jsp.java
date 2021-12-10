package org.apache.jsp.view.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <title>profile_teacher</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container rounded bg-white mt-5 mb-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3 border-right\">\n");
      out.write("                    <div class=\"d-flex flex-column align-items-center text-center p-3 py-5\"><img class=\"rounded-circle mt-5\" src=\"https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQF2psCzfbB611rnUhxgMi-lc2oB78ykqDGYb4v83xQ1pAbhPiB&usqp=CAU\"><span class=\"font-weight-bold\">Amelly</span><span class=\"text-black-50\">amelly12@bbb.com</span><span> </span></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-5 border-right\">\n");
      out.write("                    <div class=\"p-3 py-5\">\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center mb-3\">\n");
      out.write("                            <h4 class=\"text-right\">Profile Settings</h4>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row mt-2\">\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">Name</label><input type=\"text\" class=\"form-control\" placeholder=\"first name\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">Surname</label><input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"surname\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row mt-3\">\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">PhoneNumber</label><input type=\"text\" class=\"form-control\" placeholder=\"enter phone number\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Address</label><input type=\"text\" class=\"form-control\" placeholder=\"enter address\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Email ID</label><input type=\"text\" class=\"form-control\" placeholder=\"enter email id\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-12\"><label class=\"labels\">Education</label><input type=\"text\" class=\"form-control\" placeholder=\"education\" value=\"\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row mt-3\">\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">Country</label><input type=\"text\" class=\"form-control\" placeholder=\"country\" value=\"\"></div>\n");
      out.write("                            <div class=\"col-md-6\"><label class=\"labels\">State/Region</label><input type=\"text\" class=\"form-control\" value=\"\" placeholder=\"state\"></div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"mt-5 text-center\"><button class=\"btn btn-primary profile-button\" type=\"button\">Save Profile</button></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <div class=\"p-3 py-5\">\n");
      out.write("                        <div class=\"d-flex justify-content-between align-items-center experience\"><span>Edit Experience</span><span class=\"border px-3 p-1 add-experience\"><i class=\"fa fa-plus\"></i>&nbsp;Experience</span></div><br>\n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Experience in Designing</label><input type=\"text\" class=\"form-control\" placeholder=\"experience\" value=\"\"></div> <br>\n");
      out.write("                        <div class=\"col-md-12\"><label class=\"labels\">Additional Details</label><input type=\"text\" class=\"form-control\" placeholder=\"additional details\" value=\"\"></div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
