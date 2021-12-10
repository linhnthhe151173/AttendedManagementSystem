package org.apache.jsp.view.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_005fadmin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>home_admin</title>\n");
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
      out.write("                        <a class=\"nav-link\" href=\"home_admin.jsp\" style=\"color: white;\"><span class=\"fas fa-user\">Welcome: </span>Admin</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"#\" style=\"color: white;\"><span class=\"fas fa-sign-in-alt\"></span>| Logout</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <div class=\"content-wrapper\" style=\"margin-top: 20px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div>\n");
      out.write("                    <h5 style=\"color: #EF7F1B;\n");
      out.write("                        margin-bottom: 20px;\">Total</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("                        <div class=\"card text-white bg-primary o-hidden h-100\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"card-body-icon\">\n");
      out.write("                                    <i class=\"fa fa-fw fa-comments\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mr-5\">Total Subject</div>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"card-footer text-white clearfix small z-1\" href=\"subject.jsp\">\n");
      out.write("                                <span class=\"float-left\">20 Subject</span>\n");
      out.write("                                <span class=\"float-right\">\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("                        <div class=\"card text-white bg-warning o-hidden h-100\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"card-body-icon\">\n");
      out.write("                                    <i class=\"fa fa-fw fa-list\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mr-5\">Total Class</div>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"card-footer text-white clearfix small z-1\" href=\"class.jsp\">\n");
      out.write("                                <span class=\"float-left\">30 Class</span>\n");
      out.write("                                <span class=\"float-right\">\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("                        <div class=\"card text-white bg-success o-hidden h-100\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"card-body-icon\">\n");
      out.write("                                    <i class=\"fa fa-fw fa-shopping-cart\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mr-5\">Total Account</div>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"card-footer text-white clearfix small z-1\" href=\"account.jsp\">\n");
      out.write("                                <span class=\"float-left\">30 Account</span>\n");
      out.write("                                <span class=\"float-right\">\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-xl-3 col-sm-6 mb-3\">\n");
      out.write("                        <div class=\"card text-white bg-danger o-hidden h-100\">\n");
      out.write("                            <div class=\"card-body\">\n");
      out.write("                                <div class=\"card-body-icon\">\n");
      out.write("                                    <i class=\"fa fa-fw fa-support\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"mr-5\">Total Schedule</div>\n");
      out.write("                            </div>\n");
      out.write("                            <a class=\"card-footer text-white clearfix small z-1\" href=\"schedule.jsp\">\n");
      out.write("                                <span class=\"float-left\">100 Schedule</span>\n");
      out.write("                                <span class=\"float-right\">\n");
      out.write("                                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <!-- Area Chart Example-->\n");
      out.write("                <hr>\n");
      out.write("                <h5 style=\"color: #EF7F1B;\n");
      out.write("                    margin-bottom: 20px;\">Detail</h5>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div style=\"margin-top: 20px;\n");
      out.write("                         text-align: center;\" class=\"col-md-2\">\n");
      out.write("                        <table class=\"table table-bordered table-hover\">\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"course.jsp\" style=\"color: black;\">Subject</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"subject.jsp\" style=\"color: black;\">Class</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"teacher.jsp\" style=\"color: black;\">Student</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"assign_subject.jsp\" style=\"color: black;\">Teacher</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"student.jsp\" style=\"color: black;\">Schedule</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><a href=\"student.jsp\" style=\"color: black;\">Attendence Report</a></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-10\" style=\"border: 1px solid #EF7F1B;\">\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
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
