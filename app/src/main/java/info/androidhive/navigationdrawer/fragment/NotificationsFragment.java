package info.androidhive.navigationdrawer.fragment;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import info.androidhive.navigationdrawer.R;
import info.androidhive.navigationdrawer.activity.AboutUsActivity;
import info.androidhive.navigationdrawer.activity.PrivacyPolicyActivity;

public class NotificationsFragment extends Fragment {

    ImageView downloadjanuary,downloadfebruary,downloadmarch,downloadapril,downloadmay,downloadjune;
    ImageView downloadjuly,downloadaugust,downloadseptember,downloadoctober,downloadnovember,downloaddecember;

    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference reference;
    private DatabaseReference childrefrence;
    private ImageView image;
    private DatabaseReference rootRef1,rootRef2,rootRef3,rootRef4,rootRef5,rootRef6,rootRef7,rootRef8,rootRef9,rootRef10,rootRef11,rootRef12;
    private DatabaseReference demoRef1,demoRef2,demoRef3,demoRef4,demoRef5,demoRef6,demoRef7,demoRef8,demoRef9,demoRef10,demoRef11,demoRef12;

    private String url1 = new String();
    private String url2 = new String();
    private String url3 = new String();
    private String url4 = new String();
    private String url5 = new String();
    private String url6 = new String();
    private String url7 = new String();
    private String url8 = new String();
    private String url9 = new String();
    private String url10 = new String();
    private String url11 = new String();
    private String url12 = new String();


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public NotificationsFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static NotificationsFragment newInstance(String param1, String param2) {
        NotificationsFragment fragment = new NotificationsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    public void setUrl1(String value){
        this.url1 = value;
    }
    public void setUrl2(String value){
        this.url2 = value;
    }
    public void setUrl3(String value){
        this.url3 = value;
    }
    public void setUrl4(String value){
        this.url4 = value;
    }
    public void setUrl5(String value){
        this.url5 = value;
    }
    public void setUrl6(String value){
        this.url6 = value;
    }
    public void setUrl7(String value){
        this.url7 = value;
    }
    public void setUrl8(String value){
        this.url8 = value;
    }
    public void setUrl9(String value){
        this.url9 = value;
    }
    public void setUrl10(String value){
        this.url10 = value;
    }
    public void setUrl11(String value){
        this.url11 = value;
    }
    public void setUrl12(String value){
        this.url12 = value;
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onActivityCreated(Bundle savedInstanceState)
    {
        super.onActivityCreated(savedInstanceState);


        downloadjanuary = (ImageView) getView().findViewById(R.id.january);
        downloadfebruary = (ImageView) getView().findViewById(R.id.february);
        downloadmarch = (ImageView) getView().findViewById(R.id.march);
        downloadapril = (ImageView) getView().findViewById(R.id.april);
        downloadmay = (ImageView) getView().findViewById(R.id.may);
        downloadjune = (ImageView) getView().findViewById(R.id.june);
        downloadjuly = (ImageView) getView().findViewById(R.id.july);
        downloadaugust = (ImageView) getView().findViewById(R.id.august);
        downloadseptember = (ImageView) getView().findViewById(R.id.september);
        downloadoctober = (ImageView) getView().findViewById(R.id.october);
        downloadnovember = (ImageView) getView().findViewById(R.id.november);
        downloaddecember = (ImageView) getView().findViewById(R.id.december);

        image = (ImageView) getView().findViewById(R.id.image);

        firebaseDatabase = FirebaseDatabase.getInstance();
        reference = firebaseDatabase.getReference();
        childrefrence = reference.child("Download/Component/Image");

        rootRef1 = rootRef2 = rootRef3 = rootRef4 = rootRef5 = rootRef6 = rootRef7 = rootRef8 = rootRef9 = rootRef10 = rootRef11 = rootRef12 = FirebaseDatabase.getInstance().getReference();

        demoRef1 = rootRef1.child("Download/Pdf");
        demoRef2 = rootRef2.child("Download/Pdf");
        demoRef3 = rootRef3.child("Download/Pdf");
        demoRef4 = rootRef4.child("Download/Pdf");
        demoRef5 = rootRef5.child("Download/Pdf");
        demoRef6 = rootRef6.child("Download/Pdf");
        demoRef7 = rootRef7.child("Download/Pdf");
        demoRef8 = rootRef8.child("Download/Pdf");
        demoRef9 = rootRef9.child("Download/Pdf");
        demoRef10 = rootRef10.child("Download/Pdf");
        demoRef11 = rootRef11.child("Download/Pdf");
        demoRef12 = rootRef12.child("Download/Pdf");

        demoRef1.child("January").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl1(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef2.child("February").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl2(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef3.child("March").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl3(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef4.child("April").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl4(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef5.child("May").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl5(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef6.child("June").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl6(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef7.child("July").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl7(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef8.child("August").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl8(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef9.child("September").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl9(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef10.child("October").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl10(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef11.child("November").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl11(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        demoRef12.child("December").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String value = dataSnapshot.getValue(String.class);
                setUrl12(value);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        downloadjanuary.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url1);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadfebruary.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url2);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadmarch.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url3);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadapril.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url4);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadmay.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url5);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadjune.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url6);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadjuly.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url7);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadaugust.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url8);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadseptember.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url9);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadoctober.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url10);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloadnovember.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v)
            {
                Uri u = Uri.parse(url11);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

        downloaddecember.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)
            {
                Uri u = Uri.parse(url12);
                Intent intent = new Intent(Intent.ACTION_VIEW, u);
                startActivity(intent);
            }
        });

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public void onStart() {
        super.onStart();

        childrefrence.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String message = dataSnapshot.getValue(String.class);
                Picasso.get()
                        .load(message)
                        .into(image);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }

    ////////////////////////////////////////////////////////////////////////////////////////////////



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notifications, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
