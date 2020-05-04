class Tap{
 int a,b,c;

void getdata(int x , int y){

     a=x;
     b=y;
}

void add(){

	c=a+b;

System.out.println("Addition is " +c);
}

}

class Main{
public static void main(String args[]){
	
	Tap obj= new Tap();
	obj.getdata(100,200);

}
}