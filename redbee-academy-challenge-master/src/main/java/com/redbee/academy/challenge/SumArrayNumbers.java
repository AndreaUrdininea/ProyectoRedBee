package com.redbee.academy.challenge;

import java.util.List;

public class SumArrayNumbers {

  /**
   * Method that receives an array of numbers and
   * returns the sum of each number
   *
   * @param array - Some integer list. ([1,2,3])
   * @return The result of 1 + 2 + 3
   */
	  public static Integer sum(Integer a, Integer b) {
			Integer c = 0;
		    //TODO: Implement me
			  if (a==null) {
				  c = b;	  
			  }
			  if (b==null) {
				  c=a; 
			  }
			  if (a!=null && b!=null) {
				  c= a +b;
			  }
			  return c;
		  }
		}