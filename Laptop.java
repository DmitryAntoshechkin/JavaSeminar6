// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
// NoteBook notebook1 = new NoteBook
// NoteBook notebook2 = new NoteBook
// NoteBook notebook3 = new NoteBook
// NoteBook notebook4 = new NoteBook
// NoteBook notebook5 = new NoteBook

// Например: “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет

// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.

// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

// Класс сделать в отдельном файле

// приветствие
// Выбор параметра
// выбор конкретнее
// вывод подходящих

package seminar6_Homework;

public class Laptop {
    String model;
    String tradeMark;
    int memory;
    int hardDisk;
    String processor;
    String operatingSystem;
    double monitor;
    int quantity;
    int price;
    double rating;

    public Laptop(String model, String tradeMark, int memory, int hardDisk, String processor, String operatingSystem, double monitor, int quantity, int price, double rating) {
        this.tradeMark = tradeMark;
        this.model = model;
        this.memory = memory;
        this.hardDisk = hardDisk;
        this.processor = processor;
        this.operatingSystem = operatingSystem;
        this.monitor = monitor;
        this.quantity = quantity;
        this.price = price;
        this.rating = rating;
    }
    public String getModel() {
        return model;
    }
    public String getTradeMark() {
        return tradeMark;
    }
    public int getMemory() {
        return memory;
    }
    public int getHardDisk() {
        return hardDisk;
    }
    public String getProcessor() {
        return processor;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public double getMonitor() {
        return monitor;
    }
    public int getPrice() {
        return price;
    }public int getQuantity() {
        return quantity;
    }
    public double getRating() {
        return rating;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        String s = this.tradeMark+"\t"+model+"\t"+memory+"\t"+hardDisk+"\t"+processor+"\t"+operatingSystem+"\t"+monitor+"\t"+price+"\t\t"+quantity+"\t\t"+rating;
        return s;
    }
}

 
