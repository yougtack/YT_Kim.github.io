package 연습;
class MyTv3 {
	private boolean isPowerOn;
	private int channel; 
	private int volume;
	private int PrevChannel;
	
	final int MAX_VOLUME = 100; 
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100; 
	final int MIN_CHANNEL = 1;
	
	public boolean isPowerOn(){
		isPowerOn=!isPowerOn;	
		return isPowerOn;
	}
	
	public void setChannel(int channel) {
		PrevChannel=this.channel;
		this.channel=channel;
		
	}
	
	public int  getChannel() {
		return channel;
	}
	
	public void setVolume(int volume) {
		this.volume=volume;
	}
	
	public int  getVolume() {
		return volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(PrevChannel);
	}
}
public class Exercise7_11 {
	public static void main(String args[]) {
		MyTv3 t = new MyTv3();
		
		t.setChannel(10); 
		System.out.println("CH:"+t.getChannel());
		
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel()); 
		
		t.gotoPrevChannel(); 
		System.out.println("CH:"+t.getChannel()); 
		
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
	}
}
