public class complex
{
    int a, b;

    public complex(){};
    public complex(int av, int bi)
    {
        this.a = av;
        this.b = bi;
    }

    public void plus(int a1, int b1)
    {
        this.a += a1;
        this.b += b1;
    }
    public String getval()
    {
        String val = Integer.toString(this.a) + " + " + Integer.toString(this.b) + "i";
        return val;
    }

    public void sub(int a1, int b1)
    {
        this.a -= a1;
        this.b -= b1;
    }

    public double getModule()
    {
        return Math.sqrt((this.a)^2 + (this.b)^2);
    }

    public double getarg()
    {
        return Math.atan(this.b / this.a);
    }

}
