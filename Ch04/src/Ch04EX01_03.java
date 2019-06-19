import java.util.Scanner;
public class Ch04EX01_03 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		int year = scan1.nextInt();
		
		if(year>=20)
			System.out.printf("abult");
		else if(year<20)
			System.out.printf("%d years later",20-year);
	}

}
