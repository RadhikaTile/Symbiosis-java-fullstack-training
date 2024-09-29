
public class Student {
	int rollno;
	String studname;
	public Student(int rollno, String studname) {
		this.rollno=rollno;
		this.studname=studname;
	}
	public void show() {
		System.out.println("Enter rollno: "+rollno);
		System.out.println("Enter student name: "+studname);
	}

	public static void main(String[] args) {
	Student [] batch=new Student[2];
	for(int i=0;i<batch.length;i++) {
		System.out.println(batch);
	}

	}

}
