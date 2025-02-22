package com.excerise.bottomnavigation.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.excerise.bottomnavigation.R;
import com.excerise.bottomnavigation.adapter.MessageAdapter;
import com.excerise.bottomnavigation.model.Message;

import java.util.ArrayList;

public class FragmentNoti extends Fragment {

    MessageAdapter messageAdapter;
    ArrayList<Message> messageArrayList;
    RecyclerView recyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        messageArrayList = new ArrayList<>();
        messageArrayList.add(new Message(R.drawable.coffee1, "Hưng","Ăn cơm chưa","19:20"));
        messageArrayList.add(new Message(R.drawable.coffee2, "Huy","Ăn cơm chưa","19:22"));
        messageArrayList.add(new Message(R.drawable.coffee3, "Hải","Ăn cơm chưa","9:20"));
        View view = inflater.inflate(R.layout.fragment_notification,container,false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recyclerView1);
        messageAdapter = new MessageAdapter(messageArrayList);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(),1));
        recyclerView.setAdapter(messageAdapter);
    }
}
