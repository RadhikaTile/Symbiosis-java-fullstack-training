	import java.util.*;
	public class AssignmentPro1 {
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Amount of Principal :");
			double Principal=sc.nextDouble();
			
			System.out.println("Enter the Interest Rate :");
			double Rate=sc.nextDouble();
			
			System.out.println("Enter the Period in year :");
			double Time=sc.nextDouble();
			
			double Simple_Interest=(Principal*Time*Rate);
			
			System.out.println("Simple Interest is :"+Simple_Interest);
			
			
			System.out.println("How many times interest applied :");
			double number=sc.nextDouble();
			
			double Compound_Interest=Principal*(Math.pow((1+Rate/number),Time));
			System.out.println("Compond Interest is :"+Compound_Interest);
			

		}

	}


