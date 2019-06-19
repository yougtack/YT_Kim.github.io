import java.util.*;
public class Ch04Ex01_13 {

	public static void main(String[] args) {
		System.out.printf("번호를 입력하세요.>");
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		if(input1==1)
			System.out.printf("dog");
	
		else if(input1==2)
			System.out.printf("cat");
		
		else if(input1==2)
			System.out.printf("chick");
		
		else
			System.out.printf("?I don't know.");
	}

}
