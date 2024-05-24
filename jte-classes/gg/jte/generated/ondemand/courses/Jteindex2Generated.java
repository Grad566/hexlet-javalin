package gg.jte.generated.ondemand.courses;
import org.example.hexlet.dto.courses.CoursesPage;
public final class Jteindex2Generated {
	public static final String JTE_NAME = "courses/index2.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,16,16,16,16,16,16,16,16,16,16,21,21,23,23,24,24,25,25,25,25,25,25,25,26,26,27,27,32,32,32,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CoursesPage page) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n    <head>\r\n        <meta charset=\"UTF-8\" />\r\n        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n        <title>Searcher</title>\r\n        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n    </head>\r\n    <body>\r\n        <h1>Поисковик курсов</h1>\r\n\r\n        <form action=\"/courses\" method=\"get\">\r\n            <label for=\"searchTerm\">Enter the term:</label>\r\n            <input type=\"text\" id=\"searchTerm\" name=\"term\"");
		var __jte_html_attribute_0 = page.getTerm();
		if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
			jteOutput.writeContent(" value=\"");
			jteOutput.setContext("input", "value");
			jteOutput.writeUserContent(__jte_html_attribute_0);
			jteOutput.setContext("input", null);
			jteOutput.writeContent("\"");
		}
		jteOutput.writeContent("/>\r\n            <button type=\"submit\" class=\"btn btn-primary\">Search</button>\r\n        </form>\r\n        <h2>Result</h2>\r\n        <ul>\r\n            ");
		if (page.getCourses().isEmpty()) {
			jteOutput.writeContent("\r\n                <li>Not found</li>\r\n            ");
		} else {
			jteOutput.writeContent("\r\n                ");
			for (var course : page.getCourses()) {
				jteOutput.writeContent("\r\n                    <li><a href=\"courses/");
				jteOutput.setContext("a", "href");
				jteOutput.writeUserContent(course.getId());
				jteOutput.setContext("a", null);
				jteOutput.writeContent("\">");
				jteOutput.setContext("a", null);
				jteOutput.writeUserContent(course.getName());
				jteOutput.writeContent("</a></li>\r\n                ");
			}
			jteOutput.writeContent("\r\n            ");
		}
		jteOutput.writeContent("\r\n        </ul>\r\n        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n    </body>\r\n</html>\r\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		CoursesPage page = (CoursesPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
