import java.util.*;
public class Ch04Ex02_14 {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		int input2 = scan1.nextInt();
	 
		if(input1>=input2) {
		for(int i =1;i<=9;i++) {
			for(int j=input1;j>=input2;j--) {
				if(j%input1==0)
					System.out.println();
				System.out.printf("%d*%d=%2d  ",j,i,i*j);
				
				
			}
		}
	}
		else if(input1<input2) {
			for(int i =1;i<=9;i++) {
				for(int j=input2;j>=input1;j--) {
					if(j%input2==0)
						System.out.println();
					System.out.printf("%d*%d=%2d  ",j,i,i*j);
					
					
				}
			}	
		}
	}
}
