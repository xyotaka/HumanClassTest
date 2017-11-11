package jp.techacademy.bryan.thogerson.humanclasstest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("ボブ", 21, "野球");
        human.say();
        human.think();

        Human person = new Human("アリス", 20, "ゲーム");
        person.say();
        person.think();
    }
}
