
import sun.misc.BASE64Encoder;

public class Encryption {

	private String message;
	private String key;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String encode(String s, String key) {
		return base64Encode(xorWithKey(s.getBytes(), key.getBytes()));
	}

	private byte[] xorWithKey(byte[] a, byte[] key) {
		byte[] out = new byte[a.length];
		for (int i = 0; i < a.length; i++) {
			out[i] = (byte) (a[i] ^ key[i % key.length]);
		}
		return out;
	}

	private String base64Encode(byte[] bytes) {
		BASE64Encoder enc = new BASE64Encoder();
		return enc.encode(bytes).replaceAll("\\s", "");

	}

	public String toString() {

		return "" + encode(this.message, this.key);

	}

}
