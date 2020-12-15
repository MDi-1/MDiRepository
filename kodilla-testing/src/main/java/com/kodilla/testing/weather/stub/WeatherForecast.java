package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;
    public WeatherForecast(Temperatures temperatures) { this.temperatures = temperatures; }
    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();
        for(Map.Entry<String, Double> temperature :temperatures.getTemperatures().entrySet()){
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        } return resultMap;
    }
    public double averageTemp() {
        double sum = 0;
        int i = 0;
        for (Double temp : calculateForecast().values()) {
            i ++;
            sum = sum + temp;
        } return sum / i;
    }
    public double medianTemp() {
        Collection<Double> tempC = calculateForecast().values();
        Double[] temps = tempC.toArray(new Double[0]);
        Arrays.sort(temps);
        return temps[temps.length / 2];
    }
}
