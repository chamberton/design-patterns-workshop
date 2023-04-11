package behavioral.visitor;


class MultiLayerMatColorPainter implements ColorPainter
{

    private final double WEIGHT_IN_KG_PER_UNIT_AREA = 20;//
    private final int numberOfLayers;//
    private final String color;

    MultiLayerMatColorPainter(int numberOfLayers, String color) {
        this.numberOfLayers = numberOfLayers;
        this.color = color;
    }

    private double applyColor(double area) {
         //apply 2layer on surface discount if book price is greater than 50
        double totalColorWeight = area * WEIGHT_IN_KG_PER_UNIT_AREA * numberOfLayers;
        System.out.println("Color used: "+ color + "\nQuantity(kg) : " + totalColorWeight);
        return totalColorWeight;
    }

    @Override
    public double visit(Box box)
    {
        double totalArea=box.getHeight() * box.getLength() * box.getWidth();
        double totalColorWeight = applyColor(totalArea);
        System.out.println("Color used: "+ color + "\nQuantity(kg) : " + totalColorWeight);
        return totalColorWeight;
    }
   
    @Override
    public double visit(Cylinder cylinder) 
    {
        double totalArea=cylinder.getHeight() * Math.pow(cylinder.getRadius(), 2);
       
        double totalColorWeight = applyColor(totalArea);
        System.out.println("Color used: "+ color + "\nQuantity(kg) : " + totalColorWeight);
        return totalColorWeight;
    }

   
}
  