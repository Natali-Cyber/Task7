// Основной класс
public class Main {
    public static void main(String[] args) {
        // Создание легкового автомобиля
        Car sedan = new Car("Toyota Camry", 200, 1500, CarType.SEDAN);

//        sedan.displayInfo(); // Отображение информации о машине
        sedan.startEngine(); // Запуск двигателя
        sedan.drive(); // Вождение
        sedan.turnSteeringWheel(); // Поворот руля
        sedan.stopEngine(); // Остановка двигателя
        sedan.turnSteeringWheel(); // Пробуем повернуть руль, когда двигатель заглушен

        // Создание электромобиля
        Car electricCar = new Car("Tesla Model S", 300, 2000, CarType.ELECTRIC);
        electricCar.startEngine(); // Не выполняется, так как электромобиль
        electricCar.drive(); // Вождение электромобиля
        electricCar.turnSteeringWheel(); // Поворот руля электромобиля
        electricCar.stop(); // Остановка
        electricCar.stopEngine(); // Не применимо

//        testCar(sedan);
    }

//    public static void testCar(Car car) {
//        System.out.printf("Наименование: %s\nл.с.: %d\nвес: %d\nТип: %s%n",
//                car.getName(), car.getPower(), car.getWeight(), car.getType());
//    }
}