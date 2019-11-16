package exceptions;

public class ShipNotFoundException extends RuntimeException{
    
	public ShipNotFoundException(){
        super();
    }
    
    public ShipNotFoundException(String s){
        super(s);
    }
}
