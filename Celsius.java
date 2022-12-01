package Task1;

public class Celsius implements Converter {
    private double value = 0.0; // Значение градусов Цельсия по умолчанию

    // Безаргументный конструктор
    public Celsius() {

    }

    // Конструктор, принимающий значение градусов Цельсия
    public Celsius(double value) {
        this.value = value;
    }

    // Метод, получающий новое значение градусов Цельсия
    public void setValue(double value) {
        this.value = value;
    }

    // Метод, который выводит значение градусов Цельсия
    public double getValue() {
        return value;
    }

    /**
     * Конвертирует Цельсия в Фаренгейты
     * @return
     */
    @Override
    public double converterToFahrenheit() {
        return this.value * 9.0 / 5.0 + 32;
    }

    /**
     * Конвертирует Цельсия в Кельвины
     * @return
     */
    @Override
    public double converterToKelvin() {
        return this.value + 273;
    }
}
