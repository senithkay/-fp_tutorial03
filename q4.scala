object q4 extends App {
    def bookPrice(numberOfBooks: Int): Double = numberOfBooks*24.95;

    def discount(bookPrice: Double) : Double = bookPrice*0.4;

    def shippingCost(numberOfBooks: Int): Double = numberOfBooks match {
        case y if y>50 => 50*3 + (numberOfBooks-50)*0.75;
        case _ => numberOfBooks*3;
    }

    def totalCost(numberOfBooks: Int): Double = bookPrice(numberOfBooks) + shippingCost(numberOfBooks) - discount(bookPrice(numberOfBooks));

    print(totalCost(60));
}