public class MvcPatternDemo {
   public static void main(String[] args) {

      //fetch student record based on his roll no from the database
      Studente model  = retriveStudentFromDatabase();

      //Create a view : to write student details on console
      StudenteView view = new StudenteView();

      StudenteController controller = new StudenteController(model, view);

      controller.updateView();

      //update model data
      controller.setStudentName("John");

      controller.updateView();
   }

   private static Studente retriveStudentFromDatabase(){
      Studente student = new Studente();
      student.setName("Robert");
      student.setRollNo("10");
      return student;
   }
}
