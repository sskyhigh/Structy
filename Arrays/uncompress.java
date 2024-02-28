package Arrays;

public class uncompress {
    public static void main(String[] args) {
        System.out.println("Hello world");
        System.out.println(uncompress("2c3a1t"));
    }

    public static String uncompress(String s) {
        // reference string to check if there is a number 
        String numbers = "0123456789";
        String result = "";
        int i = 0, j = 0;
        while (j < s.length()) {
            String character = String.valueOf(s.charAt(j));
            if (numbers.contains(character)) {
                j += 1;
            } else {
                int num = Integer.parseInt(s.substring(i, j));
                result += character.repeat(num);
                // reset 
                j += 1;
                i = j;
            }
        }
        return result;
    }
}
