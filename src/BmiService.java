public class BmiService {
    public int calculate(double weight, double height) {
        double index = weight / (height * height); // Расчет BMI по формуле
        return (int) index; // Преобразование результата в целое число
    }
}