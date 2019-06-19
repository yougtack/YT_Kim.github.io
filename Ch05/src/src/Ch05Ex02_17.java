import java.util.Scanner;
public class Ch05Ex02_17 {

	public static void main(String[] args) {
	int[][] a=new int [4][2];
	Scanner scan1 = new Scanner(System.in);
	int input1;
	int count=1;
	int[] avg1 = new int[4];
	
	
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			a[i][j]=input1=scan1.nextInt();
		}
	}
	
	for(int i=0;i<a.length;i++) {
		int hap=0;
		for(int j=0;j<a[i].length;j++) {
			hap+=a[i][j];
		}
		System.out.printf("%d ",hap/2);
	}
	System.out.println();
	for(int i=0;i<a[i].length;i++) {
		int hap=0;
		for(int j=0;j<a.length;j++) {
			hap+=a[j][i];
			}
		System.out.printf("%d ",hap/4);
		}
	System.out.println();
	int hap=0;
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a[i].length;j++) {
			hap+=a[i][j];
		}
	}
	System.out.printf("%d", hap/8);
	}
}


