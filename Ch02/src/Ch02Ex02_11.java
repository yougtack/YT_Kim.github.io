import java.util.Scanner;
public class Ch02Ex02_11 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextDouble();
		
		Scanner scan2 = new Scanner(System.in);
		double input2 = scan2.nextDouble();
		
		System.out.printf("%10.2f%10.2f%10.2f",input1,input2,(input1+input2));
		
		
	}

}
