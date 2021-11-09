package q11274;
class SuperClass {
	int value1, value2;
	SuperClass(int a, int b){
		value1=a;
		value2=b;
	}
	void show(){
		System.out.println("This is super class show() method");
		System.out.println("value1 = " +value1);
	}
}

class SubClass extends SuperClass {
	int value3, value4;
	SubClass(int a, int b, int c ,int d){
		super(a,b);
		value3=c;
		value4=d;
	}
	void show(){
		System.out.println("This is sub class show() method");
		super.show();
		System.out.println("value2 from super class = " + super.value2);
		System.out.println("value3 = " +value3);
		System.out.println("value4 = " +value4);
	}
}

public class AccessUsingSuper {
	public static void main(String[] args) {
		SubClass obj = new SubClass(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		obj.show();
	}
}