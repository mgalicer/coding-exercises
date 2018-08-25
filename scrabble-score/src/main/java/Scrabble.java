import java.util.HashMap;

class Scrabble {
    HashMap<String, Integer> scores = new HashMap<>();
    int score;
    String scrabbleWord;

    Scrabble(String word) {
      scrabbleWord = word;
      score = 0;
      fillScores();
    }

    private void fillScores() {
      String[][] letters = {{ "A", "E", "I", "O", "U", "L", "N", "R", "S", "T" }, { "D", "G" }, { "B", "C", "M", "P" }, { "F", "H", "V", "W", "Y" }, {"K"}, { "J", "X" }, {"Q", "Z" }};

      Integer[] values = { 1, 2, 3, 4, 5, 8, 10};

      int i = 0;
      for (String[] letterGroup : letters) {
        for (String letter: letterGroup) {
          scores.put(letter, values[i]);
        }
        i++;
      }
    }

    int getScore() {
      for (int i=0; i < scrabbleWord.length(); i++) {
        score += scores.get(scrabbleWord.substring(i, i+1).toUpperCase());
      }
      return score;
    }

    public static void main(String[] args) {
      Scrabble s = new Scrabble("a");
      s.getScore();
    }

}
