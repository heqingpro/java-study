package study.designpatterns.ChainOfResponsibility;

import lombok.Data;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/30 17:37
 */
@Data
public class Request {

    private RequestType type;
    private String name;

    public Request(RequestType type, String name) {
        this.type = type;
        this.name = name;
    }
}
