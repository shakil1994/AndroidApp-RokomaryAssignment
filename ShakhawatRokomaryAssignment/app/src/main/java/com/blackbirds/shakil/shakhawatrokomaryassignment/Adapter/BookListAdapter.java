package com.blackbirds.shakil.shakhawatrokomaryassignment.Adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

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
        Picasso.get().load(bookDetailsList.get(position).getImage_path()).into(holder.imgBook);
        holder.txtBookName.setText(bookDetailsList.get(position).getName_en());
        holder.txtAuthor.setText(bookDetailsList.get(position).getAuthor_name_bn());
        holder.txtPrice.setText(bookDetailsList.get(position).getPrice().toString());
    }

    @Override
    public int getItemCount() {
        return bookDetailsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtBookName, txtAuthor, txtPrice;
        ImageView imgBook;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            txtBookName = itemView.findViewById(R.id.txtBookName);
            txtAuthor = itemView.findViewById(R.id.txtAuthor);
            txtPrice = itemView.findViewById(R.id.txtPrice);
            imgBook = itemView.findViewById(R.id.imgBook);
        }
    }
}
