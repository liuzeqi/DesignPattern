package DecoratorPattern;

/**
 * 具体装饰角色
 */
public class ConcreteDecorator1 extends Decorator {
    /**
     * 构造方法中传入被装饰者，方法执行还是由被装饰者来执行
     *
     * @param component 被装饰者
     */
    public ConcreteDecorator1(Component component) {
        super(component);
    }

    private void newResponsibility(){
        System.out.println("装饰器1添加的新的职责");
    }

    @Override
    public void operate() {
        newResponsibility();
        super.operate();
    }
}
