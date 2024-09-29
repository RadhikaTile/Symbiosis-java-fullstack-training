package clg;
class A1 extends Thread{
	public void run() {
		System.out.println("Thread A");
		System.out.println("i in Thread A");
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-i="+i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread A finish...");
	}
}
class B extends Thread{
	public void run() {
		System.out.println("Thread B");
		System.out.println("i in Thread B");
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+"-i="+i);
		}
		System.out.println("Thread B finish...");
	}
}
public class multithreading_demo {

	public static void main(String[] args) {
		A1 threadA=new A1();threadA.setName("A");
		B threadB=new B();threadB.setName("B");

		threadA.start();
		threadA.yield();
		try {
			threadA.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		threadB.start();
		System.out.println("Main Thread End...");
	}
}
