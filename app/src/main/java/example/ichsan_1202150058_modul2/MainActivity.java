 package example.ichsan_1202150058_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onRadioButtonClicked(View view) { //untuk radio button yang dipilih
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.btndine:
                if (checked)
                    displayToast("Dine In"); // jika button dine in yang dipilih makan akan keluar toast "Dine In"
                break;
            case R.id.btntake:
                if (checked)
                    displayToast("Take Away"); // jika button takeaway yang dipilih maka akan keluar toast "Take Away"
                break;
        }
    }

    private void displayToast(String s) {
        Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show(); // untuk mendisplay toast
    }

    public void pesansekarang(View view) { //dari button onclick pesan sekarang
        if (((RadioButton)findViewById(R.id.btndine)).isChecked()) {
            Intent a = new Intent(this, detail.class);
            startActivity(a); // jika radio button dipilih dine in, maka saat klik button pesan sekarang akan mengarah ke detail
        }else if (((RadioButton)findViewById(R.id.btntake)).isChecked()){
            Intent a = new Intent(this,takeAway.class);
            startActivity(a); // jika radio button dipilih dine in, maka saat klik button pesan sekarang akan mengarah ke take away
        }else{
            Toast.makeText(this, "Pilih salah satu terlebih dahulu", Toast.LENGTH_SHORT).show(); //jika belum ada yang dipilih maka pilih terlebih dahulu
        }

    }
}

