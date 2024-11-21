package unit.tests;

import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;



import java.util.List;

@RunWith(MockitoJUnitRunner.class)


public class LionTest {

    private  static final String EXPECTED_ERROR = "Используйте допустимые значения пола животного - самец или самка";

    @Mock
    Feline feline;

    @Test
    public void getKittensInLionWorksSuccessfully() throws Exception {
        Lion lion = new Lion("Самка", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualKittensCount = lion.getKittens();
        int expectedKittensCount = 1;
        Assert.assertEquals(expectedKittensCount, actualKittensCount);
    }

    @Test
    public void getFoodInLionWorksSuccessfully() throws Exception {
        Lion lion = new Lion("Самец", feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.getFood("Хищник")).thenReturn(expectedFood);
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void getConstructorWithInvalidGenderName() {
        Exception exception = null;
        try {
            String genderName ="Оно";
            new Lion(genderName, null);
        } catch (Exception e) {
            exception = e;
        }
        // Проверяем, было ли исключение выброшено и сверяем с текстом без ошибки
        Assert.assertEquals("Неправильное сообщение исключения",EXPECTED_ERROR, exception.getMessage());
    }
}


