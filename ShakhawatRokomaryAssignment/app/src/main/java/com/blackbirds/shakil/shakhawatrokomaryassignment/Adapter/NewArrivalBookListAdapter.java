package com.blackbirds.shakil.shakhawatrokomaryassignment.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.blackbirds.shakil.shakhawatrokomaryassignment.Model.BookDetails;
import com.blackbirds.shakil.shakhawatrokomaryassignment.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class NewArrivalBookListAdapter extends RecyclerView.Adapter<NewArrivalBookListAdapter.MyViewHolder> {

    Context context;
    List<BookDetails> bookDetailsList;

    public NewArrivalBookListAdapter(Context context, List<BookDetails> bookDetailsList) {
        this.context = context;
        this.bookDetailsList = bookDetailsList;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_new_arrival_books_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull MyViewHolder holder, int position) {
        //Picasso.get().load(bookDetailsList.get(position).getImage_path()).into(holder.imgBook);
    }

    @Override
    public int getItemCount() {
        return bookDetailsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView imgBook;

        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            imgBook = itemView.findViewById(R.id.imgBook);
        }
    }
}
