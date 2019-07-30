package study.designpatterns.ChainOfResponsibility;

/**
 * @author heqingqing
 * @Description: $
 * @date 2019/7/30 17:37
 */
public class Request {

    private RequestType requestType;
    private String name;

    public void setRequestType(RequestType requestType){
        this.requestType = requestType;
    }

    public RequestType getRequestType() {
        return requestType;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public Request(RequestType requestType, String name) {
        this.requestType = requestType;
        this.name = name;
    }
}
