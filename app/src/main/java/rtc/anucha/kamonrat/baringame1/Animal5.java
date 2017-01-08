package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal5);
    }
    public void onClickpo (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton37);
        Intent intent = new Intent(Animal5.this, Animal6.class);
        startActivity(intent);
    }
    public void onClickpp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton38);
        Intent intent = new Intent(Animal5.this, Animal6.class);
        startActivity(intent);
    }
    public void onClickpq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton39);
        Intent intent = new Intent(Animal5.this, Animal6.class);
        startActivity(intent);
    }
    public void onClickpr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton40);
        Intent intent = new Intent(Animal5.this,Animal6.class);
        startActivity(intent);
    }
}

