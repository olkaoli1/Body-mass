public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService(); // Создаем объект класса BmiService

        double weight = 98; // Вес в килограммах
        double height = 1.87; // Рост в метрах

        int bmi = service.calculate(weight, height); // Вызываем метод calculate и передаем вес и рост

        System.out.println("Индекс массы тела (BMI): " + bmi); // Выводим результат на экран
    }
}