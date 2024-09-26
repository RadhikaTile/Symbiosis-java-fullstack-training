import java.util.Scanner;
public class Factorial_of_no {
	int n;
	int f=1;
	//int fact;
	
	public void factorial() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num: ");
		int n=sc.nextInt();
		
		//System.out.println("Enter num: ");
		//int f=sc.nextInt();
		
		while(n>0) {
			f=f*n;
			n--;
		//System.out.println("factorial is: "+f);
		}
		System.out.println("factorial is: "+f);
	}
	public static void main(String[] args) {
		Factorial_of_no f=new Factorial_of_no();
		f.factorial();

	}

}
