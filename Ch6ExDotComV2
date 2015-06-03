import java.util.ArrayList; 

package chap05;

public class DotCom {

    private ArrayList<String> locationCells;
    // private numOfHits;

    // Old Array: int[] locationCells;
    // Old Array: int numOfHits = 0;
    
    // Old Array: public void setLocationCells(int[] locs)
    
public void setLocationCells(ArrayList<String> loc) {
        locationCells = locs;
    }
    
    public String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);        // converts the string to an int
        String result = "miss";

        /* Old Array:

        for (int cell: locationCells)
        {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length)
        {
            result = "kill";
        }
        System.out.println(result);
        return result;
        */ 

        int index = locationCells.indexOf(userInput);

        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
    
    return result;

    }
}
