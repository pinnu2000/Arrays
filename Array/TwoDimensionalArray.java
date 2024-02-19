package Array;

public class TwoDimensionalArray {
	
	int[][] arr=null;
	public TwoDimensionalArray(int numOfRows,int numOfCol)
	{
		this.arr=new int[numOfRows][numOfCol];
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[0].length;col++)
			{
				arr[row][col]=Integer.MIN_VALUE;
			}
		}
	}
	
	//Inserting the values into 2D array
	public void InsertingValueInTheArray(int row, int col,int value)
	{
		try
		{
			if(arr[row][col]==Integer.MIN_VALUE)
			{
				arr[row][col]=value;
				System.out.println("The value is Successfully inserted");
			}
			else
			{
				System.out.println("This cell is already occupied");
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index for 2D array");
		}
	}
	
	//Accessing the elements
	
	public void AccessingValue(int row,int col)
	{
		System.out.println("\nAccessing Row# "+row+" Col# "+col);
		try
		{
			System.out.println("Cell value is :" +arr[row][col]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index for 2D Array");
		}
	}
	
	//Traversing 2D Array
	public void traverse2DArray()
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				System.out.println(arr[row][col]);
			}
		}
	}
	
	//Searching values
	
	public void SearchingValue(int value)
	{
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				if(arr[row][col]==value)
				{
					System.out.println("Value found at row: "+row+" Col: "+col);
					return;
				}
			}
		}
		System.out.println("Value is not found");
	}
	
	
	//Deleting an element into the 2D Array
	
	public void deleteValuefromArray(int row,int col)
	{
		try
		{
			System.out.println("Successfully deleted: "+arr[row][col]);
			arr[row][col]=Integer.MIN_VALUE;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid index for 2D Array");
		}
	}
}
