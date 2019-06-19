import java.util.*;
public class Ch04Ex02_03 {

	public static void main(String[] args) {
		
		for(;;) {
		System.out.printf("정수를 입력하세요.(0: 종료)>");
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
	
		if(input1>0)
			System.out.printf("positive integer\n");
		else if(input1<0)
			System.out.printf("negative number\n");
		else
			break;
		}
	}

}
