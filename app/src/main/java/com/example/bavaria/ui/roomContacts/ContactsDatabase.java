package com.example.bavaria.ui.roomContacts;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {ContactsRoom.class,HeaderBill.class,typebill.class}, version = 1)
public abstract class ContactsDatabase  extends RoomDatabase {
    private static ContactsDatabase Instance;
    public abstract ContactsDao contactsDao();
    public abstract HeaderBillDao headerBillDao();
    public abstract typeBillDao typeBillDao1();




    public static synchronized ContactsDatabase getGetInstance(Context context){
        if (Instance==null){
            Instance= Room.databaseBuilder(context,ContactsDatabase.class,"contactsNumer")
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return Instance;
    }
}
