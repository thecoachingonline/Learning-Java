public class Main {
    
    public static void main(String[] args) {
        Instance instanceA = new Instance(15, 8, 15, 8, 17);
        Instance instanceB = new Instance(3, 2.598, 3, 3, 3);

        double instanceAArea = instanceA.findArea();
        System.out.println(instanceAArea);
        System.out.println(instanceA.sideLenThree);

        double instanceBArea = instanceB.findArea();
        System.out.println(instanceBArea);
        System.out.println(instanceB.base);

        System.out.println(Instance.numOfSides);
    }
}
