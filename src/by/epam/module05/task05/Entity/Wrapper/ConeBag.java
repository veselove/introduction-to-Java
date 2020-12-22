package by.epam.module05.task05.Entity.Wrapper;

public class ConeBag extends Wrapper{
	
	public ConeBag(double price, WrapperType wrapperType) {
		super(price, wrapperType);
	}
	
	public ConeBag() {
		setPrice(1.20);
		setWrapperType(WrapperType.CONEBAG);
		
	}
}
