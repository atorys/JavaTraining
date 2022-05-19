package CityBook.app;

import CityBook.models.City;
import static CityBook.utils.Utility.*;

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Получение списка городов и csv файла и манипуляции с выборкой
 */
public class Main {

    public static ArrayList<City> book;

    /**
     * 1. Парсинг входящих значений
     */
    public static void parsingModule() throws FileNotFoundException {
        book = getList();
    }

    /**
     * 2. Сортировка полученный значений по имени без учета регистра
     * и по федеральному округу с учетом имени
     */
    public static void sortingModule() {
        sortByName(book);
        printer(book);

        sortByDistrictAndName(book);
        printer(book);
    }
    /**
     * 3. Нахождение города с наибольшим количеством жителей
     */
    public static void findMaxPopulationModule() {

        City city = findCityByPopulation(book);

        System.out.println("Город с наибольшим количеством жителей - " + city.getName());
        System.out.println("[" + book.indexOf(city) + "] = " + city.getPopulation());
    }

    public static void main(String[] args) throws FileNotFoundException {

        parsingModule();
//        sortingModule();
        findMaxPopulationModule();
    }
}
