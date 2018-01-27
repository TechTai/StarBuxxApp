package nyc.c4q.starbuxxapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class DrinkCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listDrinks = getListView();
        ArrayAdapter<Drinks> listAdapter = new ArrayAdapter<Drinks> (
            this,
            android.R.layout.simple_list_item_1,
            Drinks.drinks);
        listDrinks.setAdapter(listAdapter);
    }

    @Override
    //Implement the onListItemClick() method so that DrinkActivity is launched when the user clicks on an item in the list view.
    public void onListItemClick(ListView listview, View itemView, int position, long id) {
        Intent intent = new Intent(DrinkCategoryActivity.this, DrinkActivity.class);
    //If the underlying data comes from a database, the ID is the ID of the record in the table.
        intent.putExtra(DrinkActivity.EXTRA_DRINKNO, (int) id);
        startActivity(intent);
    }


}

