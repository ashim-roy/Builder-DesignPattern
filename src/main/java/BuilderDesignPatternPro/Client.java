package BuilderDesignPatternPro;

public class Client {
    public static void main(String[] args) throws Exception{

//        Student.StudentBuilder h = Student.getBuilder();
//
//       h.setName("ashim");
//       h.setName("abcd");

        Student s  = Student.getBuilder().setName("Yash")
                                    .setAge(77)
                                    .setEmail("yash@gmail.com")
                                     .setPhoneNo("123-456-7890")
                                      .setPsp(3.5).setNestedStudent(new NestedStudent()).build();

       // System.out.println(s);

        //client creates object..
      //  Student ss = new Student();

    }
}
