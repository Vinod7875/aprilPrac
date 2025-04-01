package javawithvinod;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class duplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String a="Shubham Shubham daadadeess is my my name ";
		  
		  Map<String,Integer> map=new HashMap<String,Integer>();
		  
		  String shu[]=a.split(" ");
		  
		  for(int i=0;i<shu.length;i++) {
			  
			  String s=shu[i];
			  
			  if(map.containsKey(s)) {
				  map.put(s, map.get(s)+1);
				  
				  
			  }else {
				  map.put(s, 1);
				//  System.out.println();
			  }
			  
			  
		  } System.out.println(map);
		  
		  		
		
	}

}
