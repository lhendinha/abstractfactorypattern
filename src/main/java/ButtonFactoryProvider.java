public class ButtonFactoryProvider {

    public static ButtonFactory getFactory(String osName) {
        if (osName.equals("Windows")) {
            return new WindowsButtonFactory();
        } else if (osName.equals("Mac")) {
            return new MacOsButtonFactory();
        } else {
            throw new RuntimeException("Not implemented yet");
        }
    }
}