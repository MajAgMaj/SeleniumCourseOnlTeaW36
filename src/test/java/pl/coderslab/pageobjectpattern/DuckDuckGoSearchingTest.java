package pl.coderslab.pageobjectpattern;

import org.junit.jupiter.api.Test;

import java.util.List;

public class DuckDuckGoSearchingTest {

    @Test
    public void searchWithDuckDuckGo() {

        DuckDuckGoHomePage homePage = new DuckDuckGoHomePage();

        homePage.inputPhraseToSearch("W pustyni i w puszczy");
        homePage.clickSearchButton();

        List<String> searchResults = homePage.getFirstThreeSearchResults();
        for (String searchResult : searchResults) {
            System.out.println(searchResult);
        }

        // driver.quit();

        //WebElement loginbutton123 = driver.findElement(By.cssSelector(".btn.btn-info.block.full-width.m-b"));
    }
}
