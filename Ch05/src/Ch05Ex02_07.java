import java.util.Scanner;
public class Ch05Ex02_07 {

	public static void main(String[] args) {
		int[] a=new int[99];
		Scanner scan1 =new Scanner(System.in);
		int input1;
		int min=100;
		int max=0;
		
	roop:for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
			for(int j=0;j<a.length;j++) {
			if(a[i]==999) {
				break roop;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]<min)
				min=a[i];
			else if(a[i]>=max)
				if(a[i]<999)
				max=a[i];
		}
		System.out.printf("max:%d\nmin:%d",max,min);
		
	}
}
