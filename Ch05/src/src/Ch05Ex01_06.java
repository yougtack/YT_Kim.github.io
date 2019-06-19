import java.util.Scanner;
public class Ch05Ex01_06 {

	public static void main(String[] args) {
		int [] a = new int[10];
		int min=100;
		
		Scanner scan1 = new Scanner(System.in);
		int input1;
		
		for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
			if(a[i]>=1000) {
				i--;
				continue;
			}
			
		}
		for(int j=0;j<a.length;j++) {
			if(a[j]<min) {
				min=a[j];
			}
			
		}
		System.out.printf("%d",min);
	}

}
