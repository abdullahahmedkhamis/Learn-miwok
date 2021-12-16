package com.example.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    public WordAdapter(Context context, ArrayList<Word> resource, int colorAccent) {
        super(context, 0,resource);


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word word = getItem(position);
        if (convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent, false);
        }

        TextView mDefaultTranslation,mMiwokTranslation;
        ImageView imageView;

        mDefaultTranslation = convertView.findViewById(R.id.miwok_text_veiw);
                mMiwokTranslation = convertView.findViewById(R.id.default_text_view);


imageView = convertView.findViewById(R.id.imageView);

                mDefaultTranslation.setText(word.getmDefaultTranslation());
                mMiwokTranslation.setText(word.getmMiwokTranslation());

//                imageView.setImageResource(word.getmImageResourcedId());

        if (word.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(word.getmImageResourcedId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }


        return convertView;

    }


}





