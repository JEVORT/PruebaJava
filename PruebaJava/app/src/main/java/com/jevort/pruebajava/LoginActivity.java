package com.jevort.pruebajava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {

    private static final String AES = "AES";
    private static final String Url = "https://swapi.dev/api/";
    Button btnLog;
    EditText txtUser, txtPass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLog = findViewById(R.id.BtnLoging);
        txtUser = findViewById(R.id.ImputName);
        txtUser = findViewById(R.id.ImputPass);
        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(txtUser.getText().toString(),txtPass.getText().toString());
            }
        });
    }

    public static boolean Comparar(String Pass, String clave){
        boolean estado = false;



        return estado;
    }

    public static void Login(String user, String Pass){
        String persons = Url+"persons/";
        String name, User, Color, pass;
        StringRequest postRequest = new StringRequest(Request.Method.GET, persons, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try { //count
                    JSONObject jsonRequest = new JSONObject(response);
                    JSONObject res;
                    for (int i = 0; i<jsonRequest.length(); i++){

                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });

        boolean retorno = Comparar("","");


    }
}