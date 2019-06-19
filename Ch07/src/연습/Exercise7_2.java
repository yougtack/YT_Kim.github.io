package 연습;


class SutdaDeck1{
	final int CARD_NUM = 20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM]; //cards라는 이름으로 배열20을 만듬.
	
	SutdaDeck1() {
		int num=0;
		boolean ck=false;
		
		for(int i=0;i<cards.length;i++) {
			num=i%10+1;
			ck=((i<10) && (num ==1 || num==3 || num==8));
			cards[i] = new SutdaCard1(num, ck);
		}
	}
	void shuffle() {
		for(int i=0;i<cards.length;i++) {
		int j=(int)(Math.random()*cards.length);
			SutdaCard1 tmp=cards[i];
			cards[i]=cards[j];
			cards[j]=tmp;
		}
	}
	SutdaCard1 pick(int index) {
			return cards[index];
	}
	
	SutdaCard1 pick() {
		return cards[(int)(Math.random()*cards.length)+1];
	}
}


class SutdaCard1 {
	int num;
	boolean isKwang;
	
	SutdaCard1() {
		this(1, true);
	}
	
	SutdaCard1(int num, boolean isKwang) { 
		this.num = num;
		this.isKwang = isKwang;
	}
	public String toString() {
		return num + ( isKwang ? "K":"");
	}
}


public class Exercise7_2 {
	public static void main(String [] args) {
		SutdaDeck1 deck = new SutdaDeck1();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i=0; i < deck.cards.length;i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));

	}
}
