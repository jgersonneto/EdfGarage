package models.ResultComponent;

import models.GarageComponent;

public class ResultAndarTest extends ResultComponent {

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

		return this.tVaga + "";
	}

	@Override
	public String hallResult(GarageComponent garage, int nAndar, int nCorredor, int state) {
		// TODO Auto-generated method stub
		return null;
	}

}
