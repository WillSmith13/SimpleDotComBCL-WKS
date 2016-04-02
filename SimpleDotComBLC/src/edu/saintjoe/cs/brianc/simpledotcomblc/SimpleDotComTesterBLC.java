package edu.saintjoe.cs.brianc.simpledotcomblc;

public class SimpleDotComTesterBLC {

	public static void main(String[] args) {
		
		// Create a new instance of our main object
        SimpleDotComBLC dot = new SimpleDotComBLC();
        
        // Create an array object (note syntax!!) constituting the locations occupied by our dot-com
        int[] locations = {2,3, 4};
        
        // Assign the local array reference (locations) to our instance variable through a setter method
        dot.setLocationCells(locations);
        
        // Fake a possible guess from a potential user
        // This creates a new String object, which will be referenced by "userGuess"
        String userGuess = "2";
        
        // See if it's a hit or not
        String result = dot.checkYourself(userGuess);
        
        // We know (from above) this ought to be a hit
        
        // Set the default result to "Failed"
        String testResult = "Failed";
        
        // Now see what the checkYourself method returned above
        if (result.equals("hit")) {
        	// It worked!!
        	testResult = "Passed";
        }
        
        // If it doesn't report the hit, then our code is failing to work properly
        System.out.println(testResult);
	}

}
