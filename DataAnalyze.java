import java.util.Scanner;

public class DataAnalyze {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Initializing Variables
		int sampleSize;
		int a,b,c,d,i = 0;
		int sum = 0, sum1 = 0, sum2 = 0, sum3 = 0;
		int maxAvg = 0, minAvg = 0;

		System.out.println("Please enter the sample size: ");
		sampleSize = in.nextInt();

		int [] smp = new int [sampleSize];
		int [] smp1 = new int [sampleSize];
		int [] smp2 = new int [sampleSize];
		int [] smp3 = new int [sampleSize];

		System.out.println("Enter numbers for trial 0 ");
		for (a = 0; a < sampleSize; a++ ) {
			System.out.println("Enter Sample #" + a + ":");
			smp[a] = in.nextInt();
		}
		a = 0;

		System.out.println("Enter numbers for trial 1 ");
		for (b = 0; b < sampleSize; b++ ) {
			System.out.println("Enter Sample #" + b + ":");
			smp1[b] = in.nextInt();
		}
		b = 0;

		System.out.println("Enter numbers for trial 2 ");
		for (c = 0; c < sampleSize; c++ ) {
			System.out.println("Enter Sample #" + c + ":");
			smp2[c] = in.nextInt();
		}
		c = 0;

		System.out.println("Enter numbers for trial 3 ");
		for (d = 0; d < sampleSize; d++ ) {
			System.out.println("Enter Sample #" + d + ":");
			smp3[d] = in.nextInt();
		}
		d =0;

		for (int w : smp)
			sum += w;
		for (int x : smp1)
			sum1 += x;
		for (int y : smp2)
			sum2 += y;
		for (int z : smp3)
			sum3 += z;

		int avg0 = sum/sampleSize;
		int avg1 = sum1/sampleSize;
		int avg2 = sum2/sampleSize;
		int avg3 = sum3/sampleSize;
		int []avg={avg0,avg1,avg2,avg3};

		minAvg=avg[0];
		maxAvg=avg[0];

		for(i=1;i<4;i++)
		{
			if(minAvg>avg[i])minAvg=avg[i];
			if(maxAvg<avg[i])maxAvg=avg[i];		
		}

		System.out.println("\tSample #\tTrial 1\tTrial 2\tTrial 3\tTrial 4");
		for (i = 0; i < sampleSize; i ++){
			System.out.println(" \t" + i + " \t\t" + smp[i] + " \t" + smp1[i] + " \t" + smp2[i] + " \t" + smp3[i]);
		}

		System.out.println("       -------------------------------------------------");
		System.out.println("\tAverage: \t" + avg0 + " \t" + avg1 + " \t" + avg2 + " \t" + avg3);
		System.out.println("");
		System.out.println("\tMin Average: " + minAvg);
		System.out.println("\tMax Average: " + maxAvg);
		System.out.println("");
		
		if (minAvg == maxAvg)
			System.out.println("The trials match EXACTLY!");
		else if (maxAvg < minAvg*2)
			System.out.println("The trials concur witheach other!");
		else
			System.out.println("The trials do not concur");

		in.close();

	}
}	

//Contributors: Gerardo Rodriguez