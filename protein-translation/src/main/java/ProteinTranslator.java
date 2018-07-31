import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class ProteinTranslator {

  HashMap<String, String> proteinDecodings = new HashMap<String, String>();

  ProteinTranslator() {
    initializeHashMap();
  }

  List<String> translate(String rnaSequence) {
    List<String> rna = new ArrayList<String>();
    int i = 0;
    while(i < rnaSequence.length() - 1) {
      String codon = proteinDecodings.get(rnaSequence.substring(i, i + 3));
      if(codon.equals("STOP")) {
        return rna;
      }

      rna.add(codon);
      i = i + 3;
    }
    return rna;
  }

  void initializeHashMap() {
    proteinDecodings.put("AUG", "Methionine");
    proteinDecodings.put("UUU", "Phenylalanine");
    proteinDecodings.put("UUC", "Phenylalanine");
    proteinDecodings.put("UUA", "Leucine");
    proteinDecodings.put("UUG", "Leucine");
    proteinDecodings.put("UCU", "Serine");
    proteinDecodings.put("UCC", "Serine");
    proteinDecodings.put("UCA", "Serine");
    proteinDecodings.put("UCG", "Serine");
    proteinDecodings.put("UAU", "Tyrosine");
    proteinDecodings.put("UAC", "Tyrosine");
    proteinDecodings.put("UGU", "Cysteine");
    proteinDecodings.put("UGC", "Cysteine");
    proteinDecodings.put("UGG", "Tryptophan");
    proteinDecodings.put("UAA", "STOP");
    proteinDecodings.put("UAG", "STOP");
    proteinDecodings.put("UGA", "STOP");

  }


}