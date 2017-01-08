package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Animal19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal19);
    }
    public void onClickrs (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton478);
        Intent intent = new Intent(Animal19.this, Animal20.class);
        startActivity(intent);
    }
    public void onClickrt (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton479);
        Intent intent = new Intent(Animal19.this, Animal20.class);
        startActivity(intent);
    }
    public void onClickru (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton480);
        Intent intent = new Intent(Animal19.this, Animal20.class);
        startActivity(intent);
    }
    public void onClickrv (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton481);
        Intent intent = new Intent(Animal19.this,Animal20.class);
        startActivity(intent);
    }
}
