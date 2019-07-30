package study.designpatterns.observer;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/30 21:44
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
