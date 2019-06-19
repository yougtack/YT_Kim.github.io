import java.util.Scanner;
public class Ch02Ex02_05 {
	public static void main(String []args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
	
		
		Scanner scan2 = new Scanner(System.in);
		double input2 = scan2.nextDouble();
		
	
		System.out.printf("%d * %.6f = %.6f",input1,input2,(input1*input2));
		
	}

}
