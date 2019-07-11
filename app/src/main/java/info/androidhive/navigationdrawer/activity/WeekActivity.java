package info.androidhive.navigationdrawer.activity;

import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import info.androidhive.navigationdrawer.R;

public class WeekActivity extends AppCompatActivity {

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference reference;
    private DatabaseReference childrefrence1,childrefrence2,childrefrence3,childrefrence4,childrefrence5,childrefrence6,childrefrence7;
    private DatabaseReference rootRef1,rootRef2,rootRef3,rootRef4,rootRef5,rootRef6,rootRef7;
    private DatabaseReference demoRef1,demoRef2,demoRef3,demoRef4,demoRef5,demoRef6,demoRef7;

    private TextView suntextView,montextView,tuestextView,wednestextView,thurstextView,fritextView,saturtextView;
    private ImageView sunimageview,monimageview,tuesimageview,wednesimageview,thursimageview,friimageview,saturimageview;

    private TextView date1,date2,date3,date4,date5,date6,date7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        suntextView = (TextView) findViewById(R.id.sunshow);
        montextView = (TextView) findViewById(R.id.monshow);
        tuestextView = (TextView) findViewById(R.id.tuesshow);
        wednestextView = (TextView) findViewById(R.id.wednesshow);
        thurstextView = (TextView) findViewById(R.id.thursshow);
        fritextView = (TextView) findViewById(R.id.frishow);
        saturtextView = (TextView) findViewById(R.id.saturshow);

        sunimageview = (ImageView) findViewById(R.id.sunimg);
        monimageview = (ImageView) findViewById(R.id.monimg);
        tuesimageview = (ImageView) findViewById(R.id.tuesimg);
        wednesimageview = (ImageView) findViewById(R.id.wednesimg);
        thursimageview = (ImageView) findViewById(R.id.thursimg);
        friimageview = (ImageView) findViewById(R.id.friimg);
        saturimageview = (ImageView) findViewById(R.id.saturimg);

        date1 = (TextView) findViewById(R.id.sundate);
        date2 = (TextView) findViewById(R.id.mondate);
        date3 = (TextView) findViewById(R.id.tuesdate);
        date4 = (TextView) findViewById(R.id.wednesdate);
        date5 = (TextView) findViewById(R.id.thursdate);
        date6 = (TextView) findViewById(R.id.fridate);
        date7 = (TextView) findViewById(R.id.saturdate);


        firebaseDatabase = FirebaseDatabase.getInstance();

        reference = firebaseDatabase.getReference();

        //database reference pointing to root of database
        rootRef1 = rootRef2 = rootRef3 = rootRef4 = rootRef5 = rootRef6 = rootRef7 = FirebaseDatabase.getInstance().getReference();

        //database reference pointing to demo node
        demoRef1 = rootRef1.child("events/sunday");
        demoRef2 = rootRef2.child("events/monday");
        demoRef3 = rootRef3.child("events/tuesday");
        demoRef4 = rootRef4.child("events/wednesday");
        demoRef5 = rootRef5.child("events/thursday");
        demoRef6 = rootRef6.child("events/friday");
        demoRef7 = rootRef7.child("events/saturday");

        //  ------------------------------------------------------------------------------------  //


        demoRef1.child("date").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                date1.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef2.child("date").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                date2.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef3.child("date").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                date3.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef4.child("date").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                date4.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef5.child("date").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                date5.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef6.child("date").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                date6.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef7.child("date").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String value = dataSnapshot.getValue(String.class);
                date7.setText(value);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });


        //  ------------------------------------------------------------------------------------  //


        suntextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,SundayActivity.class);
                startActivity(intent);

            }
        });

        montextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,MondayActivity.class);
                startActivity(intent);

            }
        });

        tuestextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,TuesdayActivity.class);
                startActivity(intent);

            }
        });

        wednestextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,WednesdayActivity.class);
                startActivity(intent);

            }
        });

        thurstextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,ThursdayActivity.class);
                startActivity(intent);

            }
        });

        fritextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,FridayActivity.class);
                startActivity(intent);

            }
        });

        saturtextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,SaturdayActivity.class);
                startActivity(intent);

            }
        });

        //  ------------------------------------------------------------------------------------  //

        sunimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,SundayActivity.class);
                startActivity(intent);

            }
        });

        monimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,MondayActivity.class);
                startActivity(intent);

            }
        });

        tuesimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,TuesdayActivity.class);
                startActivity(intent);

            }
        });

        wednesimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,WednesdayActivity.class);
                startActivity(intent);

            }
        });

        thursimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,ThursdayActivity.class);
                startActivity(intent);

            }
        });

        friimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,FridayActivity.class);
                startActivity(intent);

            }
        });

        saturimageview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(WeekActivity.this,SaturdayActivity.class);
                startActivity(intent);

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == android.R.id.home) {

            onBackPressed();
            return true;

        }

        return super.onOptionsItemSelected(item);
    }

}
