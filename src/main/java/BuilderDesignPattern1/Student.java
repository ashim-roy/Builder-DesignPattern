package BuilderDesignPattern1;

public class Student {
    String name;    //many attributes of students
    String email;
    int age;
    String phoneNo;
    double psp;


        // just validating and creating object of student.
    public Student (Helper h) throws Exception{
        if(h.getAge() > 100){   //if age is greater i dont want to create and throw exception
            throw new Exception("Age should be less than 100");
        }
        if(h.getPsp() <0){
            throw new Exception("PSP should be > than 0");
        }
        // if all these validations are passed

        this.age = h.getAge();
        this.email = h.getEmail();
        this.phoneNo = h.getPhoneNo();
        this.name = h.getName();
        this.psp = h.getPsp();
        // passed
        //return new Student(this); // new Student(new StudentBuilder());
    }

}

