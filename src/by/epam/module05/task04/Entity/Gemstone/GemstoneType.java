package by.epam.module05.task04.Entity.Gemstone;

public enum GemstoneType {
	
	ALEXANDRITE ("alexandrite"),
	AMBER ("amber"),
	AMETHYST ("amethyst"),
	AMERTINE ("amertine"),
	AQUAMARINE ("aquamarine"),
	CITRINE ("citrine"),
	DIAMOND ("diamodn"), 
	FANCY_COLOR_DIAMOND ("fancy color diamond"),
	EMERALD ("emerald"),
	GARNET ("garnet"),
	IOLITE ("iolite"),
	JADE ("jade"),
	KUNZITE ("kunzite"),
	LAPIS_LAZULI ("lapis lazuli"),
	MOONSTONE ("moonstone"),
	MORGANITE ("morganite"),
	OPAL ("opal"),
	PEARL ("pearl"),
	PERIDOT ("peridot"),
	ROSE_QUARTZ ("rose quartz"),
	RUBY ("ruby"),
	SAPPHIRE ("sapphire"),
	SPINEL ("spinel"),
	SUNSTONE ("sunstone"),
	TANZANITE ("tanzanite"),
	TOPAZ ("topaz"),
	TOURMALINE ("tourmaline"),
	TURQUOISE ("turquoise"),
	ZIRCON ("zircon");
	
	private String type;

	GemstoneType(String type) {
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type;
	}
	

}
