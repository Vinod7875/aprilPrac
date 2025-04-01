package javawithvinod;

public class Logic3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome";
		int length=str.length();
		
		for(int i=0;i<length;i++) {
			
			for(int j=0;j<length;j++) {
				
				if(i==j||(i+j==length-1)) {
					System.out.print(str.charAt(j));
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
			
		}
		}
	
	
	
	}
	


