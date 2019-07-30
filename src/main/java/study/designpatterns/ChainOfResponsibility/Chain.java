package study.designpatterns.ChainOfResponsibility;


/**
 * @author heqingqing
 * @Description: 责任链模式$
 * @date 2019/7/30 17:28
 */
public class Chain {

    abstract class Handler{
        protected Handler successor;

        public Handler(Handler successor){
            this.successor = successor;
        }

        protected abstract void handlerRequest(Request request);
    }

    class ConcreateHandler1 extends Handler {
        public ConcreateHandler1(Handler handler) {
            super(handler);
        }

        @Override
        public void handlerRequest(Request request) {
            if (request.getRequestType() == RequestType.TYPE1) {
                System.out.println(request.getName() + " is handle by ConcreteHandler1");
                return;
            }
            if (successor != null) {
                successor.handlerRequest(request);
            }
        }

    }
    class ConcreateHandler2 extends Handler {
        public ConcreateHandler2(Handler handler) {
            super(handler);
        }

        @Override
        public void handlerRequest(Request request) {
            if (request.getRequestType() == RequestType.TYPE2) {
                System.out.println(request.getName() + " is handle by ConcreteHandler2");
                return;
            }
            if (successor != null) {
                successor.handlerRequest(request);
            }
        }
    }
    public void test(){
        Handler handler1 = new ConcreateHandler1(null);
        Handler handler2 = new ConcreateHandler2(handler1);
        Request request = new Request(RequestType.TYPE1,"request1");
        handler2.handlerRequest(request);

        Request request1 = new Request(RequestType.TYPE2,"request2");
        handler2.handlerRequest(request1);
    }

    public static void main(String[] args) {
        Chain chain = new Chain();
        chain.test();
    }
}
