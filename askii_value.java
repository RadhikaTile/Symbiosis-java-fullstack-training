import java.util.*;
public class askii_value {
char ch;

	public void value() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character: ");
		char ch=sc.next().charAt(0);
		
		int askii_value=(int) ch;
		System.out.println("Askii value of given character: "+askii_value);
	}
	public static void main(String[] args) {
		askii_value a=new askii_value();
		a.value();
	}

}
