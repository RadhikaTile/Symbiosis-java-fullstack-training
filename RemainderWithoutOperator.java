import java.util.*;
public class RemainderWithoutOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		int num=sc.nextInt();
		
		System.out.println("enter the divisor");
		int divisor=sc.nextInt();
		
		int remainder=num-divisor*(num/divisor);
		
		System.out.println("Remainder is :"+remainder);
		
		

	}

}

