package DecoratorPattern;

/**
 * 抽象构件的具体实现类，要装饰的就是它
 */
public class ConcreteComponent extends Component {

    @Override
    public void operate() {
        System.out.println("被装饰者原有方法");
    }
}
