package javawithvinod;

public class palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a=112211;
		int temp=0;
		int output=a;
		
		while(a!=0) {
			int rev=a%10;  // if we use mode here so pick last value OR use / so give us remaning value
			System.out.println(rev);
			temp=(temp*10)+rev;
			System.out.println(temp);
			a=a/10;
			System.out.println(a);
			
			
		}
		
		System.out.println(output);
	//	System.out.println(a);
		if(output==temp) {
			System.out.println("it is palidromne no : "+ temp);
		}else {
			System.out.println("not palindrome");
		}
		
		//System.out.println(temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
