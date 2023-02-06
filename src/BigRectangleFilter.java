public class BigRectangleFilter implements Filter{
    private double perimeterSize;

    public double getPerimeterSize() {
        return perimeterSize;
    }

    public void setPerimeterSize(double perimeterSize) {
        this.perimeterSize = perimeterSize;
    }

    @Override
    public boolean accept(Object x) {
        perimeterSize = (double) x;
        if (perimeterSize > 10) {
            return true;
        }else{
            return false;
        }
    }
}
