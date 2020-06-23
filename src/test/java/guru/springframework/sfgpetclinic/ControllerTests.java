package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@Tag("controllers")
//This allows you to declare test methods to execute per class
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface ControllerTests {
    //You can add default test methods

    @BeforeAll
    default void beforeAll() {
        System.out.println("Lets do something here");
    }
}
