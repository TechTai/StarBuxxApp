package nyc.c4q.starbuxxapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DrinkActivity extends AppCompatActivity {

    //Retrieves the ID of the drink the user clicked as extra info in the intent so it is defined as a constant
    public static final String EXTRA_DRINKNO = "drinkNo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);


     //Get the drink from the intent. Retrieve value of EXTRA_DRINKNO from the intent that started DrinkActivity
        int drinkNo = (Integer) getIntent().getExtras().get(EXTRA_DRINKNO);
     //Use the drinkNo to get details of the drink the user selected
        Drinks drink = Drinks.drinks[drinkNo];

     //Populate the drink image
        ImageView photo = (ImageView) findViewById(R.id.photo);
        photo.setImageResource(drink.getImageResourceID());
        photo.setContentDescription(drink.getName());

     //Populate the drink name
        TextView name = (TextView) findViewById(R.id.name);
        name.setText(drink.getName());

     //Populate the drink description
        TextView description = (TextView) findViewById(R.id.description);
        description.setText((drink.getDescription()));
    }
}
