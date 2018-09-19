
class Matrix {
    String matrixStr;
    int[][] matrix;
    int numRows;

    Matrix(String matrixAsString) {
        matrixStr = matrixAsString;
        matrix = convertStringToArr(matrixAsString);
    }


    int[] getRow(int rowNumber) {
        return matrix[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[numRows];
        for(int i = 0; i < numRows; i++) {
            col[i] = matrix[i][columnNumber];
        }
        return col;
    }

    int[][] convertStringToArr(String matrixStr) {
        // split string into rows separated by newlines
        String[] rows = matrixStr.split("\n");
        numRows = rows.length;
        // create new array based on size of rows
        int [][] newArr = new int[numRows][];
        // for each row
        for(int i = 0; i < rows.length; i++) {
            // get list of numbers as strings
            String[] s = rows[i].split(" ");
            // create integer version of each element and add to new array
            int[] newRow = new int[s.length];
            for(int k = 0; k < s.length; k++) newRow[k] = Integer.valueOf(s[k]);
            newArr[i] = newRow;
        }
        return newArr;
    }
}
