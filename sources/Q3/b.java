package Q3;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.provider.CallLog;
import android.telecom.PhoneAccountHandle;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

public class b {
    public ArrayList a(Context context, String str, int i4) {
        String str2;
        String str3;
        String str4;
        String str5;
        c(context);
        ArrayList arrayList = new ArrayList();
        Uri build = CallLog.Calls.CONTENT_URI.buildUpon().appendQueryParameter("limit", Integer.toString(i4)).build();
        String str6 = "number";
        String str7 = "date";
        String str8 = "duration";
        String str9 = "name";
        String[] strArr = {"", "", ""};
        strArr[0] = str;
        strArr[1] = Integer.toString(1);
        strArr[2] = Long.toString(System.currentTimeMillis() - 2505600000L);
        Bundle bundle = new Bundle();
        bundle.putString("android:query-arg-sql-selection", "subscription_id = ? AND type = ? AND date >= ?");
        bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
        bundle.putStringArray("android:query-arg-sort-columns", new String[]{str7});
        bundle.putInt("android:query-arg-sort-direction", 1);
        Cursor query = context.getContentResolver().query(build, new String[]{str6, str7, str8, str9, "type"}, bundle, (CancellationSignal) null);
        if (query == null) {
            System.out.println("mCursor is null!");
        } else if (query.getCount() < 1) {
            query.close();
        } else {
            int count = query.getCount();
            query.moveToFirst();
            int i5 = 0;
            while (i5 < count) {
                HashMap hashMap = new HashMap();
                String string = query.getString(query.getColumnIndexOrThrow(str6));
                if (string == null) {
                    string = "";
                }
                hashMap.put("NUMBER", string);
                String string2 = query.getString(query.getColumnIndexOrThrow(str8));
                if (string2 == null) {
                    str2 = "";
                } else {
                    str2 = b(Duration.ofSeconds(Long.parseLong(string2)));
                }
                hashMap.put("DURATION", str2);
                String string3 = query.getString(query.getColumnIndexOrThrow(str9));
                if (string3 == null) {
                    string3 = "";
                }
                hashMap.put("CACHED_NAME", string3);
                String string4 = query.getString(query.getColumnIndexOrThrow(str7));
                int i6 = count;
                String str10 = str6;
                if (string4 != null) {
                    str5 = str7;
                    str4 = str8;
                    str3 = str9;
                    Date date = new Date(Long.parseLong(string4));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
                    String format = simpleDateFormat.format(date);
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
                    String format2 = simpleDateFormat2.format(date);
                    hashMap.put("DATE24HR", format);
                    hashMap.put("DATE12HR", format2);
                } else {
                    str5 = str7;
                    str4 = str8;
                    str3 = str9;
                    hashMap.put("DATE24HR", "");
                    hashMap.put("DATE12HR", "");
                }
                int i7 = query.getInt(query.getColumnIndexOrThrow("type"));
                hashMap.put("CALL_TYPE", i7 == 3 ? "MISSED" : i7 == 5 ? "REJECTED" : "INCOMING");
                PrintStream printStream = System.out;
                printStream.println((String) hashMap.get("NUMBER"));
                printStream.println((String) hashMap.get("CACHED_NAME"));
                printStream.println((String) hashMap.get("DURATION"));
                printStream.println((String) hashMap.get("DATE24HR"));
                printStream.println((String) hashMap.get("DATE12HR"));
                printStream.println((String) hashMap.get("CALL_TYPE"));
                arrayList.add(hashMap);
                query.moveToNext();
                i5++;
                count = i6;
                str6 = str10;
                str7 = str5;
                str8 = str4;
                str9 = str3;
            }
            query.close();
        }
        return arrayList;
    }

    public String b(Duration duration) {
        return duration.toString().substring(2).replaceAll("(\\d[HMS])(?!$)", "$1 ").toLowerCase();
    }

    public HashMap c(Context context) {
        int i4;
        HashMap hashMap = new HashMap();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
        List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager != null ? subscriptionManager.getActiveSubscriptionInfoList() : null;
        ArrayList arrayList = (ArrayList) ((TelecomManager) context.getSystemService(TelecomManager.class)).getCallCapablePhoneAccounts();
        if (arrayList != null) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                String id = ((PhoneAccountHandle) arrayList.get(i5)).getId();
                PrintStream printStream = System.out;
                printStream.println("Loop Index is : " + i5);
                printStream.println("PhoneAccountId is : " + id);
                if (activeSubscriptionInfoList != null && !activeSubscriptionInfoList.isEmpty()) {
                    Iterator<SubscriptionInfo> it = activeSubscriptionInfoList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        SubscriptionInfo next = it.next();
                        PrintStream printStream2 = System.out;
                        printStream2.println("Subscription ID in SathiCallLog is : " + next.getSubscriptionId());
                        printStream2.println("ICC ID in SathiCallLog is : " + next.getIccId());
                        if (!String.valueOf(next.getSubscriptionId()).equals(id)) {
                            if (next.getIccId() != null && next.getIccId().contains(String.valueOf(id))) {
                                i4 = next.getSimSlotIndex();
                                printStream2.println("Subscription ID match found with ICC ID, so setting SIM Slot Index as : " + next.getSimSlotIndex());
                                break;
                            }
                        } else {
                            i4 = next.getSimSlotIndex();
                            printStream2.println("Subscription ID match found with PhoneAccountId, so setting SIM Slot Index as : " + next.getSimSlotIndex());
                            break;
                        }
                    }
                    hashMap.put(Integer.valueOf(i4), ((PhoneAccountHandle) arrayList.get(i5)).getId());
                }
                i4 = i5;
                hashMap.put(Integer.valueOf(i4), ((PhoneAccountHandle) arrayList.get(i5)).getId());
            }
        }
        return hashMap;
    }
}
