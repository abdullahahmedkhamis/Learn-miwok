package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    private ListView listView;

    private MediaPlayer mMediaPlayer;
    private MediaPlayer mMediaPlayer1;


   /* private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();

        }


    };*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);


        final ArrayList<Word> wordss = new ArrayList<Word>();

        wordss.add  (new Word("Where are you going?", "minto wuksus", R.drawable.donut));
        wordss.add  (new Word("What is your name?" , "tinnә oyaase'nә", R.drawable.donut));
        wordss.add  (new Word("My name is...", "oyaaset...", R.drawable.donut));
        wordss.add  (new Word("How are you feeling?", "michәksәs?", R.drawable.donut));
        wordss.add  (new Word("I’m feeling good.", "kuchi achit", R.drawable.donut));
        wordss.add  (new Word("Are you coming?", "әәnәs'aa?", R.drawable.donut));
        wordss.add  (new Word("Yes, I’m coming.", "hәә’ әәnәm", R.drawable.donut));
        wordss.add  (new Word("I’m coming.", "әәnәm", R.drawable.donut));
        wordss.add  (new Word("Let’s go.", "yoowutis", R.drawable.donut));
        wordss.add  (new Word("Come here.", "әnni'nem", R.drawable.donut));



      //  WordAdapter adapter11 = new WordAdapter(this, wordss);
      //  WordAdapter adapter12 = new WordAdapter(this, wordss, R.color.colorAccent);

       // listView = (ListView)  findViewById(R.id.list);   //  It's Writing is Wrong
       // ArrayList<Word> words = new ArrayList<Word>();

        WordAdapter adapter = new WordAdapter(this, wordss, R.color.colorAccent);  // Not words but wordss
        ListView listView = (ListView) findViewById(R.id.list);   // Was not Found in here
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = wordss.get(i);
                mMediaPlayer = MediaPlayer.create(Phrases.this, R.raw.phrase_where_are_you_going);   // And mMediaPlayer Must to be Difrient here and blow
                mMediaPlayer.start();
                Log.v("NumbersActivity", "Current word: " + word.toString());



            }
        });


     /*   ArrayAdapter adapter1 = new WordAdapter(this, wordss, R.color.colorAccent);

        ArrayAdapter<Word> itemAdapter = new ArrayAdapter<Word>(this,R.layout.list_item, wordss);
        ListView listView11 = (ListView) findViewById(R.id.list);

        listView11.setAdapter(adapter);
        WordAdapter adapter10 = new WordAdapter(this, wordss, R.color.colorAccent); */

        ListView listView1 = (ListView) findViewById(R.id.list);

        //listView1.setAdapter(adapter10);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Word word = wordss.get(i);
                mMediaPlayer1 = MediaPlayer.create(Phrases.this, word.getmAudioResourceId());
                mMediaPlayer1.start();
              //  mMediaPlayer1.setOnCompletionListener(mCompletionListener);



            }
        });
    }
   /* private void releaseMediaPlayer() {

        if(mMediaPlayer != null){
            mMediaPlayer.release();
            mMediaPlayer = null;

        }
    }*/
}
