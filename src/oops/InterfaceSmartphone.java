package oops;

public class InterfaceSmartphone {

	public static void main(String[] args) {
		SmartPhone sPhone = new SmartPhone();
		sPhone.camera();
		sPhone.musicPlayer();
	}
	
}
interface Camera {
	void camera();
}
interface MusicPlayer {
	void musicPlayer();
}

class SmartPhone implements Camera, MusicPlayer {
	public void camera() {
		System.out.println("Camera is not Working");
	}
	public void musicPlayer() {
		System.out.println("Try with good song");
	}
}