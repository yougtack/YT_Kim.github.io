import java.util.Scanner;
public class Ch05Ex02_01 {

	public static void main(String[] args) {
		char[] abc=new char[10];
		int count=0;
		Scanner scan1 = new Scanner(System.in);
		String input1 = scan1.nextLine();
		input1=input1.replace(" ","");
		
		for(int i=0;i<abc.length;i++) {
			count++;
			abc[i]=input1.charAt(i);
		}
		for(int j=count-1;j>=0;j--) {
			System.out.printf("%c ",abc[j]);
		}
		
	}

}
