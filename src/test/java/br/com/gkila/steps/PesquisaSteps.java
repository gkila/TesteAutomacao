package br.com.gkila.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class PesquisaSteps {

	WebDriver driver;

	@Before
	public void driverSetup() {
		driver = new ChromeDriver();
	}

	@After
	public void quit() {
		driver.quit();
	}

	@Given("que eu estou acessando a aplicacao")
	public void queEuEstouAcessandoAAplicacao() {
		driver.get("https://site.getnet.com.br/");

	}

	@When("Eu preencho o campo de busca com {string}")
	public void euPreenchoOCampoDeBuscaCom(String string) throws InterruptedException {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.id("search-trigger"))).click();
		driver.findElement(By.id("global-search-input")).sendKeys(string);
		

	}

	@When("Clico em procurar")
	public void clicoEmProcurar() {
		driver.findElement(By.xpath("//button[text()='Procurar']")).click();
	}

	@Then("O sistema retorna uma lista de perguntas ao usuario")
	public void oSistemaRetornaUmaListaDePerguntasAoUsuario() {
		
	}

	@When("eu clico no link {string}")
	public void euClicoNoLink(String string) {
		driver.findElement(By.partialLinkText(string)).click();
	}

	@SuppressWarnings("deprecation")
	@Then("uma moda vai ser aberta com a mensagem {string}")
	public void umaModaVaiSerAbertaComAMensagemComoFaOAPortabilidadeDaMinhaMaquininha(String string) {
		//String text = driver.findElement(By.xpath("//div[contains(@class, 'o-modal__title') and text()='Como faco para colocar dinheiro na minha conta SuperGet?']")).getText();
		String text = driver.findElement(By.xpath("//div[contains(@class, 'o-modal__title') and text()='"+string+"']")).getText();
		Assert.assertEquals(text, string);
		
	}

}
