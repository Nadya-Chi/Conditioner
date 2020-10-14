package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConditionerTest {

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
        conditioner.setCurrentTemperature(20);
        conditioner.increaseCurrentTemperature();
        assertEquals(21,conditioner.getCurrentTemperature());
        }

    @Test
    public void increaseCurrentTemperatureFalse() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(45);
        conditioner.increaseCurrentTemperature();
        assertEquals(35,conditioner.getCurrentTemperature());
        }

    @Test
    public void increaseCurrentTemperatureMax() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(35);
        conditioner.increaseCurrentTemperature();
        assertEquals(35,conditioner.getCurrentTemperature());
        }

    @Test
    public void decreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(20);
        conditioner.decreaseCurrentTemperature();
        assertEquals(19,conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureFalse() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(5);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10,conditioner.getCurrentTemperature());
    }

    @Test
    public void decreaseCurrentTemperatureMin() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(10);
        conditioner.decreaseCurrentTemperature();
        assertEquals(10,conditioner.getCurrentTemperature());
    }

}