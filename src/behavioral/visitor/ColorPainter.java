package behavioral.visitor;


interface ColorPainter 
{
    double visit(Box book);
    double visit(Cylinder Cylinder);
}