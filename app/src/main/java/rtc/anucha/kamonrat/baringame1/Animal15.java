package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal15);
    }
    public void onClickrc (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton460);
        Intent intent = new Intent(Animal15.this, Animal16.class);
        startActivity(intent);
    }
    public void onClickrd (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton463);
        Intent intent = new Intent(Animal15.this, Animal16.class);
        startActivity(intent);
    }
    public void onClickre (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton464);
        Intent intent = new Intent(Animal15.this, Animal16.class);
        startActivity(intent);
    }
    public void onClickrf (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton465);
        Intent intent = new Intent(Animal15.this,Animal16.class);
        startActivity(intent);
        finish();
    }
}
