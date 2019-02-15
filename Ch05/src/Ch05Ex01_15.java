import java.util.Scanner;
public class Ch05Ex01_15 {

	public static void main(String[] args) {
		int [][] a= new int[5][4];
		String[] abc = new String[5];
		Scanner scan1 = new Scanner(System.in);
		int input1;
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=input1=scan1.nextInt();
			}
		}
		
		for(int i=0;i<a.length;i++) {
			int sum=0;
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
			if(sum/a[i].length<80)
				abc[i]= "fail";
			else {
				abc[i]="pass";
				count++;
			}
		}
		
		for(int i=0;i<abc.length;i++) {
		System.out.printf("%s\n",abc[i]);
			}
		System.out.printf("Successful:%d",count);
	}

}
