public class Main{

public static void main(String[] args){

	int num = Integer.parseInt(args[1]);
	
	int a=0, count = 0;
	int b = 1;
	
	while(count<num){
		
		System.out.println(a);
		System.out.println(b);
		a = b;
		b = a + b;		
	}

}

}