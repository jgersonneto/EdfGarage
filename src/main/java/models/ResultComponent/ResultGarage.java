package models.ResultComponent;

import models.GarageComponent;
import models.Vaga;

public class ResultGarage extends ResultComponent{
	
	private int tVaga;
	private double preco;
	private int vagaLivre;

	@Override
	public String garageResult(GarageComponent garage) {
		
		// Essa parte verifica qual andar tem mais vagas livre
		int auxTVaga;
		String auxTextLabel;
		GarageComponent vaga = new Vaga();
		this.tVaga = getTVaga(garage, 1, 1, 0);
		this.tVaga += getTVaga(garage, 1, 2, 0);
		auxTVaga = this.tVaga;
		this.tVaga = getTVaga(garage, 2, 1, 0);
		this.tVaga += getTVaga(garage, 2, 2, 0);
		if(auxTVaga > this.tVaga) {
			auxTextLabel = "1º andar - Tem Mais vagas LIVRE, no TOTAL: "+ auxTVaga +" Vagas\n\n";
			vagaLivre = 1;
		}
		else {
			auxTextLabel = "2º andar - Tem Mais vagas LIVRE, no TOTAL: "+ this.tVaga +" Vagas\n\n";
			vagaLivre = 2;
		}
		// Essa parte verifica o total de valor arrecadado pelo edf. garagem
		this.tVaga = 0;
		this.tVaga = getTVaga(garage, 1, 1, 1);
		this.tVaga += getTVaga(garage, 1, 2, 1);		
		this.tVaga += getTVaga(garage, 2, 1, 1);
		this.tVaga += getTVaga(garage, 2, 2, 1);
		this.preco = vaga.getPreco()*this.tVaga;
		auxTextLabel += "Edf Garagem - Arrecadou um TOTAL: "+ this.preco +" Reais\n\n";
		
		// Essa parte ordena por andar com vagas livres
		this.tVaga = getTVaga(garage, vagaLivre, 1, 0);
		auxTVaga = getTVaga(garage, vagaLivre, 2, 0);
		if(this.tVaga > auxTVaga) {
			auxTextLabel += "Edf Garagem - Ordenção por vaga Livre\n";
			auxTextLabel += vagaLivre + "º andar - {1º corredor, 2º corredor}\n";
		}
		else {
			auxTextLabel += "Edf Garagem - Ordenção por vaga Livre\n";
			auxTextLabel += vagaLivre + "º andar - {2º corredor, 1º corredor}\n";
		}
		if(vagaLivre == 2) {
			vagaLivre--;
		}
		else {
			vagaLivre++;
		}
		this.tVaga = getTVaga(garage, vagaLivre, 1, 0);
		auxTVaga = getTVaga(garage, vagaLivre, 2, 0);
		if(this.tVaga > auxTVaga) {			
			auxTextLabel += vagaLivre + "º andar - {1º corredor, 2º corredor}\n";
		}
		else {			
			auxTextLabel += vagaLivre + "º andar - {2º corredor, 1º corredor}\n";
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
