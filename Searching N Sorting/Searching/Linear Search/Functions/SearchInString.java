package Searching;

public class SearchInString {
    public static void main(String[] args) {
        String name = "Vaibhav Khandekar";
        char target1 = 'h';
        char target2 = 'e';
        System.out.println(search1(name,target1));
        System.out.println(search2(name,target2));
    }

    static boolean search1(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}
