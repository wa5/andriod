package vishnu.demo.scrollerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class adopter extends AppCompatActivity {
    GridView grid;
    //int images[]={ R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.a,R.drawable.b,R.drawable.c, };
    int icons[]={
            R.drawable.c,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c
    };
    String name[]={"HTML","JAVA","JSP","PHP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adopter);
        //setTitle("GridView Demo");

        grid=(GridView)findViewById(R.id.datagrid);
        adopterclass obj=new adopterclass(this,name,icons);
        grid.setAdapter(obj);

       // simplegridview=(GridView)findViewById(R.id.simplegridview);
       // adopterclass adop=new adopterclass(getApplicationContext(),images);
        //simplegridview.setAdapter(adop);
    }
}
