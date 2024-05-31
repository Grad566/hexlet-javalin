package gg.jte.generated.ondemand.sessions;
import org.example.hexlet.NamedRoutes;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "sessions/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,2,2,2,2,2,4,4,5,5,5,5,5,5,5,5,5,20,20,20,20,20,20,20,20};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <form");
				var __jte_html_attribute_0 = NamedRoutes.sessionsPath();
				if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
					jteOutput.writeContent(" action=\"");
					jteOutput.setContext("form", "action");
					jteOutput.writeUserContent(__jte_html_attribute_0);
					jteOutput.setContext("form", null);
					jteOutput.writeContent("\"");
				}
				jteOutput.writeContent(" method=\"post\">\r\n        <div class=\"mb-3\">\r\n        <label class=\"form-label\">\r\n            Enter your NickName\r\n            <input class=\"form-control\" type=\"text\" placeholder=\"Nickname\" name=\"nickname\">\r\n        </label>\r\n        </div>\r\n        <div class=\"mb-3\">\r\n        <label class=\"form-label\">\r\n            Enter password\r\n            <input class=\"form-control\" type=\"password\" placeholder=\"Password\" name=\"password\">\r\n        </label>\r\n        </div>\r\n        <button type=\"submit\" class=\"btn btn-primary\">Sign In</button>\r\n    </form>\r\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
