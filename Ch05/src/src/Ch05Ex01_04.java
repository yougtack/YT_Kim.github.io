import java.util.Scanner;
public class Ch05Ex01_04 {
	public static void main(String [] arg) {
		int[] a= new int[100];
		Scanner scan1 = new Scanner(System.in);
		int input1;
		int count = 0;
		
		for(int i=0;i<a.length;i++) {
			a[i]=input1 = scan1.nextInt();
			if(a[i]==0) {
				count--;
				break;
		
			}
			count++;
			}
		for(int j=count;j>=0;j--) {
			System.out.printf("%d ",a[j]);
		}
		}
	}


