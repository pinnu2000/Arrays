package Array;

import java.util.Arrays;

public class Main2DArray {

	public static void main(String[] args) {
		TwoDimensionalArray tda=new TwoDimensionalArray(3,3);
		System.out.println(Arrays.deepToString(tda.arr));
		tda.InsertingValueInTheArray(0, 0, 10);
		tda.InsertingValueInTheArray(0, 1, 20);
		
		tda.AccessingValue(4, 0);
		
		tda.traverse2DArray();
		
		tda.SearchingValue(20);
		
		System.out.println(Arrays.deepToString(tda.arr));
		tda.deleteValuefromArray(0, 0);
		System.out.println(Arrays.deepToString(tda.arr));
	}

}
