package unit.tests;

import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionSexTest {

    private final boolean expectedHasMane;
    private final String sex;


    public LionSexTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters(name = "sex = {0}, expectedHasMane = {1}")
    public static Object[][] gendersOfLion() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeWorksSuccessfully() throws Exception {
        Lion lion = new Lion(sex, null);
        boolean actualHasMane = lion.doesHaveMane();
        Assert.assertEquals(expectedHasMane, actualHasMane);
    }
}

