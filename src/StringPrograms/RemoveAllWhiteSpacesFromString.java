package StringPrograms;

public class RemoveAllWhiteSpacesFromString {

	public static void main(String[] args) {
		String s="Remove All White Spaces From A String 123";
		
		String s1 = s.replaceAll("\\s", "");
		
		System.out.println(s1);

	}

}
