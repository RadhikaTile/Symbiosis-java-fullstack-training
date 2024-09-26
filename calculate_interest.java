import java.util.Scanner;
public class calculate_interest {
	int principal;
	int rate;
	int year;
	int simpleinterest;
	
	public static void Simple_interest() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principal: ");
		int principal=sc.nextInt(); 
		
		System.out.println("Enter rate of interest: ");
		int rate=sc.nextInt();
		
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		
		 int simpleinterest=(principal*rate*year/100);
		 System.out.println("Simple interest is: "+simpleinterest);
		}
	public static void main(String[] args) {
		Simple_interest();

	}

}
