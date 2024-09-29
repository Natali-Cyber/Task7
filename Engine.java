// Класс Engine, представляющий двигатель автомобиля
public class Engine {
    private boolean isRunning;

    // Конструктор
    public Engine() {
        this.isRunning = false;
    }

    // Запуск двигателя
    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Двигатель запущен.");
        } else {
            System.out.println("Двигатель уже работает.");
        }
    }

    // Остановка двигателя
    public void stop() {
        if (isRunning) {
            isRunning = false;
            System.out.println("Двигатель заглушен.");
        } else {
            System.out.println("Двигатель уже заглушен.");
        }
    }

    // Проверка состояния двигателя
    public boolean isRunning() {
        return isRunning;
    }
}