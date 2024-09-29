
public class polymorphism {
int rollno;
String name;
public polymorphism() {}
public polymorphism(int a) {}
public polymorphism(int a, int b) {}
public polymorphism(String a, String b) {}

public void register() {
	System.out.println("No args method");
}
public void register(int rollno) {
	this.rollno=rollno;
	System.out.println("only to register with rollno");
}
public void register(int rollno,String name) {
	this.rollno=rollno;
	this.name=name;
	System.out.println("register with roll no and name");
}
public void register(String name,int rollno) {
	this.name=name;
	this.rollno=rollno;
	System.out.println("register with roll no and name");
}
	public static void main(String[] args) {
		polymorphism p=new polymorphism();
		p.register();
		p.register(10);
		p.register(10,"radhika");
		p.register("radhika",10);
		
	}

}
