package by.epam.module05.task05.Entity.Wrapper;

public class Foil extends Wrapper{
	
	public Foil(double price, WrapperType wrapperType) {
		super(price, wrapperType);
	}
	
	public Foil() {
		setPrice(1.20);
		setWrapperType(WrapperType.FOIL);
	}
}
