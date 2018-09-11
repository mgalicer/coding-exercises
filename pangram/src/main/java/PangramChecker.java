import java.util.HashMap;

public class PangramChecker {
    private static HashMap<Character, Boolean> letters() {
      // initialize hashtable with letters A-Z and a count of 0
      HashMap<Character, Boolean> letters = new HashMap<>();
      for (char c = 'A'; c <= 'Z'; c++) {
        letters.put(c, false);
      }

      return letters;
    }

    public boolean isPangram(String input) {
      // if input is less than 26 chars, don't bother.
      if(input.length() < 26) return false;

      HashMap<Character, Boolean> letters = letters();
      // pansum variable will be updated as we update letter counts - so if it reaches 26, then iteration can stop.
      int panSum = 0;

      for(int i = 0; i < input.length(); i++) {
        // if character is a letter, format it and update HashMap and sum
        if(Character.isLetter(input.charAt(i))) {
          char letter = Character.toUpperCase(input.charAt(i));
          if(letters.get(letter) == false) {
            letters.put(letter, true);
            panSum++;
          }
        }
        // stop iterating, we have all letters of alphabet
        if(panSum == 26) return true;
      }

      return false;
    }



}
