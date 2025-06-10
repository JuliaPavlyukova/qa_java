package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;


@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Mock
    Animal animal;

    @Before
    public void setUp() {
        animal = new Animal();
    }

    @Test
    public void testGetFoodForHerbivore() throws Exception {
        List<String> expectedFood = List.of("Трава", "Различные растения");
        List<String> actualFood = animal.getFood("Травоядное");
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFoodForPredator() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = animal.getFood("Хищник");
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFoodForUnknownAnimalKind() {
        Exception exception = assertThrows(Exception.class, () -> {
            animal.getFood("");
        });
        String expectedMessage = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        String actualMessage = exception.getMessage();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void testGetFoodForNullAnimalKind() {
        assertThrows(Exception.class, () -> {
            animal.getFood(null);
        });
    }

    @Test
    public void getFamily() {
        String actual = animal.getFamily();
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        assertEquals(expected, actual);
    }
}
