public class ArithemeticE {
    public static void main(String[] args) {
        try{
            int num1= 45;
            int num2=0;
            int div= num1/num2;
            System.out.println("Result"+ div);


        }
        catch (ArithmeticException ae)
        {
            System.out.println("Arithmetic Exception");
        }
        System.out.println("After");
    }
}