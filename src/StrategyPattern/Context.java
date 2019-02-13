package StrategyPattern;

/**
 * 封装类
 * 通过构造传递不同的具体策略，面向接口
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        strategy.doSomething();
    }
}
