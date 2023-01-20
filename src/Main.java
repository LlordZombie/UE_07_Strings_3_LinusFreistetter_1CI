public class Main {

    public static void main(String[] args) {
        System.out.println(isConstantName("WER_IST_DAS?"));
        System.out.println(isMethodName("ichBinJohn"));
        System.out.println(countOccurence("abababa", "abab"));
        printHexAsciiTab();
        System.out.println();
        System.out.println();
        System.out.println(hexCrossSum("Affe"));
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
        int col = 16;
        int row = 7;
        System.out.print("   ");
        for (int i = 0; i < col; i++) {
            System.out.printf("?%X  ", i);
        }
        char ascii = (char) (32);
        for (int i = 1; i < row; i++) {
            System.out.println();
            System.out.printf("?%X", i);
            for (int j = 0; j < col; j++) {
                System.out.printf("%3c ", ascii);
                ascii += 1;
            }
        }
    }

    public static int hexCrossSum(String n) {
        int sum = 0;
        int digit = 0;
        for (int i = 0; i < n.length(); i++) {
            char ch = Character.toLowerCase(n.charAt(i));
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else if (ch >= 'a' && ch <= 'f') {
                digit = ch - 'a' + 10;
            } else {
                return -1;
            }
            sum+=digit;
        }
        return sum;
    }


}