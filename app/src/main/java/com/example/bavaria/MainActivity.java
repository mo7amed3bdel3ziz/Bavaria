package com.example.bavaria;

import static io.reactivex.rxjava3.schedulers.Schedulers.computation;

import android.app.Dialog;
import android.content.ClipData;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.bavaria.databinding.ActivityMainBinding;
import com.example.bavaria.ui.roomContacts.ContactsDatabase;
import com.example.bavaria.ui.roomContacts.ContactsRoom;
import com.example.bavaria.ui.roomContacts.typebill;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.SingleObserver;
import io.reactivex.rxjava3.disposables.Disposable;


public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
    private ActivityMainBinding binding;
    Dialog dialog;

    typebill item =new typebill();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarMain.toolbar);
        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.receiptstatus, R.id.sendsellsFragment, R.id.companyDataFragment, R.id.usersFragment, R.id.logoutFragment,
                R.id.sellsID, R.id.logoutFragment, R.id.clientsId, R.id.sellsFragment)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);


        FloatingActionButton floatingActionButton = findViewById(R.id.addProductFAB);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = new Dialog(MainActivity.this);

                // set custom dialog
                dialog.setContentView(R.layout.chos_itemse);
                //  dialog.setContentView(R.layout.chos_itemse);

                // set custom height and width
                dialog.getWindow().setLayout(900, 1500);

                // set transparent background
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

                // show dialog
                dialog.show();
                Button save =dialog.findViewById(R.id.saveBtn);
                save.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        addItem(item);
                        item.setLastUUID("فوزى");
                        ArrayList<typebill> postitem =new ArrayList<>();
                        postitem.add(item);
                        getRoom();
                    }
                });
            }




        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
    public void addItem(typebill i){


        ContactsDatabase postsDataBass =  ContactsDatabase.getGetInstance(getApplicationContext());
        //  postsDataBass.contactsDao().insertContacts()
        postsDataBass.typeBillDao1().inserttypebill(i)
                //   postsDataBass.contactsDao().insertContacts(post)


                .subscribeOn(computation())

                .subscribe(new CompletableObserver() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onComplete() {
                        Log.d("yousiiiif","complete1");

                    }
                    @Override
                    public void onError(@NonNull Throwable e) {
                        Log.d("yousiiiif",e.getMessage().toString());
                    }
                });

    }
    public void getRoom(){
        ContactsDatabase contactsDatabase=ContactsDatabase.getGetInstance(this);
        contactsDatabase.typeBillDao1().gettypebill()
                //getlistItems("123")
                .subscribeOn(computation())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SingleObserver<List<typebill>>() {
                    @Override
                    public void onSubscribe(@androidx.annotation.NonNull Disposable d) {

                    }


                    @Override
                    public void onSuccess(@androidx.annotation.NonNull List<typebill> contactsRooms) {
                        // Log.d("yousiiiif",contactsRooms.get(1).getNumber().toString());

                        StringBuilder s=new StringBuilder();

                        for (int i=0;i==contactsRooms.size();i++){

                            contactsRooms.get(i).getDescription();
                            contactsRooms.get(i).getInternalCode()  ;
                            s.append(contactsRooms.get(i).getItemCode()+""+
                                    contactsRooms.get(i).getLastUUID() ) ;
                            // textView2.append( contactsRooms.get(0).getINTERNALCODE()+"__" +contactsRooms.get(0).getDESCRIPTION());
                        }
                        Log.d("yousiiiif" ,contactsRooms.get(1).getLastUUID()
                                +""+ contactsRooms.get(1).getDescription());

                      //  textView2.setText(s.toString());
                        //   contactUsers=contactsRooms;

                        //   adapter.setContactUserslist(contactsRooms);
                        //     for (ContactsRoom r:contactsRooms){
                        //         Log.i("Contact","name:"+r.getName()+"number"+r.getNumber()+"email"+r.getEmail());
                        //     }
                        //    adapter.notifyDataSetChanged();
   
                        //   binding.contactsrecy.setAdapter(adapter);
                    }

                    @Override
                    public void onError(@androidx.annotation.NonNull Throwable e) {
                        Log.d("yousiiiif","e.getMessage().toString()");

                    }
                });

    }

}