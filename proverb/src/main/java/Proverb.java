class Proverb {
    String[] pWords;
    Proverb(String[] words) {
        pWords = words;
    }

    String recite() {
      String proverb = "";

      if(pWords.length == 0) return proverb;

      int count = 0;
      while(count < pWords.length - 1) {
        proverb += String.format("For want of a %s the %s was lost.\n", pWords[count], pWords[count + 1]);
        count++;
      }
      String last = String.format("And all for the want of a %s.", pWords[0]);
      return proverb + last;
    }

}
