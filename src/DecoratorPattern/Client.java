package DecoratorPattern;

public class Client {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        // 装饰：动态地给对象添加额外的职责
        component = new ConcreteDecorator1(component);
        component.operate();
    }
}
