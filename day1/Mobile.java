package week1.day1;

public class Mobile {
	public void sendMessage() {
		System.out.println("sendMessage");
	}
	public void shareDocument() {
		System.out.println("shareDocument");
	}
	public void makeCall() {
		System.out.println("makeCall");
	}
	public static void main(String[] args) {
		Mobile myMobile= new Mobile();
		myMobile.sendMessage();
		myMobile.shareDocument();
		myMobile.makeCall();
		
	}

}
