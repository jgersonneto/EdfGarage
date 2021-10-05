package testGarage;

/**
 * @author José Gerson <jgersonneto@gmail.com>
 */

import org.junit.Assert;
import org.junit.Test;

import models.BuilderGarage;
import models.FactoryGarage;
import models.GarageComponent;
import models.ResultComponent.ResultAndarTest;
import models.ResultComponent.ResultComponent;
import models.ResultComponent.ResultCorredorTest;
import models.ResultComponent.ResultGarageTest1;
import models.ResultComponent.ResultGarageTest2;

public class TestResult {

	private GarageComponent garage;

	@Test
	public void testCorredor1Andar1() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultCorredorTest = new ResultCorredorTest();

		int actual = Integer.parseInt(resultCorredorTest.hallResult(this.garage, 1, 1, 1));
		int expected = 3;
		Assert.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testCorredor2Andar1() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultCorredorTest = new ResultCorredorTest();

		int actual = Integer.parseInt(resultCorredorTest.hallResult(this.garage, 1, 2, 1));
		int expected = 5;
		Assert.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testCorredor1Andar2() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultCorredorTest = new ResultCorredorTest();

		int actual = Integer.parseInt(resultCorredorTest.hallResult(this.garage, 2, 1, 1));
		int expected = 1;
		Assert.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testCorredor2Andar2() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultCorredorTest = new ResultCorredorTest();

		int actual = Integer.parseInt(resultCorredorTest.hallResult(this.garage, 2, 2, 1));
		int expected = 3;
		Assert.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testAndar1() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultAndarTest = new ResultAndarTest();

		int actual = Integer.parseInt(resultAndarTest.floorResult(this.garage, 1, 0));
		int expected = 4;
		Assert.assertEquals(expected, actual, 0.0001);
	}

	@Test
	public void testAndar2() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultAndarTest = new ResultAndarTest();
		
		int actual = Integer.parseInt(resultAndarTest.floorResult(this.garage, 2, 0));
		int expected = 8;
		Assert.assertEquals(expected, actual, 0.0001);
	}
	@Test
	public void testGarageAndarMaisLivre() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultGarageTest1 = new ResultGarageTest1();
		
		int actual = Integer.parseInt(resultGarageTest1.garageResult(this.garage));
		int expected = 2;
		Assert.assertEquals(expected, actual, 0.0001);
	}
	@Test
	public void testGarageTotalArrecadado() {
		FactoryGarage factoryGarage = new FactoryGarage();
		BuilderGarage builderGarage = new BuilderGarage();
		this.garage = builderGarage.builder(factoryGarage);
		ResultComponent resultGarageTest2 = new ResultGarageTest2();

		int actual = Integer.parseInt(resultGarageTest2.garageResult(this.garage));
		int expected = 120;
		Assert.assertEquals(expected, actual, 0.0001);
	}

}
