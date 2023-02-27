package UnitTestingAssnmnt;
class InvalidPrincipalException extends Exception {
    public InvalidPrincipalException(String message) {
        super(message);
    }
}

class InvalidTimeException extends Exception {
    public InvalidTimeException(String message) {
        super(message);
    }
}

class InvalidRateException extends Exception {
    public InvalidRateException(String message) {
        super(message);
    }
}
public class Calculator {
	public double calculateSimpleInterest(double principal, double time, double rate) 
			throws InvalidPrincipalException, InvalidTimeException, InvalidRateException {
	        if (principal <= 0) {
	            throw new InvalidPrincipalException("Invalid principal amount");
	        }
	        if (time <= 0) {
	            throw new InvalidTimeException("Invalid time period");
	        }
	        if (rate <= 0) {
	            throw new InvalidRateException("Invalid interest rate");
	        }
	        return principal * time * rate;
	    }
}
