package models.ResultComponent;

import models.GarageComponent;

public class ResultCorredor extends ResultComponent{
	
	private int tVaga;
	
	

	@Override
	public String garageResult(GarageComponent garage) {
		return null;
	}

	@Override
	public String floorResult(GarageComponent garage, int nAndar, int state) {
		return null;
	}

	@Override
	public String hallResult(GarageComponent garage, int nAndar, int nCorredor, int state) {
		this.tVaga = getTVaga(garage, nAndar, nCorredor, state);		
		String s;
		if(state == 0) {
			s = "livre";
		}
		else {
			s = "ocupado";
		}
		return nAndar + "º andar - "+ nCorredor + "º corredor\n"+"O total de vagas " + s + ": " + this.tVaga + "\n";
	}
	
	

	

}
