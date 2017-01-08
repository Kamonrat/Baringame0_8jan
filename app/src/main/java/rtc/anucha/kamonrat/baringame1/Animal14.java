package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal14);
    }
    public void onClickqy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton458);
        Intent intent = new Intent(Animal14.this, Animal15.class);
        startActivity(intent);
    }
    public void onClickqz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton459);
        Intent intent = new Intent(Animal14.this, Animal15.class);
        startActivity(intent);
    }
    public void onClickra (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton461);
        Intent intent = new Intent(Animal14.this, Animal15.class);
        startActivity(intent);
    }
    public void onClickrb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton462);
        Intent intent = new Intent(Animal14.this,Animal15.class);
        startActivity(intent);
    }
}
