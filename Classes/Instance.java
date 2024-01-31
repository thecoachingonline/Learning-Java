public class Instance {
    static int numOfSides = 3;
    double base;
    double height;
    double sideLenOne;
    double sideLenTwo;
    double sideLenThree;
    
    public Instance(double base, double height, double sideLenOne, double sideLenTwo, double sideLenThree) {
        this.base = base;
        this.height = height;
        this.sideLenOne = sideLenOne;
        this.sideLenTwo = sideLenTwo;
        this.sideLenThree = sideLenThree;
    }

    public double findArea() {
        return (this.base * this.height) / 2;
    }
}