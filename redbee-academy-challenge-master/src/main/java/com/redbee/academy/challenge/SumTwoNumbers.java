package com.redbee.academy.challenge;

public class SumTwoNumbers {

  /**
   * Method that receives two numbers and returns the
   * sum of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
	  public static Integer sum(List<Integer> array) {
		    //TODO: Implement me
			  Integer sum = 0;
			  for (Integer i: array) {  //en esta linea toma un elemento de la lista Array, y desp lo guarda en la variable 'i'	  
			  sum= i + sum;
			  }
		    return sum;
		  }
		}

