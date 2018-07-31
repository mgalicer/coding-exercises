class ArmstrongNumbers {

	boolean isArmstrongNumber(int numberToCheck) {

    int numCopy = numberToCheck;
    int numDigits = 0;
    while(numCopy > 0) {
      numDigits +=  1;
      numCopy /= 10;
    }

    int numCopyb = numberToCheck;
    int armstrongSum = 0;
    while(numCopyb > 0) {
      int digit = numCopyb % 10;
      armstrongSum += Math.pow(digit, numDigits);
      numCopyb /= 10;
    }

    boolean result;
    return result = (armstrongSum == numberToCheck) ? true : false;
	}

}
