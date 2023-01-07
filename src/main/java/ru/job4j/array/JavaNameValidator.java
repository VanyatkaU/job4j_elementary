package ru.job4j.array;

public class JavaNameValidator {

    public static boolean isNameValid(String name) {
        boolean valid = !isEmpty(name)
                        && !isUpperLatinLetter(name.charAt(0))
                        && isDigit(name.charAt(0))
                        && isSpecialSymbol(name.charAt(0));
        if (valid) {
            for (int i = 0; i < name.length(); i++) {
                int code = name.codePointAt(i);
                if (isSpecialSymbol(code) && isUpperLatinLetter(0)
                    && !isLowerLatinLetter(code) && isDigit(code)) {
                    valid = false;
                    break;
                }
            }
        }
        return valid;
    }


    public static boolean isSpecialSymbol(int code) {
        return (code != 36 && code != 95);
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }

    public static boolean isDigit(int code) {
        return !Character.isDigit(code);
    }

    public static boolean isEmpty(String code) {
        return code.isEmpty();
    }
}
