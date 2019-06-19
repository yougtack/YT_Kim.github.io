import java.util.*;
public class Ch04Ex01_04 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextDouble();

		if(input1>88.45)
			System.out.printf("Heavyweight");
		
		if(input1<=88.45 && input1>72.57)
			System.out.printf("Crulserweight");
		
		if(input1<=72.57 && input1>61.23)
			System.out.printf("Middleweight");
		
		if(input1<=61.23 && input1>50.88)
			System.out.printf("Lightweight");
		
		if(input1<=50.88)
			System.out.printf("Flyweight");
	}

}
