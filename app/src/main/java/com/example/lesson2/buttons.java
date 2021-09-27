package com.example.lesson2;

public class buttons {
    public static String stringInputTextView = "";
    public static String symbolOperation = "";
    public static double valueFirst;
    public static double valueSecond;
    public static double temp;



    public static boolean divButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "/";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public static boolean multiplyButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "*";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public static boolean minusButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "-";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public static boolean addButton() {
        if (symbolOperation.isEmpty() && !stringInputTextView.isEmpty()) {
            symbolOperation = "+";
            valueFirst = Double.parseDouble(stringInputTextView);
            return true;
        }
        return false;
    }

    public static boolean dotButton() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat(".");
            return true;
        }
        return false;
    }

    public static boolean nullaButton() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("0");
            return true;
        }
        return false;
    }

    public static boolean buttonOne() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("1");
            return true;
        }
        return false;
    }

    public static boolean buttonTwo() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("2");
            return true;
        }
        return false;
    }

    public static boolean buttonThree() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("3");
            return true;
        }
        return false;
    }

    public static boolean buttonFour() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("4");
            return true;
        }
        return false;
    }

    public static boolean buttonFive() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("5");
            return true;
        }
        return false;
    }

    public static boolean buttonSix() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("6");
            return true;
        }
        return false;
    }

    public static boolean buttonSeven() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("7");
            return true;
        }
        return false;
    }

    public static boolean buttonEight() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("8");
            return true;
        }
        return false;
    }

    public static boolean buttonNine() {
        if (stringInputTextView.length() <= 7 || (!symbolOperation.isEmpty() && stringInputTextView.isEmpty())) {
            stringInputTextView = stringInputTextView.concat("9");
            return true;
        }
        return false;
    }

    public static void clearTextView() {
        stringInputTextView = "";
    }

    public static void clearAllCount() {
        stringInputTextView = "";
        symbolOperation = "";
        double valueFirst = 0.0f;
        double valueSecond = 0.0f;
        double temp = 0.0f;
    }

    public static void equalsCount() {
        valueSecond = Double.parseDouble(stringInputTextView);
        if (symbolOperation.equals("/")) {
            temp = valueFirst / valueSecond;
        }
        if (symbolOperation.equals("*")) {
            temp = valueFirst * valueSecond;
        }
        if (symbolOperation.equals("-")) {
            temp = valueFirst - valueSecond;
        }
        if (symbolOperation.equals("+")) {
            temp = valueFirst + valueSecond;
        }
    }



}
