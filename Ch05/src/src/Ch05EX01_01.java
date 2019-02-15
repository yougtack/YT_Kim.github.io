import java.util.*;
public class Ch05EX01_01 {
	public static void main(String [] args) {
		char[] a=new char[10];
		Scanner scan1 = new Scanner(System.in);
		String input1 = scan1.nextLine();
		input1=input1.replace(" ","");
		for(int i=0;i<a.length;i++) {
			a[i]=input1.charAt(i);
			
	}
		
		for(int j=0;j<a.length;j++) {
			System.out.printf("%c",a[j]);
		}
	}
}
