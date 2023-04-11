package behavioral.strategy;

public class TokenAuthenticator implements Authenticator {

	private String token;
	
	public TokenAuthenticator(String token){
		this.token = token;
	}
	
	@Override
	public String login(String domain) {
		System.out.println("Validating token to server hosted at ... " + domain);
		System.out.println("Awaiting for response of user id linked to token .... ");
		System.out.println("Successfully login into the domain ");
		System.out.println("User id returned\n");
		return Utils.generateUserId();
	}

}
