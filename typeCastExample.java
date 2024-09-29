package clg;

public class typeCastExample {
	public static void wrapDemo2(){
		char ch='a';
		Character chrobj=new Character(ch);
		
		byte a=10;
		Byte byteobj=new Byte(a);
		
		int b=20;
		Integer intobj=new Integer(b);
		
		float c=18.03f;
		Float floatobj=new Float(c);
		
		double d=2309.43;
		Double doubleobj=new Double(d);
		
		
		System.out.println("Displaying values of wrapper class objects: ");
		System.out.println("Character object: "+chrobj);
		
		System.out.println("Byte object: "+byteobj);
		System.out.println("Integer object: "+intobj);
		
		System.out.println("Float object: "+floatobj);
		System.out.println("Double object: "+doubleobj);
		
		System.out.println("\n");
		
		char chr=chrobj;
		byte by=byteobj;
		int in=intobj;
		float fl=floatobj;
		double db=doubleobj;
		
		System.out.println("Displaying unwrapped values: ");
		
		System.out.println("char value: "+chr);
		System.out.println("byte value: "+by);
		
		System.out.println("int value: "+in);
		System.out.println("float value: "+fl);
		System.out.println("double value: "+db);
		
		double dval;
		int intval=10;
		dval=intval;
		intval=(int)dval;
	}
	public static void wrapDemo() {
		int i=20;
		Integer iref=new Integer(i);
		System.out.println(iref);
		int j=iref.intValue();
		System.out.println(j);
		
		int k=40;
		Integer kref=k;
		System.out.println(kref);
		int k1=kref.intValue();
		System.out.println(k1);
		
		char ch='D';
		Character cref=new Character(ch);
		System.out.println(cref);
		
		char c='S';
		Character ccref=c;
		System.out.println(ccref);
	}
	public static void method5() {
		Integer aObj=Integer.valueOf(23);
		Double bObj=Double.valueOf(5.55);
		
		int a=aObj.intValue();
		double b=bObj.doubleValue();
		
		System.out.println("The value of a: "+a);
		System.out.println("The value of b: "+b);
		}
	
	public static void method4() {
		int a=5;
		double b=5.65;
		
		Integer aObj=Integer.valueOf(a);
		Double bObj=Double.valueOf(b);
		
		if(aObj instanceof Integer) {
			System.out.println("Object of Integer");
		}
		if(bObj instanceof Double) {
			System.out.println("Object of Double");
		}
	}
	public static void method3() {
		int num=10;
		System.out.println("The integer value is: "+num);
		
		String data=String.valueOf(num);
		System.out.println("The string value is: "+data);
	}
	public static void method2() {
		double num=10.56;
		System.out.println("The double value: "+num);
		
		int data=(int)num;
		System.out.println("The integer value: "+data);
	}
	public static void method1() {
		int num=10;
		System.out.println("The integer value: "+num);
		double data=num;
		System.out.println("The double value: "+data);
	}
	public static void main(String[] args) {
		

	}

}
