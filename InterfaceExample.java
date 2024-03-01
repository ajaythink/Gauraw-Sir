interface GrandPapa {
    void propertyOfGrandPa();
}

interface Father {
    void propertyOfFather();
}

abstract class Son implements GrandPapa {
    public void propertyOfGrandPa() {
        System.out.println("This propery for Father.");
    }

    public void propertyOfFather() {
        System.out.println("\"This property for Son.\"");
    }
}

class Baby extends Son {
    public void propertyOfGrandPa() {
        super.propertyOfGrandPa();
    }

    public void propertyOfFather() {
        super.propertyOfFather();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Baby baby = new Baby();
        baby.propertyOfFather();
        baby.propertyOfGrandPa();

    }
}
