public class Example5 {
    public static void main(String[] args) {
        // 대소문자와 숫자가 혼합된 문자열에서 소문자와 대문자의 갯수를 리턴하는 메서드
        // 숫자는 제외
        // 리턴 형태는 "소문자 갯수 : 대문자 갯수"
        // 대문자 'A'=65 ~ 'Z'=90
        // 소문자 'a'=97 ~ 'z'=122
        String str1 = "aBcDeFgHiJk";
        String str2 = "LmNoPqRsTu";
        String str3 = "VwXyZ1234";
        System.out.println(getCharRatio(str1)); // 6 : 5
        System.out.println(getCharRatio(str2)); // 5 : 5
        System.out.println(getCharRatio(str3)); // 2 : 3
    }
   public static String getCharRatio(String str){
        int a = 0;
        int b = 0;
        char[] c = str.toCharArray();
       for (int i = 0; i < c.length; i++) {
           if (c[i] >= 'A' && 'Z' >= c[i])
               a = a + 1;
           else if ( c[i] >= 'a' && 'z' >= c[i])
               b= b + 1;
           }
       return a + ":" + b;
       }
   }