package week1;

public class Mobile {

		
		  public String makecall(String mobileModel, float mobileWeight) {
			  /*if(mobileWeight>20) {
				  return mobileModel + " Weight is too heavy";
			  }
			  else {
				  return mobileModel + " Weight is not heavy";				  
			  }	*/
			  return mobileModel + " Weight is " + mobileWeight;	
	}
		boolean sendMsg(boolean isFullCharged , int mobileCost) {
			if(isFullCharged) {
				 System.out.println("Full Charged");
			}
			else {
				System.out.println("Not Full Charged");
			}
			System.out.println("Mobile Cost is " + mobileCost);
			return true;
		}
		  
		 public static void main(String[] args) {
		   System.out.println("This is my mobile");
           Mobile obj = new Mobile();
           String mobilemodel =obj.makecall("Nokia",220.3f);
           System.out.println(mobilemodel);
           boolean charged = obj.sendMsg(true,10);		
	}

}
