package Search;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import groovyjarjarantlr4.v4.parse.ANTLRParser.element_return;
import groovyjarjarantlr4.v4.runtime.dfa.EdgeMap;

public class amazon 
{
public static void main(String[] args) 
{
EdgeDriver dr=new EdgeDriver();
dr.get("https://www.primeabgb.com/");
dr.manage().timeouts().getImplicitWaitTimeout();
dr.findElement(By.name("s")).sendKeys("Headphones");


}

}