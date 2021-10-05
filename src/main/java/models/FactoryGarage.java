package models;

import java.util.ArrayList;

public class FactoryGarage {

	public GarageComponent createCorredor(int[] lista) {
		GarageComponent corredor = new Corredor6();

		for (int state : lista) {
			Vaga vaga = new Vaga();
			vaga.setState(state);
			GarageComponent vagaComponent = vaga;
			corredor.setComponent(vagaComponent);
		}

		return corredor;
	}

	public GarageComponent createAndares(ArrayList<GarageComponent> corredor) {
		GarageComponent andar = new Andar2();

		corredor.forEach(valor -> andar.setComponent(valor));

		return andar;

	}

	public GarageComponent createGaragem(ArrayList<GarageComponent> andar) {
		GarageComponent garage = new Garage();

		andar.forEach(valor -> garage.setComponent(valor));

		return garage;
	}

}
