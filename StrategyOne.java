public class StrategyOne implements StrategyInterface {

    public int calculate(String s) {
	int toReturn = 0;
	for (int j = 0; j < s.length(); j++) {
	    //int bird = 0;
		//bird = 200000000;
	    //System.out.println("StragegyONE : " + bird);
	    System.out.print(".");
	    toReturn += (byte) s.charAt(j);

	    //toReturn += BillUtil.value();
	   	int bill;
	    if(j==0){
	    	bill = BillUtil.value();
	    }else{
	    	bill = 0;
	    }

	   // System.out.print("BIIIL " + bill);
	    toReturn += bill;

	    
	}




	System.out.println("... done!");
	if (s.length() == 0) {
	    return 0;
	} else {
	    return toReturn % s.length();
	}
    }
    
}
