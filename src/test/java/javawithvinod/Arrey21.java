package javawithvinod;

import java.util.HashMap;
import java.util.Map;

public class Arrey21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String []a= {"my" nam is shu"};
		//Duplicate count
	  String a="Shubham bhafade daadadeess";
	  
	  Map<String,Integer> map=new HashMap<String,Integer>();
	  
	  
	  for(int i=0;i<a.length();i++) {
		  char ch=a.charAt(i);
		  String s=String.valueOf(ch);
		  
		  if(ch==' ') {
			
			
			 if(map.containsKey("Space")) {
				  map.put("Space", map.get("Space")+1); 
				  
			  }else{
				  map.put("Space", 1);
			  }  
		  }else {
			  if(map.containsKey(s)) {
				  map.put(s, map.get(s)+1);
				 
				  
			  }else{
				  map.put(s, 1);
			  }
		  }
		  }
	 
	  System.out.println(map);
	  
	}

}
