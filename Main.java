import java.util.*;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		Student s = new Student();
		StudentGroup sg = new StudentGroup();
		int id, i ;
		String fullName;
		Date birthDate;
		double avgMark;
		System.out.println("how many students do you want enter");
		int n = sc.nextInt();
		for(i=0;i<n;i++){
        System.out.println("enter the details of the Student");
		id = sc.nextInt();
		fullName = sc.next();
		birthDate = sc.next();
		avgMark = sc.next();
		System.out.println("enter your choice 1-filling the details");
		switch(ch)
		{
        case 1:
		s = new Student( id, fullName, birthDate, avgMark);
		sg = new setStudent(fullname, id);
		break;
		case 2:
        System.out.println("adding the student at the first position");
        sg=new addFirst(fullname);
        break;
        case 3:
        System.out.println("adding the student at the last  position");
        sg= new addLast(fullname);
        break;
        case 4:
         System.out.println("adding the student by index");
        sg= new add(fullname,id);
        break;
        case 5:
        System.out.println("remove the student by index");
        sg= new remove(fullname,id);
        break;
        case 6:
        System.out.println("remove the student by name");
        sg= new add(fullname);
        break;
        case 7:
        System.out.println("remove the student by index and ");
        sg= new removeFromIndex(id);
        break;
        case 8:
        System.out.println( "remove from element");
        sg= new removeFromElement(fullname);
        break;
        case 9:
        System.out.println( "removeToIndex");
        sg= new removeToIndex(id);
        break;
        case 10:
        System.out.println( "removeToElement");
        sg= new removeToElement(fullname);
        break;
        case 11:
        System.out.println( "removeToElement");
        sg= new bubbleSort(fullname);
        break;

		}
		}
}
