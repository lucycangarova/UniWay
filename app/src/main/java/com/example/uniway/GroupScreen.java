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

public class GroupScreen extends AppCompatActivity {


    //Defining android ListView
    ListView mListView;

    //Elements that will be displayed in android ListView
    String[] menuOptions = new String[]{"Group One ", "Group Two", "Group Three"};

    //Ids of flag Images that are placed in res> drawable folder. They return the int value
    final int[] images = new int[]{R.drawable.group_settings, R.drawable.group_settings,
            R.drawable.group_settings};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_screen);

        mListView = (ListView) findViewById(R.id.group_view_list);

        //Declaring Array adapter
        GroupScreen.CustomAdapter customAdapter = new GroupScreen.CustomAdapter();
        //Setting the android ListView's adapter to the newly created adapter
        mListView.setAdapter(customAdapter);

    }

    public void startBack(View view){
        Intent intent = new Intent(this, MenuScreen.class);
        startActivity(intent);
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
            View view = getLayoutInflater().inflate(R.layout.custom_list_view, null);
            ImageView mImageView = (ImageView) view.findViewById(R.id.imageView3);
            TextView mTextView = view.findViewById(R.id.textView3);

            mImageView.setImageResource(images[position]);
            mTextView.setText(menuOptions[position]);

            return view;
        }
    }
}
