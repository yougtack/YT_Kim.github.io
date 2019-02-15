import java.util.Scanner;
public class Ch05Ex02_09 {

	public static void main(String[] args) {
		int[] a=new int[100];
		Scanner scan1 = new Scanner(System.in);
		int input1;
		int count=0;
	roop:for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
			for(int j=0;j<a.length;j++) {
				if(a[i]==0)
					break roop; 
			}
			count++;
		}
		for(int i=0;i<count;i++) {
			if(a[i]%2==0)
				a[i]=a[i]/2;
			else 
				a[i]=a[i]*2;
		}
		System.out.printf("%d\n", count);
		for(int i=0;i<count;i++) {
			System.out.printf("%d ",a[i]);
		}
		
	}
}
