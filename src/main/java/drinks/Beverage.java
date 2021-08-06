package drinks;
import java.util.List;

public class Beverage {
    private String name;
    private String description;
    private List<String> ingredients;    

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }    

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return description;
    }
}
