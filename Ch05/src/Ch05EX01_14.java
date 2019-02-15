import java.util.Scanner;
public class Ch05EX01_14 {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		Scanner scan2 = new Scanner(System.in);
		int input1,input2;
		
		int[][] a = new int[2][4];
		int[][] b = new int[2][4];
		System.out.println("frist array");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=input1=scan1.nextInt();
				}
			}
		System.out.println("second arraty");
		for(int f=0;f<a.length;f++) {
			for(int g=0;g<a[f].length;g++) {
				b[f][g]=input2=scan2.nextInt();
			}
		}
		for(int h=0;h<a.length;h++) {
			for(int k=0;k<a[h].length;k++) {
				System.out.printf("%d ",a[h][k]*b[h][k]);

			}
			System.out.println();
			
		}		
	}

}
