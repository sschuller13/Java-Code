import java.util.Random;

public class LabExercise5 {

	boolean method_1 (int[] array, int[][] array2, int x) 
	{
		return array[x] == array2[x][0] || array[x] == array2[x][1];
	}
	int method_2(byte[][] rectangle) 
	{
		int sum = rectangle[0][0] +rectangle[0][1]+rectangle[1][0]+rectangle[1][1];
		if(sum>0)return sum;
		else return 0;
	}
	
	double method_3(double[] array)
	{
		Random r = new Random();
		int index = r.nextInt(array.length);
		return array[index];
		
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub
			LabExercise5 object = new LabExercise5();
			int[] arr1 = new int[3];
			arr1 = new int[] {10,5,2};
			int[][] arr2 = new int[3][2];
			arr2 = new int[][]{{10,8},{3,7},{2,8}};
			int idx = 2;
			
			System.out.println(""+ object.method_1(arr1, arr2, idx));
			
			double[] arr3 = new double[6];
			arr3 = new double [] {4,5,9,8,1,2};
			System.out.println(""+ object.method_3(arr3));
			
			
			
			
		}

}
