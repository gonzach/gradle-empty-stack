public class Mobile {
    private String name;
    private String color;
    private String brand;
    private String message;

    public mobile(String message){
        this.message = message;
    }

    public call(String message){
        System.out.println("Message: " + message);
    }
}
