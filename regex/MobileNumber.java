package com.aswin.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
	public static void main(String[] args) {
		String regex="[956]{3}[0-9]{7}";
		String input="9562973858";
		Pattern pattern=Pattern.compile(regex);
		Matcher match =pattern.matcher(input);
		if(match.matches()) {
			System.out.println("Phone Number valid");
		}
		else {
			System.out.println("Not valid");
		}
	}

}


