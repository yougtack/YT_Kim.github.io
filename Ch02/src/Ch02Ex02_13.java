import java.util.Scanner;
public class Ch02Ex02_13 {

	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();
		Scanner scan3 = new Scanner(System.in);
		int input3 = scan3.nextInt();
		
		System.out.printf("sum = %d\n",(input1+input2+input3));
		System.out.printf("avg = %d",(input1+input2+input3)/3);
		
	}

}
