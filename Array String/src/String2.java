import javax.management.StringValueExp;
import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        String str3 = String.valueOf(2.3); // double -> String 변환
        String str4 = String.valueOf(false); // -> boolean -> String 변환
        System.out.println(str3); //"2.3"
        System.out.println(str4); //"false"

        String str5 = str3.concat(str4);
        System.out.println(str5); // 2.3false
        String str6 = "안녕" + 3; // 안녕3
        String str7 = "안녕". concat(String.valueOf(3)); // 안녕3

        // #4. 문자열 -> byte[] 또는 문자열 -> char[]
        // byte array는 UTF-8 문자를 담는데 이용됨. 한글은 최소 2바이트가 필요
        // 1바이트에 한글이 담기지 않기 때문에 음수로 보이게 됨
        String str8 = "Hello Java!";
        String str9 = "안녕하세요";
        byte[] array1 = str8.getBytes();
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        // toCharArray()
        char[] array3= str8.toCharArray();
        char[] array4= str9.toCharArray();
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(array4));;


    }
}
