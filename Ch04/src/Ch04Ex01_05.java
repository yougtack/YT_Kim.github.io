import java.util.*;
public class Ch04Ex01_05 {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextDouble();
		double input2 = scan1.nextDouble();
		
     	Scanner scan2 = new Scanner(System.in);
		double input3 = scan2.nextDouble();
		double input4 = scan2.nextDouble();
		
		if(input1>=4.0 && input2>=4.0)
			System.out.printf("A\n");
		if(input1>=3.0 && input2>=3.0)
			System.out.printf("B\n");
		else
			System.out.printf("C\n");
		
		if(input3>=4.0 && input4>=4.0)
			System.out.printf("A\n");
		if(input3>=3.0 && input4>=3.0)
			System.out.printf("B\n");
		else
			System.out.printf("C\n");
		
	}

}
