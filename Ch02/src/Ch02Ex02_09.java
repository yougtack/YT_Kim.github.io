import java.util.Scanner;
public class Ch02Ex02_09 {
	public static void main(String [] args) {
	Scanner scan1 = new Scanner(System.in);
    float input1 = scan1.nextFloat();
	
    Scanner scan2 = new Scanner(System.in);
	float input2 = scan2.nextFloat();	
	
	Scanner scan3 = new Scanner(System.in);
	double input3 = scan3.nextDouble();
	
	System.out.printf("%.3f\n%.3f\n%.3f",input1,input2,input3);
	}

}
