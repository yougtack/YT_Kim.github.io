import java.util.*;
public class Ch05Ex01_12 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int sum=0;
		int count1=0;
		int count2=1;
		int count3=2;
		Scanner scan1 = new Scanner(System.in);
		int input1 = scan1.nextInt();
		
		a[0]=100;
		a[1]=input1;
		System.out.printf("%d %d ",a[0],a[1]);
		
		for(int i=0;i<a.length;i++) {
			a[count3]=a[count1]-a[count2];
			System.out.printf("%d ",a[count3]);
				if(a[count3]<0) {
					break;
				}
			count1++;
			count2++;
			count3++;
		}
		

	}

}
