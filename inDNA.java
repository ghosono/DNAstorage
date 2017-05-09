import java.util.Scanner;

public class inDNA {
	
	public static void main(String [] args){
		String text, output;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Let's convert some Text to DNA!");
		System.out.println("Enter text: ");
		text = in.nextLine();
		output = toDNA(text);
		
		System.out.println("This is your String in DNA: " + output);
		
		
	}
	
	//Write program that converts text to DNA
	public static String toDNA(String data){
		char [] ch;
		String str = "";
		String between;
		int count = 0;
		between = toBinary (data);
		ch = between.toCharArray();
		//Figure out the pattern for doing this... I'm so confused... I don't know if this prevent problematic sequences
		//Probably the best way to go about doing this is by doing some sort of randomization, even still I don't think this avoids bad things
		for (char car : ch){
			count = (int) Math.round(1 * Math.random());
			if (car == '0'){
				if (count == 0){
					str += "a";
				}
				else if (count == 1){
					str += "c";
				}
			}
			else if (car == '1'){
				if (count == 0){
					str += "G";
				}
				else if (count == 1){
					str += "T";
				}
			}
			else if (car == ' '){
				str += " ";
			}
		}
		
		return str;
	}
	
	public static String toBinary(String s){
		  byte[] bytes = s.getBytes();
		  StringBuilder binary = new StringBuilder();
		  for (byte b : bytes)
		  {
		     int val = b;
		     for (int i = 0; i < 8; i++){
		        binary.append((val & 128) == 0 ? 0 : 1);
		        val <<= 1;
		     }
		     binary.append(' ');
		  }
		  String n = "" + binary;
		  System.out.println("This is your String in binary: " + n);
		  return n;
	}

}