package com.redbee.academy.challenge;

import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
	  public static List<Integer> max(List<Integer> a, List<Integer> b) {

		  List<Integer> listaMax = new ArrayList<>();
		  if(a.size()>b.size()) {
			  for (Integer i =0; i < b.size(); i++) {
				  listaMax.add(Math.max(a.get(i),b.get(i)));
			  }
			  for(Integer i =b.size(); i < a.size(); i++) {
				  listaMax.add(a.get(i));
			  }
		  }else {
			  for (Integer i =0; i < a.size(); i++) {
				  listaMax.add(Math.max(a.get(i),b.get(i)));
			  }
			  for(Integer i =a.size(); i < b.size(); i++) {
				  listaMax.add(b.get(i));
			  }
		  }
		  
	    //TODO: Implement me
	    return listaMax;
	  }



	}
