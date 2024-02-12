package org.java.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public  class Javatest {
 	public static void main(String[] args) {
		int number=123456;
		int reverse=0;
//		while (number != 0) {
//			int dig =number % 10;
//			reverse = reverse * 10 + dig;
//			
//			number /=10;
			
		for (; number !=0; number /=10) {
			int dig =number %10;
			reverse = reverse *10 +dig;
			
			
		}
		System.out.println(reverse);
		}
		
	}
	
	
	









