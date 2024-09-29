package clg;

public class multithreading_demo3 extends Thread{
	Thread t;
	public multithreading_demo3() {
		t=new Thread(this);
		System.out.println("T is born");
		System.out.println("T is ready!!!");
		t.start();
	}
	public void m1() {
		System.out.println("Method 1");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("T is running!!!");
		m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new multithreading_demo3();
	}

}
