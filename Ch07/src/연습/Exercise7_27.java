package 연습;

class Outer2 {
	int value = 10;
	class Inner {
		int value=20;
		
		void method1() {
			Outer2 o = new Outer2();
			int value=30;
			
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(o.value);
			
		}

	}
}
public class Exercise7_27 {
	public static void main(String [] args) {
		Outer2 out = new Outer2();
		Outer2.Inner inner = out.new Inner();
		
		inner.method1();
	}
}
