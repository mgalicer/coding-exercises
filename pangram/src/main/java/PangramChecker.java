import java.util.HashMap;

public class PangramChecker {

    public boolean isPangram(String input) {
      // if input is less than 26 chars, don't bother.
      if(input.length() < 26) return false;

      // initialize hashtable with letters A-Z and a count of 0
      HashMap<Character, Boolean> letterPresence = new HashMap<>();
      for (char c = 'A'; c <= 'Z'; c++) {
        letterPresence.put(c, false);
      }
      // pansum variable will be updated as we update letter counts - so if it reaches 26, then iteration can stop.
      int panSum = 0;
      int count = 0;

      while(count < input.length()) {
        // if character is a letter, format it and update HashMap and sum
        if(Character.isLetter(input.charAt(count))) {
          char letter = Character.toUpperCase(input.charAt(count));
          if(letterPresence.get(letter) == false) {
            letterPresence.put(letter, true);
            panSum++;
          }
        }
        // stop iterating, we have all letters of alphabet
        if(panSum == 26) return true;
        count++;
      }

      return false;
    }



}
