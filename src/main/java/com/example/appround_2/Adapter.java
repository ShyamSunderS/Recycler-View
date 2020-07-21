package com.example.appround_2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.Viewholder> {
    private List<ModelClass> modelClassList;

    public Adapter(List<ModelClass> modelClassList) {
        this.modelClassList = modelClassList;
    }


    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup viewholder, int viewType) {
        View view = LayoutInflater.from(viewholder.getContext()).inflate(R.layout.item_layout, viewholder, false);
        return new Viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder viewholder, int position) {
        int resource = modelClassList.get(position).getImageResource();
        String title = modelClassList.get(position).getTitle();
        String title2=modelClassList.get(position).getTitle2();
        String title3=modelClassList.get(position).getTitle3();
        String body = modelClassList.get(position).getBody();
        viewholder.setData(resource, title, title2,title3, body);
    }

    @Override
    public int getItemCount() {
        return modelClassList.size();
    }

    class Viewholder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView title;
        private TextView title2;
        private TextView title3;
        private TextView body;
        private Button button;

        public Viewholder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            title = itemView.findViewById(R.id.title);
            title2 = itemView.findViewById(R.id.title2);
            title3 = itemView.findViewById(R.id.title3);
            body = itemView.findViewById(R.id.body);
            button=itemView.findViewById(R.id.button);
        }

        private void setData(int resource, String titleText,String titleText2,String titleText3, String bodyText) {
            imageView.setImageResource(resource);
            title.setText(titleText);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    button.setText("Sign in");
                }
            });
            title2.setText(titleText2);
            title3.setText(titleText3);
            body.setText(bodyText);
        }

    }
}
