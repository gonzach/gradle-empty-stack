public class iPhone extends Mobile {
    @Override
    public void Call(String message){
        System.out.println("<iPhone>Message: " + super.message);
    }

}
