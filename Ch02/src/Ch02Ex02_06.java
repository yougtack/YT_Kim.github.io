import java.util.Scanner;
public class Ch02Ex02_06 {
	public static void main(String [] args) {
		double OneYd=91.44;
		double OneIn=2.54;
		
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextDouble();
		
		System.out.printf("%4.1fyd = %4.1fcm\n",input1,(input1*OneYd));

		Scanner scan2 = new Scanner(System.in);
		double input2 = scan2.nextDouble();
		
		System.out.printf("%4.1fin =  %4.1fcm",input2,(input2*OneIn));
		}


}
