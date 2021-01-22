package vishnu.demo.scrollerview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
String A="10";//instac
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String A="20";
    }
//defult toast
    public void VishnuShami(View view) {
        String A="30";
        Toast.makeText(this, A, Toast.LENGTH_LONG).show();

    }

























    public void DefaultToast(View view) {
       Toast.makeText(this, "hi im a short toast", Toast.LENGTH_SHORT).show();
       // Toast.makeText(this, "hi im a short long toast", Toast.LENGTH_LONG).show();

       // String Variable="im a toast with dynamic variable";
        //Toast.makeText(this, Variable, Toast.LENGTH_SHORT).show();
    }

    public void CustomTOast(View view) {

       LayoutInflater ji=getLayoutInflater();
        View layout= ji.inflate(R.layout.activity_custom_toast,(ViewGroup)findViewById(R.id.CustomToast));

        ImageView image = (ImageView) layout.findViewById(R.id.customimage);
       image.setImageResource(R.drawable.download);
      // TextView text = (TextView) layout.findViewById(R.id.text);
        //text.setText("Hello! This is a custom toast!");
        Toast toast=new Toast(getApplicationContext());
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER_HORIZONTAL,0 ,0);
        toast.setView(layout);
        toast.show();

    }

    public void scrollview(View view) {

        Intent intencion = new Intent(MainActivity.this,MainActivity2.class );
        startActivity(intencion);

        //String op="hhhhh";
        //Toast.makeText(this, op, Toast.LENGTH_SHORT).show();


    }

    public void scroll(View view) {
        Intent intencion = new Intent(MainActivity.this,imgscrollview.class );
        startActivity(intencion);
    }



}
