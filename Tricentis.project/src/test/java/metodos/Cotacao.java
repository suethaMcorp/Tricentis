package metodos;

import org.openqa.selenium.By;

public class Cotacao extends HomePage {
	public void preencherDadosDoVeiculo() {
		selecionarOpcaoMenu(el.campoMake, "BMW");
		clicarEscrever(el.enginePerformance, "100");
		clicarEscrever(el.DateOfManufacture, "09/25/2020");
		selecionarOpcaoMenu(el.numberOfSeats, "5");
		selecionarOpcaoMenu(el.fuelType, "Petrol");
		clicarEscrever(el.listPrice, "20000");
		clicarEscrever(el.licensePlateNumber, "2513522165");
		clicarEscrever(el.annualMileage, "100");
		clicar(el.botaoNext);
	}

	public void preencherDadosDoSeguro() {
		clicarEscrever(el.firstName, "Matheus");
		clicarEscrever(el.lastName, "Oliveira");
		clicarEscrever(el.dateOfBirth, "04/05/1996");
		clicar(el.genderMale);
		clicarEscrever(el.streetAdress, "Rua petrolina");
		selecionarOpcaoMenu(el.country, "Brazil");
		clicarEscrever(el.zipCode, "06463260");
		clicarEscrever(el.city, "São Paulo");
		selecionarOpcaoMenu(el.ocupation, "Employee");
		clicar(el.hSpeeding);
		clicarEscrever(el.website, "www.teste.com.br");
		clicar(el.botaoNext2);

	}

	public void preencherDadosDoProduto() {
		clicarEscrever(el.startDate, "09/25/2022");
		selecionarMenuValor(el.insuranceSum, " 3.000.000,00");
		selecionarOpcaoMenu(el.meritRating, "Bonus 1");
		selecionar(el.damageInsurance, "No Coverage");
		clicar(el.optionalProducts);
		selecionarOpcaoMenu(el.courtesyCar, "Yes");
		clicar(el.botaoNext3);
	}

	public void preencherDadosDoPreco() throws InterruptedException {
		selecionarPreco("gold");
		Thread.sleep(1000);
		driver.findElement(By.id("nextsendquote")).click();
	}

	public void enviarCotacao() {
		clicarEscrever(el.getEmail(), "teste@teste.com");
		clicarEscrever(el.getPhone(), "1112345682");
		clicarEscrever(el.getUsername(), "teste123");
		clicarEscrever(el.getPassword(), "Teste123");
		clicarEscrever(el.getConfirmpassword(), "Teste123");
		clicarEscrever(el.getComments(), "testeeeeeeeeeeeeeeeeee");
		clicar(el.getBotaoSend());

	}
	
}
