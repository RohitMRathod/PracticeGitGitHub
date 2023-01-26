package shivprasad;



public class QA_Logic {
	
	
	//Constructor chaining
	
	QA_Logic(String a){
		System.out.println(a);
		
	}
	
	QA_Logic(int a){
		this("shiv");
		a=23;
		System.out.println(a);
	}
	
	
	public static void main(String[] args) {
		
		
	new QA_Logic(12);
		
	}

}
