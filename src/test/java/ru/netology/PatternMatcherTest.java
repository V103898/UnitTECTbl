package ru.netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PatternMatcherTest {

    @Test
    public void testCountPatternOccurrences_normalCase_success() {
        // given
        String text = "aaababaabaaaaba";
        String pattern = "aab";

        // when
        int result = PatternMatcher.countPatternOccurrences(text, pattern);

        // then
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testCountPatternOccurrences_patternAtStartAndEnd_success() {
        // given
        String text = "aabaaabaaab";
        String pattern = "aab";

        // when
        int result = PatternMatcher.countPatternOccurrences(text, pattern);

        // then
        Assertions.assertEquals(3, result);
    }

    @Test
    public void testCountPatternOccurrences_noMatches_zero() {
        // given
        String text = "bbbbbbbb";
        String pattern = "aab";

        // when
        int result = PatternMatcher.countPatternOccurrences(text, pattern);

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testCountPatternOccurrences_emptyText_zero() {
        // given
        String text = "";
        String pattern = "aab";

        // when
        int result = PatternMatcher.countPatternOccurrences(text, pattern);

        // then
        Assertions.assertEquals(0, result);
    }

    @Test
    public void testCountPatternOccurrences_emptyPattern_zero() {
        // given
        String text = "aaababaabaaaaba";
        String pattern = "";

        // when
        int result = PatternMatcher.countPatternOccurrences(text, pattern);

        // then
        Assertions.assertEquals(0, result);
    }
    @Test
    public void testCountPatternOccurrences_nullArguments_zero() {
        // given
        String text = null;
        String pattern = null;

        // when
        int result = PatternMatcher.countPatternOccurrences(text, pattern);

        // then

        Assertions.assertEquals(0, result);
    }
}