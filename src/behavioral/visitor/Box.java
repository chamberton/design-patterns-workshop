package behavioral.visitor;

class Box implements Colorable {
    private double width;
    private double height;
    private double length;
   
    public Box(double height, double length, double width)
    {
        this.width=width;
        this.height=height;
        this.length=length;
    }
   
    public double getWidth() 
    {
        return width;
    }
   
    public double getHeight() 
    {
        return height;
    }

    public double getLength() 
    {
        return length;
    }
   
    @Override
    public int accept(ColorPainter visitor) 
    {
        return visitor.visit(this);
    }
   
}