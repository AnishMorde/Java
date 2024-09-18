public class dec_bin {

    public static void DecToBin(int DecNum){
        int pow=0;
        int Bin = 0;
        while(DecNum>0){
            int remainder = DecNum%2;
            Bin= Bin+(remainder*(int)Math.pow(10, pow));
            pow++;
            DecNum=DecNum/2;



        }

        System.out.println(Bin);
    }
    public static void main(String[] args) {
        DecToBin(10);
    }
}
