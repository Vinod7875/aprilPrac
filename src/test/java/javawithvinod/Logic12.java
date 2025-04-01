package javawithvinod;

public class Logic12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Welcome";
		
		
		for(int i=0;i<=str.length()-1;i++) {
			
		
			for(int k=0;k<=str.length()-1;k++) {
				if(i==k) {
					System.out.print(str.charAt(k));
				}else {
					System.out.print(" ");
				}
				
			}
			
			for(int j=str.length()-1;j>=i;j--) {
				if(i==j) {
					System.out.print(str.charAt(j));
				}else {
					System.out.print(" ");
				}
			}
			
			
			
			System.out.println();
		}
		
		
		
		
		
	}

}
