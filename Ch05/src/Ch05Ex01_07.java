import java.util.Scanner;
public class Ch05Ex01_07 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int b=0;
		int c=10_000;
		Scanner scan1 = new Scanner(System.in);
		int input1;
		
		for(int i=0;i<a.length;i++) {
			a[i]=input1 = scan1.nextInt();
			if(!(a[i]<=1000 && a[i]>=1)) {
				a[i]=100;
			}
		}
		
		for(int j=0;j<a.length;j++) {
			if(a[j]<100) {
				if(a[j]>b)
				b=a[j];
			}
			else if(a[j]>100) {
				if(a[j]<c) {
					c=a[j];
				}
			}
		}
		System.out.printf("%d %d",b,c);
		
	}

}
