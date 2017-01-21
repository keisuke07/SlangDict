package com.example.kei.slangdict;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
<<<<<<< HEAD
import android.util.Log;

import com.example.kei.slangdict.Model.Word;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;

=======

public class MainActivity extends AppCompatActivity {

>>>>>>> 136f920fd68bcb2ad7614d17446bb5e5a5956811
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< HEAD

        mDatabase = FirebaseDatabase.getInstance().getReference().child("word").child("really");

        //Log.d("ASD", mDatabase.child("word").toString());

        mDatabase.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                Word word = dataSnapshot.getValue(Word.class);

                Log.d("ASD", "Value is: " + word.getMeaning());
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("ASD", "Failed to read value.", error.toException());
            }
        });
=======
>>>>>>> 136f920fd68bcb2ad7614d17446bb5e5a5956811
    }
}
