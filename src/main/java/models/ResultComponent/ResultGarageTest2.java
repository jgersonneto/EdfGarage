package models.ResultComponent;

import models.GarageComponent;
import models.Vaga;

public class ResultGarageTest2 extends ResultComponent {

	private int tVaga;

	@Override
	public String garageResult(GarageComponent garage) {

		int auxTVaga;
		String auxTextLabel;
		GarageComponent vaga = new Vaga();		
		
		this.tVaga = getTVaga(garage, 1, 1, 1);
		this.tVaga += getTVaga(garage, 1, 2, 1);
		this.tVaga += getTVaga(garage, 2, 1, 1);
		this.tVaga += getTVaga(garage, 2, 2, 1);
		int preco = (int) (vaga.getPreco() * this.tVaga);
		auxTextLabel = preco + "";

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
