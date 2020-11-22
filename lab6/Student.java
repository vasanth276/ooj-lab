package CIE;
import java.util.*;
public class Student{
String name,usn;
int sem;
public Student(String name,String usn,int sem)
{this.name=name;
this.usn=usn;
this.sem=sem;
}
public Student()
{this.name="null";
this.usn="null";
this.sem=0;
}


public void getdetails()
{System.out.println("STUDENT NAME :"+ this.name);
System.out.println("STUDENT USN :"+ this.usn);
System.out.println("CURRENT SEM :"+ this.sem);
}
}
