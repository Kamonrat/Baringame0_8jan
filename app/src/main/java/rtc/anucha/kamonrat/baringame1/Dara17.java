package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara17);
    }
    public void onClickjy (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton290);
        Intent intent = new Intent(Dara17.this, Dara18.class);
        startActivity(intent);
    }
    public void onClickjz (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton291);
        Intent intent = new Intent(Dara17.this, Dara18.class);
        startActivity(intent);
    }
    public void onClickka (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton292);
        Intent intent = new Intent(Dara17.this, Dara18.class);
        startActivity(intent);
    }
    public void onClickkb (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton293);
        Intent intent = new Intent(Dara17.this, Dara18.class);
        startActivity(intent);
        finish();
    }
}
