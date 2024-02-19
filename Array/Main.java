package Array;

public class Main {

	public static void main(String[] args) {
		SingleDimensionArray_insertion sda = new SingleDimensionArray_insertion(10);
		sda.insert(0, 0);
		sda.insert(1, 10);
		sda.insert(2, 20);
		sda.insert(0, 300);
		sda.insert(14, 9);
		
		System.out.println("Traversal");
		sda.traversal();
		System.out.println();
		System.out.println("Show the value of Integer.MIN_VALUE : "+Integer.MIN_VALUE);
		
//		if(Integer.MIN_VALUE==sda.arr[5])
//		{
//			System.out.println("equal");
//		}
		
		sda.SearchInArray(30);
		
		sda.deleteValue(1);
		System.out.println(sda.arr[1]);
	}

}
