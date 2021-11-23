package ExProject.models;

public abstract class Vehicle {
    String ctrlSignal ;
    String productLabel;
    int yearProduct;
    String owner;

    public String getCtrlSignal() {
        return ctrlSignal;
    }

    public void setCtrlSignal(String ctrlSignal) {
        this.ctrlSignal = ctrlSignal;
    }

    public String getProductLabel() {
        return productLabel;
    }

    public void setProductLabel(String productLabel) {
        this.productLabel = productLabel;
    }

    public int getYearProduct() {
        return yearProduct;
    }

    public void setYearProduct(int yearProduct) {
        this.yearProduct = yearProduct;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Vehicle(String ctrlSignal, String productLabel, int yearProduct, String owner) {
        this.ctrlSignal = ctrlSignal;
        this.productLabel = productLabel;
        this.yearProduct = yearProduct;
        this.owner = owner;
    }
}
