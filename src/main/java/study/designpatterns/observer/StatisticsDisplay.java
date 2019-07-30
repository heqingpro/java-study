package study.designpatterns.observer;

/**
 * @author heqingqing
 * @Description: 观察者$
 * @date 2019/7/30 21:59
 */
public class StatisticsDisplay implements Observer{

    public StatisticsDisplay(Subject weatherData){
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure){
        System.out.println("StatisticsDisplay.update: " + temp + " " + humidity + " " + pressure);
    }

}
