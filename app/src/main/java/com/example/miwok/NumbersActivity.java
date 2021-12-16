package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.miwok.R.color.cardview_shadow_end_color;
import static com.example.miwok.R.color.colorPrimary;

public class NumbersActivity extends AppCompatActivity {

    int count = 0 ;
    int index = 0 ;

    private MediaPlayer mMediaPlayer;
    private MediaPlayer mMediaPlayer1;
    private MediaPlayer mMediaPlayer2;
    private MediaPlayer mMediaPlayer3;
    private MediaPlayer mMediaPlayer4;
    private MediaPlayer mMediaPlayer5;
    private MediaPlayer mMediaPlayer6;
    private MediaPlayer mMediaPlayer7;
    private MediaPlayer mMediaPlayer8;
    private MediaPlayer mMediaPlayer9;
    private MediaPlayer mMediaPlayer10;
    private MediaPlayer mMediaPlayer11;
    private MediaPlayer mMediaPlayer12;
    private MediaPlayer mMediaPlayer13;
    private MediaPlayer mMediaPlayer14;
    private MediaPlayer mMediaPlayer15;
    private MediaPlayer mMediaPlayer16;
    private MediaPlayer mMediaPlayer17;
    private MediaPlayer mMediaPlayer18;
    private MediaPlayer mMediaPlayer19;

   /* private  MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }

        private void releaseMediaPlayer() {
            if(mMediaPlayer != null){
                mMediaPlayer.release();
                mMediaPlayer = null;
            }
        }
    };*/




        private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


           final ArrayList<Word> wordss = new ArrayList<Word>();

            wordss.add  (new Word("one","lutti",R.drawable.number_one));
            wordss.add  (new Word("two", "otiiko", R.drawable.number_two));
            wordss.add  (new Word("three", "tolookosu", R.drawable.number_three));
            wordss.add  (new Word("four", "oyyisa", R.drawable.number_four));
            wordss.add  (new Word("five", "massokka", R.drawable.number_five));
            wordss.add  (new Word("six", "temmokka", R.drawable.number_six));
            wordss.add  (new Word("seven", "kenkaku", R.drawable.number_seven));
            wordss.add  (new Word("eight", "kawinta", R.drawable.number_eight));
            wordss.add  (new Word("nine", "wo'e", R.drawable.number_nine));
            wordss.add  (new Word("ten", "na'aacha", R.drawable.number_ten));


        WordAdapter adapter111 = new WordAdapter(this, wordss, colorPrimary);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter111);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Word word = wordss.get(i);

      //  mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());

        mMediaPlayer = MediaPlayer.create(NumbersActivity.this, R.raw.number_one);
        mMediaPlayer.start();
    }
});
/*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Word word = wordss.get(i);

     //  mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());

        mMediaPlayer1 = MediaPlayer.create(NumbersActivity.this, R.raw.number_two);
        mMediaPlayer1.start();


      /*  Word word101 = wordss.get(i);

        Log.v("NumbersActivity", "Current word: " + word101);

        mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());   //getAudioResourceId
        mMediaPlayer.start(); */



   // }
//});


        listView = (ListView)  findViewById(R.id.list);
        ArrayList<Word> words = new ArrayList<Word>();
        WordAdapter adapter = new WordAdapter(this, words, R.color.colorPrimary);
        listView.setAdapter(adapter);


        ArrayAdapter adapter1 = new WordAdapter(this, wordss, R.color.colorPrimary);
        ListView listView2 = (ListView) findViewById(R.id.list);
        listView2.setAdapter(adapter1);

        ArrayAdapter<Word> itemAdapter = new ArrayAdapter<Word>(this,R.layout.list_item, wordss);
        ListView listView11 = (ListView) findViewById(R.id.list);

        listView11.setAdapter(adapter);
        WordAdapter adapter10 = new WordAdapter(this, wordss, R.color.colorPrimary);

        ListView listView1 = (ListView) findViewById(R.id.list);

        listView1.setAdapter(adapter10);    //  That is code was not Found Was not Want to Show Data in Activity Becouse Was not Found

/*listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

        releaseMediaPlayer();
    }
});
    }

    private void releaseMediaPlayer() {
        if (mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;

        }*/
    }
}
