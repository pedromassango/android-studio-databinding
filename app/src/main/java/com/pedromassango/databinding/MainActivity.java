package com.pedromassango.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pedromassango.databinding.databinding.BindingMain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       // ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        BindingMain mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //BindingMain mb = BindingMain.inflate(getLayoutInflater());

        Usuario usuario = new Usuario();
        usuario.setPrimeiroNome("Pedro");
        usuario.setSegundoNome("Massango");
        usuario.setIdate("20");

        mainBinding.setUser(usuario);
    }
}
