package 연습;
class Product{
	int price;
	int bonusPoint;
	
	Product(){};
	
	Product(int price){
		this.price=price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	
	Tv(){}
	
	public String toString() {
		return "Tv";
	}
}
public class Exercise7_5 {
	public static void main(String[ ]args) {
		Tv tv = new Tv();
	}

}
