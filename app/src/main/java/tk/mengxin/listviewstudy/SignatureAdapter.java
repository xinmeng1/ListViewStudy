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
 * Date: 12/12/2015
 * Time: 11:54
 * Version: V 1.0
 */

public class SignatureAdapter extends ArrayAdapter<Signature> {

    private int resourceId;

    static class ViewHolder{
        @Bind(R.id.imageView)
        ImageView sigImageView;
        @Bind(R.id.textView_signature)
        TextView sigNameView;
        @Bind(R.id.textView_initial)
        TextView initialNameView;
        public ViewHolder(View view){
            ButterKnife.bind(this, view);
        }
    }

    public SignatureAdapter(Context context, int resource, List<Signature> objects) {
        super(context, resource, objects);
        resourceId = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Signature signature = getItem(position);
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
        if(signature.getType().equals("TYPED")){
            viewHolder.sigImageView.setImageResource(R.drawable.ic_listview_typed_icon);
        }else {
            viewHolder.sigImageView.setImageResource(R.drawable.ic_listview_signature_icon);
        }
        viewHolder.initialNameView.setText(signature.getInitialName());
        viewHolder.sigNameView.setText(signature.getSignatureName());
        return view;
    }
}
