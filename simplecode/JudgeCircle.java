public class JudgeCircle {
	public boolean judgeCircle(String moves) {
		int x=0;
		int y=0;
		for (int i=0;i<moves.length();i++){
			char c = moves.charAt(i);
			switch (c){
				case 'R':x++;break;
				case 'L':x--;break;
				case 'U':y++;break;
				case 'D':y--;break;
			}
		}
		return (x==0)&&(y==0); 
	}
	
	public static void main(String[] args){
		String ss = "LLDDUURR";
		System.out.println(new JudgeCircle().judgeCircle(ss));
	}
}