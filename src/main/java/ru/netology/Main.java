package ru.netology;
public class Main {
    public static final String TEXT = "aaababaabaaaabaabaabaabaaababaabaaababaabaaaabaabaabaabbabaabaaababaababaabaabaabaaabbaab";
    public static final String PATTERN = "aab";

    public static void main(String[] args) {
        int count = 0;

        for (int i = 0; i < TEXT.length() - PATTERN.length(); i++) {

            boolean matches = true;
            for (int j = 0; j < PATTERN.length(); j++) {
                if (PATTERN.charAt(j) != TEXT.charAt(j + i)) {
                    matches = false;
                    break; // Вставьте ваш код сюда
                }
            }
            if (matches) {
                count++;
            }
        }
        System.out.println("Строка " + PATTERN + " встретилась в тексте " + count + " раз");
    }
}