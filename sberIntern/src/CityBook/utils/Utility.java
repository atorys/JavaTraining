package CityBook.utils;

import CityBook.app.Main;
import CityBook.models.City;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Utility {

    public static String file = "/resources/city_ru.csv";
    public static String delimiter = ";";

    public static void  sortByName(ArrayList<City> list) {
        list.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
    }

    public static void  sortByDistrictAndName(ArrayList<City> list) {
        list.sort(Comparator.comparing(City::getDistrict).thenComparing(City::getName));
    }

    public static City  findCityByPopulation(ArrayList<City> list) {
        int index = 0;

        for (City city : list) {
            if (city.getPopulation() > list.get(0).getPopulation()) {
                index = list.indexOf(city);
            }
        }

        return list.get(index);
    }



    public static ArrayList<City> getList() throws FileNotFoundException {

        Scanner in = new Scanner(new File(Objects.requireNonNull(Main.class.getResource(file)).getPath()));
        ArrayList<City> book = new ArrayList<>();
        while (in.hasNext()) {
            book.add(getCity(in.nextLine()));
        }
        in.close();
        return book;
    }

    private static City getCity(String line) {
        Scanner input = new Scanner(line);
        input.useDelimiter(delimiter);
        input.skip("\\d*");

        City city = new City(null, null, null, 0, null);

        city.setName(input.next());
        city.setRegion(input.next());
        city.setDistrict(input.next());
        city.setPopulation(input.nextInt());
        if (input.hasNext()) {
            city.setFoundation(input.next());
        }
        input.close();

        return (city);
    }

    public static void  printer(ArrayList<City> list) {
        for (City city :list) {
            System.out.println(city);
        }
    }
}
