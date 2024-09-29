
public class two_D_array {
	public static void array() {
		int sum;
		int nums[][]=new int[3][6];
		for(int i=0;i<3;i++) 
			for(int j=0;j<6;j++) 
				nums[i][j]=(i+1)*(j+1);
					System.out.println("print 2 D array");
					for(int i=0;i<3;i++) {
						for(int j=0;j<6;j++) {
							System.out.print(nums[i][j]+" ");
						}
						System.out.println();
					}
					
			}

	public static void main(String[] args) {
		
		array();
	}

}
