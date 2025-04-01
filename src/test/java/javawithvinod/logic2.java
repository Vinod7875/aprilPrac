package javawithvinod;

public class logic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        int n = 6; // Size of the pattern

		        // Loop through each row
		        for (int i = 0; i < n; i++) {
		            // Determine the number to print based on the row index
		            int numberToPrint = n - Math.min(i, n - i - 1);

		            // Print the determined number for each column in the row
		            for (int j = 0; j < n; j++) {
		                System.out.print(numberToPrint);
		            }
		            // Move to the next line after printing all columns in the current row
		            System.out.println();
		        }
		    }
		
}

		
		
		
