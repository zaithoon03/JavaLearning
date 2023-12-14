package week1day2;




public class Browsermethod {


	
	String launchbrowser(String browsername) {
		System.out.println("browser launched sucessfully");
		return browsername;
	}
	
	void loadurl() {
		System.out.println("application url loaded sucessfully");
		
	}
	
public static void main(String[] args) {
		Browsermethod obj = new Browsermethod();
		String BrowserName = obj.launchbrowser("Edge Browser");
		System.out.println(BrowserName);
		obj.loadurl();
	}

}
