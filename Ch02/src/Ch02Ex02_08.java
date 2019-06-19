import java.util.Scanner;
public class Ch02Ex02_08 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextDouble();
		
		Scanner scan2= new Scanner(System.in);
		double input2 = scan2.nextDouble();
		
		Scanner scan3 = new Scanner(System.in);
		char input3 = scan3.next().charAt(0);
		
		System.out.printf("%.2f\n%.2f\n%s",input1,input2,input3);

	}


}
