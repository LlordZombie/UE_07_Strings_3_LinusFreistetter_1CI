public class Main {
    public static void main(String[] args) {
        System.out.println(isConstantName("WER_IST_DAS?"));
        System.out.println(isMethodName("ichBinJohn"));
        System.out.println(countOccurence("abababa", "abab"));
    }

    public static boolean containsOnlyChars(String s, String chars) {
        String singleLetter;
        for (int i = 0; i < s.length(); i++) {
            singleLetter = String.valueOf(s.charAt(i));
            if (!chars.contains(singleLetter)) {
                return false;
            }
        }
        return true;
    }


    public static boolean isConstantName(String name) {
        if (name.length() == 0) {
            return false;
        }
        String firstChar = String.valueOf(name.charAt(0));
        if (!containsOnlyChars(firstChar, "QWERTZUIOPASDFGHJKLYXCVBNMÜ")) {
            return false;
        }
        if (!containsOnlyChars(name, "ABCDEFGHIJKLMNOPQRSTUVWXYZ_1234567890")) {
            return false;
        }
        return true;
    }

    public static boolean isMethodName(String name) {
        String firstChar = String.valueOf(name.charAt(0));
        if (!containsOnlyChars(firstChar, "abcdefghijklmnopqrstuvwxyz")) {
            return false;
        }
        if (!containsOnlyChars(name, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdeffghijklmnopqrstuvwxyz_1234567890")) {
            return false;
        }
        return true;
    }


    public static int countOccurence(String s, String part) {
        int rInt = 0;
        String possiblePart = "";
        if (!s.contains(part)) {
            return rInt;
        }
        if (part.isEmpty()) {
            return rInt;
        }
        for (int i = 0; i < s.length() - part.length(); i++) {
            possiblePart = s.substring(i, i + part.length());
            if (possiblePart.equals(part)) {
                rInt++;
            }
        }
        return rInt;
    }

    public static void printHexAsciiTab() {

    }


}