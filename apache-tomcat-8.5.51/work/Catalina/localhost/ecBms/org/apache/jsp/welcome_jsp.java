/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.51
 * Generated at: 2020-04-09 09:20:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kiiik.bms.model.user.User;
import com.kiiik.bms.util.Constants;

public final class welcome_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kiiik.bms.util.Constants");
    _jspx_imports_classes.add("com.kiiik.bms.model.user.User");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <title>欢迎</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"css/jquery-ui.min.css\" />\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\"/>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-1.11.2.min.js\"></script>  \r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.form.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("\t\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t\t.welcomeLabel{\r\n");
      out.write("\t\t\tfont:normal 13px arial sansserif;\r\n");
      out.write("\t\t\tcolor:#FFFFFF;\r\n");
      out.write("\t\t\tmargin-left:30px;\r\n");
      out.write("\t\t\tletter-spacing:2px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.informationLabel{\r\n");
      out.write("\t\t\tfont:normal 13px arial sansserif;\r\n");
      out.write("\t\t\tcolor:#0066FF;\r\n");
      out.write("\t\t\tmargin-left:10px;\r\n");
      out.write("\t\t\tletter-spacing:2px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ta:link { text-decoration: none;color:#0066FF;}\r\n");
      out.write("\t　　 a:active { text-decoration:none;color:#0066FF;}\r\n");
      out.write("\t　　 a:hover { text-decoration:none;color:#0066FF;} \r\n");
      out.write("\t　　 a:visited { text-decoration:none;color:#0066FF;}\r\n");
      out.write("\t</style>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("  \t");

  		User user = (User) request.getSession().getAttribute(Constants.USER_SESSION);
  	
      out.write("\r\n");
      out.write("\t\t<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n");
      out.write("\t\t  <tr>\r\n");
      out.write("\t\t    <td style=\"background:#0064b0; width:100%; height:16px; float:left\">\r\n");
      out.write("\t\t    <label class=\"welcomeLabel\">欢迎您");
      out.print(user.getTrueName() );
      out.write("，这是您第");
      out.print(user.getLoginCount() );
      out.write("次登录\r\n");
      out.write("\t\t    </label>\r\n");
      out.write("\t\t    <label class=\"informationLabel\">\r\n");
      out.write("\t\t    \t<a href=\"pageAction/changepwd\" style=\"color:#FFDD55;text-decoration:none;\" target=\"rightFrame\">修改密码</a>\r\n");
      out.write("\t\t    </label>\r\n");
      out.write("\t\t    </td>\r\n");
      out.write("\t\t  </tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
