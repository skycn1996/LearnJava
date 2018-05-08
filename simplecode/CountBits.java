import java.util.Scanner;

class CountBits {
    public int[] countBits(int num) {
        int [] result = new int[num+1];
        for(int i =0; i<=num;i++){
            int x=0;
            int y=i;
            do{
                if (y % 2==1) 
                    x++;
                y >>>=1;
				//System.out.println(y);
            }while(y>0);
            result[i]=x;
        }
        return result;
    }
	
	public static void main(String[] args){
		System.out.println("Please input a num:");
		Scanner ms = new Scanner(System.in);
		int mi = ms.nextInt();
		CountBits cb = new CountBits();
		int[] r = cb.countBits(mi);
		int xx=0;
		for(int i : r){
			xx++;
			System.out.printf("%d  ",i);
			if (xx%4==0)
				System.out.println("");
		}
	}
}