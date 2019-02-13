package StrategyPattern;

/**
 * 策略接口的具体实现类，实现具体的策略
 */
public class ConcreteStrategy1 implements Strategy {

    @Override
    public void doSomething() {
        System.out.println("这是策略1");
    }
}
