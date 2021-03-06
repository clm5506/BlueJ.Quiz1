
public class LoopFun
{

    /**
     * Given a number, return the factorial of that number.
     * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
     * @param number
     * @return the factorial of the number
     */
    public Integer factorial(Integer number){

        Integer myInt = new Integer(1);

        for(int i = 2; i <= number; i++) {
            myInt *=i;   
        }

        return myInt;
    }

    /**
     * Given a phrase, get the acronym of that phrase. Acronym is the combination of
     * the first character of each word in upper case.
     * For example, given "Ruby on Rails", this method will return "ROR"
     * @param phrase
     * @return Upper case string of the first letter of each word
     */
    public String acronym(String phrase) {

        String[] firstLetters = phrase.split(" ");
        String result = "";
        for (int i = 0; i < firstLetters.length; i ++) {
                String word = firstLetters[i];
                String testAns = firstLetters[i]; 
                String[] s = testAns.split("");
                result = result + s[0];
                
            }
            return result.toUpperCase();
        }
            /**
             * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
             * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
             * at the end of the alphabet, it will wraps around.
             * For example:
             *  'a' => 'd'
             *  'w' => 'z'
             *  'x' => 'a'
             *  'y' => 'b'
             * @param word
             * @return the encrypted string by shifting each character by three character
             */
            public String encrypt(String word) {
               // String[] wordArray = word.split("");
              
               StringBuilder result = new StringBuilder();
               char[] wordCharArray = word.toCharArray();
                
               for(int i = 0 ; i < wordCharArray.length; i++) {
                   
                   char s = wordCharArray[i];
                   
                   wordCharArray[i] = (char) (s+3);
                   
                   if (wordCharArray[i] > 122 ) {
                       wordCharArray[i] -= 26;
                    }
                   result = result.append(wordCharArray[i]);
                
            }
                
               return result.toString();
    }
}
