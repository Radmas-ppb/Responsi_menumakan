package com.example.menumakan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    adapterProduk adapter;

    List<Produk> produkList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        produkList = new ArrayList<>();

        recyclerView =(RecyclerView)findViewById(R.id.FieldRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        produkList.add(
                new Produk(
                        1,
                        "Pecel lele",
                        "15000",
                        R.drawable.ketoprak,"Pecel lele tambah mihun"
                ));
        produkList.add(
                new Produk(
                        2,
                        "Nasi Goreng Mercon",
                        "14500",
                        R.drawable.ketoprak,"CABENYA AKEH TENAN!!"
                ));
        produkList.add(
                new Produk(
                        3,
                        "Ayam Geprek Keju",
                        "20000",
                        R.drawable.ketoprak,"Keju Mozarela"
                ));
        produkList.add(
                new Produk(
                        4,
                        "Kari Ayam",
                        "17500",
                        R.drawable.ketoprak,"Kari ayam Hitam"
                ));
        produkList.add(
                new Produk(
                        5,
                        "Tahu Bulat",
                        "500",
                        R.drawable.ketoprak,"Ya Tahu yang Bulet"
                ));
        produkList.add(
                new Produk(
                        6,
                        "Salad Buah",
                        "12000",
                        R.drawable.ketoprak,"Ada Buah Naga juga didalemnya"
                ));

        adapter = new adapterProduk(this,produkList);
        recyclerView.setAdapter(adapter);
    }
}
