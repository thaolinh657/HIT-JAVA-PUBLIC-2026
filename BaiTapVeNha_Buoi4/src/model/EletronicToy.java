package model;

public class EletronicToy extends Toy{
    private int warranty;

    public EletronicToy(String name, String id, double price, int quantity, int warranty) {
        super(name, id, price, quantity);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
    @Override
    public double calculateDiscount(){
        if(getPrice()>500.0){
            return getPrice()*0.05;
        }
        return 0;
    }
    @Override
    public void printInfo (){
        super. printInfo();
        System.out.println("Thoi gian bao hanh: " + warranty +" thang" );
        System.out.println("So tien guoc giam gia: " + calculateDiscount());
    }

}
