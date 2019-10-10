public class Person{
    private String name;
    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public Person(Mobile mobile) {
        this.mobile = mobile;
    }
}
