class Animal{      // Question 2
    private String name;
    private String type;
    private String color;
    public void settype(String a)
    {
        type=a;
    }
    public void setcolor(String a)
    {
        color=a;
    }
    public void setname(String a)
    {
        name=a;
    }
    public String getname()
    {
        return this.name;
    }
    public String getcolor()
    {
        return this.color;
    }
    public String gettype()
    {
        return this.type;
    }

}
class Area{   // Question 1
    void calculate(float x)
    {
        System.out.println("The area of the square is "+ Math.pow(x,2));
    }
    void calculate(float x, float y)
    {
        System.out.println("The area of the rectangle is "+ x*y);
    }
    void calculate(double x)
    {
        double y = 3.14*x*x;
        System.out.println("The area of the circle is "+ y);
    }
    void calculate(double h, double b)
    {
        double ans = (h*b)/2;
        System.out.println("The area of the triangle is "+ ans);

    }
}
public class Oops {

    public static void main(String[] args) {
        Area ar = new Area();
        ar.calculate(6);
        ar.calculate(6,7);
        ar.calculate(8.0);
        ar.calculate(8.0,8.0);
        Animal a= new Animal();
        a.setcolor("black");
        System.out.println(a.getcolor());
        a.settype("horse");
        System.out.println(a.gettype());
        a.setname("Tyson");
        System.out.println(a.getname());

    }
}