import java.util.Scanner;
public class Ch05Ex02_08 {

	public static void main(String[] args) {
		int[] a=new int[100];
		Scanner scan1 =new Scanner(System.in);
		int input1;
		int sum=0;
		int count=0;
		roop:for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
			for(int j=0;j<a.length;j++) {
				if(a[i]==0)
					break roop;
			}
			if(a[i]%5==0) {
				sum+=a[i];
				count++;
			}
		}
		System.out.printf("Multiples of 5:%d\nsum:%d\navg:%.1f",count,sum,(float)sum/count);
	}

}
