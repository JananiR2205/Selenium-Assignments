package week1.day1;

public class Mobile {
	
	public void makeCall() {
		System.out.println("Making the call");		
	}
	public void sendMsg() {
		System.out.println("Sending the message");
	}

public static void main(String[] args) {
	Mobile mymobile = new Mobile();
	mymobile.makeCall();
	mymobile.sendMsg();
	
}

}