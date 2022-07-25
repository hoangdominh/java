public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student(){

    }
//  Access Modifier

    //  Public Access Modifier
    /*
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.name = classes;
    }
     */
    void display() {
        System.out.println(name + " " + classes);
    }
//  Private Access Modifier
    /*
    private void setName(String name) {
        this.name = name;
    }

    private void setClasses(String classes) {
        this.name = classes;
    }
     */

//   Default Access Modifier
    /*
     void setName(String name) {
        this.name = name;
    }

     void setClasses(String classes) {
        this.name = classes;
    }
     */

    //   Protected Access Modifier
    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.name = classes;
    }
}
