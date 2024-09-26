import java.util.*;
public class PalindromeNumber {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int rem = 0,sum=0,temp;
		System.out.println("Enter the number to find Palindrome or not :");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		
		if(temp==sum)
			System.out.println("Number is Palindrome");
		else
			System.out.println("Number is Not Palindrome");
	}

}
