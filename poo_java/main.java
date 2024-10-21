import java.util.ArrayList;

public class main {
	public static void addToInt(int x, int amountToAdd){
		x = x + amountToAdd;
	}
	public static void cuenta(int n){
		for (int i = n;i<10;i++)
			System.out.println(i);
	}
	public static void ejem4(){
		StringBuilder sb = new StringBuilder();
		sb.append("aaa").insert(1, "bb").insert(4, "ccc");
		System.out.println(sb);
	}
	public static void ejem5(){
		int count = 0;
		String s1 = "java";
		String s2 = "java";
		StringBuilder s3 = new StringBuilder("java");		
		if (s1 == s2) 
			count++;
		if (s1.equals(s2))
			count++;
		//if (s1 == s3)count++; No se compara String con StringBuilder
		if (s1.equals(s3))
			count++;		
		System.out.println(count);
	}
	public static void roar(String roar1, StringBuilder roar2){
		String rs =  roar1.concat("!!!");
		System.out.println("No mutable String: "+rs);
		roar2.append("!!!");
	}	
	public static void ejem6(){
		String roar1 = "roar";
		StringBuilder roar2 = new StringBuilder("roar");
		new main().roar(roar1, roar2);
		System.out.println(roar1 + " " + roar2);
	}
	public static void ejem7(){
		var string = "12345";
		var builder = new StringBuilder("12345");

		System.out.println(builder.charAt(4));
		System.out.println(builder.replace(2, 4, "6").charAt(3));
		System.out.println(string.replace("123", "1").charAt(2));
	}
	public static void ejem8(){
		String numbers = "012345678";
		System.out.println(numbers.substring(1, 3));
		System.out.println(numbers.substring(7, 7));
		System.out.println(numbers.substring(7));
		System.out.println(numbers.substring(5));
	}
	public static void ejem9(){
		String s1 = "purr";
		String s2 = "";

		s1.toUpperCase();
		s1.trim();
		s1.substring(1, 3);
		s1 += "two";
		
		s2 += 2;
		s2 += 'c';
		s2 += false;
		 
		if ( s2 == "2cfalse")
			System.out.println("==");
		if ( s2.equals("2cfalse"))
			System.out.println("equals");
			
		System.out.println(s1.length());
	}
	public static void ejem10(){
		var letters = new StringBuilder("abcdefg");
		
		//returns a single character String
		System.out.println(letters.substring(1, 2));//
		//returns a single character String.
		System.out.println(letters.substring(2, 2));
		//returns a single character String.
	//System.out.println(letters.substring(6, 5));
		//returns a single character String.
		System.out.println(letters.substring(6, 6));
		//throws an exception.
		System.out.println(letters.substring(1, 2));
		//throws an exception.
		System.out.println(letters.substring(2, 2));
		//throws an exception.
	//System.out.println(letters.substring(6, 5));//
		//throws an exception.
		System.out.println(letters.substring(6, 6));				
	}
	public static void ejem11(){
		StringBuilder numbers = new StringBuilder("0123456789");
		numbers.delete(2, 8);
		numbers.append("-").insert(2, "+");
		System.out.println(numbers);
		//01+89-
	}
	public static void ejem12(){
		StringBuilder b = new StringBuilder("rumble");
		//StringBuilder b = "rumble"; no compila
		b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
		System.out.println(b);
		//rum4
	}
	public static void ejem13(){
		var puzzle = new StringBuilder("Java");
		// INSERT CODE HERE FOR avaJ
		//avaJ
		puzzle.reverse();
	
		//Java/JavavaJ$/Java
		//puzzle.append("vaJ$").substring(1, 2);
		
		//avaJ
		puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1);
	
		//JvaJvaJ$/JvaJ$/ err
		//puzzle.append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length());
		//JvaJ$
		System.out.println(puzzle);
	}
	public static void ejem14(){
		
	}
	public static void main (String []args) {
		main.ejem14();
  }
}
