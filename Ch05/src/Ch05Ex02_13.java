import java.util.Scanner;
public class Ch05Ex02_13 {

	public static void main(String[] args) {
		int[] a=new int[10];
		Scanner scan1 =new Scanner(System.in);
		int input1=scan1.nextInt();
		int input2=scan1.nextInt();
		
		int count1=0;
		int count2=1;
		int count3=2;
		a[0]=input1;
		a[1]=input2;
		System.out.printf("%d %d ",a[0],a[1]);
		
		for(int i=2;i<a.length;i++) {
		a[count3]=a[count1]+a[count2];
			System.out.printf("%d ",a[count3]%10);
			if(count3>=10) {
				break;
				}
			count1++;
			count2++;
			count3++;
		}
		
	}

}
