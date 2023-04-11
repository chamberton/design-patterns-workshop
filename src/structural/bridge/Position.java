package structural.bridge;

class Position {
    final double x, y, z;

    Position(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("Position: X: %f, Y: %f, Z: %f,", x,y,z);
    }
}