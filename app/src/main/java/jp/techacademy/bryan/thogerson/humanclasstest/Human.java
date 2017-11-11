package jp.techacademy.bryan.thogerson.humanclasstest;

/**
 * Created by Bryan on 2017/11/11.
 */
import android.util.Log;

class Human extends Animal implements Thinkable{

    String hobby;

    public Human(String name, int age, String hobby){
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    public void say(){
        Log.d("humanclasstest", "「私の名前は" + this.name + "です。年は" + this.age + "歳です。」" );
    }

    @Override
    public void think(){
        Log.d("humanclasstest", "「私は" + this.hobby + "について考える。」");
    }

}
