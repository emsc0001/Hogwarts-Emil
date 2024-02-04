package src.edu.hogwarts;

public class Ingredient extends TeachingMaterial{
    private String name;
    private double amount;
    private String unit;

    public Ingredient(String name, double amount, String unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }
    public Ingredient(){

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Ingredient{\n" +
                "name: " + name + "\n" +
                "amount: " + amount + "\n" +
                "unit: " + unit + "\n" +
                "}";
    }
}