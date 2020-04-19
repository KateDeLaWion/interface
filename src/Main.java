public class Main {

    // interface is a class
    public interface Profession{
        public void setName(String name);
        public void teacherType();
    }


    // implementing or using interface
    public static class Teacher implements Profession {
        String name;
        public void setName(String name){
            this.name = name;
        }
        public void teacherType(){
            System.out.println("I am teaching " + name);

        }
    }



    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setName("Database for Java");
        teacher1.teacherType();
    }



}
