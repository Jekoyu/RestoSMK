package com.jekoyu.restosmk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.jekoyu.restosmk.retrofit.ApiEndpoint;
import com.jekoyu.restosmk.retrofit.ApiService;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
private ListView listView;
private final String TAG="BAGUS";
private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }
    public void getData(){
        ApiService.apiEndpoint().getEmployee().enqueue(new Callback<ArrayList<EmployeeModel>>() {
            @Override
            public void onResponse(Call<ArrayList<EmployeeModel>> call, Response<ArrayList<EmployeeModel>> response) {
                if(response.isSuccessful()) {

                    Log.d(TAG, "onResponse" + response.body().toString());
                }
            }

            @Override
            public void onFailure(Call<ArrayList<EmployeeModel>> call, Throwable t) {
                Log.d(TAG, "onFailure: "+t.toString() );
            }
        });
    }
}