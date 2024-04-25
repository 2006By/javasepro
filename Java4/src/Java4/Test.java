package Java4;
import java.util.Scanner;
import Java4.shape.Circle;
import Java4.shape.Rectangle;
import Java4.shape.Triangle;
public class Test {
    static void resultc(double c1 ,double c2,String a) {
        if(c1>c2)
            System.out.printf("第一个%s的周长大于第二个%s\n",a,a);
        if(c1==c2)
            System.out.printf("第一个%s的周长等于第二个%s\n",a,a);
        if(c1<c2)
            System.out.printf("第一个%s的周长小于第二个%s\n",a,a);
    }
    static void results(double s1,double s2,String a) {
        if(s1>s2)
            System.out.printf("第一个%s的面积大于第二个%s\n",a,a);
        if(s1==s2)
            System.out.printf("第一个%s的面积等于第二个%s\n",a,a);
        if (s1<s2)
            System.out.printf("第一个%s的面积小于第二个%s\n",a,a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("choose the shape which is the one you want calculate it's area and Perimeter:");
        System.out.println("1.Circle\t2.Triangle\t3.Rectangle");
        try {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请输入你想达到的功能序号：");
                    System.out.println("1.calculation 2.compare ");
                    int option=sc.nextInt();
                    switch (option) {
                        case 1:
                            double r;
                            try {
                                System.out.println("请输入半径：");
                                r = sc.nextDouble();
                                shape s = new  Circle(r);
                                System.out.println("the area of the circle is :" + s.getarea() + "\nthe perimeter of the circle is :" + s.getperimeter());
                            } catch (Exception e) {
                                System.out.println("wrong");
                            }
                            break;
                        case 2:
                            double r1,r2;
                            System.out.println("请输入第一个圆的半径：");
                            r1=sc.nextDouble();
                            System.out.println("请输入第二个圆的半径：");
                            r2=sc.nextDouble();
                            shape s=new Circle(r1);
                            double c1=s.getperimeter();
                            double s1=s.getarea();
                            System.out.println("the area of the first circle is :" + s.getarea() + "\nthe perimeter of the circle is :" + s.getperimeter());
                            shape a=new Circle(r2);
                            double c2=a.getperimeter();
                            double s2=a.getarea();
                            System.out.println("the area of the second circle is :" + a.getarea() + "\nthe perimeter of the circle is :" + a.getperimeter());
                            String name="圆";
                            resultc(c1,c2,name);
                            results(s1,s2,name);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("请输入你想达到的功能序号：");
                    System.out.println("1.calculation 2.compare ");
                    int option2=sc.nextInt();
                    switch(option2) {
                        case 1:
                            System.out.println("input a,b,c:");
                            double a, b, c;
                            try {
                                a = sc.nextDouble();
                                b = sc.nextDouble();
                                c = sc.nextDouble();
                                shape s = new Triangle(a, b, c);
                                System.out.println("the area of the triangle is :" + s.getarea()
                                        + "\nthe perimeter of the triangle is :" + s.getperimeter());

                            } catch (Exception e) {
                                System.out.println("wrong");
                            }
                            break;
                        case 2:
                            double e1,e2,e3,e4,e5,e6;
                            System.out.println("请输入第一个三角形的三条边：");
                            e1=sc.nextDouble();
                            e2=sc.nextDouble();
                            e3=sc.nextDouble();
                            System.out.println("请输入第二个三角形的三条边：");
                            e4=sc.nextDouble();
                            e5=sc.nextDouble();
                            e6=sc.nextDouble();
                            shape s=new Triangle(e1,e2,e3);
                            double c1=s.getperimeter();
                            double s1=s.getarea();
                            System.out.println("the area of the first circle is :" + s.getarea() + "\nthe perimeter of the circle is :" + s.getperimeter());
                            shape a1=new Triangle(e4,e5,e6);
                            double c2=a1.getperimeter();
                            double s2=a1.getarea();
                            System.out.println("the area of the second circle is :" + a1.getarea() + "\nthe perimeter of the circle is :" + a1.getperimeter());
                            String name2="三角形";
                            resultc(c1,c2,name2);
                            results(s1,s2,name2);
                            break;
                    }
                    break;
                case 3:
                    System.out.println("请输入你想达到的功能序号：");
                    System.out.println("1.calculation 2.compare ");
                    int option3=sc.nextInt();
                    switch(option3) {
                        case 1:
                            System.out.println("input m,n:");
                            double m, n;
                            try {
                                m = sc.nextDouble();
                                n = sc.nextDouble();
                                shape s = new Rectangle(m, n);
                                System.out.println("the area of the circle is :" + s.getarea()
                                        + "\nthe perimeter of the circle is :" + s.getperimeter());

                            } catch (Exception e) {
                                System.out.println("wrong");
                            }
                            break;
                        case 2:
                            double e1,e2,e3,e4;
                            System.out.println("请输入第一个矩形的两条边：");
                            e1=sc.nextDouble();
                            e2=sc.nextDouble();
                            System.out.println("请输入第二个矩形的两条边：");
                            e3=sc.nextDouble();
                            e4=sc.nextDouble();
                            shape s=new Rectangle(e1,e2);
                            double c1=s.getperimeter();
                            double s1=s.getarea();
                            System.out.println("the area of the first rectangle is :" + s.getarea() + "\nthe perimeter of the rectangle is :" + s.getperimeter());
                            shape a1=new Rectangle(e3,e4);
                            double c2=a1.getperimeter();
                            double s2=a1.getarea();
                            System.out.println("the area of the second rectangle is :" + a1.getarea() + "\nthe perimeter of the rectangle is :" + a1.getperimeter());
                            String name3="矩形";
                            resultc(c1,c2,name3);
                            results(s1,s2,name3);
                            break;

                    }
            }
        }catch (Exception e) {
            System.out.println("please choose a correct number");

            sc.close();
        }
    }
}
