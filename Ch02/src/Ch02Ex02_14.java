import java.util.Scanner;
public class Ch02Ex02_14 {
	public static void main(String [] args) {
		double OneYd=91.44;
		System.out.printf("yard? ");
	
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextDouble();

		System.out.printf("%.1fyard = %.1fcm",input1,(input1*OneYd));
		
		
		
	}

}
