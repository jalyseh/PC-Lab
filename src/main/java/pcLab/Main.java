package pcLab;

public class Main {

    public static void main(String[] args) {
        Dimensions newDim = new Dimensions(1,2,3);
        Case caseA = new Case("Basic","Antec","ATX2",newDim);

        Motherboard motherboardA = new Motherboard("Advanced","ATX",3,4,"AMBIOS");

        Resolution newRes = new Resolution(1,2);
        Monitor monitorA = new Monitor(newRes,"Basic","Antec");

        PC pc = new PC(caseA,motherboardA,monitorA);
        pc.description();
        System.out.println();
        pc.powerUp();



    }
}


