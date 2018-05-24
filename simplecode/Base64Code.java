import java.util.Base64;
public class Base64Code {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        byte[] encodeBytes = Base64.getEncoder().encode(longUrl.getBytes());
        return new String(encodeBytes);
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        byte[] decodeBytes = Base64.getDecoder().decode(shortUrl.getBytes());
        return new String(decodeBytes);
    }
	
	public static void main(String[] args){
		Base64Code codec = new Base64Code();
		String [] longUrls = new String[]{"https://wxl1234234.com/aderwe/ereewfads.html",
		"https://wxl1234234.com/aderwe/ereewfads123456.html",
		"https://wxl1234234.com/aderwe/ereewfads6987410.html"};
		String tmp;
		for(String s : longUrls){
			System.out.println(s);
			tmp = codec.encode(s);
			System.out.println(tmp);
			System.out.println(codec.decode(tmp));
			System.out.println("");
		}
	}		
}

// Your Base64Code object will be instantiated and called as such:
// Base64Code codec = new Base64Code();
// codec.decode(codec.encode(url));