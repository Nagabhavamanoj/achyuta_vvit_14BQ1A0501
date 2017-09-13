import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int i;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {

		for(i=0;i<lenght;i++)
        {
            return (Student[i]);
        }

		return null;
	}

	@Override
	public void setStudents(Student[] students) {
	    if(Student.lenght==null)
            throws IllegalArgumentException;
	}

	@Override
	public Student getStudent(int index) {
		if(index<0||index>Student.lenght)
            throws IllegalArgumentException;
        }
        else
         {
               return Student[index];
         }

	}

	@Override
	public void setStudent(Student student, int index) {
		if (student == null||(index<0||index>Student.lenght))
        {
         throws IllegalArgumentException;
        }
        else
        {
            for(int i=0;i<Student.lenght;i++)
            {
                if(i==index)
                    Student[fullName]=student;

            }
          }
        }
	}

	@Override
	public void addFirst(Student student) {
		int i,j;
		if (student ==null)
            throws IllegalArgumentException;
        else{
        j=Student.length;
        i=j;
        i++;
        while(i!=1)
        {
            Student[i]=Student[j];
            student[j]='\0';
            i=i-1;j=j-1;
        }
        Student[fullName]=student;
	}
	}
	@Override
	public void addLast(Student student) {
		int i,j;
		if (student ==null)
            throws IllegalArgumentException;
        else
        {
           i=Student.lenght;
           i++;
           Student[fullName]=student;
        }
	}

	@Override
	public void add(Student student, int index) {
	   if (student == null||(index<0||index>Student.lenght))
        {
         throws IllegalArgumentException;
        }
        else
        {
            Student[index]=student;
        }
	}

	@Override
	public void remove(int index) {
		if (student == null||(index<0||index>Student.lenght))
        {
         throws IllegalArgumentException;
        }
        else
        {
           Student[index]='\0';
        }
	}

	@Override
	public void remove(Student student) {
        int i;
        if(student=="null")
            IllegalArgumentException;
        else
        {
        for(i=0;i<Student.lenght;i++)
        {
            if(Student[fullName]==student)
                Student[i]='\o';
        }
        }
	}

	@Override
	public void removeFromIndex(int index) {
		int i;
		if(index<0||index>Student.lenght)
        {
            throws IllegalArgumentException;
        }
        else{
        for(i=0;i<Student.lenght;i++)
        {
            if(i==index)
                Student[i]='\o';
        }
        }
	}

	@Override
	public void removeFromElement(Student student) {
		int i;
		if(student=="null")
            IllegalArgumentException;
        else
        {
            for(i=0;i<Student.length;i++)
            {
              if(Student[fullName]==student)
              {
                  Student[fullName]=="null";
              }
            }
        }
	}

	@Override
	public void removeToIndex(int index) {
		if(index<0||index>Student.lenght)
        {
            throws IllegalArgumentException;
        }
        else{
           for(i=0;i<Student.length;i++)
            {
              if(i==index)
              {
                  i=i+1;
                  j=i;
                  break;
              }
            }
            while(j<Student.lenght)
            {
                Student[j]=="null";
                j++;
            }
        }
	}
	@Override
	public void removeToElement(Student student) {
		if(student=="null")
            IllegalArgumentException;
         else
         {
        for(i=0;i<Student.length;i++)
            {
              if(Student[fullname]==student)
              {
                  i=i+1;
                  j=i;
                  break;
              }
            }
            while(j<Student.lenght)
            {
                Student[j]=="null";
                j++;
            }
         }
	}

	@Override
	public void bubbleSort() {
	    int i,j;
		int n = Student.length;
        int temp = 0;
         for(int i=0; i < n; i++){
                 for(int j=1; j < (n-i); j++){
                          if(Student[j-1] > Student[j]){
                                 //swap elements
                                 temp = Student[j-1];
                                 Student[j-1] = Student[j];
                                 Student[j] = temp;
                         }

                 }
	}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		if (date == null){
	      throws IllegalArgumentException;
		}
       else
          for(int i=0;i<Student.lenght;i++)
         {
             if(Student[birthDate]==date)
             {
                 return(Student[i]);
             }
         }

	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		if (firstDate == null||lastDate == null){
	      throws IllegalArgumentException;
		}
       else
          for(int i=0;i<Student.lenght;i++)
         {
            if(Student[birthDate]>=firstDate)
            {
                if(Student[birthDate]<=lastDate)
                    return(Student[i]);
            }
         }


	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		if (firstDate == null||days == null){
	      throws IllegalArgumentException;
		}
		else
        {
            for(int i=0;i<Student.lenght;i++)
         {
            if(Student[birthDate]>=firstDate)
            {
                int day;
                day=birthDate-firstDate;
                return(Student[i]+" "+day);
            }
        }

	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		if (indexOfStudent == 0)
            throws IllegalArgumentException
		else{
           for(int i=0;i<Student.length;i++)
           {
              if(i == indexOfStudent)
              {
                 Date date = java.time.LocalDate.now();
                 Date date1 = Student[birthDate];
                 int  date2 = date-date1;
                return(date2);
              }
           }
     }

	}

	@Override
	public Student[] getStudentsByAge(int age) {
		if (age == 0)
            throws IllegalArgumentException
		else{
		   for(int i=0;i<Student.length;i++)
           {
              if(i == indexOfStudent)
              {
                 Date date = java.time.LocalDate.now();
                 Date date1 = Student[birthDate];
                 int  date2 = date-date1;
              }
		if(date2==age)
        {
            return(Student[i]);
        }
    }
		}
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		int max
		max=Student[0];
		for(int i = 0; i < Student.lenght; i++)
        {
            if(max < Student[avgMark])
            {
                max = Student[avgMark];
            }
        }

		return max;
	}

	@Override
	public Student getNextStudent(Student student) {
		if(student=="null")
            IllegalArgumentException;
         else
         {
             for(int i=0;i<Student.lenght;i++)
             {
                 if(Student[student]==student)
                 {
                     i=i+1;
                     return(Student[student]);
                     break;
                 }
             }
         }
		return null;
	}
}
