import java.util.*;
public class Ch04Ex01_08 {
	public static void main(String [] args) {
		Scanner scan1 = new Scanner(System.in);
		double input1 = scan1.nextDouble();
		
		if(input1>=0 && input1<=4.5) {
			switch((int)input1) {
			case 4:
				System.out.printf("scholarship");
				break;
			case 3:
				System.out.printf("next semester");
				break;
			case 2:
				System.out.printf("seasonal semeter");
				break;
			default:
				System.out.printf("retake");
	
			}
		}
	}

}
