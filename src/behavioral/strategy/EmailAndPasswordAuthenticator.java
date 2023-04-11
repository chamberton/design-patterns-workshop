package behavioral.strategy;

public class EmailAndPasswordAuthenticator implements Authenticator {
	private String email;
	private String password;
	
	public EmailAndPasswordAuthenticator(String email, String password){
		this.email    = email;
		this.password = password;
	}
	
	@Override
	public String login(String domain) {
		System.out.println("Sending email and password to server hosted at ... " + domain);
		System.out.println("Awaiting for response of user id .... ");
		System.out.println("Authentication successful. ");
		System.out.println("User id returned\n");
		return Utils.generateUserId();
	}
}
