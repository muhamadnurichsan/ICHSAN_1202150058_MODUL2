package example.ichsan_1202150058_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void pizzaABC (View view){
        Intent p = new Intent(menu.this, TahuGejrot.class); // untuk bisa pindah ke activity gejrot dari activity menu
        startActivity(p);
    }
}

