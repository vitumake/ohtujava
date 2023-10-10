package module5_3.task2;

public class StringManipulator {
    
    public String concatenate(String s1, String s2) {
        return s1 + s2;
    }

    public int findLenght(String s) {
        return s.length();
    }

    public String convertToUppercase(String s) {
        return s.toUpperCase();
    }

    public String convertToLowerCase(String s) {
        return s.toLowerCase();
    }

    public boolean containsSubString(String s, String sub) {
        return s.contains(sub);
    }
}
