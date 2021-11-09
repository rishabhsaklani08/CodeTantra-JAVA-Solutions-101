import java.util.Scanner;
class SingleInheritance{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the first class string: ");
		String a = in.nextLine();
		System.out.println("First class string is: " + a);
		
		System.out.print("Enter the second class string: ");
		String b = in.nextLine();
		System.out.println("Second class string is: " + b);
	}
}