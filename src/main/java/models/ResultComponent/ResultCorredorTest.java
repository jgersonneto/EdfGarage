package models.ResultComponent;

import models.GarageComponent;

public class ResultCorredorTest extends ResultComponent {

	private int tVaga;

	@Override
	public String garageResult(GarageComponent garage) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String floorResult(GarageComponent garage, int nAndar, int state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hallResult(GarageComponent garage, int nAndar, int nCorredor, int state) {
		this.tVaga = getTVaga(garage, nAndar, nCorredor, state);

		return this.tVaga + "";
	}

}
