package unit.tests;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineTest {
    @Test
    public void getFamilyWorksSuccessfully() {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensWorksSuccessfully() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getKittensCountWorksSuccessfully() {
        Feline feline = new Feline();
        int actualKittensCount = feline.getKittens(10);
        int expectedKittensCount = 10;
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void eatMeatWorksSuccessfully() throws Exception {
        Feline feline = new Feline();
        List<String> actualFood = feline.eatMeat();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expectedFood, actualFood);
    }
}
