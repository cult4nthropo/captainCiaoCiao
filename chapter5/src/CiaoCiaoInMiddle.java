package src;

public class CiaoCiaoInMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isCiaoCiaoInMiddle("CiaoCiao"));
		System.out.println(isSubstringInMiddle("Tell CiaoCiao this", "CiaoCiao"));

	}
	
	public static boolean isCiaoCiaoInMiddle(String s) {
		String ciaoCiao = "CiaoCiao";
		if (!s.contains(ciaoCiao)) {
			return false;
		}
		int ciaoCiaoStart = s.indexOf(ciaoCiao);
		int ciaoCiaoEnd = s.lastIndexOf(ciaoCiao) + ciaoCiao.length();
		
		if (!(ciaoCiaoStart == (s.length() - ciaoCiaoEnd)))  {
			return false;
		}
		return true;
	}
	//Second version without contains
	public static boolean isSubstringInMiddle(String s, String substring) {
		if (substring.length() > s.length()) {
			return false;
		}
		int startSubstring = s.length()/2 - substring.length()/2;
		boolean regionMatches = s.regionMatches(startSubstring, substring, 0, substring.length());
		return regionMatches;
	}

}
