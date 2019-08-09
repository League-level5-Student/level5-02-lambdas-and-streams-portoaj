package _01_Lambda_Methods;

import java.util.ArrayList;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		printCustomMessage((String s) ->{
			char [] output = new char[s.length()];
			for(int i = 0; i < s.length(); i++)
			{
				output[i] = s.charAt(s.length() - 1 - i);
			}
			System.out.println(new String(output));
		},"message");
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		printCustomMessage((String s) -> {
			boolean toggle = true;
			char [] output = new char[s.length()];
			for(int i = 0; i < output.length; i++)
			{
				toggle = !toggle;
				if(toggle)
					output[i] =  Character.toUpperCase(s.charAt(i));
				else
					output[i] = Character.toLowerCase(s.charAt(i));
			}
			System.out.println(new String(output));
		}, "mixedcasestuff");
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		printCustomMessage((String s) -> {
			boolean toggle = true;
			char [] output = new char[s.length()*2];
			for(int i = 0; i < output.length; i+=2)
			{
				output[i] = s.charAt(i/2);
				output[i + 1] = '.';
			}
			System.out.println(new String(output));
		}, "periodseparatedvalues");
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((String s) -> {
			ArrayList<Character> vowels = new ArrayList<Character>();
			vowels.add('a');
			vowels.add('e');
			vowels.add('i');
			vowels.add('o');
			vowels.add('u');
			StringBuilder output = new StringBuilder();

			for(int i = 0; i < s.length(); i++)
			{
				if(!vowels.contains(s.charAt(i)))
				{
					output.append(s.charAt(i));
				}
			}
			System.out.println(output.toString());
		}, "nomorevowelsiguess");
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
