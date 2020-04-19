public class InterfaceProgram {

    // interface is a class
    public interface Programming{
        String classes = "Programming with Perscholas";
        public void setName(String name);
        public void langLearn();

    }


    // implementing or using interface
    public static class Language implements Programming{
        String name;
        public void setName(String name){
            this.name = name;
        }
        public void langLearn(){
            System.out.println("I am learning " + classes);
            System.out.println("My first language is " + name);
        }
    }



    public static void main(String[] args) {
        Language lang1 = new Language();
        lang1.setName("Java");
        lang1.langLearn();
    }


}
