package p1_Vidya;

public class Example2 {
	int num1= 6;
	static int num2 = 10;
	String str ="";
	
	void processData() {
		for(int i=0;i<10;i++) {
			if(i%3==0) {
				continue;
			}
			str=str+i;
		}
		//break;
		System.out.print(str);
		
	}
	
	public static void main(String[] args) {
		Example2 e1 = new Example2();
		Example2 e2 = new Example2();
		
		e1.num1= 15;
		e1.num2= 17;
		e2.num1= 22;
		e2.num2= 28;
		
		System.out.println(e1.num1++ + " " + ++e2.num2);
		
	}
}
