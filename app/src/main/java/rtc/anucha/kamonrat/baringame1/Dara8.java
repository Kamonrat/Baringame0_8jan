package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Dara8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dara8);
    }
    public void onClickin (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton254);
        Intent intent = new Intent(Dara8.this, Dara9.class);
        startActivity(intent);
    }
    public void onClickio (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton255);
        Intent intent = new Intent(Dara8.this, Dara9.class);
        startActivity(intent);
    }
    public void onClickip (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton256);
        Intent intent = new Intent(Dara8.this, Dara9.class);
        startActivity(intent);
    }
    public void onClickiq (View view) {
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton257);
        Intent intent = new Intent(Dara8.this, Dara9.class);
        startActivity(intent);
    }
}
