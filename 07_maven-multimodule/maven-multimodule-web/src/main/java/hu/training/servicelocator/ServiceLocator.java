package hu.training.servicelocator;

import hu.training.authenticator.Authenticator;
import hu.training.authenticator.DBAuthenticator;
import hu.training.authenticator.LDAPAuthenticator;
import hu.training.booking.BookingServiceImpl;

public class ServiceLocator {

	public static Authenticator getDbAuthenticator() {
		return new DBAuthenticator();
	}
	
	public static Authenticator getLDAPAuthenticator() {
		return new LDAPAuthenticator();
	}
	
	public static BookingServiceImpl getBookingServiceImpl() {
		return new BookingServiceImpl();
	}
}
