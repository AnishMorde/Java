public class greeting {
    static void greet(){
        System.out.println("Hello,Anish");

    }
        
  public static String msg(String name ){
    String newMsg = "HELLO" + name;
    return newMsg;
  }






    public static void main(String[] args) {
        greet();
        String print  = msg( "Anish");
        System.out.println(print);
    
    }
}
