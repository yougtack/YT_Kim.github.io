import java.util.Scanner;
public class Ch05Ex02_02 {

	public static void main(String[] args) {
		int[] a=new int[5];
		int sum=0;
		Scanner scan1 = new Scanner(System.in);
		int input1;
		
		for(int i=0;i<a.length;i++) {
			a[i]=input1=scan1.nextInt();
			if(i%2==0)
				sum+=a[i];
		}
		System.out.printf("%d",sum);
		
		
	}

}
