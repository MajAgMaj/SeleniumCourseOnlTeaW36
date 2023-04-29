package pl.coderslab.pageobjectpattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pl.coderslab.seleniumcourseonlteaw36.Base;

import java.util.ArrayList;
import java.util.List;

public class DuckDuckGoHomePage extends Base {

    public DuckDuckGoHomePage() {
        driver.get("https://duckduckgo.com/");
    }

    public void searchPhrase(String phrase) {
        inputPhraseToSearch(phrase);
        clickSearchButton();
    }

    public void inputPhraseToSearch(String phrase) {
        WebElement searchInput = driver.findElement(By.id("search_form_input_homepage")); // .var
        searchInput.sendKeys(phrase);
    }

    public void clickSearchButton() {
        WebElement searchButton = driver.findElement(By.id("search_button_homepage"));
        searchButton.click();
    }

    public List<String> getFirstThreeSearchResults() {
        List<WebElement> searchResults = driver.findElements(By.cssSelector("div#links article h2 a span"));

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            WebElement oneSearchResult = searchResults.get(i);
            resultList.add(oneSearchResult.getText());
        }
        return resultList;
    }
}
