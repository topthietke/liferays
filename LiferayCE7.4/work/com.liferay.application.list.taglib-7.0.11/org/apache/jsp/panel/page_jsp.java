package org.apache.jsp.panel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.PanelAppRegistry;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.PanelCategoryRegistry;
import com.liferay.application.list.constants.ApplicationListWebKeys;
import com.liferay.application.list.display.context.logic.PanelCategoryHelper;
import com.liferay.application.list.taglib.display.context.logic.PanelAppContentHelper;
import com.liferay.application.list.taglib.internal.display.context.ContentPanelCategoryDisplayContext;
import com.liferay.application.list.taglib.internal.util.PanelAppUtil;
import com.liferay.application.list.taglib.internal.util.PanelCategoryUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.util.List;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.PanelAppRegistry;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.PanelCategoryRegistry;
import com.liferay.application.list.constants.ApplicationListWebKeys;
import com.liferay.application.list.display.context.logic.PanelCategoryHelper;
import com.liferay.application.list.taglib.display.context.logic.PanelAppContentHelper;
import com.liferay.application.list.taglib.internal.display.context.ContentPanelCategoryDisplayContext;
import com.liferay.application.list.taglib.internal.util.PanelAppUtil;
import com.liferay.application.list.taglib.internal.util.PanelCategoryUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.util.List;
import com.liferay.application.list.PanelApp;
import com.liferay.application.list.PanelAppRegistry;
import com.liferay.application.list.PanelCategory;
import com.liferay.application.list.PanelCategoryRegistry;
import com.liferay.application.list.constants.ApplicationListWebKeys;
import com.liferay.application.list.display.context.logic.PanelCategoryHelper;
import com.liferay.application.list.taglib.display.context.logic.PanelAppContentHelper;
import com.liferay.application.list.taglib.internal.display.context.ContentPanelCategoryDisplayContext;
import com.liferay.application.list.taglib.internal.util.PanelAppUtil;
import com.liferay.application.list.taglib.internal.util.PanelCategoryUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Layout;
import com.liferay.portal.kernel.service.LayoutLocalServiceUtil;
import com.liferay.portal.kernel.util.HashMapBuilder;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.taglib.servlet.PipingServletResponseFactory;
import java.util.List;

public final class page_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/panel/init.jsp");
    _jspx_dependants.add("/init.jsp");
    _jspx_dependants.add("/panel/panel_app.jspf");
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

List<PanelCategory> childPanelCategories = (List<PanelCategory>)request.getAttribute("liferay-application-list:panel:childPanelCategories");
PanelCategory panelCategory = (PanelCategory)request.getAttribute("liferay-application-list:panel:panelCategory");

PanelAppRegistry panelAppRegistry = (PanelAppRegistry)request.getAttribute(ApplicationListWebKeys.PANEL_APP_REGISTRY);
PanelCategoryRegistry panelCategoryRegistry = (PanelCategoryRegistry)request.getAttribute(ApplicationListWebKeys.PANEL_CATEGORY_REGISTRY);

