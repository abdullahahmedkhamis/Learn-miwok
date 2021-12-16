package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    private ListView listView;
    private MediaPlayer mMediaPlayer;
    private MediaPlayer mMediaPlayer1;

    private MediaPlayer mMediaPlayer2;

    private MediaPlayer mMediaPlayer3;


  /*  private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            // Now that the sound file has finished playing, release the media player resources.
            releaseMediaPlayer();
        }
    };*/




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);




       final   ArrayList<Word> wordss = new ArrayList<Word>();

        wordss.add  (new Word("father", "әpә", R.drawable.family_father));
        wordss.add  (new Word("mother", "әṭa", R.drawable.family_mother));
        wordss.add  (new Word("son", "angsi", R.drawable.family_son));
        wordss.add  (new Word("daughter", "tune", R.drawable.family_daughter));
        wordss.add  (new Word("older brother", "taachi", R.drawable.family_older_brother));
        wordss.add  (new Word("younger brother" , "chalitti", R.drawable.family_younger_brother));
        wordss.add  (new Word("older sister", "teṭe", R.drawable.family_older_sister));
        wordss.add  (new Word("younger sister" , "kolliti", R.drawable.family_younger_sister));
        wordss.add  (new Word("grandmother", "ama", R.drawable.family_grandmother));
        wordss.add  (new Word("grandfather", "paapa", R.drawable.family_grandfather));


       // WordAdapter adapter11 = new WordAdapter(this, wordss);
       // WordAdapter adapter111 = new WordAdapter(this, wordss, R.color.design_default_color_primary);



     //   listView = (ListView)  findViewById(R.id.list);
       // final ArrayList<Word> words = new ArrayList<Word>();
        WordAdapter adapter = new WordAdapter(this, wordss, R.color.colorAccent);  // not words
        ListView listView1 = (ListView) findViewById(R.id.list);
        listView1.setAdapter(adapter);     // listView1  not listView just
       // ArrayAdapter adapter1 = new WordAdapter(this, wordss, R.color.colorAccent);
       // ArrayAdapter<Word> itemAdapter = new ArrayAdapter<Word>(this,R.layout.list_item, wordss);
      //  ListView listView11 = (ListView) findViewById(R.id.list);
       // listView11.setAdapter(adapter);
       // WordAdapter adapter10 = new WordAdapter(this, wordss, R.color.colorAccent);
       // listView1.setAdapter(adapter10);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {    // not  listView Just
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
             //   releaseMediaPlayer();
              //  Word word = words.get(i);
                Word word = wordss.get(i);   // not words
                // mMediaPlayer = MediaPlayer.create(FamilyMembers.this, word.getmAudioResourceId());
                mMediaPlayer = MediaPlayer.create(FamilyMembers.this, R.raw.family_grandfather); // not mMediaPlayer1
                mMediaPlayer.start();
              //  mMediaPlayer.setOnCompletionListener(mCompletionListener);


            }
        });

    }
    private void releaseMediaPlayer() {
        if(mMediaPlayer != null) {
            mMediaPlayer.release();
            mMediaPlayer = null;
        }
    }

}
