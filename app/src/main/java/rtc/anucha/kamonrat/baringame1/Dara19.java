package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara19);
    }
    public void onClickkg (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton298);
        Intent intent = new Intent(Dara19.this, Dara20.class);
        startActivity(intent);
    }
    public void onClickkh (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton299);
        Intent intent = new Intent(Dara19.this, Dara20.class);
        startActivity(intent);
    }
    public void onClickki (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton300);
        Intent intent = new Intent(Dara19.this, Dara20.class);
        startActivity(intent);
    }
    public void onClickkj (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton301);
        Intent intent = new Intent(Dara19.this, Dara20.class);
        startActivity(intent);
    }
}
