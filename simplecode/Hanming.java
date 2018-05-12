import java.util.Scanner;

public class Hanming {
    public int hammingDistance(int x, int y) {
        int result=0;
        for (int i=0;i<32;i++){
            if((x%2)!=(y%2))
                result++;
            x>>>=1;
            y>>>=1;
        }
        return result;
    }
	
	public static void main(String[] args){
		System.out.println("Please input 2 int:");
		Scanner sc = new Scanner(System.in);
		int i1= sc.nextInt();
		int i2= sc.nextInt();
		Hanming hm = new Hanming();
		System.out.println(hm.hammingDistance(i1,i2));		
	}
}