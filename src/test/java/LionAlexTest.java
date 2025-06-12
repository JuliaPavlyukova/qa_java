import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;


@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {
    private LionAlex alex;
    @Mock
    private Feline feline;

    @Before
    public void setUp() throws Exception {
        alex = new LionAlex(feline);
    }

    @Test
    public void testGetFriends() {
        Assert.assertEquals(3, alex.getFriends().size());
    }

    @Test
    public void testGetPlaceOfLiving() {
        Assert.assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

    @Test
    public void testDoesAlexHaveMane() {
        Assert.assertTrue(alex.doesHaveMane());
    }

    @Test
    public void testGetKittnes() {
        Assert.assertEquals(0, alex.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), alex.getFood());
    }

}
