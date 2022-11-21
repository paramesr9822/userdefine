package userdefine;

public class agenotEligibleException extends Exception {
	@Override
	public String getMessage() {
	String msg="age is less than18";
	return msg;

	}
	
	private void m2() {
	System.out.println("m2");

	}

}
