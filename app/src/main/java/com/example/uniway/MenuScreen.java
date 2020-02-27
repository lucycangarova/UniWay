package com.example.uniway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MenuScreen extends AppCompatActivity {

    //Defining android ListView
    ListView mListView;

    //Elements that will be displayed in android ListView
    String[] menuOptions = new String[]{"Challenges", "Tour Mode", "Friends",
            "Groups", "Profile", "Settings"};

    //Ids of flag Images that are placed in res> drawable folder. They return the int value
    final int[] images = new int[]{R.drawable.challenges_icon, R.drawable.tour_icon,
            R.drawable.friend_icon,R.drawable.group_icon,
            R.drawable.profile_icon, R.drawable.settings_icon};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_screen);

        mListView = (ListView) findViewById(R.id.menu_list_view);

        //Declaring Array adapter
        CustomAdapter customAdapter = new CustomAdapter();
        //Setting the android ListView's adapter to the newly created adapter
        mListView.setAdapter(customAdapter);


        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //The position where the list item is clicked is obtained from the
                //the parameter position of the android listview
                int itemPosition = position;

                //Get the String value of the item where the user clicked
                String itemValue = (String) mListView.getItemAtPosition(position);

                //In order to start displaying new activity we need an intent
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);

                //Here we will pass the previously created intent as parameter
                startActivity(intent);

            }
        });
    }

    class CustomAdapter extends BaseAdapter{

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
            View view = getLayoutInflater().inflate(R.layout.custom_list_view, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView3);
            TextView mTextView = view.findViewById(R.id.textView3);

            mImageView.setImageResource(images[position]);
            mTextView.setText(menuOptions[position]);

            return view;
        }
    }
}
