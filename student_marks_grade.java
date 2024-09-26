import java.util.Scanner;
public class student_marks_grade {

	int marks;
	
	public void get_marks() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks=sc.nextInt();
		
		if(marks>80)
		{
			System.out.println("Grade A");
		}
		
		else if(marks>70 && marks<80)
		{
			System.out.println("Grade B");
		}
		
		else if(marks>60 && marks<70)
		{
			System.out.println("Grade c");
		}
		
		else if(marks>50 && marks<60)
		{
			System.out.println("Grade A");
		}
		
		else
		{
			System.out.println("Fail");
		}
		
	}
	public static void main(String[] args) {
		student_marks_grade s=new student_marks_grade();
		s.get_marks();
	}

}
