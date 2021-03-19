package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class search_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction.release();
    _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.release();
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

      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Contact Manager Home</title>\n");
      out.write("       \t\t\t<!-- Bootstrap Core CSS -->\n");
      out.write("\t\t\t    <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t    <!-- MetisMenu CSS -->\n");
      out.write("\t\t\t    <link href=\"css/metisMenu.min.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t    <!-- DataTables CSS -->\n");
      out.write("\t\t\t    <link href=\"css/dataTables.bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t    <!-- DataTables Responsive CSS -->\n");
      out.write("\t\t\t    <link href=\"css/dataTables.responsive.css\" rel=\"stylesheet\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t    <!-- Custom CSS -->\n");
      out.write("\t\t\t    <link href=\"css/sb-admin-2.css\" rel=\"stylesheet\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("     <nav class=\"navbar navbar-default navbar-static-top\" role=\"navigation\" style=\"margin-bottom: 0\">\n");
      out.write("            <div class=\"navbar-header\">\n");
      out.write("                \n");
      out.write("                \t\t<a class=\"navbar-brand\" href=\"list.do\"><div id=\"bigfont\">Laptops List</div></a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("    \t\n");
      out.write("    \t<!-- <div align=\"center\">\n");
      out.write("\t        <h1>Laptops List</h1> -->\n");
      out.write("\t        \n");
      out.write("\t        ");
      if (_jspx_meth_form_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    \t\n");
      out.write("\t\t  <!-- search.do?brand=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${brand}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
      out.write(" -->\n");
      out.write("    \t\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_form_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_form_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_form_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_form_005fform_005f0.setParent(null);
    // /WEB-INF/jsp/search.jsp(37,9) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setAction("search.do");
    // /WEB-INF/jsp/search.jsp(37,9) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setModelAttribute("laptops");
    // /WEB-INF/jsp/search.jsp(37,9) name = method type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_form_005fform_005f0.setMethod("get");
    int[] _jspx_push_body_count_form_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_form_005fform_005f0 = _jspx_th_form_005fform_005f0.doStartTag();
      if (_jspx_eval_form_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t <div class=\"row\">\n");
          out.write("\t\t\t\t        <div class=\"col-lg-12\">\n");
          out.write("\t\t\t\t            <div class=\"panel panel-default\">\n");
          out.write("\t\t\t\t                \n");
          out.write("\t\t\t\t                <!-- /.panel-heading -->\n");
          out.write("\t\t\t\t                <div class=\"panel-body\">\n");
          out.write("\t\t\t\t                    <div class=\"dataTable_wrapper\">\n");
          out.write("\t\t\t\t                    <table>\n");
          out.write("\t\t\t\t                    <tr>\n");
          out.write("\t\t\t\t                      <th width=\"200\">\n");
          out.write("\t\t\t\t                       <select name=\"brand\" class=\"form-control\">\n");
          out.write("\t\t\t                       \t  \t  <option value=\"Dell\">Dell</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"Acer\">Acer</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"Apple\">Apple</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"ASUS\">ASUS</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"HP\">HP</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"Lenovo\">Lenovo</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"Toshiba\">Toshiba</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"HCL\">HCL</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"Sony\">Sony</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"Samsung\">Samsung</option>\n");
          out.write("\t\t\t\t                       </select>\n");
          out.write("\t\t\t\t                     </th>\n");
          out.write("\t\t\t\t                     <th width=\"200\">\n");
          out.write("\t\t\t\t                     \t<select name=\"brandPriority\" class=\"form-control\">\n");
          out.write("\t\t\t\t                     \t\t<option value=\"first\">First Priority</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"second\">Second Priority</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"third\">Third Priority</option>\n");
          out.write("\t\t\t\t                     \t</select>\n");
          out.write("\t\t\t\t                     </th>\n");
          out.write("\t\t\t\t                     \n");
          out.write("\t\t\t\t                     <th width = \"100\"></th>\n");
          out.write("\t\t\t\t                     \n");
          out.write("\t\t\t\t                     <th width=\"200\">\n");
          out.write("\t\t\t\t                       <select name=\"ram\"  class=\"form-control\">\n");
          out.write("\t\t\t\t                           <option value=\"4GB\">4GB</option>\n");
          out.write("\t\t\t\t                       \t   <option value=\"2GB\">2GB</option>\n");
          out.write("\t\t\t\t                       \t   <option value=\"3GB\">3GB</option>\n");
          out.write("\t\t\t\t                       \t   <!-- <option value=\"4GB\">4GB</option> -->\n");
          out.write("\t\t\t\t                       \t   <option value=\"8GB\">8GB</option>\n");
          out.write("\t\t\t\t                       </select>\n");
          out.write("\t\t\t\t                     </th>\n");
          out.write("\t\t\t\t                     <th width=\"200\">\n");
          out.write("\t\t\t\t                     \t<select name=\"brandPriority\" class=\"form-control\">\n");
          out.write("\t\t\t\t                     \t\t<option value=\"first\">First Priority</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"second\">Second Priority</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"third\">Third Priority</option>\n");
          out.write("\t\t\t\t                     \t</select>\n");
          out.write("\t\t\t\t                     </th>\n");
          out.write("\t\t\t\t                     \n");
          out.write("\t\t\t\t                     <th width = \"100\"></th>\n");
          out.write("\t\t\t\t                     \n");
          out.write("\t\t\t\t                     <th width=\"200\">\n");
          out.write("\t\t\t\t                       <select name=\"hdd\"  class=\"form-control\">\n");
          out.write("\t\t\t\t                   \t       <option value=\"500GB\">500GB</option>\n");
          out.write("\t\t\t\t                       \t   <option value=\"128GB\">128GB</option>\n");
          out.write("\t\t\t\t                       \t   <option value=\"512GB\">512GB</option>\n");
          out.write("\t\t\t\t                       \t   <option value=\"1TB\">1TB</option>\n");
          out.write("\t\t\t\t                       </select>\n");
          out.write("\t\t\t\t                      </th>\n");
          out.write("\t\t\t\t                      <th width=\"200\">\n");
          out.write("\t\t\t\t                     \t<select name=\"brandPriority\" class=\"form-control\">\n");
          out.write("\t\t\t\t                     \t\t<option value=\"first\">First Priority</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"second\">Second Priority</option>\n");
          out.write("\t\t\t                       \t  \t  <option value=\"third\">Third Priority</option>\n");
          out.write("\t\t\t\t                     \t</select>\n");
          out.write("\t\t\t\t                     </th>\n");
          out.write("\t\t\t\t                     \n");
          out.write("\t\t\t\t                      <th width = \"100\"></th>\n");
          out.write("\t\t\t\t                      \n");
          out.write("\t\t\t\t                      <th>\n");
          out.write("\t\t\t\t                      <button type=\"submit\" class=\"btn btn-default\">Search</button>\n");
          out.write("\t\t\t\t                      </th>\n");
          out.write("\t\t\t\t                      </tr>\n");
          out.write("\t\t\t\t                      </table>\n");
          out.write("\t\t\t\t\t\t\t\t        <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
          out.write("\t\t\t\t\t\t\t\t        <tr>\n");
          out.write("\t\t\t\t\t\t\t\t       \t\t<th>No</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t<th>Brand</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t<th>Model</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t<th>Processor</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t<th>RAM</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t<th>HDD</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t<th>Price</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t<th>Rating</th>\n");
          out.write("\t\t\t\t\t\t\t\t        \t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t \t");
          if (_jspx_meth_c_005fforEach_005f0(_jspx_th_form_005fform_005f0, _jspx_page_context, _jspx_push_body_count_form_005fform_005f0))
            return true;
          out.write("\t         \t\n");
          out.write("\t\t\t\t\t\t\t\t\t\t</table>\n");
          out.write("\t\t\t\t\t\t\t\t\t  </div>\n");
          out.write("\t\t\t\t                   </div>\n");
          out.write("\t\t\t\t                   <!-- /.panel-body -->\n");
          out.write("\t\t\t\t               </div>\n");
          out.write("\t\t\t\t               <!-- /.panel -->\n");
          out.write("\t\t\t\t           </div>\n");
          out.write("\t\t\t\t           <!-- /.col-lg-12 -->\n");
          out.write("\t\t\t\t       </div>\n");
          out.write("\t\t\t\t");
          int evalDoAfterBody = _jspx_th_form_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_form_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_form_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_form_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_form_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fform_005fform_005fmodelAttribute_005fmethod_005faction.reuse(_jspx_th_form_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_form_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_form_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_form_005fform_005f0);
    // /WEB-INF/jsp/search.jsp(124,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("laptops");
    // /WEB-INF/jsp/search.jsp(124,12) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.laptopsList}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/jsp/search.jsp(124,12) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t        \t<tr>\n");
          out.write("\t\t\t\t\t\t\t\t        \t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${status.index + 1}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.brand}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.model}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.processor}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.ram}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.hdd}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.price}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${laptops.rating}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</td>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t");
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n");
          out.write("\t\t\t\t\t\t\t\t        \t</tr>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
