package ru.synergy.rvcontentproviderwithsql.contentprovider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.os.Build;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import ru.synergy.rvcontentproviderwithsql.BuildConfig;
import ru.synergy.rvcontentproviderwithsql.tablemoc.TableItems;

public class RequestProvider extends ContentProvider {

    private static final String TAG = "RequestProvider";
    private SQLiteOpenHelper mSqliteOpenHelper;
    private static final UriMatcher sUriMatcher;

    public static final String AUTHORITY = BuildConfig.APPLICATION_ID + ".db";
    public static final int TABLE_ITEMS = 0;

    static {
        sUriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        sUriMatcher.addURI(AUTHORITY, TableItems.NAME + "/offset" + "#",  TABLE_ITEMS);
    }

    public static Uri urlForItems(int limit) {
        return Uri.parse("content://" + AUTHORITY + "/" + TableItems.NAME + "/offset" + limit);
    }

    @Override
    public boolean onCreate() {
        mSqliteOpenHelper = new
        return false;
    }

    @Nullable
    @Override
    public Cursor query(@NonNull Uri uri, @Nullable String[] projection, @Nullable String selection, @Nullable String[] selectionArgs, @Nullable String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues values) {
        return null;
    }

    @Override
    public int delete(@NonNull Uri uri, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(@NonNull Uri uri, @Nullable ContentValues values, @Nullable String selection, @Nullable String[] selectionArgs) {
        return 0;
    }
}
