class Thread{

public static void main(String atrgs[]){
	try{
	System.out.println(10/0);
	}
	catch(ArithmeticException e){

	e.printStackTrace();
	System.out.println(e.toString());
	System.out.println(e.getMessage());
}
}
}