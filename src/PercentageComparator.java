import java.util.Comparator;

class PercentageComparator implements Comparator<Student>{
	public int compare(Student stud1, Student stud2) {
		if(stud1.percentage < stud2.percentage)
			return 1;
		return -1;
	}
} 