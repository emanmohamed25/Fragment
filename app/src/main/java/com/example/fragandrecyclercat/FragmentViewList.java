package com.example.fragandrecyclercat;

import android.os.Bundle;

import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class FragmentViewList extends Fragment implements RecyclerViewAdapter.onClick {

    Modl[] modle = new Modl[12];

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_view_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.RecyclerView_ViewList);

        modle[0] = new Modl("Developer", "Sara Adele", R.drawable.developer);
        modle[1] = new Modl("Businessman", "Ahmed Adele", R.drawable.businessman);
        modle[2] = new Modl("Coordinator", "Ali Adele", R.drawable.coordinator);
        modle[3] = new Modl("Doctors", "Mohamed saad", R.drawable.doctors);
        modle[4] = new Modl("Engineer", "Ashraf Ali", R.drawable.engineer);
        modle[5] = new Modl("Farmer", "Mohamed Adele", R.drawable.farmer);
        modle[6] = new Modl("developer", "Mona Naser", R.drawable.developer);
        modle[7] = new Modl("Policeman", "Mohamed Khalifa", R.drawable.policeman);
        modle[8] = new Modl("Surgeon", "Naser Adele", R.drawable.surgeon);
        modle[9] = new Modl("Teacher", "Sara Ali", R.drawable.teacher);
        modle[10] = new Modl("mechanical engineer", "Hamza Adele", R.drawable.worker);
        modle[11] = new Modl("Loader", "Ebrahim Ahmed", R.drawable.loader);


//        NavDirections action = FragmentViewListDirec.actionFragmentGetDataToFragmentViewData();

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(modle, this);
        recyclerView.setAdapter(recyclerViewAdapter);

        //  View itemViewClicked=RecyclerViewAdapter.AdapterViewHolder.GetItemClick();

  /*      View name = itemViewClicked.findViewById(R.id.TV_PersonName);
        View jopDes = itemViewClicked.findViewById(R.id.TV_JopDescription);
        View image = itemViewClicked.findViewById(R.id.ImageView_Icon);*/
        // String n= name.get;
    }

    @Override
    public void onClick(Modl modl) {
        Navigation.findNavController(requireView()).navigate(R.id.fragmentViewItem);

    }
    /*public void Click(){

        NavDirections action = FragmentGetDataDirections
                .actionFragmentGetDataToFragmentViewData(name,email);
        Navigation.findNavController(view).navigate(action);
    }*/
}