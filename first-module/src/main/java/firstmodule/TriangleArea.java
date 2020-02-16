package firstmodule;

public class TriangleArea {
    int a,b,c;
    double p;
    public TriangleArea(int a, int b, int c)
    {
        if(a+b<c || b+c<a || c+a<b)
        {
            throw new IllegalArgumentException("Triangle sides are wrong!");
        }
        else {
            this.a = a;
            this.b = b;
            this.c = c;
            this.p =(this.a+this.b+this.c);
        }
    }
    public double area()
    {
        double halfp= p/2;
        return Math.sqrt(halfp*(halfp-a)*(halfp-b)*(halfp-c));
    }

    public static void main(String[] args) {
        TriangleArea ra = new TriangleArea(3,3,3);
        System.out.println(ra.area());
    }
}
