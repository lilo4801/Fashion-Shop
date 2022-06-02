package org.apache.jsp.cart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cart_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/fonts/font-awesome-4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <link href=\"resources/css/cart/cart.css\" rel=\"stylesheet\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-8 cart\">\n");
      out.write("                    <div class=\"title\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <h4><b>Shopping Cart</b></h4>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col align-self-center text-right text-muted\">3 items</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row border-top border-bottom\">\n");
      out.write("                        <div class=\"row main align-items-center\">\n");
      out.write("                            <div class=\"col-2\"><img class=\"img-fluid\" src=\"https://i.imgur.com/1GrakTl.jpg\"></div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"row text-muted\">Shirt</div>\n");
      out.write("                                <div class=\"row\">Cotton T-shirt</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\"> <a href=\"#\">-</a><a href=\"#\" class=\"border\">1</a><a href=\"#\">+</a> </div>\n");
      out.write("                            <div class=\"col\">&euro; 44.00 <span class=\"close\">&#10005;</span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"row main align-items-center\">\n");
      out.write("                            <div class=\"col-2\"><img class=\"img-fluid\" src=\"https://i.imgur.com/ba3tvGm.jpg\"></div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"row text-muted\">Shirt</div>\n");
      out.write("                                <div class=\"row\">Cotton T-shirt</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\"> <a href=\"#\">-</a><a href=\"#\" class=\"border\">1</a><a href=\"#\">+</a> </div>\n");
      out.write("                            <div class=\"col\">&euro; 44.00 <span class=\"close\">&#10005;</span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row border-top border-bottom\">\n");
      out.write("                        <div class=\"row main align-items-center\">\n");
      out.write("                            <div class=\"col-2\"><img class=\"img-fluid\" src=\"https://i.imgur.com/pHQ3xT3.jpg\"></div>\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                <div class=\"row text-muted\">Shirt</div>\n");
      out.write("                                <div class=\"row\">Cotton T-shirt</div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col\"> <a href=\"#\">-</a><a href=\"#\" class=\"border\">1</a><a href=\"#\">+</a> </div>\n");
      out.write("                            <div class=\"col\">&euro; 44.00 <span class=\"close\">&#10005;</span></div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"back-to-shop\"><a href=\"#\">&leftarrow;</a><span class=\"text-muted\">Back to shop</span></div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-4 summary\">\n");
      out.write("                    <div>\n");
      out.write("                        <h5><b>Summary</b></h5>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col\" style=\"padding-left:0;\">ITEMS 3</div>\n");
      out.write("                        <div class=\"col text-right\">&euro; 132.00</div>\n");
      out.write("                    </div>\n");
      out.write("                    <form>\n");
      out.write("                        <p>SHIPPING</p> <select>\n");
      out.write("                            <option class=\"text-muted\">Standard-Delivery- &euro;5.00</option>\n");
      out.write("                        </select>\n");
      out.write("                        <p>GIVE CODE</p> <input id=\"code\" placeholder=\"Enter your code\">\n");
      out.write("                    </form>\n");
      out.write("                    <div class=\"row\" style=\"border-top: 1px solid rgba(0,0,0,.1); padding: 2vh 0;\">\n");
      out.write("                        <div class=\"col\">TOTAL PRICE</div>\n");
      out.write("                        <div class=\"col text-right\">&euro; 137.00</div>\n");
      out.write("                    </div> <button class=\"btn\">CHECKOUT</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script src=\"resources/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"resources/vendor/bootstrap/js/popper.min.js\"></script>\n");
      out.write("    <script src=\"resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <script src=\"resources/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
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
