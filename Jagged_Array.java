
public class Jagged_Array {
	public static void array() {
		int myarray[][]=new int[3][];
		myarray[0]=new int[] {1,2,3};
		myarray[1]=new int[] {4,5,6};
		myarray[2]=new int[] {7,8,9};
		System.out.println("Two dimensional jagged array");
		for(int i=0;i<myarray.length;i++) {
			for(int j=0;j<myarray[i].length;j++) 
				System.out.print(myarray[i][j]+" ");
			System.out.println();
		}
}
	public static void main(String[] args) {
		array();

	}

}
