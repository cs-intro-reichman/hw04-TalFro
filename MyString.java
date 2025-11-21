public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String x = str.toLowerCase();
        return x;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
       char [] S1 = new char[str1.length()];
        char [] S2 = new char[str2.length()];

        for(int i = 0; i < str1.length() ; i++){
            S1[i] = str1.charAt(i);
        }

        for(int i = 0; i < str2.length() ; i++){
            S2[i] = str2.charAt(i);
        }

        int x = 0;
        for(int i = 0; i < S1.length; i++){
            if(S1[i] == S2[0]){
                x = i;
                break;
            }
        }

        for(int i = 0 ; i < S2.length ; i++){
            if(S1[x] != S2[i]){
                return false;
            }
            x++;
        }


        return true;
    }
}
