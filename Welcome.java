public class Welcome {

	public static void main(String[] args) {//111 "222" 23.45 false sandeep
		int a=Integer.parseInt(args[0]); 
		int b=Integer.parseInt(args[1]);
		float salary=Float.parseFloat(args[2]);
		boolean condition=Boolean.parseBoolean(args[3]);
		String name=args[4];
		System.out.println(condition+"Salary : "+salary);
		int result=a+b;
		System.out.println("Addition of two numbers : "+result);
		System.out.println("welcome to java MR :"+name);
		
	}

}

//user understandable language 	SOURCE CODE

//  JVM   0'S 1'S BINARY LANGUAGE  MACHINE UNDERSTANDABLE LANGUAGE BYTE CODE 

//COMPAILATION  -->COMPILER   .JAVA --->COMPILER ---->.CLASS ---->JVM-->OUTPUT

//JAVAC FILENAME.JAVA-->.CLASS  COMPILER    A-->65->0101110

//JAVA CLASSNAME  -->JVM


//int a=123;a=234

//arrays -->multiple values