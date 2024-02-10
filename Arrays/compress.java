package Arrays;

public class compress {
    public static void main(String[] args) {
        //System.out.println("Hello world");
        System.out.println(compress("ccaaatssss")); // print 2c3at4s 
    }

    public static String compress(String s) {
        //String letters = "abcdefghijklmnopqrstuvwxyz";
        s += '!'; 
        String result = "";
        int i = 0, j = 0;
        while (j < s.length()) {
            //String characters = String.valueOf(s.charAt(j));
            if (s.charAt(i)==s.charAt(j)) {
                ++j;
            } else {
                // if there is one character, just print the character
                int number = j - i;
                if(number > 1){
                    result += "" + number + s.charAt(i);
                }
                // gives us sum
                else{
                    result += "" + s.charAt(i);
                }
                // move the index
                i = j;
            }
        }
        return result;
    }
}
