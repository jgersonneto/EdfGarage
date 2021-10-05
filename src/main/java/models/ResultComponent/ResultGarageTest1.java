package models.ResultComponent;

import models.GarageComponent;

public class ResultGarageTest1 extends ResultComponent {

	private int tVaga;

	@Override
	public String garageResult(GarageComponent garage) {
		// Essa parte verifica qual andar tem mais vagas livre
		int auxTVaga;
		String auxTextLabel;
		this.tVaga = getTVaga(garage, 1, 1, 0);
		this.tVaga += getTVaga(garage, 1, 2, 0);
		auxTVaga = this.tVaga;
		this.tVaga = getTVaga(garage, 2, 1, 0);
		this.tVaga += getTVaga(garage, 2, 2, 0);
		if (auxTVaga > this.tVaga) {
			auxTextLabel = "1";
		} else {
			auxTextLabel = "2";
		}

		return auxTextLabel;
	}

	@Override
	public String floorResult(GarageComponent garage, int nAndar, int state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hallResult(GarageComponent garage, int nAndar, int nCorredor, int state) {
		// TODO Auto-generated method stub
		return null;
	}

}
