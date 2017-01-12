package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin15);
    }
    public void onClickca (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton90);
        Intent intent = new Intent(Barin15.this,Barin16.class);
        startActivity(intent);
    }
    public void onClickcb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton91);
        Intent intent = new Intent(Barin15.this,Barin16.class);
        startActivity(intent);
    }
    public void onClickcc (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton92);
        Intent intent = new Intent(Barin15.this,Barin16.class);
        startActivity(intent);
    }
    public void onClickcd (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton93);
        Intent intent = new Intent(Barin15.this,Barin16.class);
        startActivity(intent);
        finish();
    }
}
