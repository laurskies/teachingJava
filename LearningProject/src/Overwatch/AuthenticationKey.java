package Overwatch;

public class AuthenticationKey {

	private int authKey;
	
	public AuthenticationKey() {
		this.authKey = 1986;
	}

	public boolean verify(int authKeyToVerify)
	{
		if (authKey == authKeyToVerify)
		{
			return true;
		} else {
			return false;
		}
	}
	
}
