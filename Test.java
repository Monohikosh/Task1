package Task1;

public class Test {
    public static void main(String[] args) {
        // Создаем 3 объекта Celsius
        Celsius celsius = new Celsius(15.5);
        Celsius celsius1 = new Celsius();
        Celsius celsius2 = new Celsius(-10);

        // Конвертируем Цельсия в
        // Фаренгейта и Кельвина для
        // объекта celsius и выводим
        // результат
        System.out.println("Конвертация для celsius: ");
        System.out.println("Цельсия: " + celsius.getValue());
        System.out.println("Фаренгейты: " + celsius.converterToFahrenheit());
        System.out.println("Кельвины: " + celsius.converterToKelvin());
        System.out.println();

        // Конвертируем Цельсия в
        // Фаренгейта и Кельвина для
        // объекта celsius1 и выводим
        // результат
        System.out.println("Конвертация для celsius1: ");
        System.out.println("Цельсия: " + celsius1.getValue());
        System.out.println("Фаренгейты: " + celsius1.converterToFahrenheit());
        System.out.println("Кельвины: " + celsius1.converterToKelvin());
        System.out.println();

        // Конвертируем Цельсия в
        // Фаренгейта и Кельвина для
        // объекта celsius2 и выводим
        // результат
        System.out.println("Конвертация для celsius2: ");
        System.out.println("Цельсия: " + celsius2.getValue());
        System.out.println("Фаренгейты: " + celsius2.converterToFahrenheit());
        System.out.println("Кельвины: " + celsius2.converterToKelvin());
        System.out.println();
    }
}