PanelCategoryHelper panelCategoryHelper = new PanelCategoryHelper(panelAppRegistry, panelCategoryRegistry);

      out.write("\n");
      out.write("\n");
      out.write("<ul aria-orientation=\"vertical\" class=\"m-1 p-0\" id=\"");
      if (_jspx_meth_portlet_namespace_0(_jspx_page_context))
        return;
      out.print( panelCategory.getKey() );
      out.write("_panel\" role=\"menubar\">\n");
      out.write("\t<li class=\"list-group\" role=\"none\">\n");
      out.write("\n");
      out.write("\t\t");

		for (PanelCategory childPanelCategory : childPanelCategories) {
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t");
if (
 !childPanelCategory.include(request, PipingServletResponseFactory.createPipingServletResponse(pageContext)) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");

				List<PanelApp> childPanelCategoryPanelApps = PanelCategoryUtil.getPanelApps(request, panelAppRegistry, childPanelCategory);
				
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
if (
 childPanelCategoryPanelApps.isEmpty() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t");
      //  liferay-application-list:panel
      com.liferay.application.list.taglib.servlet.taglib.PanelTag _jspx_th_liferay$1application$1list_panel_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.application.list.taglib.servlet.taglib.PanelTag.class) : new com.liferay.application.list.taglib.servlet.taglib.PanelTag();
      _jspx_th_liferay$1application$1list_panel_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1application$1list_panel_0.setParent(null);
      _jspx_th_liferay$1application$1list_panel_0.setPanelCategory( childPanelCategory );
      int _jspx_eval_liferay$1application$1list_panel_0 = _jspx_th_liferay$1application$1list_panel_0.doStartTag();
      if (_jspx_th_liferay$1application$1list_panel_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1application$1list_panel_0);
        _jspx_th_liferay$1application$1list_panel_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1application$1list_panel_0);
      _jspx_th_liferay$1application$1list_panel_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t\t");
}
else {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");

						boolean active = PanelCategoryUtil.isActive(request, childPanelCategoryPanelApps, childPanelCategory, childPanelCategories, panelCategoryHelper);

						String id = PanelCategoryUtil.getId(childPanelCategory);
						int notificationsCount = PanelCategoryUtil.getNotificationsCount(request, childPanelCategory, panelCategoryHelper);
						
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<a aria-expanded=\"");
      out.print( active );
      out.write("\" class=\"");
      out.print( PanelCategoryUtil.isHeaderActive(request, childPanelCategory, panelCategoryHelper) ? "active" : "" );
      out.write(" collapse-icon collapse-icon-middle nav-link ");
      out.print( active ? StringPool.BLANK : "collapsed" );
      out.write(" list-group-heading panel-header\" data-qa-id=\"appGroup\" data-toggle=\"liferay-collapse\" href=\"#");
      out.print( id );
      out.write("\" id=\"");
      out.print( id );
      out.write("-link\" role=\"menuitem\">\n");
      out.write("\t\t\t\t\t\t\t");
