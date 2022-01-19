package Remote;

public class Television implements RemoteControl {

	public static final int MAX_VOLUMN = 10;
	public static final int MIN_VOLUMN = 0;
	int volumn = 0;
	boolean mute;
	
	
	@Override
	public void turnOn() {
		System.out.println(" TV 전원을 켭니다");
	}

	@Override
	public void turnOff() {
		System.out.println(" TV 전원을 끕니다");
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println(" 음소거 on ");
		}
		else {
			System.out.println(" 음소거 off ");
		}
	}
	
	@Override
	public void setVolumn(int volumn) {
		this.volumn = volumn;
		if(volumn > MAX_VOLUMN) {
			this.volumn = MAX_VOLUMN;
			System.out.println(" VOLUMN : " + MAX_VOLUMN);
		}
		else if(volumn < MIN_VOLUMN) {
			this.volumn = MIN_VOLUMN;
			System.out.println(" VOLUMN : " + MIN_VOLUMN);
		}
		else {
			this.volumn = volumn;
			System.out.println(" VOLUMN : " + this.volumn);
		}
		
	}
	
	
	

}
