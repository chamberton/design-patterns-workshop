package behavioral.visitor;


class Cylinder implements Colorable {
    private double radius;
    private double height;
   
    public Cylinder(double height, double radius)
    {
        this.radius=radius;
        this.height=height;
    }
   
    public double getHeight() 
    {
        return height;
    }
   
    public double getRadius() 
    {
        return radius;
    }


    @Override
    public double accept(ColorPainter visitor) 
    {
        return visitor.visit(this);
    }
   
}