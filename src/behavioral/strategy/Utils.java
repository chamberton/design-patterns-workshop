package behavioral.strategy;

import java.nio.charset.Charset;
import java.util.Random;

public class Utils {
    final private static int USER_ID_LENGTH = 12;
	private Utils() {}

	public static String generateUserId() {
		byte[] array = new byte[USER_ID_LENGTH];
		new Random().nextBytes(array);
		return new String(array, Charset.forName("UTF-8"));
	}
	
}
