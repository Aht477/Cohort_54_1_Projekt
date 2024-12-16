package homework_27.task_01;
/*
Task 1
Реализуйте Enum для определения четырех времен года с методами,
возвращающими среднюю температуру для каждого времени года.
 */

public enum Enum {
    Summer(17.0),
    Autumn(8.0),
    Winter(0.0),
    Spring(9.0);

    private Double averageTemperature;

    Enum(Double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public Double getAverageTemperature() {

        return averageTemperature;
    }

    public void setAverageTemperature(Double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
}
