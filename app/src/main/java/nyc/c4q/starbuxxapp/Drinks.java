package nyc.c4q.starbuxxapp;

/**
 * Created by MsNehisi on 1/4/18.
 */

public class Drinks {
    //Each drink will have the following characteristics composed of the below variables
    private String name;
    private String description;
    private int imageResourceID;

    //The list of drinks will be in array of Drinks based on the number of offerings: Total(4): Latte, Cappuccino, Filter, Americano
    public static final Drinks[] drinks = {
    new Drinks("Latte", "A couple of espresso shots with steamed milk", R.drawable.latte),
    new Drinks("Cappuccino", "Espresso, hot milk, and a steamed milk foam", R.drawable.cappuccino),
    new Drinks("Filter", "Highest quality beans roasted and brewed fresh", R.drawable.filter),
    new Drinks("Americano", "Diluted expresso with similar strength but different flavor", R.drawable.americano)
    };

    //Drinks Constructor
    private Drinks (String name, String description, int imageResourceID) {
        this.name = name;
        this.description = description;
        this.imageResourceID = imageResourceID;
    }

    //Create getters for the above private variables
    public String getDescription(){
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceID() {
        return imageResourceID;
    }
    //The String representation of a Drink is its actual name
    public String toString(){
        return this.name;
    }
}


