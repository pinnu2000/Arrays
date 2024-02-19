package Array;

public class SingleDimensionArray_insertion 
{
	//Declaring an array
	int[] arr=null;
	
	//Creating a Constructor for deciding size of an array 
	
	public SingleDimensionArray_insertion(int sizeOfArray)
	{
		//storing the size of an array
		arr=new int[sizeOfArray];
		//loop used to store the value 
		for(int i=0;i<arr.length;i++)
		{
			
//we have used Integer.MIN_VALUE(-2147483648) is the lowest value to each value in the array
			
			arr[i]=Integer.MIN_VALUE;
		}
	}
	
	//creating a method to insert value with index(location) and values
	
	public void insert(int location,int value)
	{
		
		//used try and catch to avaoid exceptions
		
		try{
			
			//checking the index value is equal to the min value or not
			
			if(arr[location]==Integer.MIN_VALUE)
			{
				arr[location]=value;
				System.out.println("Successfully Inserted");
			}
			else
			{
				System.out.println("The cell is already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index to access array");
		}
	}
	
	//Array traversal
	
	public void traversal()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	
	public void SearchInArray(int valueToSearch) {
		
		for(int i=0;i<arr.length;i++)
		{
			if(valueToSearch==arr[i])
			{
				System.out.println("Value is found at the index of "+i);
				return;
			}
		}
		System.out.println(valueToSearch +" is not found");
		
	}
	
	//Deleteing an element in the array
	
	public void deleteValue(int valueToDeleteIndex) {
		try
		{
			arr[valueToDeleteIndex]=Integer.MIN_VALUE;
			System.out.println("The value has been deleted successfully");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The value that is provided is not in the range of an array");
		}
	}
}
