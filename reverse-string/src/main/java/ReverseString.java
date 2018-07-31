class ReverseString {

    String reverse(String inputString) {
      StringBuilder reversedStr = new StringBuilder(inputString.length());
      for(int i = inputString.length() - 1; i >= 0; i--) {
        reversedStr.append(inputString.charAt(i));
      }
      return reversedStr.toString();
    }

}