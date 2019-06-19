package 연습;

abstract class Unit {
	int x,y;
	void stop() {};
	abstract void move(int x, int y);
	
}

class Marine extends Unit{  
	void move(int x, int y) {}
	void stimPack() {}
}

class Tank extends Unit{ 
	void move(int x, int y) {}
	void changeMode() {}
}

class Dropship extends Unit{ 
	void move(int x, int y) {}
	void load() {}
	void unload() {}
}


public class Exercise7_17 {

}
