import java.util.Scanner;
public class Circle {
	int radius;
    double pi=3.14;
    
    public void calculate() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter radius");
    	int radius=sc.nextInt();
    	System.out.println("Area of circle: "+(pi*radius*radius));
    	
    	System.out.println("Circumference of circle: "+(2*pi*radius));
    }

	public static void main(String[] args) {
		Circle c=new Circle();
		c.calculate();

	}

}
