package org.apache.jsp.view.teacher;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class class_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>class_detail</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- header -->\n");
      out.write("        <nav class=\"navbar navbar-expand-md sticky-top\" style=\"background-color: #EF7F1B;margin-bottom: 20px;\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"today_schedule.jsp\" style=\"color: white;\">Attendence Management</a>\n");
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
      out.write("            <div>\n");
      out.write("                <button type=\"button\" class=\"btn\" style=\"background-color: #EF7F1B;\"><a href=\"other_schedule.jsp\" style=\"color: white;\n");
      out.write("                                                                                        text-decoration: none;\">Back</a></button>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"padding-top: 10px;\">\n");
      out.write("                <h4 style=\"text-align: center;\">Class name: <span style=\"color: #EF7F1B;\">SE1511</span></h4>   \n");
      out.write("            </div>\n");
      out.write("            <div style=\"margin-top: 20px;\">\n");
      out.write("                <table class=\"table table-striped\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">STT</th>\n");
      out.write("                            <th scope=\"col\">Image</th>\n");
      out.write("                             <th scope=\"col\">Student Code</th>\n");
      out.write("                            <th scope=\"col\">Email</th>\n");
      out.write("                            <th scope=\"col\">Full Name</th>\n");
      out.write("                            <th scope=\"col\">Date Of Birth</th>\n");
      out.write("                            <th scope=\"col\">Gender</th>\n");
      out.write("                            <th scope=\"col\">Address</th>\n");
      out.write("                            <th scope=\"col\">Phone</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">1</th>\n");
      out.write("                            <td><img src=\"../../img/avatar.png\" style=\"width: 100px;height: 100px;\"></td>\n");
      out.write("                            <td>HE151173</td>\n");
      out.write("                            <td>LinhNTHHE151173@fpt.edu.vn</td>\n");
      out.write("                            <td>Nguyễn Thị Hải Linh</td>\n");
      out.write("                            <td>02-08-2001</td>                            \n");
      out.write("                            <td>Female</td>\n");
      out.write("                            <td>Hai Duong</td>\n");
      out.write("                            <td>12345</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">2</th>\n");
      out.write("                            <td><img src=\"../../img/avatar.png\" style=\"width: 100px;height: 100px;\"></td>\n");
      out.write("                            <td>HE151173</td>\n");
      out.write("                            <td>LinhNTHHE151173@fpt.edu.vn</td>\n");
      out.write("                            <td>Nguyễn Thị Hải Linh</td>\n");
      out.write("                            <td>02-08-2001</td>                            \n");
      out.write("                            <td>Female</td>\n");
      out.write("                            <td>Hai Duong</td>\n");
      out.write("                            <td>12345</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">3</th>\n");
      out.write("                            <td><img src=\"../../img/avatar.png\" style=\"width: 100px;height: 100px;\"></td>\n");
      out.write("                            <td>HE151173</td>\n");
      out.write("                            <td>LinhNTHHE151173@fpt.edu.vn</td>\n");
      out.write("                            <td>Nguyễn Thị Hải Linh</td>\n");
      out.write("                            <td>02-08-2001</td>                            \n");
      out.write("                            <td>Female</td>\n");
      out.write("                            <td>Hai Duong</td>\n");
      out.write("                            <td>12345</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">4</th>\n");
      out.write("                            <td><img src=\"../../img/avatar.png\" style=\"width: 100px;height: 100px;\"></td>\n");
      out.write("                            <td>HE151173</td>\n");
      out.write("                            <td>LinhNTHHE151173@fpt.edu.vn</td>\n");
      out.write("                            <td>Nguyễn Thị Hải Linh</td>\n");
      out.write("                            <td>02-08-2001</td>                            \n");
      out.write("                            <td>Female</td>\n");
      out.write("                            <td>Hai Duong</td>\n");
      out.write("                            <td>12345</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">5</th>\n");
      out.write("                            <td><img src=\"../../img/avatar.png\" style=\"width: 100px;height: 100px;\"></td>\n");
      out.write("                            <td>HE151173</td>\n");
      out.write("                            <td>LinhNTHHE151173@fpt.edu.vn</td>\n");
      out.write("                            <td>Nguyễn Thị Hải Linh</td>\n");
      out.write("                            <td>02-08-2001</td>                            \n");
      out.write("                            <td>Female</td>\n");
      out.write("                            <td>Hai Duong</td>\n");
      out.write("                            <td>12345</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">6</th>\n");
      out.write("                            <td><img src=\"../../img/avatar.png\" style=\"width: 100px;height: 100px;\"></td>\n");
      out.write("                            <td>HE151173</td>\n");
      out.write("                            <td>LinhNTHHE151173@fpt.edu.vn</td>\n");
      out.write("                            <td>Nguyễn Thị Hải Linh</td>\n");
      out.write("                            <td>02-08-2001</td>                            \n");
      out.write("                            <td>Female</td>\n");
      out.write("                            <td>Hai Duong</td>\n");
      out.write("                            <td>12345</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <!-- Footer -->\n");
      out.write("            <footer class=\"page-footer font-small blue\" style=\"margin-top: 10px;\">\n");
      out.write("\n");
      out.write("                <!-- Copyright -->\n");
      out.write("                <div class=\"footer-copyright text-center py-3\">© Powered by <span style=\"color: #EF7F1B;\">Linhnthhe151173</span>\n");
      out.write("                </div>\n");
      out.write("                <!-- Copyright -->\n");
      out.write("\n");
      out.write("            </footer>\n");
      out.write("            <!-- Footer -->\n");
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
