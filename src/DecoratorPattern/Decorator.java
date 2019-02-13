package DecoratorPattern;

/**
 * 装饰角色，子类可给被装饰者添加不同职责
 */
public abstract class Decorator extends Component{

    private Component component;

    /**
     * 构造方法中传入被装饰者，方法执行还是由被装饰者来执行
     * @param component 被装饰者
     */
    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
