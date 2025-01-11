public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public double getZ() {
        return z;
    }

    public double getMagnitude(){
        return Math.sqrt((x*x) + (y*y) +(z*z));
    }

    public Vector3D normalize() {
        double magnitude = getMagnitude();
        if (magnitude == 0) {
            throw new IllegalStateException("Magnitude is zero");
        } else {
            return new Vector3D(x / magnitude, y / magnitude, z / magnitude);
        }
    }

    public Vector3D add(Vector3D inputVector){
        return new Vector3D(x + inputVector.getX(), y + inputVector.getY(), z + inputVector.getZ());
    }

    public Vector3D multiply(double multiplier){
        return new Vector3D(x * multiplier, y * multiplier, z * multiplier);

    }

    public Vector3D dotProduct(Vector3D inputVector){
        return new Vector3D(x * inputVector.getX(), y * inputVector.getY(), z * inputVector.getZ());
    }

@Override
    public String toString(){
        return("(" + x + "," + y + "," + "z" + ")");
    }
}