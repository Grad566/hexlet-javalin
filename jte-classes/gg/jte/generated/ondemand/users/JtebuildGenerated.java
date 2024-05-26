package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.courses.BuildUserPage;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,11,11,11,13,13,14,14,15,15,15,16,16,17,17,19,19,48,48,48,1,1,1,1};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, BuildUserPage page) {
		jteOutput.writeContent("\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\" />\r\n    <meta name=\"viewport\">\r\n    <title>Sing in</title>\r\n</head>\r\n<body>\r\n");
		if (page.getErrors() != null) {
			jteOutput.writeContent("\r\n    <ul>\r\n        ");
			for (var validator : page.getErrors().values()) {
				jteOutput.writeContent("\r\n            ");
				for (var error : validator) {
					jteOutput.writeContent("\r\n                <li>");
					jteOutput.setContext("li", null);
					jteOutput.writeUserContent(error.getMessage());
					jteOutput.writeContent("</li>\r\n            ");
				}
				jteOutput.writeContent("\r\n        ");
			}
			jteOutput.writeContent("\r\n    </ul>\r\n");
		}
		jteOutput.writeContent("\r\n<form action=\"/users\" method=\"post\">\r\n    <div>\r\n        <label>\r\n            Name\r\n            <input type=\"text\" name=\"name\" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Email\r\n            <input type=\"email\" required name=\"email\" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Password\r\n            <input type=\"password\" required name=\"password\">\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Confirm password\r\n            <input type=\"password\" required name=\"passwordConfirmation\">\r\n        </label>\r\n    </div>\r\n    <button type=\"submit\">Submit</button>\r\n</form>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		BuildUserPage page = (BuildUserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
