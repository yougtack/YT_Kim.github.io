import java.util.Scanner;
public class Ch05Ex01_05 {
	public static void main(String [] args) {
		double [] a={0,85.6,79.5,83.1,80.0,78.2,75.0};
		
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		
		System.out.printf("%.1f",(double)a[input1]+a[input2]);
		
		
	}
}
