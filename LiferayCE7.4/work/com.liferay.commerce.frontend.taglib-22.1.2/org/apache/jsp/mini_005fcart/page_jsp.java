package org.apache.jsp.mini_005fcart;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.util.HtmlUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import java.util.Map;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/mini_cart/init.jsp");
    _jspx_dependants.add("/META-INF/c.tld");
    _jspx_dependants.add("/META-INF/liferay-aui.tld");
    _jspx_dependants.add("/META-INF/liferay-theme.tld");
    _jspx_dependants.add("/META-INF/liferay-ui.tld");
  }

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

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_0.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_0 = _jspx_th_liferay$1theme_defineObjects_0.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
        _jspx_th_liferay$1theme_defineObjects_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_0);
      _jspx_th_liferay$1theme_defineObjects_0.release();
      com.liferay.portal.kernel.theme.ThemeDisplay themeDisplay = null;
      com.liferay.portal.kernel.model.Company company = null;
      com.liferay.portal.kernel.model.User user = null;
      com.liferay.portal.kernel.model.User realUser = null;
      com.liferay.portal.kernel.model.Contact contact = null;
      com.liferay.portal.kernel.model.Layout layout = null;
      java.util.List layouts = null;
      java.lang.Long plid = null;
      com.liferay.portal.kernel.model.LayoutTypePortlet layoutTypePortlet = null;
      java.lang.Long scopeGroupId = null;
      com.liferay.portal.kernel.security.permission.PermissionChecker permissionChecker = null;
      java.util.Locale locale = null;
      java.util.TimeZone timeZone = null;
      com.liferay.portal.kernel.model.Theme theme = null;
      com.liferay.portal.kernel.model.ColorScheme colorScheme = null;
      com.liferay.portal.kernel.theme.PortletDisplay portletDisplay = null;
      java.lang.Long portletGroupId = null;
      themeDisplay = (com.liferay.portal.kernel.theme.ThemeDisplay) _jspx_page_context.findAttribute("themeDisplay");
      company = (com.liferay.portal.kernel.model.Company) _jspx_page_context.findAttribute("company");
      user = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("user");
      realUser = (com.liferay.portal.kernel.model.User) _jspx_page_context.findAttribute("realUser");
      contact = (com.liferay.portal.kernel.model.Contact) _jspx_page_context.findAttribute("contact");
      layout = (com.liferay.portal.kernel.model.Layout) _jspx_page_context.findAttribute("layout");
      layouts = (java.util.List) _jspx_page_context.findAttribute("layouts");
      plid = (java.lang.Long) _jspx_page_context.findAttribute("plid");
      layoutTypePortlet = (com.liferay.portal.kernel.model.LayoutTypePortlet) _jspx_page_context.findAttribute("layoutTypePortlet");
      scopeGroupId = (java.lang.Long) _jspx_page_context.findAttribute("scopeGroupId");
      permissionChecker = (com.liferay.portal.kernel.security.permission.PermissionChecker) _jspx_page_context.findAttribute("permissionChecker");
      locale = (java.util.Locale) _jspx_page_context.findAttribute("locale");
      timeZone = (java.util.TimeZone) _jspx_page_context.findAttribute("timeZone");
      theme = (com.liferay.portal.kernel.model.Theme) _jspx_page_context.findAttribute("theme");
      colorScheme = (com.liferay.portal.kernel.model.ColorScheme) _jspx_page_context.findAttribute("colorScheme");
      portletDisplay = (com.liferay.portal.kernel.theme.PortletDisplay) _jspx_page_context.findAttribute("portletDisplay");
      portletGroupId = (java.lang.Long) _jspx_page_context.findAttribute("portletGroupId");
      out.write('\n');
      out.write('\n');

long accountEntryId = (Long)request.getAttribute("liferay-commerce:cart:accountEntryId");
Map<String, String> cartViews = (Map<String, String>)request.getAttribute("liferay-commerce:cart:cartViews");
String checkoutURL = (String)request.getAttribute("liferay-commerce:cart:checkoutURL");
long commerceChannelGroupId = (Long)request.getAttribute("liferay-commerce:cart:commerceChannelGroupId");
long commerceChannelId = (Long)request.getAttribute("liferay-commerce:cart:commerceChannelId");
String commerceCurrencyCode = (String)request.getAttribute("liferay-commerce:cart:commerceCurrencyCode");
boolean displayDiscountLevels = (boolean)request.getAttribute("liferay-commerce:cart:displayDiscountLevels");
boolean displayTotalItemsQuantity = (boolean)request.getAttribute("liferay-commerce:cart:displayTotalItemsQuantity");
int itemsQuantity = (int)request.getAttribute("liferay-commerce:cart:itemsQuantity");
Map<String, String> labels = (Map<String, String>)request.getAttribute("liferay-commerce:cart:labels");
String orderDetailURL = (String)request.getAttribute("liferay-commerce:cart:orderDetailURL");
long orderId = (long)request.getAttribute("liferay-commerce:cart:orderId");
String productURLSeparator = (String)request.getAttribute("liferay-commerce:cart:productURLSeparator");
boolean requestCodeEnabled = (boolean)request.getAttribute("liferay-commerce:cart:requestQuoteEnabled");
String siteDefaultURL = (String)request.getAttribute("liferay-commerce:cart:siteDefaultURL");
boolean toggleable = (boolean)request.getAttribute("liferay-commerce:cart:toggleable");

