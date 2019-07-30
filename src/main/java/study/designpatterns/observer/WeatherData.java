package study.designpatterns.observer;


import java.util.ArrayList;
import java.util.List;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/30 21:43
 */
public class WeatherData implements Subject{
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<>();
    }

    public void setWeatherData(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for (Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }
}
