public class Main {
    public static void main(String[] args) {
        System.out.println(isConstantName("WER_IST_DAS"));
        ;
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


    public static boolean isConstantName(String name){
        String firstChar = String.valueOf(name.charAt(0));
        if (!containsOnlyChars(firstChar,"QWERTZUIOPASDFGHJKLYXCVBNMÜ")) {
            return false;
        }
        if(!containsOnlyChars(name,"ABCDEFGHIJKLMNOPQRSTUVWXYZÜÄÖ_1234567890")){
            return false;
        }
        return true;
    }

    public static boolean isMethodName(String name){
        String firstChar = String.valueOf(name.charAt(0));
        if (!containsOnlyChars(firstChar,"abcdefghijklmnopqrstuvwxyz")) {
            return false;
        }
        if(!containsOnlyChars(name,"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdeffghijklmnopqrstuvwxyz_1234567890")){
            return false;
        }
        return true;
    }



}