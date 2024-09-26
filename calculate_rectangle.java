import java.util.Scanner;
public class calculate_rectangle {
	int length;
	int width;
	int area;
	
	public static void calculate() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length: ");
		int length=sc.nextInt();
		
		System.out.println("Enter width: ");
		int width=sc.nextInt();
		
		int area=(length*width);
		System.out.println("Area of rectangle is: "+area);
	}

	public static void main(String[] args) {
		calculate();

	}

}
