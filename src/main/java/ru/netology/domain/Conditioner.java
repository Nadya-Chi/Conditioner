package ru.netology.domain;

public class Conditioner {
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;

    public int getMaxTemperature() {
        return maxTemperature;
    }
    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return minTemperature;
    }
    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public int getIncreaseCurrentTemperature() {
        return currentTemperature;
    }
    public void setIncreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature > maxTemperature) {
            return;
        }
        if (currentTemperature > minTemperature) {
            currentTemperature++;
        }
        this.currentTemperature = currentTemperature++;
    }

    public int getDecreaseCurrentTemperature() {
        return currentTemperature;
    }
    public void setDecreaseCurrentTemperature(int currentTemperature) {
        if (currentTemperature < minTemperature) {
            return;
        }
        if (currentTemperature < maxTemperature) {
            currentTemperature--;
        }
        this.currentTemperature = currentTemperature--;
    }
}