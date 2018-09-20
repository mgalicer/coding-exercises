
class Matrix {
    int[][] matrix;

    Matrix(String matrixAsString) {
        matrix = convertStringToArr(matrixAsString);
    }

    int[] getRow(int rowNumber) {
        return matrix[rowNumber];
    }

    int[] getColumn(int columnNumber) {
        int[] col = new int[matrix.length];
        for(int i = 0; i < matrix.length; i++) {
            col[i] = matrix[i][columnNumber];
        }
        return col;
    }

    int[][] convertStringToArr(String matrixStr) {
        String[] rows = matrixStr.split("\n");
        int numRows = rows.length;
        int [][] newArray = new int[numRows][];
        for(int i = 0; i < rows.length; i++) {

            String[] s = rows[i].split(" ");
            // create integer version of each element and add to new array
            int[] newRow = new int[s.length];
            for(int k = 0; k < s.length; k++) newRow[k] = Integer.valueOf(s[k]);
            newArray[i] = newRow;
        }
        return newArray;
    }
}
