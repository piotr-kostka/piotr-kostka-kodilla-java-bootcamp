package module4.excercise41;

import java.util.List;

public class CompaniesList {

    private List<String> companies;
    private String temporary = "";

    public CompaniesList(List<String> companies) {
        this.companies = companies;
    }

    public String concatenate() {

        StringBuilder temporary = new StringBuilder();
        for (int i = 0; i < companies.size(); i++) {
            temporary.append(companies.get(i));
            if (i < companies.size()-1) {
                temporary.append(", ");
            }
        }
        return temporary.toString();
    }
}
