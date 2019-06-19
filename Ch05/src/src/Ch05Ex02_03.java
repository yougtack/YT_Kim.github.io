import java.util.Scanner;
public class Ch05Ex02_03 {

	public static void main(String[] args) {
		int[] a=new int[10];
		int odd=0;
		int even=0;
		Scanner scan1 = new Scanner(System.in);
		int input1;
		
		for(int i=0;i<a.length;i++) {
			a[i]=input1 = scan1.nextInt();
			if(i%2==0)
				odd+=a[i];
			else
				even+=a[i];
		}
		System.out.printf("odd:%d\neven:%d",odd,even);
	}

}
