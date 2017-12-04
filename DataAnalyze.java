import java.util.Scanner;

public class DataAnalyze {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sampleSize;
		int i = 0;
		int val = 0;
		
		System.out.print("PLease enter the sample size: ");
		sampleSize = in.nextInt();
		int[] smp = new int [sampleSize];
		
		
		System.out.println("Enter numbers for trial 0 ");
		for (i = 0; i < sampleSize; i++ ) {
			System.out.println("Enter numbers for Sample #" + i + ":");
			smp[i] = in.nextInt();
		}
		System.out.print();
	}
	
	
}
