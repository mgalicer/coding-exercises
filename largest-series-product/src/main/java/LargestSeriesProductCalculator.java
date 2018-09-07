class LargestSeriesProductCalculator {
    String numStr;

    LargestSeriesProductCalculator(String inputNumber) {
        numStr = inputNumber;
    }

    long calculateLargestProductForSeriesLength(int numberOfDigits) {
        if(numberOfDigits > numStr.length()) throw new IllegalArgumentException("Series length must be less than or equal to the length of the string to search.");
        if(numberOfDigits < 0) throw new IllegalArgumentException("Series length must be non-negative.");

        int count = 0;
        // largest product
        long largestProduct = 0;

        while(count <= numStr.length() - numberOfDigits) {
            // get the series
            String series = numStr.substring(count, count +numberOfDigits);
            count++;

            // get the product of the digits in the series
            int product = 1;
            for(int i = 0; i < numberOfDigits; i++) {
                if (Character.isDigit(series.charAt(i))) {
                    product *= Character.getNumericValue(series.charAt(i));
                } else {
                    throw new IllegalArgumentException("String to search may only contain digits.");
                }

            }

            // reassign largest product if a larger one is found
            largestProduct = (product > largestProduct ) ? product : largestProduct;

        }

        return largestProduct;
    }

}
