package com.example.firebase_01;

import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FirBase {
    private final DatabaseReference firBase;
    public FirBase()
    {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        firBase = db.getReference(Employee.class.getSimpleName());
    }
    public Task<Void> add(Employee emp)
    {
        return firBase.push().setValue(emp);
    }
}
