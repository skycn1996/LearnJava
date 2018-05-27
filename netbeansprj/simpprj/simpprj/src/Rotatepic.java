/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class Rotatepic {
    public void rotate(int[][] matrix) {
    int n = matrix.length;
        for (int i=0;i<n / 2;i++){
            for(int j=i;j<n-i-1;j++){
                int newi=i;
                int newj=j;
                int tempnewi;
                int temp=matrix[i][j];
                int templast;
                for (int k = 0;k<4;k++){
                    templast=temp;
                    tempnewi=newi;
                    newi=newj;
                    newj=n-1-tempnewi;
                    temp=matrix[newi][newj];
                    matrix[newi][newj]=templast;
                    //System.out.printf("[i,j]=%d , %d ; ",newi,newj);
                }
            }
        }
    }
    
    public static void print2Array(int[][] arr,boolean newLine){
        for(int[] a : arr){
            for(int v :a){
                System.out.printf("%d  ",v);
            }
            System.out.printf("\n");
        }        
        if (newLine)
            System.out.println();
    }
    
    public static void main(String[] args){
        Rotatepic rp = new Rotatepic();
        int[][] samp1 = { {1,2,3},
            {4,5,6},
            {7,8,9}};
        print2Array(samp1,true);
        rp.rotate(samp1);
        print2Array(samp1,true);

        int[][] samp2 = {{ 5, 1, 9,11},
            { 2, 4, 8,10},
            {13, 3, 6, 7},
            {15,14,12,16}};
        print2Array(samp2,true);
        rp.rotate(samp2);
        print2Array(samp2,true);        
    }
}
