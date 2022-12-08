package org.git;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	
	 private void method1() {
		 System.out.println();
	}
	 
	 private void method2() {
		 System.out.println();
		}
	 
	 private void method3() {
		 System.out.println();
		}

	 private void method4() {
		 System.out.println();
		}
	 
	 private void method5() {
		 System.out.println();
		}
	 
	 private void method6() {
		 System.out.println();
		}
	 
	 private void method7() {
		 System.out.println();
		}
	 
	 private void method20() {
      WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
      driver.navigate().to("https://github.com/");
      driver.quit();
	}
	 
	private void method21() {
     WebDriverManager.firefoxdriver().setup();
     WebDriver driver = new FirefoxDriver();
     driver.navigate().to("https://github.com/");
	} 
	 
	private void method22() {
     WebDriverManager.edgedriver().setup();
     WebDriver driver = new EdgeDriver();
     driver.navigate().to("https://github.com/");
	}
	
	 
	private void method23() {
    System.out.println("Method 23");
	}
	
	private void method24() {
    System.out.println("Method 24");
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
