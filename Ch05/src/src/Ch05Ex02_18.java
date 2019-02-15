import java.util.Scanner;
public class Ch05Ex02_18 {

	public static void main(String[] args) {
		char[][] a=new char[3][5];
		Scanner scan1 = new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=scan1.next().charAt(0);
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=(char)(a[i][j]+32);
			System.out.printf("%c ",a[i][j]);
			}
			System.out.println();
		}
		
		
	}

}
