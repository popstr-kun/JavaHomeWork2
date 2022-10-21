public class P41 {
    public static void main(String[] args){
        int[] test;
        test = new int[5];

        test[0] = 80;
        test[1] = 3;
        test[2] = 55;
        test[3] = 12;
        test[4] = 75;

        test[99] = 4324;

        for(int i=0 ;i<5;i++){
            System.out.println("第"+(i+1)+"個人的分數是"+test[i]+"分");
        }
    }
}
