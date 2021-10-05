package models;

import java.util.ArrayList;
import java.util.List;

public class BuilderGarage {
	
	

	public GarageComponent builder(FactoryGarage factoryGarage) {
		int[] corredor1 = {1,1,0,1,0,0};
		int[] corredor2 = {1,1,1,1,1,0};
		int[] corredor3 = {0,0,0,1,0,0};
		int[] corredor4 = {0,1,0,1,1,0};		
		List<GarageComponent> lista1 = new ArrayList<>();
		List<GarageComponent> lista2 = new ArrayList<>();
		
		lista1 = builderListCorredor(factoryGarage, corredor1, corredor2); 
		lista2 = builderListCorredor(factoryGarage, corredor3, corredor4); 
		lista1 = builderListAndar(factoryGarage, lista1, lista2);
		
		
		
		GarageComponent garage = builderListGarage(factoryGarage, lista1);
		

		return garage;
	}

	private List<GarageComponent> builderListAndar(FactoryGarage factoryGarage, List<GarageComponent> lista1, List<GarageComponent> lista2) {
		List<GarageComponent> lista = new ArrayList<>();
					
		lista.add(factoryGarage.createAndares((ArrayList<GarageComponent>)lista1));
		lista.add(factoryGarage.createAndares((ArrayList<GarageComponent>)lista2));
		
		return lista;
	}
	
	private List<GarageComponent> builderListCorredor(FactoryGarage factoryGarage, int[] corredor1, int[] corredor2) {		
		List<GarageComponent> lista = new ArrayList<>();
		List<int[]> lista1 = new ArrayList<>();
		lista1.add(corredor1);
		lista1.add(corredor2);
		lista1.forEach(valor -> {
			GarageComponent corredor = factoryGarage.createCorredor(valor);
			lista.add(corredor);	
		});

		return lista;
	}
	
	private GarageComponent builderListGarage(FactoryGarage factoryGarage, List<GarageComponent> lista1) {
		
		GarageComponent garage = factoryGarage.createGaragem((ArrayList<GarageComponent>)lista1);
		
		return garage;
	}

}
