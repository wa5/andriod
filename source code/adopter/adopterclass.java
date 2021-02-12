package vishnu.demo.scrollerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class adopterclass extends BaseAdapter {


    private final int images[];
    private final String name[];
    Context context;
LayoutInflater inflater;


public adopterclass(Context context,String[] name, int[] images){

    this.context = context;
    this.name = name;
    this.images = images;
    //this.context=ApplicationContext;
    //this.images=images;
    //inflater=LayoutInflater.from(ApplicationContext);
}


    @Override
    public int getCount()
    {
        return name.length;//it will show all images in my folder
    }

    @Override
    public Object getItem(int position) {

    return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup)
    {
        LayoutInflater layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.activity_adopterdatatodisplay,null);

        ImageView img=(ImageView)view.findViewById(R.id.iconimage);
        TextView tv=(TextView)view.findViewById(R.id.textdata);

        img.setImageResource(images[position]);
        tv.setText(name[position]);

        return view;


    }
}
