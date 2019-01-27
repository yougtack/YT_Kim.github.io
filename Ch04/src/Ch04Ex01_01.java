import java.util.Scanner;
public class Ch04Ex01_01 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		Scanner scan2 = new Scanner(System.in);
		int input2 = scan2.nextInt();
		
		System.out.printf("%d\n",input1);
		if(input1<0)
			System.out.printf("minus\n");
		
		System.out.printf("%d\n",input2);
		if(input2<0)
			System.out.printf("minus\n");
		
	}

}
