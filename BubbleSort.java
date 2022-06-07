import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = in.next();
        char[] ch = str.toCharArray();
        for(int i = 0;i < ch.length - 1;i++ ){
            for(int j = 0;j < ch.length - 1;j++ ){
                if((int)ch[j] < (int)ch[j+1]){
                    char temp = ch[j];
                    ch[j] = ch[j+1];
                    ch[j+1] = temp;
                }
            }
        }
        String str1 = String.valueOf(ch);
        System.out.println(str1);
    }
}
