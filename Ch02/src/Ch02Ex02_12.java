import java.util.Scanner;
public class Ch02Ex02_12 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		double input2 = scan2.nextDouble();
		
		System.out.printf("%.2f * %d = %.0f",input2,input1,(input1*input2));
		
	}
}
