package BuilderDesignPattern1;

public class Helper {
    private String name;
    private String email;
    private int age;
    private String phoneNo;
    private double psp;

    public Helper(String name, String email, int age, String phoneNo, double psp){
        this.name = name;
        this.email= email;
        this.age = age;
        this.phoneNo = phoneNo;
        this.psp = psp;
    }
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public double getPsp() {
        return psp;
    }

}
