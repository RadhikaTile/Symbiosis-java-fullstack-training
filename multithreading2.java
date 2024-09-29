package clg;

public class multithreading2 implements Runnable{
@Override 
public void run() {
	for(int i=0;i<5;i++) {
		try {
			System.out.println(Thread.currentThread().getName());
			System.out.println("I : "+i);
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
	}
}
	public static void main(String[] args) {
		multithreading2 mobj=new multithreading2();
		
		Thread t=new Thread(mobj);
		t.start();
		System.out.println(Thread.currentThread().getName());
	}
}
