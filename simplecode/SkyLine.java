class SkyLine {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int L = grid.length;
        int H = grid[0].length;
        int[] Ls = new int[L];
        int[] Hs = new int[H];
        int result=0;
        for (int i=0;i<L;i++){
            for(int j=0;j<H;j++){
                if ((i==0)||(grid[i][j]>Hs[j]))
                    Hs[j]=grid[i][j];
                if((j==0)||(grid[i][j]>Ls[i]))
                    Ls[i]=grid[i][j];
            }
        }
        for(int i : Hs){
            System.out.printf("%d ",i);
        }
        System.out.println("");
        for(int i : Ls){
            System.out.printf("%d ",i);
        }
		System.out.println("");
        int Max;
        for(int i=0;i<L;i++){
            for(int j=0;j<H;j++){
                Max=Ls[i]<Hs[j]?Ls[i]:Hs[j];
                if(grid[i][j]<Max)
                   result+=(Max-grid[i][j]);
            }
        }
        return result;
    }
	
	public static void main(String[] args){
		int[][] in ={
			{1,3,0,9,7},
			{2,4,8,10,1},
			{7,2,7,6,4},
			{3,6,2,0,3}
		};
		SkyLine sl = new SkyLine();
		int r = sl.maxIncreaseKeepingSkyline(in);
		System.out.println(r);
	}
}