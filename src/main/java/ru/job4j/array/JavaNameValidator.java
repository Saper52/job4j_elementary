package ru.job4j.array;

import static java.lang.Character.isDigit;
import static java.lang.Character.isUpperCase;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        char[] array = name.toCharArray();
        boolean valid = !name.isEmpty() && isLowerLatinLetter(array[0]) && !isDigit(array[0]) && !isSpecialSymbol(array[0]);
        if (valid) {
            for (int i = 1; i < array.length; i++) {
                if (!(isSpecialSymbol(array[i]) || isUpperLatinLetter(array[i]) || isLowerLatinLetter(array[i]))) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return isUpperCase(code);
    }

    public static boolean isLowerLatinLetter(int code) {
        return !isUpperCase(code);
    }
}