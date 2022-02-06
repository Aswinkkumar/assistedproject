package com.aswin.map;
import java.util.*;

public class typesOfMap {
	

		public static void main(String[] args) {
			
			
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Tom");    
		      hm.put(2,"Gouri");    
		      hm.put(3,"catherin");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		 
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Ales");  
		      ht.put(5,"Rosy");  
		      ht.put(6,"Jack");  
		      ht.put(7,"John");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
		   
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Annie");    
		      map.put(9,"Carlotte");    
		      map.put(10,"Catie");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}



