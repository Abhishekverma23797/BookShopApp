/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.54
 * Generated at: 2021-12-11 04:14:32 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Connection;
import com.DB.DBConnect;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/All_Component/footer.jsp", Long.valueOf(1638878733846L));
    _jspx_dependants.put("/All_Component/navbar.jsp", Long.valueOf(1638880445929L));
    _jspx_dependants.put("/All_Component/AllCss.jsp", Long.valueOf(1638867051448L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("com.DB.DBConnect");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Ebook: Index</title>\r\n");
      out.write("<!-- CSS only -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- JavaScript Bundle with Popper -->\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("	integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-Fo3rlrZj/k7ujTnHg4CGR2D7kSs0v4LLanw2qksYuRlEzO+tcaEPQogQ0KaoGN26/zrn20ImR1DfuLWnOo7aBA==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"All_Component/style.css\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write(".back-img {\r\n");
      out.write("	background: url(\"img/bb.jpg\");\r\n");
      out.write("	height: 80vh;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("	background-size: cover;\r\n");
      out.write("	background-repeat: no-repeat;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".card-ho:hover{\r\n");
      out.write(" background-color: #fcf7f7\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #f7f7f7\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("<div class=\"container-fluid p-3\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("		<div class=\"col-md-3\">\r\n");
      out.write("\r\n");
      out.write("			<h3>\r\n");
      out.write("\r\n");
      out.write("				<i class=\"fas fa-book\"></i> BookShop\r\n");
      out.write("			</h3>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"col-md-6\">\r\n");
      out.write("			<form class=\"d-flex\">\r\n");
      out.write("				<input class=\"form-control me-2 my-lg-0\" type=\"search\"\r\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("				<button class=\"btn btn-outline-primary\" type=\"submit\">Search</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"col-md-3\">\r\n");
      out.write("\r\n");
      out.write("			<a href=\"Login.jsp\" class=\"btn btn-success \"><i class=\"fas fa-sign-in-alt\"></i>  Login</a> <a\r\n");
      out.write("				href=\"Register.jsp\" class=\"btn btn-primary\"><i class=\"fas fa-user-plus\"></i>  Register</a>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-dark bg-custom\">\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<a class=\"navbar-brand\" href=\"#\"><i class=\"fas fa-home\"></i></a>\r\n");
      out.write("		<button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\"\r\n");
      out.write("			data-bs-target=\"#navbarSupportedContent\"\r\n");
      out.write("			aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("			aria-label=\"Toggle navigation\">\r\n");
      out.write("			<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("		</button>\r\n");
      out.write("		<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("			<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link active\"\r\n");
      out.write("					aria-current=\"page\" href=\"#\"> Home</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><i\r\n");
      out.write("						class=\"fas fa-book-open\"></i>Recent Book</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">New Book</a></li>\r\n");
      out.write("\r\n");
      out.write("				<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\">Old Book</a>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<form class=\"from-inline my-2 my-lg-0\">\r\n");
      out.write("				<button class=\"btn btn-danger my-2 my-sm-0 ml-1\" type=\"submit\">\r\n");
      out.write("					<i class=\"fas fa-cogs\"></i>  Setting\r\n");
      out.write("				</button>\r\n");
      out.write("				<button class=\"btn btn-success\" type=\"submit\">\r\n");
      out.write("					<i class=\"fas fa-phone-square-alt\"></i>  Contact Us\r\n");
      out.write("				</button>\r\n");
      out.write("			</form>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid back-img\">\r\n");
      out.write("		\r\n");
      out.write("	</div>\r\n");
      out.write("	");
  Connection con =DBConnect.getConn();
		out.println(con);
	
      out.write("\r\n");
      out.write("<!-- Start Recent book -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h3 class=\"text-center\">Recent Book</h3>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 50px; height: 60px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"text-center mt-1\">\r\n");
      out.write("		<a href=\"\" class=\"btn btn-danger btn-sm text-white\">View All</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End Recent Book -->\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	\r\n");
      out.write("	<!-- Start New book -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h3 class=\"text-center\">New Book</h3>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"\" class=\"btn btn-success btn-sm mt-1\"><i class=\"fas fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"text-center mt-1\">\r\n");
      out.write("		<a href=\"\" class=\"btn btn-danger btn-sm text-white\">View All</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End New Book -->\r\n");
      out.write("	\r\n");
      out.write("	<hr>\r\n");
      out.write("	<!-- Start Old book -->\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h3 class=\"text-center\">Old Book</h3>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card card-ho\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"bookimg\" src=\"bookimg/b2.jpg\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>Android App Development</p>\r\n");
      out.write("						<p>Michael Burton</p>\r\n");
      out.write("						<p>Categories:New</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							\r\n");
      out.write("							<a href=\"\" class=\"btn btn-primary	 btn-sm mt-1\">View Details</a>\r\n");
      out.write("							<a href=\"\" class=\"btn btn-danger btn-sm mt-1\">Price</a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"text-center mt-1\">\r\n");
      out.write("		<a href=\"\" class=\"btn btn-danger btn-sm text-white\">View All</a>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- End Old Book -->\r\n");
      out.write("	\r\n");
      out.write("	");
      out.write("<div class=\"conatiner-fluid text-center text-white p-3 mt-2 bg-dark \" >\r\n");
      out.write("\r\n");
      out.write("<h5>@Desing And Developed by Group 8</h5>\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
