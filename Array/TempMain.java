package Array;

import java.util.Scanner;

public class TempMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("How many day's temparature: ");
		int NumDays=sc.nextInt();
		int[] arr=new int[NumDays];
		
		//Record temparature and finding avg
		
		int sum=0;
		for(int i=0;i<NumDays;i++)
		{
			System.out.print("Day "+(i+1)+" 's high temp : ");
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		
		double avg=sum/NumDays;
		
		int above=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>avg)
			{
				above++;
			}
		}
		System.out.println("Average temp: "+avg);
		System.out.println(above + " days above average temparature ");
	}

}
