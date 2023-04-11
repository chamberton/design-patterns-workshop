package behavioral.strategy;

public class AuthProvider {

	private Authenticator authenticator = null;

	public void setAuthenticator(Authenticator authenticator){
		this.authenticator = authenticator;
	 }
  
	 public String authenticate(String hostEndpoint){
		return authenticator.login(hostEndpoint);
	 }


}
