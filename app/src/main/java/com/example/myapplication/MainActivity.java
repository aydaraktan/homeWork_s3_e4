package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<State> states = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInitialData();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.list);
        // создаем адаптер
        StateAdapter adapter = new StateAdapter(this, states);
        // устанавливаем для списка адаптер
        recyclerView.setAdapter(adapter);
    }
    private void setInitialData(){
        states.add(new State ("Кыргызстан", "Бишкек", R.drawable.kyrgyzstan));
        states.add(new State ("Казакстан", "Нур-Султан", R.drawable.kazakhstan));
        states.add(new State ("Китай", "Пекин", R.drawable.china));
        states.add(new State ("Россия", "Москва", R.drawable.russia));
        states.add(new State ("Германия", "Берлин", R.drawable.germany));
        states.add(new State ("Бразилия", "Бразилиа", R.drawable.brazil));
        states.add(new State ("Аргентина", "Буэнос-Айрес", R.drawable.argentina));
        states.add(new State ("Колумбия", "Богота", R.drawable.columbia));
        states.add(new State ("Уругвай", "Монтевидео", R.drawable.uruguay));
        states.add(new State ("Чили", "Сантьяго", R.drawable.chile));



    }
}