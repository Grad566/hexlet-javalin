package gg.jte.generated.ondemand;
import org.example.hexlet.dto.MainPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,5,5,8,8,10,10,11,11,12,12,12,13,13,14,14,14,14,14,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, MainPage page) {
		jteOutput.writeContent("\r\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\r\n    <h1 class=\"text-body-emphasis\">Hi Hexlet!</h1>\r\n    <p>First site</p>\r\n    ");
				if (!page.isVisited()) {
					jteOutput.writeContent("\r\n        This message is showed just once. To see it again, remove cookies!\r\n    ");
				}
				jteOutput.writeContent("\r\n    ");
				if (page.getCurrentUser() != null) {
					jteOutput.writeContent("\r\n        Welcome, ");
					jteOutput.setContext("html", null);
					jteOutput.writeUserContent(page.getCurrentUser());
					jteOutput.writeContent("!\r\n    ");
				}
				jteOutput.writeContent("\r\n");
			}
		}, null);
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		MainPage page = (MainPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
