package com.example.uniway;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class FriendsScreen extends AppCompatActivity  {


    //Defining android ListView
    ListView mListView;

    //Elements that will be displayed in android ListView
    String[] friendNames = new String[]{"Jacob", "Mary", "Allison",
            "Jenny", "Jarrod", "Karen"};

    String[] friendScores = new String[]{"23", "18", "27",
            "14", "11", "0"};

    final int[] images = new int[]{R.drawable.friends_setting_icon, R.drawable.friends_setting_icon,
            R.drawable.friends_setting_icon,R.drawable.friends_setting_icon,
            R.drawable.friends_setting_icon, R.drawable.friends_setting_icon
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friends_screen);

        mListView = (ListView) findViewById(R.id.friend_list_view);

        //Declaring Array adapter
        CustomAdapter customAdapter = new CustomAdapter();
        //Setting the android ListView's adapter to the newly created adapter
        mListView.setAdapter(customAdapter);
    }


    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.friends_custom_list, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView13);
            TextView mTextView = view.findViewById(R.id.textView13);

            mImageView.setImageResource(images[position]);
            mTextView.setText(friendNames[position]+" "+friendScores[position]+" points!");

            return view;
        }
    }

}
