
public class StringUtilities {
    /**
     * @param input value to be returned
     * @return `input`
     */
    public String returnInput(String input) {
        return input;
    }

    /**
     * @param baseValue value to be added to
     * @param valueToBeAdded value to add
     * @return the concatenation of `baseValue` and `valueToBeAdded`
     */
    public String concatenate(String baseValue, String valueToBeAdded) {
        String ans = baseValue + valueToBeAdded;
        return ans;
    }

    /**
     * @param valueToBeReversed value to be reversed
     * @return identical string with characters in opposite order
     */
    public String reverse(String valueToBeReversed) {
        StringBuffer reversedStr = new StringBuffer(valueToBeReversed);
        reversedStr = reversedStr.reverse();
        String result = reversedStr.toString();
        return result;
    }

    /**
     * @param word word to get middle character of
     * @return middle character of `word`
     */
    public Character getMiddleCharacter(String word) {
        int mid = word.length()-1;
        mid = mid/2;
        char ans = word.charAt(mid);
        return ans;
    }

    /**
     * @param value value to have character removed from
     * @param charToRemove character to be removed from `value`
     * @return `value` with char of value `charToRemove` removed
     */
    public String removeCharacter(String value, Character charToRemove) {
        
        char myChar = charToRemove;
        value = (value.replace("myChar",""));
        return value;
    }

    /**
     * @param sentence String delimited by spaces representative of a sentence
     * @return last `word` in sentence
     */
    public String getLastWord(String sentence) {
        
        String[] sentArray = sentence.split(" ");
        int lastWordInx = (sentArray.length -1);
        String result = sentArray[lastWordInx];
        return result;
    }
}
