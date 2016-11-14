import java.awt.*;

/**
 * Created by Lizzi on 14.11.2016.
 */
public class test {
    public static void main(String[] args) {
        Book.Author author =new Book.Author("Alan","email1",'f');
        Book.Author author2 =new Book.Author("Alan","email1",'f');
        Book.Author author3 =new Book.Author("Alan","email1",'m');
        System.out.println(author.equals(author2));
        System.out.println(author2.equals(author3));
        System.out.println(author.equals(author3));
        Book.Author[] arrayofauthors=new Book.Author[3];
        arrayofauthors[0]=author;
        arrayofauthors[1]=author2;
        arrayofauthors[2]=author3;
        Book book=new Book("sads",arrayofauthors,3);
        Book book1=new Book("sads",arrayofauthors,3);
        Book book2=new Book("sadsdd",arrayofauthors,3);
        System.out.println(book.equals(book1));
        System.out.println(book.equals(book2));
        System.out.println(book2.equals(book1));
        System.out.println(book.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        MyPoint myPoint=new MyPoint(1,2);
        MyPoint myPoint1=new MyPoint(1,3);
        MyPoint myPoint2=new MyPoint(1,2);
        MyPoint myPoint3=new MyPoint(2,2);
        System.out.println(myPoint.equals(myPoint1));
        System.out.println(myPoint.equals(myPoint2));
        System.out.println(myPoint1.equals(myPoint2));
        MyTriangle myTriangle=new MyTriangle(myPoint,myPoint1,myPoint3);
        MyTriangle myTriangle1=new MyTriangle(myPoint,myPoint1,myPoint3);
        MyTriangle myTriangle2=new MyTriangle(myPoint2,myPoint1,myPoint3);
        MyTriangle myTriangle3=new MyTriangle(myPoint1,myPoint2,myPoint3);
        System.out.println(myTriangle.equals(myTriangle1));
        System.out.println(myTriangle2.equals(myTriangle1));
        System.out.println(myTriangle2.equals(myTriangle));
        System.out.println(myTriangle3.equals(myTriangle1));
        Ball ball=new Ball(1,2,3,3,2);
        Ball ball1=new Ball(1,2,3,3,2);
        Ball ball2=new Ball(1,5,3,3,2);
        Ball ball3=new Ball(1,2,3,3,5);
        Ball ball4=new Ball(1,2,3,5,5);
        System.out.println(ball.equals(ball));
        System.out.println(ball.equals(ball1));
        System.out.println(ball.equals(ball2));
        System.out.println(ball.equals(ball3));
        System.out.println(ball.equals(ball4));
        Person person=new Person("dsds","dsds");
        Person person1=new Person("dsds","dsds");
        Person person2=new Person("dsds","fsdfds");
        System.out.println(person.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person.equals(person1));
        System.out.println(person.equals(person2));
        Student student=new Student("dds","dds","dsfds",43,3432);
        Student student1=new Student("dds","dds","dsfds",43,3432);
        Student student2=new Student("dds","dds","dsfds",43,34232);
        System.out.println(student.equals(student1));
        System.out.println(student.equals(student2));
        Staff staff=new Staff("dds","dds","dsfds",43);
        Staff staff1=new Staff("dds","dds","dsfds",43);
        Staff staff2=new Staff("dds","dds","dsfds",433);
        System.out.println(staff.equals(staff1));
        System.out.println(staff.equals(staff2));
        MyDate myDate=new MyDate(2016,11,18);
        System.out.println(myDate);
        MyDate myDate1=new MyDate(2016,11,30);
        myDate1.nextDay();
        System.out.println(myDate1);
        MyDate myDate2=new MyDate(2016,12,31);
        myDate2.nextDay();
        System.out.println(myDate2);
        MyDate myDate3=new MyDate(2017,1,1);
        System.out.println(myDate3.equals(myDate2));
        System.out.println(myDate.equals(myDate1));
        myDate3.previousDay();
        System.out.println(myDate3);
        MovablePoint movablePoint=new MovablePoint(1,3,3,3);
        MovablePoint movablePoint1=new MovablePoint(1,4,3,4);
        MovablePoint movablePoint2=new MovablePoint(1,3,4,4);
        MovableCircle movableCircle=new MovableCircle(1,2,2,2,2);
        System.out.println(movableCircle);
        movableCircle.moveDown();
        System.out.println(movableCircle);
        MovableRectangle movableRectangle=new MovableRectangle(1,2,3,3,1,23);
        System.out.println(movableRectangle);
        movableRectangle.moveRight();
        System.out.println(movableRectangle);

    }
}
