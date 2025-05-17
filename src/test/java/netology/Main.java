package netology;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PatternMatcher {

    public static int countPatternOccurrences(String text, String pattern) {
        if (text == null || pattern == null || pattern.isEmpty()) {
            return 0;
        }

        int count = 0;
        int patternLength = pattern.length();
        int textLength = text.length();

        for (int i = 0; i <= textLength - patternLength; i++) {
            boolean matches = true;
            for (int j = 0; j < patternLength; j++) {
                if (pattern.charAt(j) != text.charAt(j + i)) {
                    matches = false;
                    break;
                }
            }
            if (matches) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String text = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
        String pattern = "aab";
        int count = countPatternOccurrences(text, pattern);
        System.out.println("Строка " + pattern + " встретилась в тексте " + count + " раз");
    }
}

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