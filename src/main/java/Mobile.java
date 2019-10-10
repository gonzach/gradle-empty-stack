public abstract class Mobile {
    private String name;
    private String color;
    private String brand;
    private String message;

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

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void call(String message){
        System.out.println("Message: " + message);
    }

    public void PrintInfo(){
        System.out.print("name: "+ name + ", color: " + color + ", brand: " + brand);
    }


}
