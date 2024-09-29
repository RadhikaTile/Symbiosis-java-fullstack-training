package clg;
interface MinMax<T extends Comparable<T>>{
	T min();
	T max();
}
class MinMaxImpl<T extends Comparable<T>> implements MinMax<T>{
	T[] values;
	
	public MinMaxImpl(T[] obj) {
		this.values = obj;
	}

	@Override
	public T min() {
		T o1=values[0];
		for(int i=1;i<values.length;i++) 
			if(values[i].compareTo(o1)<0)
				o1=values[i];
		return o1;
	}

	@Override
	public T max() {
		T o1=values[0];
		for(int i=1;i<values.length;i++) 
			if(values[i].compareTo(o1)>0)
				o1=values[i];
		return o1;
	}
	
}
class Person implements Comparable<Person>{
	private String name;
	private String city;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	public Person(String name, String city, int age) {
		super();
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public int compareTo(Person o) {
		if(age==o.age)
		return 0;
		else if(age>o.age)
		return 1;
		else
			return -1;
	}
	
}
public class GenericInterface {
public static void main(String[] args) {
		System.out.println("--------------Float------------");
		Float arr[]= {3.22f,6.2f,222.12f,76.89f,3.2f};
		MinMaxImpl<Float>objOne=new MinMaxImpl<Float>(arr);
		System.out.println("Minimum value is: "+objOne.min());
		System.out.println("Maximum value is: "+objOne.max());
		
		System.out.println("------------String-------------");
		String arrOne[]= {"Ankita","Ram","Sneha","Gauri"};
		MinMaxImpl<String>objTwo=new MinMaxImpl<String>(arrOne);
		System.out.println("Minimum value is: "+objTwo.min());
		System.out.println("Maximum value is: "+objTwo.max());
		
		System.out.println("----------Person-----------");
			Person p[]=new Person[] {
					new Person("Nitin","Pune",34),
					new Person("Radha","Nashik",27),
					new Person("Poonam","Mumbai",43),
			};
		MinMaxImpl<Person>objThree=new MinMaxImpl<Person>(p);
		System.out.println("Minimum value is: "+objTwo.min());
		System.out.println("Maximum value is: "+objTwo.max());
		
	}

}
