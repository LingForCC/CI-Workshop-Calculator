

public class Calculator {

    public int calculate(String operation, int i, int j) {
        if (operation == "add") {
            return i + j;
        }
        if (operation.equals("substract")) {
            return i - j;
        }

        if (operation.equals("divide")) {
            if (j != 0) {
                return i / j;
            }
            throw new IllegalArgumentException("j should not be 0");
        }

        throw new RuntimeException("Unsupported Operation" + operation);
    }

}
