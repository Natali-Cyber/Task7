// Класс Car, представляющий сам автомобиль
public class Car {
    private final String name;
    private final int power; // в л.с.
    private final int weight; // в кг
    private final CarType type;

    private final Engine engine; // композиция
    private final Wheel wheel; // композиция

    // Конструктор
    public Car(String name, int power, int weight, CarType type) {
        this.name = name;
        this.power = power;
        this.weight = weight;
        this.type = type;
        this.engine = new Engine();
        this.wheel = new Wheel();
    }

    // Геттеры
    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getWeight() {
        return weight;
    }

    public CarType getType() {
        return type;
    }

    // Запуск двигателя
    public void startEngine() {
        if (type != CarType.ELECTRIC) {
            engine.start();
        } else {
            System.out.println("Электромобиль не требует запуска двигателя.");
        }
    }

    // Остановка двигателя
    public void stopEngine() {
        if (type != CarType.ELECTRIC && engine.isRunning()) {
            engine.stop();
        } else if (type == CarType.ELECTRIC) {
            System.out.println("Электромобиль не имеет двигателя для остановки.");
        }
    }

    // Вождение
    public void drive() {
        if (type == CarType.ELECTRIC || engine.isRunning()) {
            System.out.println("Машина поехала.");
        } else {
            System.out.println("Сначала заведите двигатель.");
        }
    }

    // Поворот руля автомобиля
    public void turnSteeringWheel() {
        wheel.turn();
    }

    // Остановка автомобиля
    public void stop() {
        System.out.println("Машина остановилась.");
    }

    // Метод для отображения информации о машине
    public void displayInfo() {
        System.out.println("Автомобиль: " + name);
        System.out.println("Мощность: " + power + " л.с.");
        System.out.println("Вес: " + weight + " кг.");
        System.out.println("Тип: " + type);
    }
}