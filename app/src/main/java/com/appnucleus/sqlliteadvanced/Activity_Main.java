package com.appnucleus.sqlliteadvanced;

import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Activity_Main extends Activity
{
    DatabaseHandler_Contact db = new DatabaseHandler_Contact(this);
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Insert();
        Retrive();
    }

    void Insert()
    {
        // Inserting Contacts
        Log.e("Insert: ", "Inserting..");
        db.addContact(new Model_Contact("Piash", "9100000000"));
        db.addContact(new Model_Contact("Rana", "9199999999"));
        db.addContact(new Model_Contact("Arman", "9522222222"));
        db.addContact(new Model_Contact("Rokey", "9533333333"));
    }

    void Retrive()
    {
        // Reading all contacts
        Log.d("Reading: ", "Reading all contacts..");
        List<Model_Contact> contacts = db.getAllContacts();

        for (Model_Contact cn : contacts)
        {
            String log = "Id: "+cn.getID()+" ,Name: " + cn.getName() + " ,Phone: " + cn.getPhoneNumber();
            // Writing Contacts to log
            Log.e("Name: ", log);
        }
    }
}
