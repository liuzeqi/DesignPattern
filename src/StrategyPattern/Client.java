package StrategyPattern;

/**
 * 策略模式：
 * 定义一组算法，将每个算法都封装起来，并且使它们之间可以互换。
 */
public class Client {

    public static void main(String[] args) {
        // 给封装角色传递具体的策略
        Context context = new Context(new ConcreteStrategy1());
        context.doAnything();
    }
}
