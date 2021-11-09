package q11293;
import java.util.Scanner;
class StaticClassDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		String s=sc.nextLine();
		String [] number = s.split(" ");
		System.out.println("a1 = A [value = "+number[0]+"]");
		System.out.println("a2 = A [value = "+number[1]+"]");
	}
}