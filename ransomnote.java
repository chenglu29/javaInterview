import java.util.*;
public class ransomnote {

	public static void checkMagazine(List<String> magazine, List<String> note) {
		// Write your code here
			if(note.size()>magazine.size()){
				System.out.println("No");
			}
			HashMap<String, Integer> hm=new HashMap<String,Integer>();
			for(int i=0;i<magazine.size();i++){
				if(hm.containsKey(magazine.get(i))){
					hm.put(magazine.get(i),hm.get(magazine.get(i))+1);
				}
				else{
					hm.put(magazine.get(i),1);
				}
			}
			for(int j=0;j<note.size();j++){
				if(hm.containsKey(note.get(j))){
					hm.put(note.get(j),hm.get(note.get(j))-1);
					if(hm.get(note.get(j))<0){
					   System.out.println("No");
						return; 
					} 
					}else{
						System.out.println("No");
						return;
				}
			}
			System.out.println("Yes");
		}
	public static void main(String[] args) {
			List<String> magazine = Arrays.asList("beautiful","day");
			List<String> note = Arrays.asList("day");
			checkMagazine(magazine,note);
		}
}
