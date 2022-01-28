package MultiThreading;

    public class egException extends Exception{
        String str1;
        egException(String str2) {
            str1=str2;
        }
        public String toString(){
            return ("Exception Occurred: "+str1) ;
        }
        public static void main(String args[]){
            try{
                System.out.println("Starting try block");
                // I'm throwing the custom exception using throw
                throw new egException(" error Message");
            }
            catch(egException exp){
                System.out.println("Catch Block") ;
                System.out.println(exp) ;
            }
        }
}
