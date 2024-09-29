import java.util.Scanner;
public class Table {
	
	public void Mult(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int num=sc.nextInt();
		
		//for(int i=1;i<=10;i++) {
		//	A=i*num;
		//	System.out.println(A);
		//}
		int i=0;
		while(i<10) {
			int A;
			A=i*num;
			i++;
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Table t=new Table();
		t.Mult();

	}

}
