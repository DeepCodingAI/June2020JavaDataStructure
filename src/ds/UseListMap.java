package ds;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class UseListMap {
    public static void main(String[] args) {
        List<String> cityOfUSA = new ArrayList<String>();
        cityOfUSA.add("NY");
        cityOfUSA.add("CA");
        cityOfUSA.add("AZ");
        cityOfUSA.add("FL");

        List<String> cityOfCanada = new ArrayList<String>();
        cityOfCanada.add("Montreal");
        cityOfCanada.add("Toronto");
        cityOfCanada.add("Alberta");

        List<String> cityOfUK = new ArrayList<String>();
        cityOfUK.add("London");
        cityOfUK.add("Manchester");
        cityOfUK.add("Scotland");

        List<String> cityOfBangladesh = new ArrayList<String>();
        cityOfBangladesh.add("Dhaka");
        cityOfBangladesh.add("Cumilla");
        cityOfBangladesh.add("Barisal");

        Map<String, List<String>> cities = new LinkedHashMap<String,List<String>>();
        cities.put("USA",cityOfUSA);
        cities.put("UK", cityOfUK);
        cities.put("Canada",cityOfCanada);
        cities.put("Bangladesh", cityOfBangladesh);

        for(Map.Entry<String,List<String>> city:cities.entrySet()) {
            System.out.println(city.getKey() + " " + city.getValue());
        }

    }
}
