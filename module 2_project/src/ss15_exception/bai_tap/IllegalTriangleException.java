package ss15_exception.bai_tap;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String s)
    {
        System.out.println(s);
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}
