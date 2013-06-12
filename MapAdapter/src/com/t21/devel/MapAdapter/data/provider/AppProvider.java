package com.t21.devel.MapAdapter.data.provider;

import android.database.sqlite.SQLiteDatabase;
import com.t21.devel.MapAdapter.data.bbdd.DbHelper;
import com.t21.devel.MapAdapter.data.provider.base.DespicableContentProvider;

/**
 * Created by alorma on 25/05/13.
 */
public class AppProvider extends DespicableContentProvider {

    public static final String AUTHORITY = "com.t21.devel.MapAdapter.data.provider.AppProvider";
    private SQLiteDatabase db;

    @Override
    public void recruitMinions() {
        addMinion(new LocationsMinion());
    }

    @Override
    public String getAuthority() {
        return AUTHORITY;
    }

    @Override
    public SQLiteDatabase getDb() {
        if (db == null) {
            db = new DbHelper(getContext()).getWritableDatabase();
        }
        return db;
    }
}