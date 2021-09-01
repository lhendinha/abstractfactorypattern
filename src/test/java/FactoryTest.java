import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryTest {

    @Test
    void createWindowsButton() {
        System.out.println("Running: testCreateWindowsButton");
        ButtonFactory buttonFactory = ButtonFactoryProvider.getFactory("Windows");
        Button button = buttonFactory.createButton();

        assertNotNull(button);
    }

    @Test
    void createMacButton() {
        System.out.println("Running: testCreateMacButton");
        ButtonFactory buttonFactory = ButtonFactoryProvider.getFactory("Mac");
        Button button = buttonFactory.createButton();

        assertNotNull(button);
    }
}
