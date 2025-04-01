package aprPrac;

public class FindCapitalCharCount {
	
	public static void main(String[] args) {
		String str = "Vinod Narwade";
		int count =0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				count--;
			}
		}
		System.out.println("Upper Case Character Count: " + count);
	}

}
