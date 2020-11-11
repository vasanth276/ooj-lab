import java.util.*;
abstract class Shape
{
  int a;
 int b;
Shape(int a,int b)
{this.a=a;
 this.b=b;
}

Shape(int a)
  { this.a=a;
  }
Shape()
{this.a=0;
 this.b=0;
}


void printArea()
{
}
}


class triangle extends Shape
{ triangle(int a,int b)
  {super(a,b);}


void printArea()
{System.out.println("the area of the triangle is = "+ (a*b)/2);
}
}

class rectangle extends Shape
{rectangle(int a,int b)
 {super(a,b);}

 void printArea()
{System.out.println("the area of the rectangle is = "+ (a*b));
}
}

class circle extends Shape
{ circle(int a)
 {super(a);}

 void printArea()
{System.out.println("the area of the circle is = "+ (3.14*a*a));
}
}


class shapes{
public static void main(String args[])
{ Scanner scan = new Scanner(System.in);
int ch,a,b;
 while(true){
  System.out.println("ENTER 1 FOR TRIANGLE");

  System.out.println("ENTER 2 FOR RECTANGLE");

  System.out.println("ENTER 3 FOR CIRCLE");

  System.out.println("ENTER 4 FOR EXIT");

ch = scan.nextInt();
 switch(ch)
{ case 1:System.out.println("enter the base and height of triangle");

          a=scan.nextInt();
          b=scan.nextInt();
          triangle t=new triangle(a,b);
          t.printArea();
          break;

case 2:System.out.println("enter the length and breadth of rectangle");

          a=scan.nextInt();
          b=scan.nextInt();
           rectangle r= new rectangle(a,b);
           r.printArea();
           break;

case 3:System.out.println("enter the radius of the circle");

          a=scan.nextInt();
           circle c = new circle(a);
           c.printArea();
          break;


case 4: scan.close();
         break;

default:System.out.println("invalid input");

}
}






}
}
