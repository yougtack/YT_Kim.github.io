import java.util.Scanner;
public class Ch04EX01_02 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		
		int sum = input2+100-input1;
		System.out.println(sum);
		if(sum > 0)
			System.out.printf("Obesity");
	}

}
