package exceptions;

/**
 * These are all the exceptions that we used in the framework for better for better handling exceptions
 */
@SuppressWarnings("serial")
public class BrowserInvocationFailedException extends FrameworkException{
	
	/**
	 * Pass the message that needs to be appended to the stacktrace
	 * @param message Details about the exception or custom message
	 */
	public BrowserInvocationFailedException(String message) {
		super(message);
	}
	/**
	 * 
	 * @param message Details about the exception or custom message
	 * @param cause Pass the enriched stacktrace or customised stacktrace
	 */
	public BrowserInvocationFailedException(String message,Throwable cause) {
		super(message,cause);
	}

}
