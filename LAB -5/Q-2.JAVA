import java.util.Scanner;
class TestOverloading1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three numbers: ");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c= sc.nextInt();
		int sum1 =	a+b;
		int sum2 = a+b+c;
		System.out.println("Addition of two numbers: " +sum1);
		System.out.println("Addition of three numbers: "+sum2);
	}
}