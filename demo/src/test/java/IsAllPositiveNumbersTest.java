import com.epam.demo.Utils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsAllPositiveNumbersTest {

    public static Stream<Arguments> testCases() {
        return Stream.of(
                Arguments.of("EmptySourceList",
                        new ArrayList<>(),
                        false),

                Arguments.of("Only Positive Nums",
                        Arrays.asList("47.0001", "3", "25.003", "13", "7"),
                        true),

                Arguments.of("Has Negative Num",
                        Arrays.asList("47", "3", "25", "13", "-7.131231"),
                        false),

                Arguments.of("All Negative Nums",
                        Arrays.asList("-47", "-3", "-25.8923", "-13", "-7"),
                        false)
        );
    }



    @ParameterizedTest(name = "isAllPositiveNumbers_{0}_Test")
    @MethodSource(value = "testCases")
    void createArrayListTest(String name,
                             List<String> actualNumbersList,
                             boolean expectedValue) {
        assertEquals(expectedValue, Utils.isAllPositiveNumbers(actualNumbersList));
    }
}
