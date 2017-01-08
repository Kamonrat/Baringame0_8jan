package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin29);
    }
    public void onClickee (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton146);
        Intent intent = new Intent(Barin29.this,Barin30.class);
        startActivity(intent);
    }
    public void onClickef (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton147);
        Intent intent = new Intent(Barin29.this,Barin30.class);
        startActivity(intent);
    }
    public void onClickeg (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton148);
        Intent intent = new Intent(Barin29.this,Barin30.class);
        startActivity(intent);
    }
    public void onClickeh (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton149);
        Intent intent = new Intent(Barin29.this,Barin30.class);
        startActivity(intent);
    }
}
