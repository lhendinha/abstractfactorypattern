public class Main {
    public static void main(String[] args) {
        ButtonFactory buttonFactory = ButtonFactoryProvider.getFactory("Windows");
        Button button = buttonFactory.createButton();

        button.onClick();
        button = buttonFactory.createButton();
        button.onClick();

        buttonFactory = ButtonFactoryProvider.getFactory("Mac");

        button = buttonFactory.createButton();
        button.onClick();
        button = buttonFactory.createButton();
        button.onClick();
    }
}
