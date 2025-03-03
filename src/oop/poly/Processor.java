package oop.poly;

public class Processor extends ComputerPart {

    Processor(String partName, int partPrice){
        super(partName, partPrice);
    }

    @Override
    public void describePart() {

        System.out.println("Processor: " + this.partName + ", Price: " + this.partPrice);
    }
}
