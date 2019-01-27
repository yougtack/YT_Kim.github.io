import java.util.*;
public class Ch04Ex01_06 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		char input1 = scan1.next().charAt(0);
		int input2 = scan1.nextInt();
		
		if(input1=='F'&& input2>=18)
			System.out.printf("WOMAN");
	
		if(input1=='F'&& input2<18)
			System.out.printf("GIRL");
		
		if(input1=='M'&& input2>=18)
			System.out.printf("MAN");
		
		if(input1=='M'&& input2<18)
			System.out.printf("Boy");
	
	}

}
