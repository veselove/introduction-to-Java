package by.epam.module05.task05.Entity.Wrapper;

public class Mesh extends Wrapper{
	
	public Mesh(double price, WrapperType wrapperType) {
		super(price, wrapperType);
		
	}
	
	public Mesh() {	
		setPrice(1.20);
		setWrapperType(WrapperType.MESH);
	}
	

}
