class LuhnValidator {

    boolean isValid(String candidate) {
        if(candidate.length() <= 1) return false;

        StringBuilder newCandidate = new StringBuilder();

        // parse and clean the input string
        for(int i = 0; i < candidate.length(); i++) {
          if(Character.isDigit(candidate.charAt(i))) {
            // if the character is a digit, start building a new string
              newCandidate.append(candidate.charAt(i));
          } else if(candidate.charAt(i) == ' ') {
            // if the character is a space, do nothing
          } else {
            // if the character isn't a digit or string, return false
            return false;
          }
        }

        if(newCandidate.length() <= 1) return false;

        int sum = 0;
        int count = 1;
        // starting from the end of the string, manipulate every other digit
        for(int j = newCandidate.length() - 1; j >= 0;  j--) {
            if(count % 2 == 0) {
                int newNum = Character.getNumericValue(newCandidate.charAt(j)) * 2;
                if(newNum > 9) newNum -= 9;
                newCandidate.insert(j, newNum);
            }
            sum += Character.getNumericValue(newCandidate.charAt(j));
            count++;
        }

        if(sum % 10 == 0) return true;
        return false;
    }
}
