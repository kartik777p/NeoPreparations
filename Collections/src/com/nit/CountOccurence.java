package com.nit;

import java.util.HashMap;
import java.util.Map;

public class CountOccurence {

	public static void main(String[] args) {
		//initialize the string which you want
		String str="What are you doing What you";
		//create map obj to store key and val 
		Map<String,Integer> map=new HashMap();
		//convert string into string array by using split method with the help
		//of place
		String[] words=str.split(" ");
		//now iterator over the array obj 
		  for(String word:words) {
			  //check key is available in map allready or not
			  //return null if not present
			  Integer intg=map.get(word);
			  //if not there then store into map
			  if(intg==null) {
				  map.put(word,1);
			  }
			  else {
				  map.put(word, intg+1);
			  }
		  }
     System.out.println(map);
	}

}
