package com.cesar.mismascotas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

    public class DogsAdaptador extends RecyclerView.Adapter<DogsAdaptador.ViewHolder>{

        public static class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView imgDog;
            private TextView tvNombredog;
            private TextView tvRating;
            private ImageButton btnRating;

            Context context;

            RecyclerView rvDogs;
            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                context =itemView.getContext();
                rvDogs= itemView.findViewById(R.id.rvDogs);

                imgDog = (ImageView) itemView.findViewById(R.id.imgDog);
                tvNombredog = (TextView) itemView.findViewById(R.id.tvNombredog);
                tvRating = (TextView) itemView.findViewById(R.id.tvRating);
                btnRating  = (ImageButton) itemView.findViewById(R.id.btnRating);

            }

        }

        public List<Miperro> ltdogs;

        public DogsAdaptador(List<Miperro> misperros) {
            this.ltdogs = misperros;

        }

        @NonNull
        @Override
        public ViewHolder onCreateViewHolder(final ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perros,parent,false);
            ViewHolder viewHolder=new ViewHolder(view);
            return viewHolder;

        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, int position) {
            final Miperro pet = ltdogs.get(position);

            holder.tvNombredog.setText(pet.getNombre());
            holder.imgDog.setImageResource(pet.getImagen());
            holder.tvRating.setText(Integer.toString(pet.getRating()));

            holder.btnRating.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {


                    if (pet.getRating() <5){
                        pet.setRating(pet.getRating()+1);
                    }
                    else {
                        pet.setRating(5);
                    }
                    holder.tvRating.setText( Integer.toString(pet.getRating()));
                }
            });
        }


        @Override
        public int getItemCount() {return ltdogs.size();}

    }
