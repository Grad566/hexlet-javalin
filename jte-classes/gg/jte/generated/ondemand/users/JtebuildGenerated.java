package gg.jte.generated.ondemand.users;
public final class JtebuildGenerated {
	public static final String JTE_NAME = "users/build.jte";
	public static final int[] JTE_LINE_INFO = {38,38,38,38,38,38,38,38,38,38,38};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor) {
		jteOutput.writeContent("\r\n\r\n<!DOCTYPE html>\r\n<html lang=\"en\">\r\n<head>\r\n    <meta charset=\"UTF-8\" />\r\n    <meta name=\"viewport\">\r\n    <title>Sing in</title>\r\n</head>\r\n<body>\r\n<form action=\"/users\" method=\"post\">\r\n    <div>\r\n        <label>\r\n            Name\r\n            <input type=\"text\" name=\"name\" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Email\r\n            <input type=\"email\" required name=\"email\" />\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Password\r\n            <input type=\"password\" required name=\"password\">\r\n        </label>\r\n    </div>\r\n    <div>\r\n        <label>\r\n            Confirm password\r\n            <input type=\"password\" required name=\"passwordConfirmation\">\r\n        </label>\r\n    </div>\r\n    <button type=\"submit\">Submit</button>\r\n</form>\r\n</body>\r\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		render(jteOutput, jteHtmlInterceptor);
	}
}
