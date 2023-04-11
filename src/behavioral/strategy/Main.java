package behavioral.strategy;

public class Main {

	public static void main(String[] args) {
		
		AuthProvider authenticationProvider = new AuthProvider();
		
		// set authentication method with email and password and try authenticating
		authenticationProvider.setAuthenticator(new EmailAndPasswordAuthenticator("test@gmail.com", "12345678"));
		authenticationProvider.authenticate("www.gmail.com");
		
		// set authentication method with token  and try autenticating
		authenticationProvider.setAuthenticator(new TokenAuthenticator("34782623yrieugre)#343434343"));
		authenticationProvider.authenticate("www.gmail.com");
	}

}
