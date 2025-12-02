package Q3;

import android.content.Context;
import android.database.Cursor;
import android.provider.Telephony;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

public class c {
    public ArrayList a(Context context, int i4, int i5) {
        int i6;
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        String str3 = "address";
        String str4 = "body";
        int i7 = 0;
        String[] strArr = {"", ""};
        strArr[0] = Integer.toString(i4);
        strArr[1] = Long.toString(System.currentTimeMillis() - 2505600000L);
        Cursor query = context.getContentResolver().query(Telephony.Sms.Inbox.CONTENT_URI, new String[]{str3, str4, "date"}, "sub_id = ? AND date >= ?", strArr, "date DESC LIMIT " + Integer.toString(i5));
        if (query == null) {
            System.out.println("mCursor is null!");
        } else if (query.getCount() < 1) {
            query.close();
        } else {
            int count = query.getCount();
            query.moveToFirst();
            while (i7 < count) {
                HashMap hashMap = new HashMap();
                String string = query.getString(query.getColumnIndexOrThrow(str3));
                if (string == null) {
                    string = "";
                }
                hashMap.put("ADDRESS", string);
                String string2 = query.getString(query.getColumnIndexOrThrow(str4));
                if (string2 == null) {
                    string2 = "";
                }
                hashMap.put("BODY", string2);
                String string3 = query.getString(query.getColumnIndexOrThrow("date"));
                if (string3 != null) {
                    str = str3;
                    str2 = str4;
                    Date date = new Date(Long.parseLong(string3));
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
                    simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
                    String format = simpleDateFormat.format(date);
                    i6 = count;
                    SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh:mm a");
                    simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
                    String format2 = simpleDateFormat2.format(date);
                    hashMap.put("DATE24HR", format);
                    hashMap.put("DATE12HR", format2);
                } else {
                    i6 = count;
                    str = str3;
                    str2 = str4;
                    hashMap.put("DATE24HR", "");
                    hashMap.put("DATE12HR", "");
                }
                PrintStream printStream = System.out;
                printStream.println((String) hashMap.get("ADDRESS"));
                printStream.println((String) hashMap.get("BODY"));
                printStream.println((String) hashMap.get("DATE24HR"));
                printStream.println((String) hashMap.get("DATE12HR"));
                arrayList.add(hashMap);
                query.moveToNext();
                i7++;
                str3 = str;
                count = i6;
                str4 = str2;
            }
            query.close();
        }
        return arrayList;
    }

    public HashMap b(Context context) {
        HashMap hashMap = new HashMap();
        SubscriptionManager subscriptionManager = (SubscriptionManager) context.getSystemService(SubscriptionManager.class);
        if (subscriptionManager != null) {
            List<SubscriptionInfo> activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
            if (activeSubscriptionInfoList == null || activeSubscriptionInfoList.isEmpty()) {
                System.out.println("SathiSmsLog : No SIM cards available");
            } else {
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    String number = next.getNumber();
                    PrintStream printStream = System.out;
                    printStream.println("Phone number is ============================================================= : " + number);
                    if (number == null || number.isEmpty()) {
                        number = Integer.toString(next.getSimSlotIndex());
                    } else if (number.length() > 10) {
                        number = number.substring(number.length() - 10);
                    }
                    hashMap.put(number, Integer.valueOf(next.getSubscriptionId()));
                }
            }
        }
        return hashMap;
    }
}
