package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal31);
    }
    public void onClickto (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton526);
        Intent intent = new Intent(Animal31.this, Animal32.class);
        startActivity(intent);
    }
    public void onClicktp (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton527);
        Intent intent = new Intent(Animal31.this, Animal32.class);
        startActivity(intent);
    }
    public void onClicktq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton528);
        Intent intent = new Intent(Animal31.this, Animal32.class);
        startActivity(intent);
    }
    public void onClicktr (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton529);
        Intent intent = new Intent(Animal31.this,Animal32.class);
        startActivity(intent);
    }
}
