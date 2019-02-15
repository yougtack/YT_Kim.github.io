import java.util.Scanner;
public class Ch05Ex01_08 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int sum1=0;
		int sum2=0;
		int count=0;
		int count2=0;
		Scanner scan1 = new Scanner(System.in);
		int input1;
		
		for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
		}
		for(int j=0;j<a.length;j++) {
			count2++;
			if(count2%2==0) {
				sum1+=a[j];	
			}
			else if(count2%2==1) {
				sum2+=a[j];
				count++;
			}
		}
		System.out.printf("sum:%d\navg:%.1f",sum1,(double)sum2/count);
		
	}

}
