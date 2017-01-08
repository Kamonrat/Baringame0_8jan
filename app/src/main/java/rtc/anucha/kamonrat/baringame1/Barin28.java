package rtc.anucha.kamonrat.baringame1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Barin28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barin28);
    }
    public void onClickea (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton142);
        Intent intent = new Intent(Barin28.this,Barin29.class);
        startActivity(intent);
    }
    public void onClickeb (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton143);
        Intent intent = new Intent(Barin28.this,Barin29.class);
        startActivity(intent);
    }
    public void onClickec (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton144);
        Intent intent = new Intent(Barin28.this,Barin29.class);
        startActivity(intent);
    }
    public void onClicked (View view){
        ImageButton btn_start = (ImageButton) findViewById(R.id.imageButton145);
        Intent intent = new Intent(Barin28.this,Barin29.class);
        startActivity(intent);
    }
}
