package io.github.mudassir.shopifywinter18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import io.github.mudassir.shopifywinter18.model.LineItem;
import io.github.mudassir.shopifywinter18.model.Order;
import io.github.mudassir.shopifywinter18.task.FetchTask;

public class MainActivity extends AppCompatActivity implements FetchTask.Callback {

    public static final String TAG = MainActivity.class.getSimpleName();
    public static final String JSON_URL = "https://shopicruit.myshopify.com/admin/orders.json?page=1&access_token=c32313df0d0ef512ca64d5b336a0d7c6";
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.v(TAG, "Start");

        setContentView(R.layout.activity_main);
        result = (TextView) findViewById(R.id.result);
        new FetchTask(this).execute(JSON_URL);
    }

    /**
     * Solving the problem
     */
    @Override
    public void onFetchComplete(Order[] orders) {
        Log.i(TAG, "Successful fetch and parse");

        float totalSpent = 0f;
        int totalSold = 0;

        // Brute force
        for(Order order : orders) {

            // Use billing address to check name because other fields may not be reliable according to docs
            if (order.getBillingAddress() != null && order.getBillingAddress().getName().equals("Napoleon Batz")) {
                totalSpent += order.getTotalPrice();
            }

            for(LineItem item : order.getLineItems()) {
                if (item.getTitle().equals("Awesome Bronze Bag")) {
                    totalSold ++;
                }
            }
        }

        result.setText(String.format("Total spent by Mr. Batz: $%.2f CAD\n\nTotal Bronze Bags sold: %d", totalSpent, totalSold));
    }
}
