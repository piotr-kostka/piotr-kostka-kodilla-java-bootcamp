package module4.excercise41;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main (String[] args) {

        CompaniesList companies = new CompaniesList(initCompanies());
        System.out.println(companies.concatenate());

    }

    private static List<String> initCompanies() {

        List<String> companies = new ArrayList<>();
        companies.add("DELL");
        companies.add("APPLE");
        companies.add("SAMSUNG");
        companies.add("SONY");
        companies.add("ALCATEL");
        return companies;
    }
}
