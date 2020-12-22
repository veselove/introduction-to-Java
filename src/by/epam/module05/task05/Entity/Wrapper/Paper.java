package by.epam.module05.task05.Entity.Wrapper;

public class Paper extends Wrapper {
	
	public Paper(double price, WrapperType wrapperType) {
		super(price, wrapperType);
		
	}

	public Paper() {
		setPrice(1.20);
		setWrapperType(WrapperType.PAPER);
	}
}
