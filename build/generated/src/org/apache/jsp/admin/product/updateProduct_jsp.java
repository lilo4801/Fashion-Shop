package org.apache.jsp.admin.product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateProduct_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<form class=\"mt-5\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/update-product\"\n");
      out.write("      enctype=\"multipart/form-data\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <label for=\"name\">Name</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"name\" placeholder=\"Enter name\" name=\"name\"\n");
      out.write("                   <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                       value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                    </c:if>\n");
      out.write("                   \n");
      out.write("                   >\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <label for=\"category\">Category</label>\n");
      out.write("\n");
      out.write("            <select class=\"form-control\" id=\"category\" name=\"categoryId\">\n");
      out.write("                <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                    <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"category\">\n");
      out.write("                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                 <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate != null && productUpdate.getCategoryId() eq category.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                   selected\n");
      out.write("                                 </c:if>\n");
      out.write("                                >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                    </c:forEach>\n");
      out.write("                </c:if>\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <label for=\"size\">Size:</label>\n");
      out.write("            <select class=\"form-control\" id=\"size\" name=\"size\">\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arraySize}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"size\">\n");
      out.write("                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                 <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate != null && productUpdate.getSize() eq size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                   selected\n");
      out.write("                                 </c:if>\n");
      out.write("                                >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${size}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                    </c:forEach>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <label for=\"color\">Color:</label>\n");
      out.write("            <select class=\"form-control\" id=\"color\" name=\"color\">\n");
      out.write("                <c:forEach items=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${arrayColor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" var=\"color\">\n");
      out.write("                        <option value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                                 <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate != null && productUpdate.getColor() eq color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                                   selected\n");
      out.write("                                 </c:if>\n");
      out.write("                                >");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${color}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</option>\n");
      out.write("                    </c:forEach>\n");
      out.write("\n");
      out.write("            </select>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <label for=\"price\">Price:</label>\n");
      out.write("\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"price\" placeholder=\"Enter price\" name=\"price\"\n");
      out.write("                  <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                       value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                    </c:if>\n");
      out.write("                   >\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <label for=\"quantity\">Quantity:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" id=\"quantity\" placeholder=\"Enter quantity\" name=\"quantity\"\n");
      out.write("                   <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                       value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate.getUnitInStock()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                    </c:if>\n");
      out.write("      \n");
      out.write("                   >\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <label for=\"file\">Choose image:</label>\n");
      out.write("            <input type=\"text\" name=\"fileOld\" class=\"form-control\" hidden value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate.getImage()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" onchange=\"loadFile(event)\"/>\n");
      out.write("            <input type=\"file\" name=\"file\" class=\"form-control\" id=\"file\"  onchange=\"loadFile(event)\"/>\n");
      out.write("     \n");
      out.write("                \n");
      out.write("           \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-9\">\n");
      out.write("            <label for=\"exampleFormControlTextarea1\">Description:</label>\n");
      out.write("            <textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"5\" placeholder=\"Enter description\" name=\"description\"\n");
      out.write("                      <c:if test=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate != null}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                       value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productUpdate.getDescription()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"\n");
      out.write("                        </c:if>\n");
      out.write("                      \n");
      out.write("                      ></textarea>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-md-3 mt-3\">\n");
      out.write("            <input type=\"submit\" value=\"Upload\" class=\"btn btn-dark\"/>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"col-md-6 mt-3\">\n");
      out.write("            <p><img id=\"output\" width=\"90%\" /></p>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"col-md-3 mt-3\">\n");
      out.write("            \n");
      out.write("        </div>           \n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <script>\n");
      out.write("        var loadFile = function (event) {\n");
      out.write("            var image = document.getElementById('output');\n");
      out.write("            image.src = URL.createObjectURL(event.target.files[0]);\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("\n");
      out.write("</form>");
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
