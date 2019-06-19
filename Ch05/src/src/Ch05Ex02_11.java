import java.util.Scanner;
public class Ch05Ex02_11 {
	public static void main(String[] args) {
		int[] a=new int[10];
		int[] b=new int[10];
		int sum=0;
		int[] num= new int[]{1,2,3,4,5,6,7,8,9,10};
		Scanner scan1 = new Scanner(System.in);
		int input1;
		for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
			if(a[i]<7) {
				if(sum<a[i]) {
					sum=a[i];
				}
			}
		}
		for(int i=0;i<=sum;i++) {
			for(int j=0;j<a.length;j++) {
				if(num[i]==a[j])
					b[i]+=1;
			}
		}
		for(int i=0;i<sum;i++) {
			System.out.printf("%d:%d\n",i+1,b[i]);
		}
	}
}
