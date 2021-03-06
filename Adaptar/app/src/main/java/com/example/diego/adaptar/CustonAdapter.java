package com.example.diego.adaptar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Dalto on 21/01/2016.
 */
public class CustonAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;
    private List<Item> itens;


    public CustonAdapter(List<Item> itens,Context context) {
        this.itens = itens;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return itens.size();
    }

    @Override
    public Object getItem(int position) {
        return itens.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //Pega o item de acordo com a posicao.
        Item item = itens.get(position);


        //infla o layout para podermos preencher os dados
        convertView = layoutInflater.inflate(R.layout.item_layout,null);



        //((TextView) view.findViewById(R.id.data)).setText(miniCurso.getData());
        ((ImageView)convertView.findViewById(R.id.imageView)).setImageResource(item.getImagem());

        ((TextView) convertView.findViewById(R.id.tvNome)).setText(item.getNome());
        ((TextView)convertView.findViewById(R.id.tvValor)).setText(item.getTelefone());


        return convertView;
    }
}