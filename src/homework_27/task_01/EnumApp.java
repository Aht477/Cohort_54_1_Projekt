package homework_27.task_01;

public class EnumApp {
    public static void main(String[] args) {

        System.out.println("Средняя температура весной: " + Enum.Spring.getAverageTemperature() + " °C");
        System.out.println("Средняя температура летом: " + Enum.Summer.getAverageTemperature() + " °C");
        System.out.println("Средняя температура осенью: " + Enum.Autumn.getAverageTemperature() + " °C");
        System.out.println("Средняя температура зимой: " + Enum.Winter.getAverageTemperature() + " °C");

    }


}


