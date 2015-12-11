package tk.mengxin.listviewstudy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by Android Studio.
 * User: Xin Meng
 * Date: 11/12/2015
 * Time: 23:11
 * Version: V 1.0
 */

public class FruitAdapter extends ArrayAdapter<Fruit> {

    private int resourceId;


    static class ViewHolder {
        @Bind(R.id.fruit_image)
        ImageView fruitImageView;
        @Bind(R.id.fruit_name)
        TextView fruitNameView;

        public ViewHolder(View view){
            ButterKnife.bind(this, view);
        }
    }


    public FruitAdapter(Context context, int resource, List<Fruit> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Get current the fruit

        Fruit fruit = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            view = convertView;
        }
        viewHolder.fruitNameView.setText(fruit.getName());
        viewHolder.fruitImageView.setImageResource(fruit.getImageId());
        return view;
    }
}
