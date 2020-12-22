package by.epam.module05.task05.Entity.Wrapper;

public class Felt extends Wrapper {
	
	public Felt(double price, WrapperType wrapperType) {
		super(price, wrapperType);
	}
	
	public Felt() {
		setPrice(1.20);
		setWrapperType(WrapperType.FELT);
	}
}
