 abstract class Vical{

public abstract int getWheelis();

}
class Bus extends Vical{
  
public int getWheelis(){
	return 6;

}
}
class Motor extends Vical{

public int getWheelis(){
	return 2;
}
}

class Santo{
public static void main(String args[]){

 	Bus b = new Bus();
	System.out.println(b.getWheelis());

	Motor m = new Motor();
	System.out.println(m.getWheelis());
}
}