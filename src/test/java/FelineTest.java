import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.List;


public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Test
    public void testFelineEatMeat() throws Exception {
        List<String> list = feline.eatMeat();
        Assert.assertEquals(3, list.size());
    }

    @Test
    public void testFelineGetFamily() throws Exception {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testFelineGetKittens() throws Exception {
        Assert.assertEquals(1, feline.getKittens());
    }
}
