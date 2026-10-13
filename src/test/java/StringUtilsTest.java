import org.example.task1.StringUtils;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"level", "", "RaceCar", "1221"})
    void shouldReturnTrueForPalidromeStrings(String input) {
        StringUtils utils = new StringUtils();

        assertTrue(utils.isPalindrome(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"hello", "123", "qwertyuiop;lkjhgfdsa"})
    void shouldReturnFalseForNonPalindromeStrings(String input) {
        StringUtils utils = new StringUtils();

        assertFalse(utils.isPalindrome(input));
    }

    @Test
    void shouldReturnFalseForNull() {
        StringUtils utils = new StringUtils();

        assertFalse(utils.isPalindrome(null));
    }

    @ParameterizedTest
    @CsvSource({
            "hello, 2",
            "xyz, 0",
            ", 0",
            "AEIOU, 5",
    })
    void shouldReturnAmountOfVowelsInString(String input, int expResult) {
        StringUtils utils = new StringUtils();

        int result = utils.countVowels(input);

        assertEquals(expResult, result);
    }

    @Test
    void shouldReturnZeroCountVowelsForEmptyString() {
        StringUtils utils = new StringUtils();

        int result = utils.countVowels("");

        assertEquals(0, result);
    }
}
