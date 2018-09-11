import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class DiamondPrinter {
    ArrayList<String> diamond;

    public DiamondPrinter() {
        diamond = new ArrayList<>();
    }
    // create char array full of spaces
    private char[] row(int len) {
        char[] row = new char[len];
        Arrays.fill(row, ' ');
        return row;
    }

    private void halfList(char a) {
        int numRows = Character.toUpperCase(a) - 'A' + 1;
        int extSpaces = numRows - 1;
        int len = extSpaces * 2 + 1;

        for(char c = 'A'; c <= a; c++) {
            char[] r = row(len);
            r[extSpaces] = c;
            r[len - extSpaces - 1] = c;
            diamond.add(new String(r));
            extSpaces--;
        }
    }


    ArrayList<String> printToList(char a) {
        int numRows = Character.toUpperCase(a) - 'A' + 1;
        halfList(a);
        for(int i = numRows-2; i >= 0; i--) {
            diamond.add(diamond.get(i));
        }

        return diamond;
    }

    public static void main(String[] args) {
        DiamondPrinter d = new DiamondPrinter();
        System.out.println(d.printToList('F'));
    }

}
