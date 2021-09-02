package com.envision.basic.java;

public class StringSplitEx {

	public static void main(String[] args) {
		
		
		String months = "Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
		
		for (String SplittedMonths :  months.split("-")) {
			
			System.out.println(SplittedMonths);
		}	

	}

}
