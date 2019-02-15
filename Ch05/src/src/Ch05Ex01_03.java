import java.util.*;
public class Ch05Ex01_03 {

	public static void main(String[] args) {
		char[] a=new char [10];
		Scanner scan1 = new Scanner(System.in);
		String input1 = scan1.nextLine();
		input1=input1.replaceAll(" ","");
		for(int i=0;i<a.length;i++) {
			a[i]=input1.charAt(i);
		}
		for(int j=0;j<a.length;j++) {
			if(j%3==0){
				if(j<8)
				System.out.printf("%c ",a[j]);
			}
		}
		
	}

}
