package src;

public class HTMLElement {

	public static void main(String[] args) {
		
		System.out.println(createHtmlElement("strong", "Strong is bold"));
		System.out.println(bold(emphazised("Strong + emphazised")));
		System.out.println(createHtmlElement("span", null));
		System.out.println(createHtmlElement("", "no"));
		System.out.println(createHtmlElement(null, "not bold"));
		System.out.println(createHtmlElement(null, null));

	}
	
	public static String createHtmlElement(String tag, String content) {
		
		String createdElement = "";
		
		if (tag == null || tag.isEmpty()) {
			if (content == null) {
				return createdElement;
			} else {
				createdElement = content;
			}
		} else {
			if (content == null) {
				content = "";
			}
			createdElement = "<" + tag + ">" + content + "</" + tag + ">";
		}
		return createdElement;
	}
	
	public static String bold(String content) {
		return createHtmlElement("strong", content);
	}
	
	public static String emphazised(String content) {
		return createHtmlElement("em", content);
	}

}
