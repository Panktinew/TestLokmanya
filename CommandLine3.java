package commandLineProject1;

public class CommandLine3 {

	public static void main(String[] args) {
		//javac pro1.java
		// java pro1 "hi" "Good Day" 67
		
		 float sum=0;
		for(int i=0;i < args.length ; i++) {
		System.out.println(args[i]);	
		
		sum = sum + Float.parseFloat(args[i]);
		
		
		}
		System.out.println(sum);
		
		
	}

}
