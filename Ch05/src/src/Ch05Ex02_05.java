import java.util.Scanner;
public class Ch05Ex02_05 {

	public static void main(String[] args) {
		double[] a=new double[6];
		Scanner scan1 = new Scanner(System.in);
		double input1;
		double sum=0;
		int count=0;
		for(int i=0;i<a.length;i++) {
			count++;
			a[i]=input1=scan1.nextDouble();
			sum+=a[i];
		}
		System.out.printf("%.1f ",sum/count);
	}

}
