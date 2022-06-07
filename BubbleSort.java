import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = in.next();
        char[] ch = str.toCharArray();
        for(int i = 0;i < ch.length - 1;i++ ) {
            for(int j = 0;j < ch.length - 1;j++ ) {
                if((int)ch[j] < (int)ch[j+1]) {
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        String str1 = String.valueOf(ch);
        System.out.println("有序字符串：" + str1);
        int[] text = new int[ch.length];
        for(int i = 0;i < ch.length;i++) {
           text[i] = (int)ch[i];
        }
        System.out.println("ASCII码：" + Arrays.toString(text));
    }
}
