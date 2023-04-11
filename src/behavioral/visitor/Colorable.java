package behavioral.visitor;

interface Colorable {
    public double accept(ColorPainter visitor);
}