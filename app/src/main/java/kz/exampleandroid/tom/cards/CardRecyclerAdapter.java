package kz.exampleandroid.tom.cards;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CardRecyclerAdapter extends RecyclerView.Adapter<CardRecyclerAdapter.ViewHolder> {
private List<News> newsList;

    public CardRecyclerAdapter(List<News> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        News news = newsList.get(i);
        viewHolder.imageId.setImageResource(news.getImageId());
        viewHolder.text.setText(news.getText());
        viewHolder.title.setText(news.getTitle());
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageId;
        TextView text;
        TextView title;
        CardView card;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageId = itemView.findViewById(R.id.li_image_iv);
            text = itemView.findViewById(R.id.li_text_tv);
            title = itemView.findViewById(R.id.li_title_tv);
            card = itemView.findViewById(R.id.card_view);
        }
    }
}
