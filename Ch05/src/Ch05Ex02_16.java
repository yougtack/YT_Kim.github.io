import java.util.Scanner;
public class Ch05Ex02_16 {

	public static void main(String[] args) {
		int[][] a= new int[2][3];
		int[][] b= new int[2][3];
		
		
		Scanner scan1 = new Scanner(System.in);
		int input1;
		System.out.printf("frist array\n");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan1.nextInt();
			}
		}
		
		System.out.printf("second array\n");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=scan1.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%d ", a[i][j]*b[i][j]);
			}
			System.out.println();
		}
	}

}
