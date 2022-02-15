import java.util.*;

class Student{

	String name;
	float percentage;
	
	Student(String name, float percentage){
		this.name = name;
		this.percentage = percentage;
	}
	
}

class PercentageComparator implements Comparator<Student>{
	public int compare(Student stud1, Student stud2) {
		if(stud1.percentage < stud2.percentage)
			return 1;
		return -1;
	}
}

public class StudentCompare{
	
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
