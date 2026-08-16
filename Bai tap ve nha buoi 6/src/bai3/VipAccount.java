package bai3;

public class VipAccount extends Account{
    private int points;
    public VipAccount(String username, String email, Address address, int points) {
        super(username, email, address);
        this.points = points;
    }
    @Override
    public double getDiscount() {
        if (points >= 1000) {
            return 0.15;
        }
        return 0.10;
    }
    public void addPoints(int point) {
        if (point <= 0) {
            System.out.println("So diem phai lon hon 0!");
            return;
        }
        int oldPoints = points;
        points += point;
        if (oldPoints < 1000 && points >= 1000) {
            System.out.println("Chuc mung tai khoan " + username + " da duoc nang hang VIP!"
            );
        }
    }
    @Override
    public String toString() {
        return "VIP ACCOUNT\n" + super.toString() + "\nPoints: " + points + "\nDiscount: " + (getDiscount() * 100) + "%";
    }
}
