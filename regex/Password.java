package com.aswin.regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Password {

	public static void main(String[] args) {
		String regex="^(?=.[A-Za-z]).{8,}";
		String input="Aswin@2468";
		Pattern pattern=Pattern.compile(regex);
		Matcher match =pattern.matcher(input);
		if(match.matches()) {
			System.out.println("Password valid");
		}
		else {
			System.out.println("Not valid");
		}
	}

}
