package models.ResultComponent;

import models.GarageComponent;

public class ResultAndar extends ResultComponent{
	
	private int tVaga;

	@Override
	public String garageResult(GarageComponent garage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String floorResult(GarageComponent garage, int nAndar, int state) {
		this.tVaga = getTVaga(garage, nAndar, 1, state);
		this.tVaga += getTVaga(garage, nAndar, 2, state);
		String s;
		if(state == 0) {
			s = "livre";
		}
		else {
			s = "ocupado";
		}
		return nAndar + "º andar\n"+"O total de vagas " + s + ": " + this.tVaga + "\n";
	}

	@Override
	public String hallResult(GarageComponent garage, int nAndar, int nCorredor, int state) {
		// TODO Auto-generated method stub
		return null;
	}

}
