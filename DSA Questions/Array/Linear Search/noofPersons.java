public class noofPersons {

    
        public static int countSeniors(String[] details) {
    
            int count=0;
            for(int i=0;i<details.length;i++){
                System.out.println(String.valueOf(details[i].charAt(11)) + String.valueOf(details[i].charAt(12)) );
                System.out.println( );

            }
               
    
            return count;
            
        }

        

    
    
    public static void main(String[] args) {

        String[]details = {"9699658060M7522","9699658060M7522","9699658060M7522"};
       System.out.println( countSeniors(details));
        
    }
}
