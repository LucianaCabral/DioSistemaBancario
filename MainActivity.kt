package com.lucianacabral.sistemabancario

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.lucianacabral.sistemabancario.model.MenuItemModel

class MainActivity : AppCompatActivity() {
    private lateinit var rvList: RecyclerView
    private var adapter = MenuItemAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciaViews()
        setItensLista()
    }

    private fun iniciaViews() {
        rvList = findViewById(R.id.rv_list)
        rvList.adapter = adapter
        rvList.layoutManager = GridLayoutManager(this, 2)
    }

    private fun setItensLista() {
        adapter.setItensList(
            arrayListOf(
                MenuItemModel(
                    "cartões"
                ),
                MenuItemModel(
                    "meus comprovantes"
                ),
                MenuItemModel(
                    "meus investimentos"
                ),
                MenuItemModel(
                    "portabilidade de salário"
                ),
                MenuItemModel(
                    "gift Cards"
                ),
                MenuItemModel(
                    "meus investimentos"
                )
            )
        )
    }
}