import java.util.*;
public class Ch04Ex02_11 {

	public static void main(String[] args) {
		
		for(;;) {
		System.out.printf("Base=");
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		System.out.printf("Height=");
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();
		System.out.printf("Triangle area=%.1f\n",(double)input1*input2/2);
		
		System.out.printf("continue?");
		Scanner scan3 = new Scanner(System.in);
		char input3 = scan1.next().charAt(0);
		
		if(!(input3=='Y' || input3=='y'))
			break;
		}
	}

}
