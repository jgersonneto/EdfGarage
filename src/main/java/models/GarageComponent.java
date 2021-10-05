package models;

import java.util.List;

public abstract class GarageComponent {
	
	public abstract double getPreco();
	public abstract int getState();
	public abstract GarageComponent getComponent(int index);
	public abstract void setComponent(GarageComponent component);
	public abstract List<GarageComponent> getLista();
	public abstract int getQtd();
	public abstract void setQtd(int qtd);

}
