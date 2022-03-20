package week1.day1;

public class variable {
	
	String mobileModel = "REALME" ; /* Global variables */
	float mobileWeight = 10.5f;
	boolean isFullCharged = true ;
	int mobileCost =  150000;
		
	/*public void makeCall() {
		System.out.println("Making the call");		
	}
	public void sendMsg() {
		System.out.println("Sending the message");
	} */

public static void main(String[] args) {
	variable variab = new variable();
	/*mymobile.makeCall();
	mymobile.sendMsg(); */
	
	System.out.println(variab.mobileModel);
	System.out.println(variab.mobileWeight);
	System.out.println(variab.isFullCharged);
	System.out.println(variab.mobileCost);

	
}

}
