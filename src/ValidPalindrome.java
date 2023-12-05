public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        String newString = s.replace("[^a-z0-9]", "");
        System.out.println(newString);

        Integer end = newString.length() - 1; //start at end of the word
        System.out.println(end);
        for (int i = 0; i < newString.length() / 2; i++) {
             if (Character.toLowerCase(newString.charAt(i)) != Character.toLowerCase(newString.charAt(end))) {
                return false;
            } else {
                end--;
            }
        } 
        return true;
    }
}
