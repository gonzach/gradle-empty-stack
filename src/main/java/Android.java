public class Android extends Mobile {
    @Override
    public void call(String message){
        if ( message.length() >= 100 && message.length() <= 150 ){
            System.out.println("<iPhone> Message cannot be sent");
        } else {
            System.out.println("<Android>Message: " + message);
        }
    }

}
