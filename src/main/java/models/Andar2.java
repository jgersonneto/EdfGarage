package models;

import java.util.ArrayList;
import java.util.List;

public class Andar2 extends GarageComponent{
	
	private List<GarageComponent> corredores;
	private int qtdCorredores;
	private int qtd;
	
	public Andar2() {
		this.corredores = new ArrayList<>();
		setQtd(2);
	}

	@Override
	public GarageComponent getComponent(int index) {
		return corredores.get(index-1);
	}

	@Override
	public void setComponent(GarageComponent component) {
		if(this.qtd < this.qtdCorredores) {
			this.corredores.add(component);
			this.qtd++;
		}
		
	}

	@Override
	public int getQtd() {
		return this.qtdCorredores;
	}

	@Override
	public void setQtd(int qtd) {
		this.qtdCorredores = qtd;
		
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
		return null;
	}

}
