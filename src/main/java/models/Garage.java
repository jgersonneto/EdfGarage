package models;

import java.util.ArrayList;
import java.util.List;

public class Garage extends GarageComponent{
	
	private List<GarageComponent> andares;
	private int qtdAndares;
	private int qtd;
	
	public Garage() {
		this.andares = new ArrayList<>();
		setQtd(2);
	}

	@Override
	public GarageComponent getComponent(int index) {
		return andares.get(index-1);
	}

	@Override
	public void setComponent(GarageComponent andares) {		
		if(this.qtd < this.qtdAndares) {
			this.andares.add(andares);
			this.qtd++;
		}				
	}

	@Override
	public int getQtd() {
		return this.qtdAndares;
	}

	@Override
	public void setQtd(int qtd) {
		this.qtdAndares = qtd;
		
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
		return this.andares;
	}

}
