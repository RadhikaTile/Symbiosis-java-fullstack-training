
public class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class passport{
	private int passportno;

	public int getPassportno() {
		return passportno;
	}

	public void setPassportno(int passportno) {
		this.passportno = passportno;
	}
}
public class onetoone {

	public static void main(String[] args) {
		Person p1=new Person();
		p1.setName("Radhika");
		
		Person p2=new Person();
		p2.setName("Sakshi");
		
		passport pp1=new passport();
		pp1.setPassportno(12344);
		
		passport pp2=new passport();
		pp2.setPassportno(12345);

		System.out.println(p1.getName()+" "+"has a US passport whose passport number is: "+pp1.getPassportno());
		System.out.println(p2.getName()+" "+"has a Indian passport whose passport number is: "+pp2.getPassportno());
	}

}
