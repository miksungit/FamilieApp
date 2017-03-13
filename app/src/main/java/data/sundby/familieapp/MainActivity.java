package data.sundby.familieapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener groceriesListener = new View.OnClickListener() {
        public void onClick(View v) {

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;

            Toast groceriesToast = Toast.makeText(context, context.getString(R.string.groceries_toast), duration);
            groceriesToast.show();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Capture our button from layout
        TextView groceries = (TextView) findViewById(R.id.tv_groceries);
        // Register the onClick listener with the implementation above
        groceries.setOnClickListener(groceriesListener);

    }
}