if (
 !childPanelCategory.includeHeader(request, PipingServletResponseFactory.createPipingServletResponse(pageContext)) ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      out.print( childPanelCategory.getLabel(themeDisplay.getLocale()) );
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
if (
 notificationsCount > 0 ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
      //  clay:badge
      com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag _jspx_th_clay_badge_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag();
      _jspx_th_clay_badge_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_badge_0.setParent(null);
      _jspx_th_clay_badge_0.setCssClass("float-right panel-notifications-count");
      _jspx_th_clay_badge_0.setDynamicAttribute(null, "data-qa-id", new String("notificationsCount"));
      _jspx_th_clay_badge_0.setDisplayType("danger");
      _jspx_th_clay_badge_0.setLabel( String.valueOf(notificationsCount) );
      int _jspx_eval_clay_badge_0 = _jspx_th_clay_badge_0.doStartTag();
      if (_jspx_th_clay_badge_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_0);
        _jspx_th_clay_badge_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_0);
      _jspx_th_clay_badge_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      if (_jspx_meth_clay_icon_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t</a>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"collapse ");
      out.print( active ? "show" : StringPool.BLANK );
      out.write("\" id=\"");
      out.print( id );
      out.write("\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"list-group-item\">\n");
      out.write("\t\t\t\t\t\t\t\t");
if (
 childPanelCategory.isAllowScopeLayouts() ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									Group curSite = themeDisplay.getSiteGroup();

									List<Layout> scopeLayouts = LayoutLocalServiceUtil.getScopeGroupLayouts(curSite.getGroupId());
									
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");
if (
 !scopeLayouts.isEmpty() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"scope-selector\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

											Group curScopeGroup = themeDisplay.getScopeGroup();
											
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
      //  clay:content-row
      com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag _jspx_th_clay_content$1row_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentRowTag();
      _jspx_th_clay_content$1row_0.setPageContext(_jspx_page_context);
      _jspx_th_clay_content$1row_0.setParent(null);
      _jspx_th_clay_content$1row_0.setVerticalAlign("center");
      int _jspx_eval_clay_content$1row_0 = _jspx_th_clay_content$1row_0.doStartTag();
      if (_jspx_eval_clay_content$1row_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_0.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1col_0.setExpand( true );
        int _jspx_eval_clay_content$1col_0 = _jspx_th_clay_content$1col_0.doStartTag();
        if (_jspx_eval_clay_content$1col_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<span class=\"scope-name\">\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
if (
 curScopeGroup.isLayout() ) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.print( curScopeGroup.getDescriptiveName(locale) );
          out.write(' ');
          out.write('(');
          if (_jspx_meth_liferay$1ui_message_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_0, _jspx_page_context))
            return;
          out.write(")\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
else {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          if (_jspx_meth_liferay$1ui_message_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_clay_content$1col_0, _jspx_page_context))
            return;
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
}
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</span>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
          _jspx_th_clay_content$1col_0.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_0);
        _jspx_th_clay_content$1col_0.release();
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");

												ContentPanelCategoryDisplayContext contentPanelCategoryDisplayContext = new ContentPanelCategoryDisplayContext(request);
												
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        //  clay:content-col
        com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag _jspx_th_clay_content$1col_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.ContentColTag();
        _jspx_th_clay_content$1col_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_content$1col_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1row_0);
        int _jspx_eval_clay_content$1col_1 = _jspx_th_clay_content$1col_1.doStartTag();
        if (_jspx_eval_clay_content$1col_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t");
          //  clay:dropdown-menu
          com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag _jspx_th_clay_dropdown$1menu_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.DropdownMenuTag();
          _jspx_th_clay_dropdown$1menu_0.setPageContext(_jspx_page_context);
          _jspx_th_clay_dropdown$1menu_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_1);
          _jspx_th_clay_dropdown$1menu_0.setBorderless( true );
          _jspx_th_clay_dropdown$1menu_0.setCssClass("text-light");
          _jspx_th_clay_dropdown$1menu_0.setDisplayType("secondary");
          _jspx_th_clay_dropdown$1menu_0.setDropdownItems( contentPanelCategoryDisplayContext.getScopesDropdownItemList() );
          _jspx_th_clay_dropdown$1menu_0.setIcon("cog");
          _jspx_th_clay_dropdown$1menu_0.setMonospaced( true );
          int _jspx_eval_clay_dropdown$1menu_0 = _jspx_th_clay_dropdown$1menu_0.doStartTag();
          if (_jspx_th_clay_dropdown$1menu_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_0);
            _jspx_th_clay_dropdown$1menu_0.release();
            return;
          }
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_dropdown$1menu_0);
          _jspx_th_clay_dropdown$1menu_0.release();
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
        }
        if (_jspx_th_clay_content$1col_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
          _jspx_th_clay_content$1col_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1col_1);
        _jspx_th_clay_content$1col_1.release();
        out.write("\n");
        out.write("\t\t\t\t\t\t\t\t\t\t\t");
      }
      if (_jspx_th_clay_content$1row_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
        _jspx_th_clay_content$1row_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_content$1row_0);
      _jspx_th_clay_content$1row_0.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<ul aria-labelledby=\"");
      out.print( id );
      out.write("-link\" class=\"nav nav-equal-height nav-stacked\" role=\"menu\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									for (PanelApp panelApp : childPanelCategoryPanelApps) {
									
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t");
      out.write('\n');
      out.write('\n');
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
      out.write("\n");
      out.write("\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_1.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_1 = _jspx_th_liferay$1theme_defineObjects_1.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_1);
        _jspx_th_liferay$1theme_defineObjects_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_1);
      _jspx_th_liferay$1theme_defineObjects_1.release();
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
if (
 !panelApp.include(request, response) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t");

	String url = PanelAppUtil.getURL(request, panelApp);
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 Validator.isNotNull(url) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

		String label = PanelAppUtil.getLabel(request, panelApp);
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t<li class=\"");
      out.print( PanelAppUtil.isActive(request, panelApp) ? "active" : StringPool.BLANK );
      out.write(" nav-item\" role=\"presentation\">\n");
      out.write("\t\t\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
      _jspx_th_aui_a_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_0.setParent(null);
      _jspx_th_aui_a_0.setAriaRole("menuitem");
      _jspx_th_aui_a_0.setCssClass("nav-link");
      _jspx_th_aui_a_0.setData(
					HashMapBuilder.<String, Object>put(
						"qa-id", "app"
					).put(
						"title", label
					).build()
				);
      _jspx_th_aui_a_0.setHref( url );
      _jspx_th_aui_a_0.setId( "portlet_" + panelApp.getPortletId() );
      int _jspx_eval_aui_a_0 = _jspx_th_aui_a_0.doStartTag();
      if (_jspx_eval_aui_a_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        out.print( label );
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t");
if (
 panelApp.getNotificationsCount(user) > 0 ) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  clay:badge
        com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag _jspx_th_clay_badge_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag();
        _jspx_th_clay_badge_1.setPageContext(_jspx_page_context);
        _jspx_th_clay_badge_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_0);
        _jspx_th_clay_badge_1.setCssClass("float-right");
        _jspx_th_clay_badge_1.setDisplayType("danger");
        _jspx_th_clay_badge_1.setLabel( String.valueOf(panelApp.getNotificationsCount(user)) );
        int _jspx_eval_clay_badge_1 = _jspx_th_clay_badge_1.doStartTag();
        if (_jspx_th_clay_badge_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_1);
          _jspx_th_clay_badge_1.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_1);
        _jspx_th_clay_badge_1.release();
        out.write("\n");
        out.write("\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_aui_a_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
        _jspx_th_aui_a_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_0);
      _jspx_th_aui_a_0.release();
      out.write("\n");
      out.write("\t\t</li>\n");
      out.write("\t");
}
      out.write('\n');
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t");

									}
									
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t");
      //  liferay-application-list:panel
      com.liferay.application.list.taglib.servlet.taglib.PanelTag _jspx_th_liferay$1application$1list_panel_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.application.list.taglib.servlet.taglib.PanelTag.class) : new com.liferay.application.list.taglib.servlet.taglib.PanelTag();
      _jspx_th_liferay$1application$1list_panel_1.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1application$1list_panel_1.setParent(null);
      _jspx_th_liferay$1application$1list_panel_1.setPanelCategory( childPanelCategory );
      int _jspx_eval_liferay$1application$1list_panel_1 = _jspx_th_liferay$1application$1list_panel_1.doStartTag();
      if (_jspx_th_liferay$1application$1list_panel_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1application$1list_panel_1);
        _jspx_th_liferay$1application$1list_panel_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1application$1list_panel_1);
      _jspx_th_liferay$1application$1list_panel_1.release();
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t");
if (
 childPanelCategory.isPersistState() ) {
      out.write("\n");
      out.write("\t\t\t\t\t\t\t");
      //  aui:script
      com.liferay.taglib.aui.ScriptTag _jspx_th_aui_script_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ScriptTag.class) : new com.liferay.taglib.aui.ScriptTag();
      _jspx_th_aui_script_0.setPageContext(_jspx_page_context);
      _jspx_th_aui_script_0.setParent(null);
      _jspx_th_aui_script_0.setPosition("auto");
      int _jspx_eval_aui_script_0 = _jspx_th_aui_script_0.doStartTag();
      if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        if (_jspx_eval_aui_script_0 != javax.servlet.jsp.tagext.Tag.EVAL_BODY_INCLUDE) {
          out = _jspx_page_context.pushBody();
          _jspx_th_aui_script_0.setBodyContent((javax.servlet.jsp.tagext.BodyContent) out);
          _jspx_th_aui_script_0.doInitBody();
        }
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tLiferay.on('liferay.collapse.hidden', (event) => {\n");
          out.write("\t\t\t\t\t\t\t\t\tvar panelId = event.panel.getAttribute('id');\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\tif (panelId === '");
          out.print( id );
          out.write("') {\n");
          out.write("\t\t\t\t\t\t\t\t\t\tLiferay.Util.Session.set(\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t'");
          out.print( PanelCategory.class.getName() );
          out.print( id );
          out.write("',\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t'closed'\n");
          out.write("\t\t\t\t\t\t\t\t\t\t);\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t});\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\tLiferay.on('liferay.collapse.shown', (event) => {\n");
          out.write("\t\t\t\t\t\t\t\t\tvar panelId = event.panel.getAttribute('id');\n");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\tif (panelId === '");
          out.print( id );
          out.write("') {\n");
          out.write("\t\t\t\t\t\t\t\t\t\tLiferay.Util.Session.set(\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t'");
          out.print( PanelCategory.class.getName() );
          out.print( id );
          out.write("',\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t'open'\n");
          out.write("\t\t\t\t\t\t\t\t\t\t);\n");
          out.write("\t\t\t\t\t\t\t\t\t}\n");
          out.write("\t\t\t\t\t\t\t\t});\n");
          out.write("\t\t\t\t\t\t\t");
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
      out.write("\n");
      out.write("\t\t\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t");
}
      out.write("\n");
      out.write("\t\t\t");
}
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

		}
		
      out.write("\n");
      out.write("\n");
      out.write("\t</li>\n");
      out.write("\n");
      out.write("\t");

	for (PanelApp panelApp : panelAppRegistry.getPanelApps(panelCategory.getKey(), permissionChecker, themeDisplay.getScopeGroup())) {
	
      out.write("\n");
      out.write("\n");
      out.write("\t\t<li class=\"list-group\" role=\"none\">\n");
      out.write("\t\t\t<div class=\"list-group-heading panel-app-root panel-header ");
      out.print( PanelAppUtil.isActive(request, panelApp) ? "active" : StringPool.BLANK );
      out.write("\">\n");
      out.write("\t\t\t\t");
      out.write('\n');
      out.write('\n');
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
      out.write("\n");
      out.write("\n");
      //  liferay-theme:defineObjects
      com.liferay.taglib.theme.DefineObjectsTag _jspx_th_liferay$1theme_defineObjects_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.theme.DefineObjectsTag.class) : new com.liferay.taglib.theme.DefineObjectsTag();
      _jspx_th_liferay$1theme_defineObjects_2.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1theme_defineObjects_2.setParent(null);
      int _jspx_eval_liferay$1theme_defineObjects_2 = _jspx_th_liferay$1theme_defineObjects_2.doStartTag();
      if (_jspx_th_liferay$1theme_defineObjects_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_2);
        _jspx_th_liferay$1theme_defineObjects_2.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1theme_defineObjects_2);
      _jspx_th_liferay$1theme_defineObjects_2.release();
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
if (
 !panelApp.include(request, response) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t");

	String url = PanelAppUtil.getURL(request, panelApp);
	
      out.write("\n");
      out.write("\n");
      out.write("\t");
if (
 Validator.isNotNull(url) ) {
      out.write("\n");
      out.write("\n");
      out.write("\t\t");

		String label = PanelAppUtil.getLabel(request, panelApp);
		
      out.write("\n");
      out.write("\n");
      out.write("\t\t<li class=\"");
      out.print( PanelAppUtil.isActive(request, panelApp) ? "active" : StringPool.BLANK );
      out.write(" nav-item\" role=\"presentation\">\n");
      out.write("\t\t\t");
      //  aui:a
      com.liferay.taglib.aui.ATag _jspx_th_aui_a_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.aui.ATag.class) : new com.liferay.taglib.aui.ATag();
      _jspx_th_aui_a_1.setPageContext(_jspx_page_context);
      _jspx_th_aui_a_1.setParent(null);
      _jspx_th_aui_a_1.setAriaRole("menuitem");
      _jspx_th_aui_a_1.setCssClass("nav-link");
      _jspx_th_aui_a_1.setData(
					HashMapBuilder.<String, Object>put(
						"qa-id", "app"
					).put(
						"title", label
					).build()
				);
      _jspx_th_aui_a_1.setHref( url );
      _jspx_th_aui_a_1.setId( "portlet_" + panelApp.getPortletId() );
      int _jspx_eval_aui_a_1 = _jspx_th_aui_a_1.doStartTag();
      if (_jspx_eval_aui_a_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        out.write("\n");
        out.write("\t\t\t\t");
        out.print( label );
        out.write("\n");
        out.write("\n");
        out.write("\t\t\t\t");
if (
 panelApp.getNotificationsCount(user) > 0 ) {
        out.write("\n");
        out.write("\t\t\t\t\t");
        //  clay:badge
        com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag _jspx_th_clay_badge_2 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.BadgeTag();
        _jspx_th_clay_badge_2.setPageContext(_jspx_page_context);
        _jspx_th_clay_badge_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_aui_a_1);
        _jspx_th_clay_badge_2.setCssClass("float-right");
        _jspx_th_clay_badge_2.setDisplayType("danger");
        _jspx_th_clay_badge_2.setLabel( String.valueOf(panelApp.getNotificationsCount(user)) );
        int _jspx_eval_clay_badge_2 = _jspx_th_clay_badge_2.doStartTag();
        if (_jspx_th_clay_badge_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_2);
          _jspx_th_clay_badge_2.release();
          return;
        }
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_badge_2);
        _jspx_th_clay_badge_2.release();
        out.write("\n");
        out.write("\t\t\t\t");
}
        out.write("\n");
        out.write("\t\t\t");
      }
      if (_jspx_th_aui_a_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_1);
        _jspx_th_aui_a_1.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_aui_a_1);
      _jspx_th_aui_a_1.release();
      out.write("\n");
      out.write("\t\t</li>\n");
      out.write("\t");
}
      out.write('\n');
}
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</li>\n");
      out.write("\n");
      out.write("\t");

	}
	
      out.write("\n");
      out.write("\n");
      out.write("</ul>\n");
      out.write("\n");
      //  liferay-frontend:component
      com.liferay.frontend.taglib.servlet.taglib.ComponentTag _jspx_th_liferay$1frontend_component_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.servlet.taglib.ComponentTag.class) : new com.liferay.frontend.taglib.servlet.taglib.ComponentTag();
      _jspx_th_liferay$1frontend_component_0.setPageContext(_jspx_page_context);
      _jspx_th_liferay$1frontend_component_0.setParent(null);
      _jspx_th_liferay$1frontend_component_0.setContext(
		HashMapBuilder.<String, Object>put(
			"categoryKey", panelCategory.getKey()
		).build()
	);
      _jspx_th_liferay$1frontend_component_0.setModule("{PanelKeyboardHandler} from application-list-taglib");
      int _jspx_eval_liferay$1frontend_component_0 = _jspx_th_liferay$1frontend_component_0.doStartTag();
      if (_jspx_th_liferay$1frontend_component_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
        _jspx_th_liferay$1frontend_component_0.release();
        return;
      }
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1frontend_component_0);
      _jspx_th_liferay$1frontend_component_0.release();
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

  private boolean _jspx_meth_portlet_namespace_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  portlet:namespace
    com.liferay.taglib.portlet.NamespaceTag _jspx_th_portlet_namespace_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.portlet.NamespaceTag.class) : new com.liferay.taglib.portlet.NamespaceTag();
    _jspx_th_portlet_namespace_0.setPageContext(_jspx_page_context);
    _jspx_th_portlet_namespace_0.setParent(null);
    int _jspx_eval_portlet_namespace_0 = _jspx_th_portlet_namespace_0.doStartTag();
    if (_jspx_th_portlet_namespace_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_0);
      _jspx_th_portlet_namespace_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_portlet_namespace_0);
    _jspx_th_portlet_namespace_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_0.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_0.setParent(null);
    _jspx_th_clay_icon_0.setCssClass("collapse-icon-closed");
    _jspx_th_clay_icon_0.setSymbol("angle-right");
    int _jspx_eval_clay_icon_0 = _jspx_th_clay_icon_0.doStartTag();
    if (_jspx_th_clay_icon_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
      _jspx_th_clay_icon_0.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_0);
    _jspx_th_clay_icon_0.release();
    return false;
  }

  private boolean _jspx_meth_clay_icon_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  clay:icon
    com.liferay.frontend.taglib.clay.servlet.taglib.IconTag _jspx_th_clay_icon_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.frontend.taglib.clay.servlet.taglib.IconTag.class) : new com.liferay.frontend.taglib.clay.servlet.taglib.IconTag();
    _jspx_th_clay_icon_1.setPageContext(_jspx_page_context);
    _jspx_th_clay_icon_1.setParent(null);
    _jspx_th_clay_icon_1.setCssClass("collapse-icon-open");
    _jspx_th_clay_icon_1.setSymbol("angle-down");
    int _jspx_eval_clay_icon_1 = _jspx_th_clay_icon_1.doStartTag();
    if (_jspx_th_clay_icon_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
      _jspx_th_clay_icon_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_clay_icon_1);
    _jspx_th_clay_icon_1.release();
    return false;
  }

  private boolean _jspx_meth_liferay$1ui_message_0(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_0.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
    _jspx_th_liferay$1ui_message_0.setKey("scope");
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

  private boolean _jspx_meth_liferay$1ui_message_1(javax.servlet.jsp.tagext.JspTag _jspx_th_clay_content$1col_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  liferay-ui:message
    com.liferay.taglib.ui.MessageTag _jspx_th_liferay$1ui_message_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(com.liferay.taglib.ui.MessageTag.class) : new com.liferay.taglib.ui.MessageTag();
    _jspx_th_liferay$1ui_message_1.setPageContext(_jspx_page_context);
    _jspx_th_liferay$1ui_message_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_clay_content$1col_0);
    _jspx_th_liferay$1ui_message_1.setKey("default-scope");
    int _jspx_eval_liferay$1ui_message_1 = _jspx_th_liferay$1ui_message_1.doStartTag();
    if (_jspx_th_liferay$1ui_message_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
      _jspx_th_liferay$1ui_message_1.release();
      return true;
    }
    if (_jspx_resourceInjector != null) _jspx_resourceInjector.preDestroy(_jspx_th_liferay$1ui_message_1);
    _jspx_th_liferay$1ui_message_1.release();
    return false;
  }
}
