
public class StudenteController {
	private Studente model;
	   private StudenteView view;

	   public StudenteController(Studente model, StudenteView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setStudentName(String name){
	      model.setName(name);		
	   }

	   public String getStudentName(){
	      return model.getName();		
	   }

	   public void setStudentRollNo(String rollNo){
	      model.setRollNo(rollNo);		
	   }

	   public String getStudentRollNo(){
	      return model.getRollNo();		
	   }

	   public void updateView(){				
	      view.printStudentDetails(model.getName(), model.getRollNo());
	   }	
	}
	

