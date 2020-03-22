package solid.lsp;

import java.util.ArrayList;
import java.util.List;

class Bird {
	public void fly(){}
	public void eat(){}
}
class Crow extends Bird {}
class Ostrich extends Bird{
	public void fly(){
		throw new UnsupportedOperationException();
	}
}

class BirdTest{
	
	/**
	 * HINT
	 * What do you think would happen when this code is executed? 
	 * As soon as an Ostrich instance is passed, it blows up!!! 
	 * Here the sub type is not replaceable for the super type.
	 * 
	 * By using factoring. Sometimes factoring out the common features into a 
	 * separate class can help in creating a hierarchy that confirms to LSP.
	 * 
	 */
	public static void main(String[] args){
		List<Bird> birdList = new ArrayList<Bird>();
		birdList.add(new Bird());
		birdList.add(new Crow());
		birdList.add(new Ostrich());
		letTheBirdsFly ( birdList );
	}
	static void letTheBirdsFly ( List<Bird> birdList ){
		for ( Bird b : birdList ) {
			b.fly();
		}
	}
}
