package SEE;
import CIE.Student;
import java.util.*;

public class External extends Student{
public int marks[]=new int[5];
public void setmarks()
{ Scanner scan=new Scanner(System.in);
for(int i=0;i<5;i++)
{marks[i]=scan.nextInt();}
}
}
