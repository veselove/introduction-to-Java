package by.epam.module04.agregation_composition.task3;

public class Task3 {

	public static void main(String[] args) {

		State Belarus = new State("Belarus");

		final int numberOfRegions = 6;

		Region[] regions = new Region[numberOfRegions];

		State.setRegions(regions);

		City brest = new City("Brest", false);
		City vitebsk = new City("Vitebsk", false);
		City gomel = new City("Gomel", false);
		City grodno = new City("Grodno", false);
		City minsk = new City("Minsk", true);
		City mogilev = new City("Mogilev", false);

		regions[0] = new Region("Brest region", 32.8, brest);
		regions[1] = new Region("Vitebsk region", 40.0, vitebsk);
		regions[2] = new Region("Gomel region", 40.4, gomel);
		regions[3] = new Region("Grodno region", 25.1, grodno);
		regions[4] = new Region("Minsk region", 40.2, minsk);
		regions[5] = new Region("Mogilev region", 29.1, mogilev);

		District[] districtsOfBrestRegion = new District[16];
		regions[0].setDistricts(districtsOfBrestRegion = new District[16]);

		District[] districtsOfVitebskRegion = new District[21];
		regions[1].setDistricts(districtsOfVitebskRegion = new District[21]);

		District[] districtsOfGomelRegion = new District[21];
		regions[2].setDistricts(districtsOfGomelRegion = new District[21]);

		District[] districtsOfGrodnoRegion = new District[17];
		regions[3].setDistricts(districtsOfGrodnoRegion = new District[17]);

		District[] districtsOfMinskRegion = new District[22];
		regions[4].setDistricts(districtsOfMinskRegion = new District[22]);

		District[] districtsOfMogilevRegion = new District[21];
		regions[5].setDistricts(districtsOfMogilevRegion = new District[21]);

		StateLogic.viewTheCapital(regions);

		StateLogic.viewNumberOfRegions(regions);

		StateLogic.viewAreaOfState(regions);

		StateLogic.viewRegionalCenters(regions);

	}

}
