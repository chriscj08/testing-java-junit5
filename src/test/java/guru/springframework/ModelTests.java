package guru.springframework;

import org.junit.jupiter.api.*;

//Interfaces can be implemented to use the interface's tag
@Tag("model")
public interface ModelTests {

    default void showTestInfo(TestInfo testInfo, RepetitionInfo repetitionInfo){
        System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition());
    }
}
