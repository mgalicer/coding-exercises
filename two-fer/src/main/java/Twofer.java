class Twofer {
    String twofer(String name) {
      String person = (name == null) ? "you" : name;
      return "One for " + person + ", one for me.";
    }
}
