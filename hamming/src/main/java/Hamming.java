class Hamming {
  String left;
  String right;

  Hamming(String leftStrand, String rightStrand) {
      if(leftStrand.length() != rightStrand.length()) {
        throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
      }

      left = leftStrand;
      right = rightStrand;

  }

  int getHammingDistance() {
    int hammingDist = 0;
    for(int i = 0; i < left.length(); i ++) {
      if(left.charAt(i) != right.charAt(i)) {
        hammingDist++;
      }
    }

    return hammingDist;
  }

}
