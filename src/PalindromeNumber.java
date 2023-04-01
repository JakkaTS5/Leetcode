public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber test = new PalindromeNumber();
        System.out.println(test.isPalindrome(121));
    }

    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
      for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) != s.charAt(s.length()- 1 -j))
            return false;
        } 
        return true;
    }
}
