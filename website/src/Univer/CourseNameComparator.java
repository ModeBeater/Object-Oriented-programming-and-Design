package Univer;
import java.util.Comparator;

public class CourseNameComparator implements Comparator<Course>{

	public int compare(Course c1, Course c2) {
		return c1.getName().compareTo(c2.getName());
	}
	
}
