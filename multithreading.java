package clg;

public class multithreading extends Thread{
  @Override
  public void run() {
	  System.out.println(Thread.currentThread().getName());
	  System.out.println(Thread.currentThread().getPriority());
  }
	public static void main(String[] args) {
		Thread t1=new multithreading();
		t1.setName("Child thread 1");
		t1.setPriority(8);
		t1.start();
		
		multithreading d1=new multithreading();
		d1.setPriority(MAX_PRIORITY);
		d1.start();
		System.out.println(t1.currentThread().getName());
		System.out.println(t1.currentThread().getPriority());
		multithreading d2=new multithreading();
		d2.start();
	}

}
