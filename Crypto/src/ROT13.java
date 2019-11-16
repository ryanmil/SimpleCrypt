import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {
    int diff;

    public ROT13(Character cs, Character cf) {
        diff = (cf - cs);
    }

    public ROT13() {
        diff = 13;
    }


    public String crypt(String text) throws UnsupportedOperationException {
        String rotated = "";
        for (Character c : text.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                int code = c - diff;
                if (Character.isUpperCase(c)) {
                    if (code < 'A') {
                        code = (1 + 'Z') - ('A' - code);
                    }
                } else {
                    if (code < 'a') {
                        code = (1 + 'z') - ('a' - code);
                    }
                }
                rotated += (char) code;
            } else {
                rotated += c;
            }
        }
        System.out.println(rotated);
        return rotated;
    }



    public String encrypt(String text) {
        String rotated = "";
        for (Character c : text.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                int code = c - diff;
                if (Character.isUpperCase(c)) {
                    if (code < 'A') {
                        code = (1 + 'Z') - ('A' - code);
                    }
                } else {
                    if (code < 'a') {
                        code = (1 + 'z') - ('a' - code);
                    }
                }
                rotated += (char) code;
            } else {
                rotated += c;
            }
        }
        System.out.println(rotated);
        return rotated;
    }

    public String decrypt(String text) {
        String rotated = "";
        for (Character c : text.toCharArray()) {
            if(Character.isAlphabetic(c)) {
                int code = c + diff;
                if (Character.isUpperCase(c)) {
                    if (code > 'Z') {
                        code = ('A' - 1) + (code - 'Z');
                    }
                } else {
                    if (code > 'z') {
                        code = ('a' - 1) + (code - 'z');
                    }
                }
                rotated += (char) code;
            } else {
                rotated += c;
            }
        }
        System.out.println(rotated);
        return rotated;
    }

    public static String rotate(String s, Character c) {
        int index = 0;
        for (; index < s.length(); index++) {
            if(s.charAt(index) == c) {
                break;
            }
        }

        String rotated = "";
        for (int j = 0; j < s.length(); j++, index++) {
            if (index >= s.length()) {
                index = 0;
            }
            rotated += s.charAt(index);
        }
        return rotated;
    }

}
