package q11264;
class Student{
	int id;
	String name;
	void setData(int n,String s){
		this.id=n;
		this.name=s;
	}
	void displayData(){
		System.out.println("Id : "+this.id);
		System.out.println("Name : "+this.name);
	}
}
class Marks extends Student{
	float javaMarks;
	float cMarks;
	float cppMarks;
	void setMarks(float a1, float a2, float a3){
		this.javaMarks=a1;
		this.cMarks=a2;
		this.cppMarks=a3;
	}
	void displayMarks(){
		System.out.println("Java marks : " +this.javaMarks);
		System.out.println("C marks : " +this.cMarks);
		System.out.println("Cpp marks : "+this.cppMarks);
	}
}
class Result extends Marks{
	float total;
	float avg;
	void compute(){
		this.total=this.javaMarks+this.cMarks+this.cppMarks;
		this.avg=this.total/3;
	}
	void showResult(){
		System.out.println("Total : "+this.total);
		System.out.println("Avg : "+this.avg);
	}
}
public class MultilevelInheritanceDemo{
	public static void main(String args[]){
		Result r = new Result();
		r.setData(Integer.parseInt(args[0]),args[1]);
		r.setMarks(Float.parseFloat(args[2]),Float.parseFloat(args[3]),Float.parseFloat(args[4]));
		r.compute();
		r.displayData();
		r.displayMarks();
		r.showResult();
	}
}