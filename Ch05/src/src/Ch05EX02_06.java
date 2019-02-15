import java.util.Scanner;
public class Ch05EX02_06 {

	public static void main(String[] args) {
		int count=0;
		char[] abc=new char[] {'A','P','P','L','E','!'};
		Scanner scan1 = new Scanner(System.in);
		String input1= scan1.nextLine();
		
		for(int i=0;i<abc.length;i++) {
			if(abc[i]==input1.charAt(0)) {
				System.out.printf("%d ",count);
			}
			count++;
		}
		
		
	}

}
