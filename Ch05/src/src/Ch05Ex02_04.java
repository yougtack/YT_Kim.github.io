import java.util.Scanner;
public class Ch05Ex02_04 {

	public static void main(String[] args) {
		int[] a= new int[100];
		int count=0;
		Scanner scan1 = new Scanner(System.in);
		int input1;
		
		for(int i=0;i<a.length;i++) {
			count++;
			a[i]=input1=scan1.nextInt();
			if(a[i]<0) {
				count--;
				break;
			}
		}
		for(int i=count-3;i<count;i++) {
		System.out.printf("%d ",a[i]);
		}
	}

}
