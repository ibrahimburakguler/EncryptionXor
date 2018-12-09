
import java.io.IOException;

import sun.misc.BASE64Decoder;

public class Decryption {

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

	public String decode(String s, String key) {
		return new String(xorWithKey(base64Decode(s), key.getBytes()));
	}

	private byte[] xorWithKey(byte[] a, byte[] key) {
		byte[] out = new byte[a.length];
		for (int i = 0; i < a.length; i++) {
			out[i] = (byte) (a[i] ^ key[i % key.length]);
		}
		return out;
	}

	private byte[] base64Decode(String s) {
		try {
			BASE64Decoder d = new BASE64Decoder();
			return d.decodeBuffer(s);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public String toString() {

		return "" + decode(this.message, this.key);

	}

}
