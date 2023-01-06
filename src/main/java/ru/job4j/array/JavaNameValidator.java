package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = false;
        if (!isEmpty(name) && isLowerLatinLetter(name.codePointAt(0))) {
            for (int i = 1; i < name.length(); i++) {
                int code = name.codePointAt(i);
                valid = isDigit(code) || isLowerLatinLetter(code)
                        || isSpecialSymbol(code) || isUpperLatinLetter(code);
                break;
            }
        }
        return valid;
    }

    public static boolean isSpecialSymbol(int code) {
        return (code == 36 || code == 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isDigit(int code) {
        return Character.isDigit(code);
    }

    public static boolean isEmpty(String code) {
        return code.isEmpty();
    }
}
