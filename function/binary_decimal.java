public class binary_decimal {


    public static void BinToDec(int BinNum){
        int MyNum = BinNum;
        int pow=0;
        int DecNum=0;
        while(BinNum>0){
            int LastDigit=BinNum%10;
            DecNum=DecNum+(LastDigit*(int)Math.pow(2, pow));
            pow++;
            BinNum=BinNum/10;
        }

        System.out.println("The decimal num of "+ MyNum +" = "+DecNum);

    }
    
    public static void main(String[] args) {
        BinToDec(101);
    }
}
