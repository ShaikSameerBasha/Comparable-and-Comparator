import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentComparew{
	
	public static void main(String args[]) {
	
		ArrayList<Student> studList = new ArrayList<Student>();
		
		studList.add(new Student("Gouthami", 90.61f));
		studList.add(new Student("Raja", 83.55f));
		studList.add(new Student("Honey", 85.55f));
		studList.add(new Student("Teja", 77.56f));
		studList.add(new Student("Varshith", 80.89f));
		
		Comparator<Student> com = new PercentageComparator();
		
		Collections.sort(studList, com);
		
		System.out.println("Avg % --> Name");
		System.out.println("---------------------");
		for(Student stud:studList) {
			System.out.println(stud.percentage + " --> " + stud.name);
		}		
	}	
}
