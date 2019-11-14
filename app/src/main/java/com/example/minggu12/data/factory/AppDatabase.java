package com.example.minggu12.data.factory;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.minggu12.data.BarangDAO;
import com.example.minggu12.model.Barang;

@Database(entities = {Barang.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract BarangDAO barangDAO();

}
