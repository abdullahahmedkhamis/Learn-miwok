package com.example.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    private ListView listView;
    private MediaPlayer mMediaPlayer;

private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
    @Override
    public void onCompletion(MediaPlayer mediaPlayer) {
        releaseMediaPlayer();
    }
};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);




       final ArrayList<Word> wordss = new ArrayList<Word>();

        wordss.add  (new Word("red", "weṭeṭṭi", R.drawable.color_red));
        wordss.add  (new Word("green", "chokokki", R.drawable.color_green));
        wordss.add  (new Word("brown", "ṭakaakki", R.drawable.color_brown));
        wordss.add  (new Word("gray", "ṭopoppi", R.drawable.color_gray));
        wordss.add  (new Word("black", "kululli", R.drawable.color_black));
        wordss.add  (new Word("white" , "kelelli", R.drawable.color_white));
        wordss.add  (new Word("dusty yellow" , "ṭopiisә", R.drawable.color_dusty_yellow));
        wordss.add  (new Word("mustard yellow", "chiwiiṭә", R.drawable.color_mustard_yellow));

      //  WordAdapter adapter111 = new WordAdapter(this, wordss);
      //  WordAdapter adapter11 = new WordAdapter(this, wordss, R.color.design_default_color_primary);


      //  listView = (ListView)  findViewById(R.id.list);
      //  final ArrayList<Word> words = new ArrayList<Word>();
        WordAdapter adapter = new WordAdapter(this, wordss, R.color.colorAccent);  // not words
        ListView listView11 = (ListView) findViewById(R.id.list);
        listView11.setAdapter(adapter);  // not listView


       // ArrayAdapter adapter1 = new WordAdapter(this, wordss, R.color.colorAccent);

      //  ArrayAdapter<Word> itemAdapter = new ArrayAdapter<Word>(this,R.layout.list_item, wordss);
      //  ListView listView111 = (ListView) findViewById(R.id.list);

       // listView11.setAdapter(adapter);
       // WordAdapter adapter10 = new WordAdapter(this, wordss, R.color.colorAccent);

       // ListView listView1 = (ListView) findViewById(R.id.list);

       // listView1.setAdapter(adapter10);
        listView11.setOnItemClickListener(new AdapterView.OnItemClickListener() {      // not listView but listView11
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//releaseMediaPlayer();
Word word = wordss.get(i);
//mMediaPlayer = MediaPlayer.create(Colors.this, word.getmAudioResourceId());
                mMediaPlayer = MediaPlayer.create(Colors.this, R.raw.color_red); // that Was not Found here
                mMediaPlayer.start();;
//mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }
    private void releaseMediaPlayer() {
        if(mMediaPlayer != null){
            mMediaPlayer.release();;
            mMediaPlayer = null;
        }
    }
}
