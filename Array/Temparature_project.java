package Array;

import java.util.Scanner;


public class Temparature_project {
	int[] arr=null;
	
 public Temparature_project(int days) 
	{
		arr=new int[days];
		System.out.println("How many day's temparature: "+days);
	}
	
	public void high_temp(int temp)
	{
		for(int high=0;high<arr.length;high++)
		{
			arr[high]=temp;
		}
	}
	
	
}
