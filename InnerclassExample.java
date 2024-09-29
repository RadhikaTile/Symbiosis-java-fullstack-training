package clg;
class outerclass{
	public class innerclass{
		private static void print() {
			System.out.println("inner class print()");
		}
		public void show() {
			outerclass obj=new outerclass();
			obj.test();
		}
	}
	public void test() {
		innerclass oobj=new innerclass();
		oobj.print();
	}
}
public class InnerclassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerclass.innerclass outin=new outerclass().new innerclass();
		outerclass obj=new outerclass();
		obj.test();
	}

}
