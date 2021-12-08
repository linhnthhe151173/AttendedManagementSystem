package org.apache.jsp.view.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class today_005fschedule_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>today_schedule</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <nav class=\"navbar navbar-expand-md sticky-top\" style=\"background-color: #EF7F1B;\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\" style=\"color: white;\">Attendence Management</a>\n");
      out.write("            <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navb\" aria-expanded=\"true\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div id=\"navb\" class=\"navbar-collapse collapse hide\">\n");
      out.write("                <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" style=\"color: white;\"><span class=\"fas fa-user\"></span>LinhNTHHE151173</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" style=\"color: white;\"><span class=\"fas fa-sign-in-alt\"></span>| Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- Container -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <p style=\"margin-top: 20px;\n");
      out.write("                       font-weight: bold;\">Other's schedule</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\" style=\"text-align: center;\">\n");
      out.write("                    <button type=\"button\" class=\"btn\" style=\"background-color: #EF7F1B;\n");
      out.write("                            margin-top: 15px;\"><a href=\"other_schedule.jsp\" style=\"color: white;\n");
      out.write("                         text-decoration: none;\">Check</a></button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <p style=\"margin-top: 20px;\n");
      out.write("                       font-weight: bold;\">Today's schedule</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-9\" style=\"margin-top: 20px;\">\n");
      out.write("                    <div style=\"margin-bottom: 40px;\">\n");
      out.write("                        <div style=\"text-align: center;\">\n");
      out.write("                            <h5 style=\"color: #EF7F1B;\">Date: 02-08-2021</h5> \n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                            <table class=\"table\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"col\">STT</th>\n");
      out.write("                                        <th scope=\"col\">Teacher's Name</th>\n");
      out.write("                                        <th scope=\"col\">Subject's Code</th>\n");
      out.write("                                        <th scope=\"col\">Subject's Name</th>\n");
      out.write("                                        <th scope=\"col\">Class's Name</th>\n");
      out.write("                                        <th scope=\"col\">Number</th>\n");
      out.write("                                        <th scope=\"col\">Time Slot</th>\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">1</th>\n");
      out.write("                                        <td>Nguyen Hai Linh</td>\n");
      out.write("                                        <td>PRJ301</td>\n");
      out.write("                                        <td>Java Web Application</td>\n");
      out.write("                                        <td><a href=\"attendence.jsp\">SE1511</a></td>\n");
      out.write("                                        <td>30</td>\n");
      out.write("                                        <td>7:30-9:30</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">2</th>\n");
      out.write("                                        <td>Nguyen Hai Linh</td>\n");
      out.write("                                        <td>PRJ301</td>\n");
      out.write("                                        <td>Java Web Application</td>\n");
      out.write("                                        <td><a href=\"attendence.jsp\">SE1511</a></td>\n");
      out.write("                                        <td>30</td>\n");
      out.write("                                        <td>7:30-9:30</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                    <tr>\n");
      out.write("                                        <th scope=\"row\">3</th>\n");
      out.write("                                        <td>Nguyen Hai Linh</td>\n");
      out.write("                                        <td>PRJ301</td>\n");
      out.write("                                        <td>Java Web Application</td>\n");
      out.write("                                        <td><a href=\"attendence.jsp\">SE1511</a></td>\n");
      out.write("                                        <td>30</td>\n");
      out.write("                                        <td>7:30-9:30</td>\n");
      out.write("                                    </tr>\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <!--time 2-->\n");
      out.write("                    <div>\n");
      out.write("                        <div style=\"text-align: center;\">\n");
      out.write("                            <h5 style=\"color: #EF7F1B;\">Date: 02-08-2021</h5> \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"alert alert-warning\" role=\"alert\">\n");
      out.write("                            You don't have a schedule today.\n");
      out.write("                        </div>\n");
      out.write("                        \n");
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
