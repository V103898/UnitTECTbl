package ru.netology;

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