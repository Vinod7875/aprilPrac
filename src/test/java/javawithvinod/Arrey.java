package javawithvinod;

public class Arrey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//middle value
		int []a= {1,2,3,4,5,6,7};
		
		int mid=a.length/2;
		System.out.println(mid);
		double s=a[mid]+a[mid-1];
		System.out.println(s);
		s=s/2;
		System.out.println(s);
		
		if(a.length%2!=0) {
			System.out.println(a[mid]+ " &  "+  s);
			
		}else {
			System.out.println("else  " + s);
		}
		
		
		
	}

}
