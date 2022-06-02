package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mainIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/./resources/html/header/header.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end_begin;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_forEach_var_items_end_begin = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_forEach_var_items_end_begin.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- basic -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"initial-scale=1, maximum-scale=1\">\n");
      out.write("        <!-- site metas -->\n");
      out.write("        <title>Fashion</title>\n");
      out.write("        <!-- bootstrap css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/vendor/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- style css -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"resources/css/mainIndex/mainIndex.css\">\n");
      out.write("        <!-- Responsive-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mainIndex/responsive.css\">\n");
      out.write("\n");
      out.write("        <!-- Scrollbar Custom CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mainIndex/jquery.mCustomScrollbar.min.css\">\n");
      out.write("        <!-- Tweaks for older IEs-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css\">\n");
      out.write("        <!-- fonts -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:400,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <!-- font awesome -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <!--  -->\n");
      out.write("        <!-- owl stylesheets -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Great+Vibes|Poppins:400,700&display=swap&subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"resources/css/mainIndex/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesoeet\" href=\"resources/css/mainIndex/owl.theme.default.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css\" media=\"screen\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- banner bg main start --> \n");
      out.write("        ");
      out.write("\n");
      out.write("<div class=\"banner_bg_main\">\n");
      out.write("\n");
      out.write("    <div class=\"header_section mt-5\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"containt_main\">\n");
      out.write("                <div id=\"mySidenav\" class=\"sidenav\">\n");
      out.write("                    <a href=\"javascript:void(0)\" class=\"closebtn\" onclick=\"closeNav()\">&times;</a>\n");
      out.write("                    <a href=\"home\">Home</a>\n");
      out.write("                    <a href=\"products\">Fashion</a>\n");
      out.write("                    <a href=\"#\">Electronic</a>\n");
      out.write("                    <a href=\"#\">Jewellery</a>\n");
      out.write("                </div>\n");
      out.write("                <span class=\"toggle_icon\" onclick=\"openNav()\"><img src=\"resources/image/toggle-icon.png\"></span>\n");
      out.write("                <div class=\"dropdown\">\n");
      out.write("                    <button class=\"btn btn-secondary dropdown-toggle\" type=\"button\" id=\"dropdownMenuButton\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">All Category \n");
      out.write("                    </button>\n");
      out.write("                    <form class=\"dropdown-menu\" aria-labelledby=\"dropdownMenuButton\" method=\"get\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/filter-product\">\n");
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"main\">\n");
      out.write("                    <!-- Another variation with a button -->\n");
      out.write("                    <form class=\"input-group\"  action=\"/ProjectWeb/products\" method=\"get\">\n");
      out.write("\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"search\" placeholder=\"Search product\">\n");
      out.write("                        <div class=\"input-group-append\">\n");
      out.write("                            <button class=\"btn btn-secondary\" type=\"submit\" style=\"background-color: #f26522; border-color:#f26522 \">\n");
      out.write("                                <i class=\"fa fa-search\"></i>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                    <form autocomplete=\"off\" action=\"/action_page.php\">\n");
      out.write("                        <div class=\"autocomplete\" style=\"width:300px;\">\n");
      out.write("                            <input id=\"myInput\" type=\"text\" name=\"myCountry\" placeholder=\"Country\">\n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\">\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"header_box\">\n");
      out.write("\n");
      out.write("                    <div class=\"login_menu\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li style=\"    margin-top: 6px;\">\n");
      out.write("                                <a href=\"cart\">\n");
      out.write("                                    <i class=\"fa fa-shopping-cart\" aria-hidden=\"true\"></i>\n");
      out.write("                                    <span class=\"padding_10\">Cart</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li>\n");
      out.write("                                <div class=\"lang_box \">\n");
      out.write("                                    <a href=\"#\" title=\"Language\" class=\"nav-link\" data-toggle=\"dropdown\" aria-expanded=\"true\">\n");
      out.write("                                        <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                                        <span class=\"padding_10\">Account</span></a\n");
      out.write("                                    </a>\n");
      out.write("\n");
      out.write("                                    <div class=\"dropdown-menu \">\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                        ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- header section end -->\n");
      out.write("    <!-- banner section start -->\n");
      out.write("    <div class=\"banner_section layout_padding\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"my_slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <h1 class=\"banner_taital\">Get Start <br>Your favriot shoping</h1>\n");
      out.write("                                <div class=\"buynow_bt\"><a href=\"products\">Buy Now</a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <h1 class=\"banner_taital\">Get Start <br>Your favriot shoping</h1>\n");
      out.write("                                <div class=\"buynow_bt\"><a href=\"products\">Buy Now</a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-sm-12\">\n");
      out.write("                                <h1 class=\"banner_taital\">Get Start <br>Your favriot shoping</h1>\n");
      out.write("                                <div class=\"buynow_bt\"><a href=\"products\">Buy Now</a></div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#my_slider\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#my_slider\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- banner section end -->\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <!-- banner bg main end -->\n");
      out.write("        <!-- fashion section start -->\n");
      out.write("        <div class=\"fashion_section\">\n");
      out.write("            <div id=\"main_slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\">Man & Woman Fashion</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("          \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\">Man & Woman Fashion</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_6(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\">Man & Woman Fashion</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_8(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#main_slider\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#main_slider\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- fashion section end -->\n");
      out.write("        <!-- electronic section start -->\n");
      out.write("        <div class=\"fashion_section\">\n");
      out.write("            <div id=\"electronic_main_slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\">Pants</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_10(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\">Pants</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_12(_jspx_page_context))
        return;
      out.write("   \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\">Pants</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_14(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#electronic_main_slider\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#electronic_main_slider\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- electronic section end -->\n");
      out.write("        <!-- jewellery  section start -->\n");
      out.write("        <div class=\"jewellery_section\">\n");
      out.write("            <div id=\"jewellery_main_slider\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("                    <div class=\"carousel-item active\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\"> Jacket</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_16(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\"> Jacket</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_17(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"carousel-item\">\n");
      out.write("                        <div class=\"container\">\n");
      out.write("                            <h1 class=\"fashion_taital\"> Jacket</h1>\n");
      out.write("                            <div class=\"fashion_section_2\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_18(_jspx_page_context))
        return;
      out.write(" \n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"carousel-control-prev\" href=\"#jewellery_main_slider\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                    <i class=\"fa fa-angle-left\"></i>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"carousel-control-next\" href=\"#jewellery_main_slider\" role=\"button\" data-slide=\"next\">\n");
      out.write("                    <i class=\"fa fa-angle-right\"></i>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"loader_main\">\n");
      out.write("                    <div class=\"loader\"></div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- jewellery  section end -->\n");
      out.write("        <!-- footer section start -->\n");
      out.write("        <div class=\"footer_section layout_padding\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"footer_logo\"><a href=\"index.html\"><img src=\"images/footer-logo.png\"></a></div>\n");
      out.write("                <div class=\"input_bt\">\n");
      out.write("                    <input type=\"text\" class=\"mail_bt\" placeholder=\"Your Email\" name=\"Your Email\">\n");
      out.write("                    <span class=\"subscribe_bt\" id=\"basic-addon2\"><a href=\"#\">Subscribe</a></span>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"footer_menu\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"#\">Best Sellers</a></li>\n");
      out.write("                        <li><a href=\"#\">Gift Ideas</a></li>\n");
      out.write("                        <li><a href=\"#\">New Releases</a></li>\n");
      out.write("                        <li><a href=\"#\">Today's Deals</a></li>\n");
      out.write("                        <li><a href=\"#\">Customer Service</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"location_main\">Help Line  Number : <a href=\"#\">+1 1800 1200 1200</a></div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- footer section end -->\n");
      out.write("        <!-- copyright section start -->\n");
      out.write("        <div class=\"copyright_section\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p class=\"copyright_text\">© 2020 All Rights Reserved. </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- copyright section end -->\n");
      out.write("        <!-- Javascript files-->\n");
      out.write("        <script src=\"resources/vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"resources/vendor/bootstrap/js/popper.min.js\"></script>\n");
      out.write("        <script src=\"resources/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"resources/vendor/jquery/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/plugin.js\"></script>\n");
      out.write("        <!-- sidebar -->\n");
      out.write("        <script src=\"resources/js/jquery.mCustomScrollbar.concat.min.js\"></script>\n");
      out.write("        <script src=\"resources/js/custom.js\"></script>\n");
      out.write("        <script src=\"resources/js/search.js\"></script>s\n");
      out.write("        <script>\n");
      out.write("            function openNav() {\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"250px\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function closeNav() {\n");
      out.write("                document.getElementById(\"mySidenav\").style.width = \"0\";\n");
      out.write("            }\n");
      out.write("        </script>\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_0);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${categoryList}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("category");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                <div class=\"dropdown-item\">\n");
          out.write("                                    <input type=\"submit\" name=\"filterCategory\" id=\"shop-filter_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                    <label for=\"shop-filter_");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${category.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</label>\n");
          out.write("                                </div>\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a href=\"login\" class=\"dropdown-item\">\n");
        out.write("                                                Login\n");
        out.write("                                            </a>\n");
        out.write("                                            <a href=\"register\" class=\"dropdown-item\">\n");
        out.write("                                                Sign Up\n");
        out.write("                                            </a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <a href=\"#\" class=\"dropdown-item\">\n");
        out.write("                                                Hi, ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getFirstName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                            </a>\n");
        out.write("                                            <a href=\"profile\" class=\"dropdown-item\">\n");
        out.write("                                                Account Setting\n");
        out.write("                                            </a>\n");
        out.write("                                            ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            <a href=\"listOrders\" class=\"dropdown-item\">\n");
        out.write("                                                Pendding order\n");
        out.write("                                            </a>\n");
        out.write("                                            <a href=\"logout\" class=\"dropdown-item\">\n");
        out.write("                                                Logout\n");
        out.write("                                            </a>\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_2);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${user.getRole() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <a href=\"admin\" class=\"dropdown-item\">\n");
        out.write("                                                    Admin\n");
        out.write("                                                </a>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID1 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_4, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_4, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_4);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setBegin(0);
    _jspx_th_c_forEach_1.setEnd(2);
    _jspx_th_c_forEach_1.setVar("product");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getStatus() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"col-lg-4 col-sm-4\">\n");
        out.write("                                                    <div class=\"box_main\">\n");
        out.write("                                                        <h4 class=\"shirt_text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\n");
        out.write("                                                        <p class=\"price_text\">Price  <span style=\"color: #262626;\">$ ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\n");
        out.write("                                                        <div class=\"tshirt_img\"><img src=\"uploads/product/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></div>\n");
        out.write("                                                        <div class=\"btn_main\">\n");
        out.write("                                                            <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
        out.write("                                                            <div class=\"seemore_bt\"><a href=\"product?idProduct=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">See More</a></div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent(null);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID1 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setBegin(3);
    _jspx_th_c_forEach_2.setEnd(5);
    _jspx_th_c_forEach_2.setVar("product");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_2, _jspx_page_context, _jspx_push_body_count_c_forEach_2))
            return true;
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_2, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_2)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_2);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getStatus() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"col-lg-4 col-sm-4\">\n");
        out.write("                                                    <div class=\"box_main\">\n");
        out.write("                                                        <h4 class=\"shirt_text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\n");
        out.write("                                                        <p class=\"price_text\">Price  <span style=\"color: #262626;\">$ ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\n");
        out.write("                                                        <div class=\"tshirt_img\"><img src=\"uploads/product/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></div>\n");
        out.write("                                                        <div class=\"btn_main\">\n");
        out.write("                                                            <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
        out.write("                                                            <div class=\"seemore_bt\"><a href=\"product?idProduct=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">See More</a></div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent(null);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID1 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_8);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID1}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setBegin(6);
    _jspx_th_c_forEach_3.setEnd(8);
    _jspx_th_c_forEach_3.setVar("product");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getStatus() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"col-lg-4 col-sm-4\">\n");
        out.write("                                                    <div class=\"box_main\">\n");
        out.write("                                                        <h4 class=\"shirt_text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\n");
        out.write("                                                        <p class=\"price_text\">Price  <span style=\"color: #262626;\">$ ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\n");
        out.write("                                                        <div class=\"tshirt_img\"><img src=\"uploads/product/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></div>\n");
        out.write("                                                        <div class=\"btn_main\">\n");
        out.write("                                                            <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
        out.write("                                                            <div class=\"seemore_bt\"><a href=\"product?idProduct=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">See More</a></div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_if_10(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent(null);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID3 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID3}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setBegin(0);
    _jspx_th_c_forEach_4.setEnd(2);
    _jspx_th_c_forEach_4.setVar("product");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_4, _jspx_page_context, _jspx_push_body_count_c_forEach_4))
            return true;
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_4, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_4)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_4);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getStatus() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"col-lg-4 col-sm-4\">\n");
        out.write("                                                    <div class=\"box_main\">\n");
        out.write("                                                        <h4 class=\"shirt_text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\n");
        out.write("                                                        <p class=\"price_text\">Price  <span style=\"color: #262626;\">$ ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\n");
        out.write("                                                        <div class=\"tshirt_img\"><img src=\"uploads/product/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></div>\n");
        out.write("                                                        <div class=\"btn_main\">\n");
        out.write("                                                            <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
        out.write("                                                            <div class=\"seemore_bt\"><a href=\"product?idProduct=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">See More</a></div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_if_12(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent(null);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID3 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_12, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_12, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_12);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID3}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setBegin(3);
    _jspx_th_c_forEach_5.setEnd(5);
    _jspx_th_c_forEach_5.setVar("product");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getStatus() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"col-lg-4 col-sm-4\">\n");
        out.write("                                                    <div class=\"box_main\">\n");
        out.write("                                                        <h4 class=\"shirt_text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\n");
        out.write("                                                        <p class=\"price_text\">Price  <span style=\"color: #262626;\">$ ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\n");
        out.write("                                                        <div class=\"tshirt_img\"><img src=\"uploads/product/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></div>\n");
        out.write("                                                        <div class=\"btn_main\">\n");
        out.write("                                                            <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
        out.write("                                                            <div class=\"seemore_bt\"><a href=\"product?idProduct=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">See More</a></div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_if_14(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent(null);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID3 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_14, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_c_forEach_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_14, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_6.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_14);
    _jspx_th_c_forEach_6.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID3}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_6.setBegin(6);
    _jspx_th_c_forEach_6.setEnd(8);
    _jspx_th_c_forEach_6.setVar("product");
    int[] _jspx_push_body_count_c_forEach_6 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
      if (_jspx_eval_c_forEach_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            ");
          if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_6, _jspx_page_context, _jspx_push_body_count_c_forEach_6))
            return true;
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_6.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_6.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_6);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_6, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_6)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_6);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getStatus() == 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                <div class=\"col-lg-4 col-sm-4\">\n");
        out.write("                                                    <div class=\"box_main\">\n");
        out.write("                                                        <h4 class=\"shirt_text\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h4>\n");
        out.write("                                                        <p class=\"price_text\">Price  <span style=\"color: #262626;\">$ ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span></p>\n");
        out.write("                                                        <div class=\"tshirt_img\"><img src=\"uploads/product/");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"></div>\n");
        out.write("                                                        <div class=\"btn_main\">\n");
        out.write("                                                            <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
        out.write("                                                            <div class=\"seemore_bt\"><a href=\"product?idProduct=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">See More</a></div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_if_16(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent(null);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID5 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_16, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_c_forEach_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_16, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_7.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_16);
    _jspx_th_c_forEach_7.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID5}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_7.setBegin(0);
    _jspx_th_c_forEach_7.setEnd(2);
    _jspx_th_c_forEach_7.setVar("product");
    int[] _jspx_push_body_count_c_forEach_7 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
      if (_jspx_eval_c_forEach_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-lg-4 col-sm-4\">\n");
          out.write("                                                <div class=\"box_main\">\n");
          out.write("                                                    <h4 class=\"shirt_text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                    <p class=\"price_text\">Start Price  <span style=\"color: #262626;\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></p>\n");
          out.write("                                                    <div class=\"jewellery_img\"><img src=\"uploads/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></div>\n");
          out.write("                                                    <div class=\"btn_main\">\n");
          out.write("                                                        <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
          out.write("                                                        <div class=\"seemore_bt\"><a href=\"product?idProduct=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">See More</a></div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_7.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_7.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_7);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_17(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent(null);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID5 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_17, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_forEach_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_17, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_8 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_8.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_17);
    _jspx_th_c_forEach_8.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID5}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_8.setBegin(6);
    _jspx_th_c_forEach_8.setEnd(8);
    _jspx_th_c_forEach_8.setVar("product");
    int[] _jspx_push_body_count_c_forEach_8 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_8 = _jspx_th_c_forEach_8.doStartTag();
      if (_jspx_eval_c_forEach_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-lg-4 col-sm-4\">\n");
          out.write("                                                <div class=\"box_main\">\n");
          out.write("                                                    <h4 class=\"shirt_text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                    <p class=\"price_text\">Start Price  <span style=\"color: #262626;\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></p>\n");
          out.write("                                                    <div class=\"jewellery_img\"><img src=\"uploads/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></div>\n");
          out.write("                                                    <div class=\"btn_main\">\n");
          out.write("                                                        <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
          out.write("                                                        <div class=\"seemore_bt\"><a href=\"product?idProduct=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">See More</a></div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_8.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_8.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_8);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_18(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent(null);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID5 != null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_18, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_c_forEach_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_18, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_9 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end_begin.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_9.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_18);
    _jspx_th_c_forEach_9.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${productListID5}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_9.setBegin(3);
    _jspx_th_c_forEach_9.setEnd(5);
    _jspx_th_c_forEach_9.setVar("product");
    int[] _jspx_push_body_count_c_forEach_9 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_9 = _jspx_th_c_forEach_9.doStartTag();
      if (_jspx_eval_c_forEach_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <div class=\"col-lg-4 col-sm-4\">\n");
          out.write("                                                <div class=\"box_main\">\n");
          out.write("                                                    <h4 class=\"shirt_text\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h4>\n");
          out.write("                                                    <p class=\"price_text\">Start Price  <span style=\"color: #262626;\">$ ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getUnitPrice()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</span></p>\n");
          out.write("                                                    <div class=\"jewellery_img\"><img src=\"uploads/product/");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getImage().split(\" \")[0]}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"></div>\n");
          out.write("                                                    <div class=\"btn_main\">\n");
          out.write("                                                        <div class=\"buy_bt\"><a href=\"products\">Buy Now</a></div>\n");
          out.write("                                                        <div class=\"seemore_bt\"><a href=\"product?idProduct=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">See More</a></div>\n");
          out.write("                                                    </div>\n");
          out.write("                                                </div>\n");
          out.write("                                            </div>\n");
          out.write("\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_9.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_9.doFinally();
      _jspx_tagPool_c_forEach_var_items_end_begin.reuse(_jspx_th_c_forEach_9);
    }
    return false;
  }
}
