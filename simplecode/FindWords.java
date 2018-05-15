import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

//List和数组的操作
//Map的操作
public class FindWords {
	
	public static void main(String[] args){
		String[] ws = new String[]{"qeroiowerIIERWe","edffeTTb","iurewJJmm","IIOByteBuffer","JKLKhdjKL","NMMbnmbmvc"};
		
		FindWords fw = new FindWords();
		ws = fw.findWords(ws);
		for(String s : ws){
			System.out.println(s);
		}
	}
    
    public String[] findWords(String[] words) {
        ArrayList<String> ls = new ArrayList<String>();
        Map<String,String> map = new HashMap<String,String>();
        map.put("a","1");
        map.put("b","2");
        map.put("c","2");
        map.put("d","1");
        map.put("e","0");
        map.put("f","1");
        map.put("g","1");
        map.put("h","1");
        map.put("i","0");
        map.put("j","1");
        map.put("k","1");
        map.put("l","1");
        map.put("m","2");
        map.put("n","2");
        map.put("o","0");
        map.put("p","0");
        map.put("q","0");
        map.put("r","0");
        map.put("s","1");
        map.put("t","0");
        map.put("u","0");
        map.put("v","2");
        map.put("w","0");
        map.put("x","2");
        map.put("y","0");
        map.put("z","2");
        for(String s1:words){
            String s=s1.toLowerCase();
            String h="-1";
			//System.out.println(s);
            for (int i=0;i<s.length();i++){
                String c = s.substring(i,i+1);
				//System.out.println("c: "+c);
				//System.out.println(h);
                if (h.equals("-1")){
                    h=map.get(c);
					//System.out.println(h);
				}
                else{
					//System.out.print("h: "+h+" c: "+c+"  get(c):"+map.get(c)+"\n");
                    if (!h.equals(map.get(c))){
                        h="-1";
                        break;
                    }
                }
            }
			if (h==null){
				h="-1";
			}
            if (!h.equals("-1"))
                ls.add(s1);
        }
        return ls.toArray(new String[ls.size()]);
    }
}