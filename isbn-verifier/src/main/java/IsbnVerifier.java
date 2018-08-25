class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        if(stringToVerify.length() < 10) return false;

        int charPlace = 0; //increasing iterator
        int factor = 10; //decreasing iterator
        int sumFactors = 0;

        while (charPlace < stringToVerify.length()) {
          if (stringToVerify.charAt(charPlace) == 'X') {
            sumFactors += 10;
          } else if (!(stringToVerify.charAt(charPlace) == '-')) {
            sumFactors += (stringToVerify.charAt(charPlace) - '0') * factor;
            factor--;
          }

          charPlace++;
        }
        return (sumFactors % 11 == 0);
    }

}
