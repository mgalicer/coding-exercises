import java.util.HashMap;
class IsogramChecker {

    boolean isIsogram(String phrase) {

      HashMap<Character, Integer> letterCounts = new HashMap<>();
      // initialize hashmap
      for(char c = 'a'; c <= 'z'; c++) {
        letterCounts.put(c, 0);
      }

      // check if character exists
      for(int i = 0; i < phrase.length(); i++) {
        char p = phrase.charAt(i);
        if (Character.isLetter(p)) {
          if(letterCounts.get(Character.toLowerCase(p)) == 1) return false;
          letterCounts.replace(Character.toLowerCase(p), 1);
        }
      }

      return true;
    }

}
