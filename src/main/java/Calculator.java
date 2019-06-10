

public class Calculator {

    public int calculate(String operation, int i, int j) {
        if(operation.equals("add")) {
            return i + j;
        }
        if(operation.equals("substract")) {
            return i - j;
        }
        if (operation.equals("divide")) {
            return divide(i, j);
        }
        if(operation.equals("multiply")) {
        	return i*j;
        }

        throw new RuntimeException("Unsupported Operation" + operation);
    }

    private int divide(int leftNum, int rightNum) {
        if (rightNum == 0) {
            throw new RuntimeException("Error!");
        }

        return leftNum / rightNum;
    }

}
