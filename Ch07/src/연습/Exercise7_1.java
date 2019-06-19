package 연습;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM]; //cards라는 이름으로 배열20을 만듬.
	
	SutdaDeck() {
		int num=0;
		boolean ck=false;
		
		for(int i=0;i<cards.length;i++) {
			num=i%10+1;
			ck=((i<10) && (num ==1 || num==3 || num==8));
			cards[i] = new SutdaCard(num, ck);
			
		}
	}
}

class SutdaCard {
	int num;
	boolean isKwang;
	
	SutdaCard() {
		this(1, true);
	}
	
	SutdaCard(int num, boolean isKwang) { 
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}


public class Exercise7_1 {
	public static void main(String [] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i < deck.cards.length;i++) 
			System.out.print(deck.cards[i]+",");
		
	}
}
