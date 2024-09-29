
public class for_each_polymorphism {
	public static void add(double a[]) {
		double total=0;
		int len=a.length;
		for(double d: a) {
			total=total+d;
		}System.out.println(total);
	}
	public static void add(int ...a) {
		int sum=0;
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	public void add(double c,int ...a) {}
	public static void main(String[] args) {
		double arr[]= {1,2,3,4};
		add(arr);
		add(1,2,3,4,5);
		add(5,6,7);
	}

}
