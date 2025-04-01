package Sample;

public class Arreyremovespecialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="shubham@#^&&123";
		int count=0;
		for(int i=0;i<=str.length()-1;i++) {
			
			char ch=str.charAt(i);
			if(((ch>='a')&&(ch<='z'))) {
			//||(ch>='0')&&(ch<='9')
				count++;
				
				
			}
			
			
		}
		str=str.replaceAll("[^a-z A-Z]", "");
		System.out.println(count+ "  "+str);
		
		
		

	}

}
