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

    /*метод должен вернуть true, если символ является символом доллара и нижнее подчеркивание;*/
    public static boolean isSpecialSymbol(int code) {
        boolean valid = false;
        return valid == ((code == 36) || (code == 95));
    }

    /*метод должен вернуть true, если символ является прописным латинским символом;*/
    public static boolean isUpperLatinLetter(int code) {
        boolean valid = false;
        return valid == isUpperCase(code);
    }

    /*метод должен вернуть true, если символ является строчным латинским символом.*/
    public static boolean isLowerLatinLetter(int code) {
        boolean valid = false;
        return valid != isUpperCase(code);
    }
}