public class Bill {

    public static int coogie() {
		// int bird = 0;
		// for (int l=0; l <100000; l++) {
		    
		//     for (int m = 0; m < 100; m++) {
		// 	bird += (l + m + 2);
		//     }

		// }

		// System.out.println("BIIIIIIIIRRRD" + bird);
		// return bird;
    	return -2001173632;
    }

    
    public static int noogie() {
		// int bird = 0;
		// for (int l=0; l <1000; l++) {
		//     for (int m = 0; m < 100; m++) {
		// 	bird += (l + m);
		//     }
		// }
		// return bird;
    	return 54900000;
    }

    
    public static void main(String[] args) {

	if (args.length < 1) {
	    System.out.println("Pass in filename as argument");
	    System.exit(1);
	}
	
	int bird = 0;
	for (int j = 0; j < 10000; j++) {
		int coog = coogie() ;
		int noog = noogie();
		//System.out.println("Coogie " + coog);
		//System.out.println("Noogie " + noog);

	    bird += j + coogie() + noogie();
	    if (j % 10 == 0) {
		System.out.print(".");
	    }
	}
	
	System.out.println("\nStart: " + bird);

	FileName fn = new FileName(args[0]);

	SomethingDoer sd = new SomethingDoer(fn);

	sd.doIt(fn);

	
    }
    
}
