//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public static void main(String[] args)
    {

    int vehicleID;
    int i = 200;
    String VehicleMakeModel;
    String VehicleColer;
    Boolean HasTowingPackage;
    int Odometer;
    double price;
    char qualityrating;
    String PhoneNumber;
    String SSN;
    String ZipCode;

    int totalCoins = 137;
    int CoinsPerBag = 20;

    int FullBags = totalCoins / CoinsPerBag;
    int leftover = totalCoins % CoinsPerBag;

    System.out.println("Full bags;" + FullBags);
    System.out.println("Left over;" + leftover);

    {
    double number = 4.3;
    double number1 = number * 2;
    System.out.println("original: " + number);
    System.out.println("Doubled: " + number1);
}
    {
        String name = "Najib";
        int FavNumber = 20;
        System.out.println("My name is " + name + " and my favorite number is " + FavNumber);

    }

    {
    int randomNumber = (int)(Math.random() * 11);
        System.out.println("Random Number: " + randomNumber);
        int NewValue = randomNumber + 5;
        System.out.println("New value: " + NewValue);


    }
}


