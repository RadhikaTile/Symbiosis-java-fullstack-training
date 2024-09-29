package clg;
class myThread extends Thread{

	myThread() {
		super();
	}
	myThread(String name){
		super(name);
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(getName()+"-i:"+i);
		}
	}
}
public class multithreading_demo2 {

	public static void main(String[] args) {
		myThread mt1=new myThread();
		myThread mt2=new myThread("child2");
		System.out.println("mt1 threads initial name and priority");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 priority:"+mt1.getPriority());
		System.out.println();
		
		System.out.println("mt2 threads initial name and priority");
		System.out.println("mt2 name:"+mt2.getName());
		System.out.println("mt2 priority:"+mt2.getPriority());
		
		mt1.setName("child1");
		mt1.setPriority(6);
		mt1.setPriority(9);
		System.out.println("mt1 threads changed name and priority");
		System.out.println("mt1 name:"+mt1.getName());
		System.out.println("mt1 priority:"+mt1.getPriority());
		System.out.println();
		
		System.out.println("mt2 threads changed name and priority");
		System.out.println("mt2 name:"+mt2.getName());
		System.out.println("mt2 priority:"+mt2.getPriority());
		mt1.start();
		mt2.start();
		/*synchronization allow us for multiple thread
		synchronization prevent thread interference synchronization has 2 categories
		1-mutual exclusive
		 1-static synchronization
		 2-synchronize method
		 3-synchronize block
		2-Inter-thread communication
		 wait
		 notify
		 notifyAll
		 */
	}

}
