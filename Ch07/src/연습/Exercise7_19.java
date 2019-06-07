package 연습;

public class Exercise7_19 {
	public static void main(String [] args) {
		Buyer b = new Buyer();
		b.buy(new Tv1());
		b.buy(new Computer());
		b.buy(new Tv1());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
	}
}
class Buyer {

	int money = 1000;
	Product1[] cart = new Product1[3]; 
	int i = 0;

	void buy(Product1 p) {

		if(p.price > money) {
			System.out.println("돈이 부족하여"+p+"구매하실 수 없습니다.");
			return;
		}
		
		money-=p.price;
		add(p);	
	}
	
	void add(Product1 p) {
		if(i>=cart.length) {
			Product1[] newCart = new Product1[cart.length*2];
			System.arraycopy(cart,0,newCart, 0, cart.length);
			cart=newCart;
		}
		
		cart[i++]=p;
	}
	

	void summary() {
		String list="";
		int sum = 0;
		
		for(int i=0;i<cart.length;i++) {
			if(cart[i]==null) {
				break;
			}
			list+=cart[i]+", ";
			sum+=cart[i].price;
		}
		
		System.out.println("구입하신 물건은 "+list+"입니다.");
		System.out.println("총비용은 "+sum+"입니다.");
		System.out.println("남은 금액은 "+money+"입니다.");
		
	}
}

class Product1{
	int price;
	
	Product1(int price){
		this.price = price;
	}
}

class Tv1 extends Product1{
	Tv1(){ super(100); }
	
	public String toString() {return "Tv";}
}

class Computer extends Product1{
	Computer(){ super(200); }
	
	public String toString() {return "Computer";}
}

class Audio extends Product1{
	Audio(){ super(50); }
	
	public String toString() {return "Audio";}
}








