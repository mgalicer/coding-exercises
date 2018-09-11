import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class DiamondPrinter {
    // create char array full of spaces
    private static char[] row(int len) {
        char[] row = new char[len];
        Arrays.fill(row, ' ');
        return row;
    }

    private static ArrayList<String> halfList(char a) {
        ArrayList<String> halfList = new ArrayList<>();

        int numRows = Character.toUpperCase(a) - 'A' + 1;
        int extSpaces = numRows - 1;
        int len = extSpaces * 2 + 1;

        char[] row = row(len);
        row[extSpaces] = 'A';
        halfList.add(new String(row));

        for(char c = 'B'; c <= a; c++) {
            char[] r = row(len);
            extSpaces--;
            r[extSpaces] = c;
            r[len - extSpaces - 1] = c;
            halfList.add(new String(r));
        }

        for(int i = numRows-2; i >= 0; i--) {
            halfList.add(halfList.get(i));
        }

        return halfList;
    }


    ArrayList<String> printToList(char a) {
        ArrayList<String> diamond = halfList(a);


        return diamond;
    }

    public static void main(String[] args) {
        DiamondPrinter d = new DiamondPrinter();
        System.out.println(d.printToList('F'));
    }

}
