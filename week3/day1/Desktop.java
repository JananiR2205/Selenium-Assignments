package week3.Day1.org.system;

public class Desktop extends Computer{
	
	public void desktopSize() {
		
		System.out.println("1920 X 1080");
		
	}

	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.computerModel();
		desk.desktopSize();
		
	}

}
