

public class else_if {
    public static void main(String[] args) {
        int age =1;

        if(age>=18){
            System.out.println("Adult");
        }
        else if(age>=13 && age < 18){
            System.out.println("Teenager");
        }

        else{
            System.out.println("Child");
        }


    }
    
}
