package com.example.menumakan;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapterProduk extends RecyclerView.Adapter<adapterProduk.ProdukViewholder> {
    private Context Ctx;
    private List<Produk> produkList;

    public adapterProduk(Context ctx, List<Produk> produkList) {
        Ctx = ctx;
        this.produkList = produkList;
    }

    @NonNull
    @Override
    public ProdukViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(Ctx);
        View view = inflater.inflate(R.layout.daftarproduk,null);
        return new ProdukViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProdukViewholder holder, int position) {

        final Produk produk = produkList.get(position);
        holder.FtextViewtitle.setText(produk.getTitle());
        holder.FtextViewprice.setText(produk.getPrice());
        holder.FtextViewdesk.setText(produk.getDes());
        holder.FimageView.setImageDrawable(Ctx.getResources().getDrawable(produk.getImage()));
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ctx,Activity2.class);
                intent.putExtra("image",produk.getImage());
                intent.putExtra("title",produk.getTitle());
                intent.putExtra("des",produk.getDes());
                intent.putExtra("harga",produk.getPrice());
                Ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

       return produkList.size();
    }

    public class ProdukViewholder extends RecyclerView.ViewHolder {

        ImageView FimageView;
        TextView FtextViewtitle, FtextViewprice, FtextViewdesk;
        RelativeLayout relativeLayout;

        public ProdukViewholder(@NonNull View itemView) {
            super(itemView);

            FimageView = itemView.findViewById(R.id.Fieldimageview);
            FtextViewtitle = itemView.findViewById(R.id.fieldtitle);
            FtextViewdesk = itemView.findViewById(R.id.Fieldtextview);
            FtextViewprice = itemView.findViewById(R.id.Fieldprice);
            relativeLayout = itemView.findViewById(R.id.FieldRelative);
        }
    }
}
