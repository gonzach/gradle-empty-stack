public class iPhone extends Mobile {
    @Override
    public void call(String message){
        if (  message.length() >= 200 && message.length() <= 250 ){
            System.out.println("<iPhone> Message cannot be sent");
        } else {
            System.out.println("<iPhone>Message: " + message);
        }
    }

}