String randomNamespace = PortalUtil.generateRandomKey(request, "taglib") + StringPool.UNDERLINE;

String miniCartId = randomNamespace + "cart";

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('	');
if (
 commerceChannelId == 0 ) {
      out.write("\n");
      out.write("\t\t<div class=\"alert alert-info mx-auto\">\n");
      out.write("\t\t\t");
      if (_jspx_meth_liferay$1ui_message_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t");
      out.write('\n');
      out.write('	');
}
else {
      out.write("\n");
      out.write("\t\t<div class=\"cart-root\" id=\"");
      out.print( miniCartId );
      out.write("\"></div>\n");
      out.write("\n");
      out.write("\t\t");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setRequire("commerce-frontend-js/components/mini_cart/entry as Cart");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\tvar initialProps = {\n");
          out.write("\t\t\t\taccountId: ");
          out.print( accountEntryId );
          out.write(",\n");
          out.write("\t\t\t\tcartActionURLs: {\n");
          out.write("\t\t\t\t\tcheckoutURL: '");
          out.print( HtmlUtil.escapeJS(checkoutURL) );
          out.write("',\n");
          out.write("\t\t\t\t\torderDetailURL: '");
          out.print( HtmlUtil.escapeJS(orderDetailURL) );
          out.write("',\n");
          out.write("\t\t\t\t\tproductURLSeparator: '");
          out.print( HtmlUtil.escapeJS(productURLSeparator) );
          out.write("',\n");
          out.write("\t\t\t\t\tsiteDefaultURL: '");
          out.print( HtmlUtil.escapeJS(siteDefaultURL) );
          out.write("',\n");
          out.write("\t\t\t\t},\n");
          out.write("\t\t\t\tchannel: {\n");
          out.write("\t\t\t\t\tcurrencyCode: '");
          out.print( commerceCurrencyCode );
          out.write("',\n");
          out.write("\t\t\t\t\tgroupId: ");
          out.print( commerceChannelGroupId );
          out.write(",\n");
          out.write("\t\t\t\t\tid: ");
          out.print( commerceChannelId );
          out.write(",\n");
          out.write("\t\t\t\t},\n");
          out.write("\t\t\t\tdisplayDiscountLevels: ");
          out.print( displayDiscountLevels );
          out.write(",\n");
          out.write("\t\t\t\tdisplayTotalItemsQuantity: ");
          out.print( displayTotalItemsQuantity );
          out.write(",\n");
          out.write("\t\t\t\titemsQuantity: ");
          out.print( itemsQuantity );
          out.write(",\n");
          out.write("\t\t\t\torderId: ");
          out.print( orderId );
          out.write(",\n");
          out.write("\t\t\t\trequestQuoteEnabled: ");
          out.print( requestCodeEnabled );
          out.write(",\n");
          out.write("\t\t\t\ttoggleable: ");
          out.print( toggleable );
          out.write(",\n");
          out.write("\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\t");

			if (!cartViews.isEmpty()) {
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\tinitialProps.cartViews = {};\n");
          out.write("\n");
          out.write("\t\t\t\t");

				for (Map.Entry<String, String> cartView : cartViews.entrySet()) {
				
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\tinitialProps.cartViews['");
          out.print( cartView.getKey() );
          out.write("'] = {\n");
          out.write("\t\t\t\t\t\tcontentRendererModuleUrl: '");
          out.print( cartView.getValue() );
          out.write("',\n");
          out.write("\t\t\t\t\t};\n");
          out.write("\n");
          out.write("\t\t\t\t");

					}
				}

				if (!labels.isEmpty()) {
				
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\tinitialProps.labels = {};\n");
          out.write("\n");
          out.write("\t\t\t\t");

				for (Map.Entry<String, String> label : labels.entrySet()) {
				
          out.write("\n");
          out.write("\n");
          out.write("\t\t\t\t\tinitialProps.labels['");
          out.print( label.getKey() );
          out.write("'] = '");
          out.print( label.getValue() );
          out.write("';\n");
          out.write("\n");
          out.write("\t\t\t");

				}
			}
			
          out.write("\n");
          out.write("\n");
          out.write("\t\t\tCart.default('");
          out.print( miniCartId );
          out.write("', '");
          out.print( miniCartId );
          out.write("', initialProps);\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_aui_script_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE)
          out = _jspx_page_context.popBody();
      }
      if (_jspx_th_aui_script_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
        _jspx_th_aui_script_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_script_0);
      _jspx_th_aui_script_0.release();
      out.write('\n');
      out.write('	');
      out.write('\n');
}
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

  private boolean _jspx_meth_liferay$1ui_message_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent(null);
    _jspx_th_liferay$1ui_message_0.setKey("this-site-does-not-have-a-channel");
    int _jspx_eval_liferay$1ui_message_0 = _jspx_th_liferay$1ui_message_0.doStartTag();
    if (_jspx_th_liferay$1ui_message_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
      _jspx_th_liferay$1ui_message_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_0);
    _jspx_th_liferay$1ui_message_0.release();
    return false;
  }
}
