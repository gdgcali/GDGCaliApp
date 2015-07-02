package co.com.android_dev.gdgcali.gdgcali.view.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import co.com.android_dev.gdgcali.gdgcali.R;
import co.com.android_dev.gdgcali.gdgcali.model.RecentPostAnswer;
import co.com.android_dev.gdgcali.gdgcali.util.EnvironmentFields;

/**
 * Created by user on 25/06/2015.
 */
public class RecentPostAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private int layoutResourceId;
    private Context context;
    private List<RecentPostAnswer> recentPostAnswers;

    public RecentPostAdapter(Context context, List<RecentPostAnswer> recentPostAnswers, int layoutResourceId) {
        this.context = context;
        this.recentPostAnswers = recentPostAnswers;
        this.layoutResourceId = layoutResourceId;
    }

    @Override
    public int getCount() {
        return recentPostAnswers.size();
    }

    @Override
    public Object getItem(int position) {
        return recentPostAnswers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final RecentPostAnswer item = (RecentPostAnswer) recentPostAnswers.get(position);
        ItemViewHolder itemViewHolder;
        if (convertView == null) {
            inflater = LayoutInflater.from(context);
            convertView = inflater.inflate(layoutResourceId, null, true);
            itemViewHolder = new ItemViewHolder();
            itemViewHolder.imgItemImage = (ImageView) convertView.findViewById(R.id.id_img_recentpost);
            itemViewHolder.txtItemCategory = (TextView) convertView.findViewById(R.id.id_category_recentpost);
            itemViewHolder.txtItemDate = (TextView) convertView.findViewById(R.id.id_datepost_recentpost);
            itemViewHolder.txtItemTittle = (TextView) convertView.findViewById(R.id.id_title_recentpost);
            itemViewHolder.imgItemImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String url = EnvironmentFields.URL_SERVER;
//                    Intent i = new Intent(Intent.ACTION_VIEW);
//                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    i.setData(Uri.parse(url));
//                    context.startActivity(i);
//                    Intent webIntent = new Intent(context, WebActivity.class);
//                    webIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
//                    webIntent.putExtra("url", url);
//                    context.startActivity(webIntent);
                }
            });
            convertView.setTag(itemViewHolder);
        } else {
            itemViewHolder = (ItemViewHolder) convertView.getTag();
        }

        Picasso.with(context).load(item.getThumbnail_images().getMedium().getUrl()).into(itemViewHolder.imgItemImage);
        itemViewHolder.txtItemTittle.setText(item.getTitle());
        itemViewHolder.txtItemDate.setText(item.getDate());
        itemViewHolder.txtItemCategory.setText(item.getCategories().get(0).getTitle());


        return convertView;
    }

    private static class ItemViewHolder {
        TextView txtItemTittle;
        TextView txtItemCategory;
        TextView txtItemDate;
        ImageView imgItemImage;
    }
}
