package com.example.fragandrecyclercat;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

public  class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.AdapterViewHolder> {

    Modl [] ModlListItem;

    private onClick onclick;
    public  interface onClick {
        public  void onClick(Modl modl);
    }

    public   RecyclerViewAdapter(){
        super();
    }
    public   RecyclerViewAdapter(Modl [] ModlListItem,onClick onClick){
        this.ModlListItem=ModlListItem ;
        this.onclick=onClick;
    }



    @NonNull
    @Override
    public AdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_item,parent,false);
        AdapterViewHolder adapter = new AdapterViewHolder(view);
        return adapter;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterViewHolder holder, int position) {

        Modl modl = ModlListItem[position];
        holder.jopDiscription.setText(modl.JopDescription);
        holder.name.setText(modl.PersonName);
        holder.image.setImageResource(modl.ImageIcon);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                onclick.onClick( modl);

//##########################################################################################################################################
                /*AppCompatActivity activity=(AppCompatActivity)view.getContext();
                FragmentViewItem fragmentViewItem= new FragmentViewItem();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.rec,fragmentViewItem)
                        .addToBackStack(null).commit();*/
            }
        });
    }


    @Override
    public int getItemCount() {
        return ModlListItem.length;
    }


    public static class AdapterViewHolder extends RecyclerView.ViewHolder {

        TextView jopDiscription ;

        //public  static View itemViewClicked;
        TextView name;
        ImageView image;
        public AdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            jopDiscription=itemView.findViewById(R.id.TV_JopDescription);
            name=itemView.findViewById(R.id.TV_PersonName);
            image=itemView.findViewById(R.id.ImageView_Icon);
            /*itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    itemViewClicked=itemView;

                }
            });*/

        }

       /* public static View GetItemClick(){
            return itemViewClicked;
        }*/
    }



}
