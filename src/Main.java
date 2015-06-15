
public class Main {

	static ArrayStack Students=new ArrayStack();

	public static void main (String[] args){
	    
	    ArrayStack Students=new ArrayStack();
	    showMainMenu(false);
	}

	    public static void Execute (int opt){
	    switch(opt){
	    
	    
	   
	        case(1): 
	            System.out.println("First Name");
	            String FN=UserInput.getString();
	            System.out.println("Last Name");
	            String LN=UserInput.getString();
	            System.out.println("AM:");
	            int AM=UserInput.getInteger();
	            System.out.println("Age:");
	            double Age=UserInput.getDouble();
	            System.out.println("Sex:");
	            char S=UserInput.getChar();
	            System.out.println("Absences");
	            int Abs=UserInput.getInteger();
	            System.out.println("Grade");
	            double Grade=UserInput.getDouble();
	            Student Stu=new Student(FN,LN,AM,Age,S,Abs,Grade);
	            Students.push((Object)Stu);
	            showMainMenu(true);
	            break;
	        case(2):
	            Student tempStu=(Student)Students.top();
	            System.out.println(tempStu.getFirst_Name()+"," +tempStu.getLast_Name()+", "+tempStu.getAM() );
	            showMainMenu(true);
	            break;
	        case(3):
	            Student temp=(Student)Students.pop();
	            System.out.println("Delete: "+temp.getFirst_Name()+"," +temp.getLast_Name()+", "+temp.getAM()+"? (y/n)" );
	            char o=UserInput.getChar();
	            switch(o){
	                case('y'):
	                    System.out.println("Succesfull deletion");
	                    showMainMenu(true);
	                    break;
	                case('n'):
	                    Students.push((Object)temp);}
	                    showMainMenu(true);
	                    break;
	        case(4):
	            System.out.println(Students.size());
	                    showMainMenu(true);
	                    break;
	                    }

	}

	 private static void  showMainMenu (boolean pause) {
	if (pause){
	    System.out.println("Press enter to return to Main Menu");
	    UserInput.getString();}
	System.out.println("");
	        System.out.println("             MENU                           ");
	        System.out.println("   1.Insert Student                         ");
	        System.out.println("   2.Show Last Entry                        ");
	        System.out.println("   3.Delete Last Entry                      ");
	        System.out.println("   4.Number of Registered Students          ");
	        System.out.println("   5.Quit                                   ");
	        System.out.println("         ");
	        System.out.println("                    Επιλέξτε 1-5      ");

	         Execute(UserInput.getInteger());

	}

}
