package ExProject;

public class VehicleException extends Exception {
    public VehicleException(String message) {
    }
    @Override
    public String getMessage() {
        return "Biển kiểm soát không tồn tại.";
    }
    @Override
    public void printStackTrace() {
        System.out.println("Biển kiểm soát không tồn tại.");
    }
}
