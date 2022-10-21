public class P49 {
    public static void main(String[] args){
        int [][] test;
        test = new int[2][5];

        test[0][0] = 80;
        test[0][1] = 12;
        test[0][2] = 33;
        test[0][3] = 25;
        test[0][4] = 18;
        test[1][0] = 97;
        test[1][1] = 34;
        test[1][2] = 72;
        test[1][3] = 68;

        for(int i=0;i< test[1].length;i++){
            System.out.println("第"+(i+1)+"個人的國語分數是"+test[0][i]);
            System.out.println("第"+(i+1)+"個人的數學分數是"+test[1][i]);
        }
    }
}
