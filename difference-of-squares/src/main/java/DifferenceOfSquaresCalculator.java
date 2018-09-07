class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int s = squareSum(input);
        return s*s;
    }

    int squareSum(int input) {
        if(input == 1) return 1;
        else
            return input + squareSum(input-1);
    }

    int computeSumOfSquaresTo(int input) {
        if(input == 0) return 0;
        else
            return input * input + computeSumOfSquaresTo(input-1);
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}


