import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P7 {
    public static void main(String[] args)throws IOException{
        System.out.print("請輸入整數");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());

        if(num == 1){
            System.out.println("輸入的是1");
            System.out.println("選擇的是1");
        }

        System.out.println("結束處理");
    }
}
