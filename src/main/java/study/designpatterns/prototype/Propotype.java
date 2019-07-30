package study.designpatterns.prototype;

/**
 * @author heqingqing
 * @Description: 原型模式，通过调用对象的方法来创建对象的拷贝$
 * @date 2019/7/30 16:47
 */
public class Propotype {

    abstract class PropotypeDemo{
        abstract PropotypeDemo myClone();
    }

    class PropotypeTest extends PropotypeDemo{
        public String str;

        public PropotypeTest(String str){
            this.str = str;
        }
        @Override
        PropotypeDemo myClone(){
            return new PropotypeTest(str);
        }

    }

    public void test(){
        PropotypeDemo demo = new PropotypeTest("abc");
        //这里实现拷贝
        PropotypeDemo clone = demo.myClone();
     }

    public static void main(String[] args) {
    }
}
