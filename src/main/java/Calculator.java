

public class Calculator {

    public int calculate(String operation, int i, int j) {
        if(operation == "add") {
            return i + j;
        }
        if(operation.equals("substract")) {
            return i - j;
        }

        if(operation.equals("multiply")) {
            return i * j;
        }

        if(operation == "divide") {
            return i / j;
        }

        throw new RuntimeException("Unsupported Operation" + operation);
    }

}
