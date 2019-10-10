public class Android extends Mobile {
    @Override
    public void call(String message){
        if ( message.length() > getMessage_limit()){
            System.out.println("<iPhone> Message cannot be sent");
        } else {
            System.out.println("<Android>Message: " + message);
        }
    }

}
