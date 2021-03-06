package in.technozion.technozion.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import in.technozion.technozion.R;

public class NavigationDrawerAdapter extends ArrayAdapter<String> {
    private Context context;
    public NavigationDrawerAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
        this.context=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView view= (TextView) super.getView(position, convertView, parent);
        Drawable drawable=context.getResources().getDrawable(R.mipmap.ic_launcher);
        drawable.setBounds(0,0,40,40);
        view.setCompoundDrawables(drawable,null,null,null);
        return view;
    }
}
