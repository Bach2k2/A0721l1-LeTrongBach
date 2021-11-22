package FURAMA_RESORT_PROJECT.models;

public class Contract {
    static int increseValue=0;
    int bookingCode;
    int contractNum;
    double moneyPay;
    double total;
    int MKH;

    public Contract() {
    }

    public Contract(int bookingCode, double moneyPay, double total, int MKH) {
        this.contractNum = ++increseValue;
        this.bookingCode = bookingCode;
        this.moneyPay = moneyPay;
        this.total = total;
        this.MKH = MKH;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getContractNum() {
        return contractNum;
    }

    public void setContractNum(int contractNum) {
        this.contractNum = contractNum;
    }

    public double getMoneyPay() {
        return moneyPay;
    }

    public void setMoneyPay(double moneyPay) {
        this.moneyPay = moneyPay;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getMKH() {
        return MKH;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "bookingCode=" + bookingCode +
                ", contractNum=" + contractNum +
                ", moneyPay=" + moneyPay +
                ", total=" + total +
                ", MKH=" + MKH +
                '}';
    }

    public void setMKH(int MKH) {
        this.MKH = MKH;
    }
}
