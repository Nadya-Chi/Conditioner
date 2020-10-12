package ru.netology.domain;

import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

//    @Test
//    public void shouldGetAndSet() {
//        Conditioner conditioner = new Conditioner();
//        String expected = "Валли";
//        assertNull(conditioner.getName());
//        conditioner.setName(expected);
//        assertEquals(expected, conditioner.getName());
//    }
//
//    @Test
//    public void checkTemperature() {
//        Conditioner conditioner = new Conditioner();
//        assertEquals(0, conditioner.getCurrentTemperature());
//        conditioner.setCurrentTemperature(0);
//        assertEquals(0, conditioner.getCurrentTemperature());
//    }
    @Test
    public void maxTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        assertEquals(35,conditioner.getMaxTemperature());
        }

    @Test
    public void minTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(0);
        assertEquals(0,conditioner.getMinTemperature());
        }

    @Test
    public void increaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setIncreaseCurrentTemperature(25);
        assertEquals(26,conditioner.getIncreaseCurrentTemperature());
        }

    @Test
    public void increaseCurrentTemperatureFalse() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setIncreaseCurrentTemperature(45);
        assertEquals(0,conditioner.getIncreaseCurrentTemperature());
        }

    @Test
    public void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setIncreaseCurrentTemperature(35);
        assertEquals(36,conditioner.getIncreaseCurrentTemperature());
        }

    @Test
    public void increaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setIncreaseCurrentTemperature(0);
        assertEquals(0,conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setDecreaseCurrentTemperature(20);
        assertEquals(19,conditioner.getDecreaseCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureFalse() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setDecreaseCurrentTemperature(5);
        assertEquals(0,conditioner.getDecreaseCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setDecreaseCurrentTemperature(35);
        assertEquals(35,conditioner.getDecreaseCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setDecreaseCurrentTemperature(10);
        assertEquals(9,conditioner.getIncreaseCurrentTemperature());
    }


}