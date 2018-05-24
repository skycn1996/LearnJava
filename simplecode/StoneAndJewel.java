public class StoneAndJewel{
    public int numJewelsInStones(String J, String S) {
        char A;
        int num = 0;
        for (int i=0;i<S.length();i++){
            A=S.charAt(i);
            if (J.indexOf(A)>=0)
                num++;
        }
        return num;
    }
	
	public static void main(String[] args){
		int num;
		String jewel = "Qwert";
		String stone = "weoivasdfkjWEOVDISJOERjlaeiobjowerqi";
		StoneAndJewel sj = new StoneAndJewel();
		num = sj.numJewelsInStones(jewel,stone);
		System.out.printf("Jewel Num:%d\nJewel:%s\nStone:%s\n",num,jewel,stone);
	}
}
