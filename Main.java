
import java.util.*;

/*
Amazon Customer Review Question 

    }
}*/

class Main {
public static void main (String[] args) {
	List<String> repository=Arrays.asList("mobile","mouse","moneypot","monitor","mousepad");
	String customerQuery="mouse";
//	System.out.println(repository);
	Collections.sort(repository);
//	System.out.println(repository);


	for(int i=2;i<=customerQuery.length();i++)
	{
		String tempQuery=customerQuery.substring(0,i);
		List<String> singlePassResult=new ArrayList<>();
		for(String word:repository){
			if(word.startsWith(tempQuery) && singlePassResult.size()<3){
				singlePassResult.add(word);
			}
			//System.out.println(singlePassResult);
		}
		System.out.println(singlePassResult);

	}
//    searchSuggetsions(); 
 	}


//public static List<List<String>> searchSuggestions(List<String> repository, String customerQuery) {
//           return 0;
//	}
}