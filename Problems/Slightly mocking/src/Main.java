class Calculator {
    private CalculatorEngine engine;

    public Calculator(CalculatorEngine engine) {
        this.engine = engine;
    }

    public String divide(int a, int b) {
        // Implement me using engine field
        try {
            return String.format("Division of %d by %d = %d", a, b, this.engine.divide(a, b));
        } catch (ArithmeticException e) {
            return String.format("Division by zero is prohibited");
        }
    }
}