package es.davidpena.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        String[] forecastArray = {
                "Hoy - Soleado - 30/20",
                "Mañana - Soleado - 30/22",
                "Miérc. 4 - Nublado - 25/21",
                "Jueves 5 - Soleado - 30/20",
                "Viernes 6 - Soleado - 30/20",
                "Sábado 7 - Soleado - 30/20",
                "Domingo 8 - Soleado - 30/20",
                "Lunes 9 - Soleado - 30/20",
                "Martes 10 - Soleado - 30/20",
                "Miérc. 11 - Soleado - 30/20"
        };

        List<String> weekForecast = new ArrayList<String>(
                Arrays.asList(forecastArray)
        );

        mForecastAdapter = new ArrayAdapter<String>(
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                weekForecast
        );

        ListView listview = (ListView) rootView.findViewById(R.id.listview_forecast);
        listview.setAdapter(mForecastAdapter);

        return rootView;
    }
}
