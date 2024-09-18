

public class tax {
    public static void main(String[] args) {
        int income=10000000;
        int tax;
        if(income<500000){
            tax=0;

        }

        else if (income>=500000 && income<10000000)
        {
            tax=(int) (income*0.20);
        }

        else {
            tax=(int) (income*0.20);
        }
            System.out.println("The tax is "+ tax);


        }

    }
    

