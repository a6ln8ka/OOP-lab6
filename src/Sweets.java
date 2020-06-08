public class Sweets extends Present_Component{
    private float weight;
    private boolean tasty;
    public Sweets(float weight, int price, boolean tasty) {
        super(price);
        this.weight = weight;
        this.tasty = tasty;
    }
}
