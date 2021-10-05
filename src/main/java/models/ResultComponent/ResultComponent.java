package models.ResultComponent;

import java.util.List;

import models.GarageComponent;

public abstract class ResultComponent {
	
	private int tVaga;
	
	public abstract String garageResult(GarageComponent garage);
	public abstract String floorResult(GarageComponent garage, int nAndar, int state);
	public abstract String hallResult(GarageComponent garage, int nAndar, int nCorredor, int state);
	protected int getTVaga(GarageComponent garage, int nAndar, int nCorredor, int state) {
		this.tVaga = 0;
		GarageComponent andar = garage.getComponent(nAndar);
		GarageComponent corredor = andar.getComponent(nCorredor);
		List<GarageComponent> lista = corredor.getLista();
		lista.forEach(valor -> {
			if(valor.getState() == state) {
				this.tVaga++;
			}			
		});
		return this.tVaga;
	}	

}
