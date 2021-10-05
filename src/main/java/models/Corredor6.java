package models;

import java.util.ArrayList;
import java.util.List;

public class Corredor6 extends GarageComponent{
	
	private List<GarageComponent> vagas;
	private int qtdVagas;
	private int qtd;
	
	public Corredor6() {
		vagas = new ArrayList<>();
		setQtd(6);
	}

	@Override
	public GarageComponent getComponent(int index) {
		return vagas.get(index-1);
	}

	@Override
	public void setComponent(GarageComponent vagas) {
		if(this.qtd < this.qtdVagas) {
			this.vagas.add(vagas);
			this.qtd++;
		}
	}

	@Override
	public int getQtd() {
		return this.qtdVagas;
	}

	@Override
	public void setQtd(int qtd) {
		this.qtdVagas = qtd;
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getState() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<GarageComponent> getLista() {
		return this.vagas;
	}

}
