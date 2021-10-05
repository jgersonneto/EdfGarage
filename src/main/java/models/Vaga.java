package models;

import java.util.List;

public class Vaga extends GarageComponent {

	private double preco;
	private int state;

	public Vaga() {
		setPreco();
		setState(0);
	}
	@Override
	public double getPreco() {
		return this.preco;
	}

	public void setPreco() {
		this.preco = 10;
	}
	@Override
	public int getState() {
		return this.state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public boolean isOccupied() {
		return this.state == 1;
	}

	@Override
	public GarageComponent getComponent(int index) {
		return null;
	}

	@Override
	public void setComponent(GarageComponent component) {
		
	}

	@Override
	public int getQtd() {		
		return 0;
	}

	@Override
	public void setQtd(int qtd) {
		
	}
	@Override
	public List<GarageComponent> getLista() {
		// TODO Auto-generated method stub
		return null;
	}

}
