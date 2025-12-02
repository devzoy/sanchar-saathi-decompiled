package com.pairip.licensecheck;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class LicenseContentProvider extends ContentProvider {
    public boolean onCreate() {
        new LicenseClient(getContext()).initializeLicenseCheck();
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new UnsupportedOperationException("Query is not supported ");
    }

    public String getType(Uri uri) {
        throw new UnsupportedOperationException("GetType is not supported ");
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("Insert is not supported ");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw new UnsupportedOperationException("Delete is not supported ");
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("Update is not supported ");
    }
}
