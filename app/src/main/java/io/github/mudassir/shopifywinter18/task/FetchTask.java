package io.github.mudassir.shopifywinter18.task;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import io.github.mudassir.shopifywinter18.model.Order;
import io.github.mudassir.shopifywinter18.model.Orders;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * AsyncTask that uses OkHttp to fetch the JSON and then uses GSON to parse it.
 * <br>
 * Pass in the url to the JSON when calling {@code .execute()}.
 * <br>
 * Returns a list of orders as {@link Order} to a callback.
 */
public class FetchTask extends AsyncTask<String, Void, Order[]> {

	public interface Callback {
		void onFetchComplete(Order[] orders);
	}
	public static final String TAG = FetchTask.class.getSimpleName();
	private Callback callback;

	public FetchTask(Callback callback) {
		this.callback = callback;
	}

	@Override
	protected Order[] doInBackground(String... params) {
		// Assume verified
		String url = params[0];

		try {
			Log.v(TAG, "Fetching JSON");

			OkHttpClient client = new OkHttpClient();
			Request request = new Request.Builder()
					.url(url)
					.build();

			Response response = client.newCall(request).execute();
			String responseString = response.body().string();

			Log.v(TAG, "Parsing JSON");

			Gson gson = new GsonBuilder()
					.serializeNulls()
					.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) // Super important
					.create();

			// Using a wrapper for the list of orders because the JSON is formatted that way
			Orders orders = gson.fromJson(responseString, Orders.class);
			return orders.getOrders();

		} catch (IOException e) {
			Log.e(TAG, "Network error", e);
		}

		return null;
	}

	@Override
	protected void onPostExecute(Order[] orders) {
		super.onPostExecute(orders);

		if(orders.length > 0) {
			Log.v(TAG, "JSON fetch callback");

			callback.onFetchComplete(orders);

		} else {
			Log.e(TAG, "JSON fetch error");
		}
	}
}
