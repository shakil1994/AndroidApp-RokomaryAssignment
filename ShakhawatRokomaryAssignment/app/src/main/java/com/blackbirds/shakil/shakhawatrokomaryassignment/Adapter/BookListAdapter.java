package com.blackbirds.shakil.shakhawatrokomaryassignment.Adapter;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blackbirds.shakil.shakhawatrokomaryassignment.BookDetailsActivity;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Interface.IRecyclerClickListener;
import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.BookDetails;
import com.blackbirds.shakil.shakhawatrokomaryassignment.R;
import com.squareup.picasso.Picasso;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class BookListAdapter extends RecyclerView.Adapter<BookListAdapter.MyViewHolder> {

    Context context;
    List<BookDetails> bookDetailsList;

    public BookListAdapter(Context context, List<BookDetails> bookDetailsList) {
        this.context = context;
        this.bookDetailsList = bookDetailsList;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_books_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        //Picasso.get().load(bookDetailsList.get(position).getImage_path()).into(holder.imgBook);
        holder.txtBookName.setText(bookDetailsList.get(position).getName_en());
        holder.txtAuthor.setText(bookDetailsList.get(position).getAuthor_name_bn());
        holder.txtPrice.setText(bookDetailsList.get(position).getPrice().toString());

        holder.setListener((view, pos) -> {
            Intent intent = new Intent(context, BookDetailsActivity.class);
//            intent.putExtra("PK", bookDetailsList.get(position).getPk());
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return bookDetailsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView txtBookName, txtAuthor, txtPrice;
        ImageView imgBook;

        private IRecyclerClickListener listener;

        public void setListener(IRecyclerClickListener listener) {
            this.listener = listener;
        }

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            txtBookName = itemView.findViewById(R.id.txtBookName);
            txtAuthor = itemView.findViewById(R.id.txtAuthor);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            imgBook = itemView.findViewById(R.id.imgBook);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onItemClickListener(v, getAdapterPosition());
        }
    }
}
