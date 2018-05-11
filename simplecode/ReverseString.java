class ReverseString {
    public String reverseString(String s) {
        int len = s.length();
        char [] cc = new char[len];
        for(int i=0;i<len;i++)
            cc[len-i-1]=s.charAt(i);
        return  new String(cc);
    }
	
	public static void main(String[] args){
		String s = "abcdefghijklmn";
		System.out.println(new ReverseString().reverseString(s));
	}
}