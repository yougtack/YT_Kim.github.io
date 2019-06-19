import java.util.Scanner;
public class Ch05Ex01_09 {
	public static void main(String [] args) {
		int[] a=new int[10];
		int tmp=0;
		Scanner scan1 = new Scanner(System.in);
		int input1;
		
		for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			for(int n=j+1;n<a.length;n++) {
				if(a[j]<a[n]) {
					tmp=a[j];
					a[j]=a[n];
					a[n]=tmp;
				}
			
			}
		
		}
		for(int k=0;k<a.length;k++) {
		System.out.printf("%d ",a[k]);
		}
	}

}
