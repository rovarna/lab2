class Formula {
    private Double sum = 0.0; // Внутренняя сумма

    // Метод для расчета формулы 1
    public Double calculate1(Double x, Double y, Double z) {
        return Math.pow(Math.cos(Math.exp(x))+Math.pow(Math.log(1+y),2)+Math.sqrt(Math.exp(Math.cos(x))+Math.pow(Math.sin(Math.PI*z),2))+Math.sqrt(1/x)+Math.cos(Math.pow(y,2)),Math.sin(z));
    }

    // Метод для расчета формулы 2
    public Double calculate2(Double x, Double y, Double z) {
        return (Math.pow(1+Math.pow(x,2),1/y))/Math.exp(Math.sin(z) + x);
    }

    // Метод для добавления значения к сумме
    public void addToSum(Double value) {
        sum += value;
    }

    // Метод для сброса суммы
    public void resetSum() {
        sum = 0.0;
    }

    // Метод для получения текущего значения суммы
    public Double getSum() {
        return sum;
    }
}