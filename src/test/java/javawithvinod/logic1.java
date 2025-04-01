package javawithvinod;

public class logic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=6;
		int count=n;
		
		for(int i=1;i<=n;i++) {
			
			int print =n;
			
			for(int j=1;j<=n;j++) {
				
				if(i==1||i==n||j==n||j==1) {
					
					System.out.print(print);
				}else {
					System.out.print(print-1);
					
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
