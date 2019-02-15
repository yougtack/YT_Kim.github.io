import java.util.Scanner;
public class Ch05EX02_15 {
	public static void main(String [] args) {
		int[][]a=new int[4][3];
		int[] sum=new int[4];
		Scanner scan1 = new Scanner(System.in);
		int input1;
		for(int i=0;i<a.length;i++) {
			System.out.printf("%dclass?",i+1);
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=input1=scan1.nextInt();
				sum[i]+=a[i][j];
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.printf("%dclass:%d\n", i+1,sum[i]);
		}
		
	}

}
