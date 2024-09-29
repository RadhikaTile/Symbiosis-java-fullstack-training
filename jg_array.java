import java.util.Scanner;
public class jg_array {
	public static void jDintArray(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input array row: ");
		//creating the array
		int n=sc.nextInt();
		int arr[][]=new int [n][];
		for(int i=0;i<n;i++) {
			System.out.println("Input number of element in"+(i+1)+"row: ");
			arr[i]=new int[sc.nextInt()];
		}

		    /*int myarray[][]=new int[3][];
			myarray[0]=new int[] {1,2,3};
			myarray[1]=new int[] {4,5,6};
			myarray[2]=new int[] {7,8,9};
			System.out.println("Two dimensional jagged array");
			for(int i=0;i<myarray.length;i++) {
				for(int j=0;j<myarray[i].length;j++) 
					System.out.print(myarray[i][j]+" ");
				System.out.println();
			}
			*/
	
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				count++;
			}
		}
		System.out.println("Input"+count+"array Elements");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();				
				}
			}
		String[][]city=new String[4][];{
			
		}
		System.out.println("array elements is: ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
			}
		}

	public static void main(String[] args) {
		jDintArray();

	}

}
