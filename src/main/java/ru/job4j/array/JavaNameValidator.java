package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean valid;
        char[] array = name.toCharArray();
        int code = name.codePointAt(0);
        // valid = !name.isEmpty() && isLowerLatinLetter(code) && !isDigit(code) && !isSpecialSymbol(code);
        if (!name.isEmpty() && isLowerLatinLetter(code) && !isDigit(code) && !isSpecialSymbol(code)) {
            for (int i = 1; i < array.length; i++) {
                if (!isSpecialSymbol(i) || !isUpperLatinLetter(i) || !isLowerLatinLetter(i)) {
                    valid = false;
                }
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        boolean valid = false;
        valid = ((code == 36) || (code == 95));
        return valid;
    }

    public static boolean isUpperLatinLetter(int code) {
        boolean valid = false;
        valid = isUpperCase(code);
        return valid;
    }

    public static boolean isLowerLatinLetter(int code) {
        boolean valid = false;
        valid = !isUpperCase(code);
        return valid;
    }
}