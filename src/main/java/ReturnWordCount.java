
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){

        String[]arr = in.split("\\s+");
        
        return arr.length;
    }
}
