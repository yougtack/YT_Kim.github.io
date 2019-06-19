import java.util.Scanner;
public class Ch02Ex02_04 {
	public static void main(String [] args) {
	Scanner scan1 = new Scanner(System.in);
	String input1 = scan1.nextLine();
	int num1 = Integer.parseInt(input1);
	Scanner scan2 = new Scanner(System.in);
	String  input2 = scan2.nextLine();
	int num2 = Integer.parseInt(input2);
	System.out.println(input1+"-"+input2+"="+(num1-num2));
	
	Scanner scan3 = new Scanner(System.in);
	String input3 = scan3.nextLine();
	int num3 = Integer.parseInt(input3);
	Scanner scan4 = new Scanner(System.in);
	String  input4 = scan4.nextLine();
	int num4 = Integer.parseInt(input4);
	System.out.println(input3+"-"+input4+"="+(num3-num4));

}


}
