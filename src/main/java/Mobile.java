public class Mobile {
    private String name;
    private String color;
    private String brand;
    private int message_limit = 5;

    public int getMessage_limit() {
        return message_limit;
    }

    public void setMessage_limit(int message_limit) {
        this.message_limit = message_limit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void call(String message){
        System.out.println("Message: " + message);
    }

    public void PrintInfo(){
        System.out.print("name: "+ name + ", color: " + color + ", brand: " + brand);
    }


}
