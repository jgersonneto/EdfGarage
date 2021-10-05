package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import models.BuilderGarage;
import models.FactoryGarage;
import models.GarageComponent;
import models.ResultComponent.ResultAndar;
import models.ResultComponent.ResultComponent;
import models.ResultComponent.ResultCorredor;
import models.ResultComponent.ResultGarage;

public class ControllerMain implements Initializable {

	private GarageComponent garage;
	private int nAndar;
	private int nCorredor;
	
	@FXML private Button rGarage;	
	@FXML private Button r1Andar;    
	@FXML private Button r2Andar;    
	@FXML private Label txtLABEL;
	@FXML private AnchorPane stackDesc;
	@FXML private Button rAndar;
	@FXML private Button r1Corredor;
	@FXML private Button r2Corredor;
    @FXML private Label labelDesc;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
	}

	@FXML
	private void acaoBTRGarage(ActionEvent e) {

		stackDesc.setVisible(true);
		ResultComponent resultGarage = new ResultGarage();		
		this.labelDesc.setText(resultGarage.garageResult(this.garage));

	}
	
	@FXML
	private void acaoBTR1Andar(ActionEvent e) {
		
		stackDesc.setVisible(true);
		rAndar.setVisible(true);
		r1Corredor.setVisible(true);
		r2Corredor.setVisible(true);
		this.nAndar = 1;
		
		
	}
	
	@FXML
	private void acaoBTR2Andar(ActionEvent e) {
		
		stackDesc.setVisible(true);
		rAndar.setVisible(true);
		r1Corredor.setVisible(true);
		r2Corredor.setVisible(true);
		this.nAndar = 2;
		
	}
	
	@FXML
	private void acaoBTRAndar(ActionEvent e) {
		ResultComponent resultAndar = new ResultAndar();		
		this.labelDesc.setText(resultAndar.floorResult(this.garage, this.nAndar, 0));		
	}
	@FXML
	private void acaoBTR1Corredor(ActionEvent e) {
		ResultComponent resultCorredor = new ResultCorredor();
		this.nCorredor = 1;		
		this.labelDesc.setText(resultCorredor.hallResult(this.garage, this.nAndar, this.nCorredor, 1));
		
	}
	@FXML
	private void acaoBTR2Corredor(ActionEvent e) {
		ResultComponent resultCorredor = new ResultCorredor();
		this.nCorredor = 2;		
		this.labelDesc.setText(resultCorredor.hallResult(this.garage, this.nAndar, this.nCorredor, 1));
		
	}

}
