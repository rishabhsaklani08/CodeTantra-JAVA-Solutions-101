package q10896;
public class FibonacciSeries {
	public static void main(String args[]){
		int number = Integer.parseInt(args[0]);
		int n1 = 0 , n2 = 1, c;
		System.out.print(n1 + " " + n2);
		while(n1+n2 <= number){
			c= n2;
			n2=n1+n2;
			n1 = c;
			System.out.print(" " + n2);
		}
		System.out.print("");
	} 
}