
public class staticblock {
private int section;
private static int srno;

static {
	System.out.println("----------within Static block-------------");
	srno=190;
	
}

static void display() {
	System.out.println("Serial no: "+srno);
	//System.out.println("Section: "+section);
}
void display1() {
	System.out.println("Section: "+section);
}

staticblock(){
	System.out.println("-------------within default constructor--------------");
	srno++;
}
	

	@Override
public String toString() {
	return "staticblock [SrNo=" +srno+" section="+section+"]";
}

	public static void main(String[] args) {
		staticblock s=new staticblock();
		System.out.println(s);
		staticblock s1=new staticblock();
		System.out.println(s1);
		staticblock s2=new staticblock();
		System.out.println(s2);
		
	}

}
