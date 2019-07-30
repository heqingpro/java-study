package study.designpatterns.observer;

/**
 * @author heqingqing
 * @Description: 天气台$
 * @date 2019/7/30 22:05
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setWeatherData(10,22,33);
    }
}
