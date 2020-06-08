import java.util.*;

public class Present {
    private Present_Component[] present_components;

    public Present(Present_Component[] present_components) {
        this.present_components = present_components;
    }

    public void sortByWeight() {
        List<Candies> candiesList = new ArrayList();
        for (Present_Component present_component : present_components) {
            if (present_component instanceof Candies) {
                candiesList.add((Candies) present_component);
            }
        }
        candiesList.sort(Comparator.comparing(Candies::getPrice));
        System.out.println(candiesList);
    }

    public String totalPrice() {
        float totalWeight = 0;
        for (Present_Component present_component : present_components) {
            totalWeight += present_component.getWeight();
        }
        return "Total weight:" + totalWeight;
    }

    public StringBuffer candy_of_range(int start, int end) {
        StringBuffer ok_candies = new StringBuffer();
        for (Present_Component present_component : present_components) {
            if (present_component instanceof Candies) {
                if (((Candies) present_component).getChocolate_percentage() >= start
                        && ((Candies) present_component).getChocolate_percentage() <= end) {
                    ok_candies.append(((Candies) present_component).toStringAgain() + "; ");
                }
            }
        }
        return ok_candies;
    }
}
