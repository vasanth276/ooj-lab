import CIE.*;
import SEE.*;
import java.util.Scanner;
class Democlass{
public static void main(String args[]){
Scanner scan=new Scanner(System.in);
int n,i,j;
String sname;
String usn;
int sem;
System.out.println("enter number of students");
n=scan.nextInt();
scan.nextLine();
Student s[]=new Student[n];
Internals in[]=new Internals[n];
External e[]=new External[n];
for(i=0;i<n;i++)
{
System.out.println("ENTER NAME  ");
sname=scan.nextLine();
System.out.println("ENTER SEMESTER ");
sem=scan.nextInt();
scan.nextLine();

System.out.println("ENTER USN ");
usn=scan.nextLine();

s[i]=new Student(sname,usn,sem);
System.out.println("ENTER INTERNAL MARKS OF 5 SUBJECTS");
in[i]=new Internals();
in[i].setmarks();
System.out.println("ENTER EXTERNAL MARKS OF 5 SUBJECTS");
e[i]=new External();
e[i].setmarks();
}
int fmarks[][]=new int [n][5];
for(i=0;i<n;i++)
for(j=0;j<5;j++)
{fmarks[i][j]=(int)( in[i].marks[j] + ( e[i].marks[j])/2);
}

for(i=0;i<n;i++)
{System.out.println("STUDENT:"+(i+1)+ "  DETAILS ARE ");
 s[i].getdetails();
System.out.println("FINAL MARKS IN 5 SUBJECTS IS");
for(j=0;j<5;j++)
{System.out.println(fmarks[i][j]);
}
}
}}
