package seminar6_Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        
        HashMap <String, Laptop> lapShop = new HashMap<>();


        Laptop notebook1 = new Laptop("A100500", "Acer", 8, 1024,  "Intel 4.1 GHz", "Windows", 13, 50, 50000, 3.8);
        lapShop.put("Notebook1", notebook1);
       
        Laptop notebook2 = new Laptop("HP12344", "HP", 16, 2048, "AMD 3.6 GHz", "Windows", 15, 6, 40000, 4.1);
        lapShop.put("Notebook2", notebook2);

        Laptop notebook3 = new Laptop("LV1558", "Lenovo", 16, 1024, "Intel 3.6 GHz", "Нет", 13, 15, 38000, 3.9);
        lapShop.put("Notebook3", notebook3);

        HashMap <String, Laptop> selection = SearchLaptops(lapShop);

       System.out.println("ТМ\tМодель\tОЗУ MB\tHDD MB\tПроцессор\tОС\tМонитор\tЦена руб.\tКоличество\tРейтинг");

        for (Map.Entry <String, Laptop> item:selection.entrySet()) {
            System.out.println(item.getValue().toString());
        }

        
     //   System.out.println(notebook1.getMemory());
    }

    private static HashMap <String, Laptop> SearchLaptops( HashMap <String, Laptop> lapShop) {
        Scanner myScanner = new Scanner(System.in, "Cp866");
        HashMap <String, Laptop> search = new HashMap<>();
        System.out.println("Выберите параметр фильтрации: ");
        System.out.println("1 - Модель\n2 - Торговая марка\n3 - Операционая система\n4 - Процессор\n5 - HDD\n6 - ОЗУ\n7 - Диагональ монитора\n8 - Цена\n");       
        int action = myScanner.nextInt();
        myScanner.nextLine();
        if (action > 0 && action < 5){
            System.out.print("Введите значение для поиска: ");
            String searchText = myScanner.nextLine();
            for (Map.Entry <String, Laptop> item:lapShop.entrySet()) {
                switch(action){
                    case 1:
                        if (item.getValue().model.contains(searchText))
                            search.put(item.getKey(), item.getValue());        
                        break;
                    case 2: 
                        if (item.getValue().tradeMark.contains(searchText))
                            search.put(item.getKey(), item.getValue());
                        break;
                    case 3: 
                        if (item.getValue().operatingSystem.contains(searchText))
                            search.put(item.getKey(), item.getValue());
                        break;
                    case 4: 
                        if (item.getValue().processor.contains(searchText))
                            search.put(item.getKey(), item.getValue());
                        break;
                }
            }
        }
        else if (action > 4 && action < 9){
            System.out.print("Введите минимальное значение: ");
            int minValue = myScanner.nextInt();
            myScanner.nextLine(); System.out.print("Введите максимальное значение: ");
            int maxValue = myScanner.nextInt();
            myScanner.nextLine();
            for (Map.Entry <String, Laptop> item:lapShop.entrySet()) {
                switch(action){
                    case 5:
                        if (item.getValue().hardDisk >= minValue && item.getValue().hardDisk <= maxValue)
                            search.put(item.getKey(), item.getValue());        
                        break;
                    case 6:
                        if (item.getValue().memory >= minValue && item.getValue().memory <= maxValue)
                            search.put(item.getKey(), item.getValue());        
                        break;
                    case 7:
                        if (item.getValue().monitor >= minValue && item.getValue().monitor <= maxValue)
                            search.put(item.getKey(), item.getValue());        
                        break;
                    case 8:
                        if (item.getValue().price >= minValue && item.getValue().price <= maxValue)
                            search.put(item.getKey(), item.getValue());        
                        break;                   
                }            
            }
        }
        else System.out.println("Введено некорректное значение");
        myScanner.close();
        return search;       
    }

}
