import java.util.*;
public class Ch04Ex02_13 {

	public static void main(String[] args) {
	
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
		
		for(int i=1;i<=input1;i++) {
			for(int j=1;j<=input2;j++) {
				System.out.printf("%d ",i*j);
			if(j==input2)
				System.out.println();
			}
		}
	}

}
