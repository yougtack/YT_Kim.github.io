import java.util.Scanner;
public class Ch05Ex02_10 {

	public static void main(String[] args) {
	int tmp;
	
	Scanner scan1 =new Scanner(System.in);
	int input1=scan1.nextInt();
	
	Scanner scan2 =new Scanner(System.in);
	int input2;
	
	int[] a=new int [input1];
	
	for(int i=0;i<a.length;i++) {
		a[i]=input2=scan2.nextInt();
	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]>a[j]) {
				tmp=a[i];
				a[i]=a[j];
				a[j]=tmp;
			}
		}
	}
	for(int i=0;i<a.length;i++) {
	System.out.printf("%d\n",a[i]);
	}
		
		
	}

}
