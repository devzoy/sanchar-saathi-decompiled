package com.dexterous.flutterlocalnotifications.models;

import android.graphics.Color;
import com.dexterous.flutterlocalnotifications.models.styles.BigPictureStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.BigTextStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.DefaultStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.InboxStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.MessagingStyleInformation;
import com.dexterous.flutterlocalnotifications.models.styles.StyleInformation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n1.C0800a;
import z2.c;

public class NotificationDetails implements Serializable {
    private static final String ACTIONS = "actions";
    private static final String ADDITIONAL_FLAGS = "additionalFlags";
    private static final String AUDIO_ATTRIBUTES_USAGE = "audioAttributesUsage";
    private static final String AUTO_CANCEL = "autoCancel";
    private static final String BIG_PICTURE = "bigPicture";
    private static final String BIG_PICTURE_BITMAP_SOURCE = "bigPictureBitmapSource";
    private static final String BIG_TEXT = "bigText";
    private static final String BODY = "body";
    private static final String BOT = "bot";
    private static final String CALLED_AT = "calledAt";
    private static final String CATEGORY = "category";
    private static final String CHANNEL_ACTION = "channelAction";
    private static final String CHANNEL_DESCRIPTION = "channelDescription";
    private static final String CHANNEL_ID = "channelId";
    private static final String CHANNEL_NAME = "channelName";
    private static final String CHANNEL_SHOW_BADGE = "channelShowBadge";
    private static final String CHRONOMETER_COUNT_DOWN = "chronometerCountDown";
    private static final String COLORIZED = "colorized";
    private static final String COLOR_ALPHA = "colorAlpha";
    private static final String COLOR_BLUE = "colorBlue";
    private static final String COLOR_GREEN = "colorGreen";
    private static final String COLOR_RED = "colorRed";
    private static final String CONTENT_TITLE = "contentTitle";
    private static final String CONVERSATION_TITLE = "conversationTitle";
    private static final String DATA_MIME_TYPE = "dataMimeType";
    private static final String DATA_URI = "dataUri";
    private static final String DAY = "day";
    private static final String ENABLE_LIGHTS = "enableLights";
    private static final String ENABLE_VIBRATION = "enableVibration";
    private static final String FULL_SCREEN_INTENT = "fullScreenIntent";
    private static final String GROUP_ALERT_BEHAVIOR = "groupAlertBehavior";
    private static final String GROUP_CONVERSATION = "groupConversation";
    private static final String GROUP_KEY = "groupKey";
    private static final String HIDE_EXPANDED_LARGE_ICON = "hideExpandedLargeIcon";
    private static final String HTML_FORMAT_BIG_TEXT = "htmlFormatBigText";
    private static final String HTML_FORMAT_CONTENT = "htmlFormatContent";
    private static final String HTML_FORMAT_CONTENT_TITLE = "htmlFormatContentTitle";
    private static final String HTML_FORMAT_LINES = "htmlFormatLines";
    private static final String HTML_FORMAT_SUMMARY_TEXT = "htmlFormatSummaryText";
    private static final String HTML_FORMAT_TITLE = "htmlFormatTitle";
    private static final String ICON = "icon";
    private static final String ICON_SOURCE = "iconSource";
    private static final String ID = "id";
    private static final String IMPORTANCE = "importance";
    private static final String IMPORTANT = "important";
    private static final String INDETERMINATE = "indeterminate";
    private static final String KEY = "key";
    private static final String LARGE_ICON = "largeIcon";
    private static final String LARGE_ICON_BITMAP_SOURCE = "largeIconBitmapSource";
    private static final String LED_COLOR_ALPHA = "ledColorAlpha";
    private static final String LED_COLOR_BLUE = "ledColorBlue";
    private static final String LED_COLOR_GREEN = "ledColorGreen";
    private static final String LED_COLOR_RED = "ledColorRed";
    private static final String LED_OFF_MS = "ledOffMs";
    private static final String LED_ON_MS = "ledOnMs";
    private static final String LINES = "lines";
    private static final String MATCH_DATE_TIME_COMPONENTS = "matchDateTimeComponents";
    private static final String MAX_PROGRESS = "maxProgress";
    private static final String MESSAGES = "messages";
    private static final String MILLISECONDS_SINCE_EPOCH = "millisecondsSinceEpoch";
    private static final String NAME = "name";
    private static final String NUMBER = "number";
    private static final String ONGOING = "ongoing";
    private static final String ONLY_ALERT_ONCE = "onlyAlertOnce";
    private static final String PAYLOAD = "payload";
    private static final String PERSON = "person";
    private static final String PLATFORM_SPECIFICS = "platformSpecifics";
    private static final String PLAY_SOUND = "playSound";
    private static final String PRIORITY = "priority";
    private static final String PROGRESS = "progress";
    private static final String REPEAT_INTERVAL = "repeatInterval";
    private static final String REPEAT_INTERVAL_MILLISECONDS = "repeatIntervalMilliseconds";
    private static final String REPEAT_TIME = "repeatTime";
    private static final String SCHEDULED_DATE_TIME = "scheduledDateTime";
    private static final String SCHEDULED_NOTIFICATION_REPEAT_FREQUENCY = "scheduledNotificationRepeatFrequency";
    private static final String SCHEDULE_MODE = "scheduleMode";
    private static final String SET_AS_GROUP_SUMMARY = "setAsGroupSummary";
    private static final String SHORTCUT_ID = "shortcutId";
    private static final String SHOW_PROGRESS = "showProgress";
    private static final String SHOW_WHEN = "showWhen";
    private static final String SILENT = "silent";
    private static final String SOUND = "sound";
    private static final String SOUND_SOURCE = "soundSource";
    private static final String STYLE = "style";
    private static final String STYLE_INFORMATION = "styleInformation";
    private static final String SUB_TEXT = "subText";
    private static final String SUMMARY_TEXT = "summaryText";
    private static final String TAG = "tag";
    private static final String TEXT = "text";
    private static final String TICKER = "ticker";
    private static final String TIMEOUT_AFTER = "timeoutAfter";
    private static final String TIMESTAMP = "timestamp";
    private static final String TIME_ZONE_NAME = "timeZoneName";
    private static final String TITLE = "title";
    private static final String URI = "uri";
    private static final String USES_CHRONOMETER = "usesChronometer";
    private static final String VIBRATION_PATTERN = "vibrationPattern";
    private static final String VISIBILITY = "visibility";
    private static final String WHEN = "when";
    public List<NotificationAction> actions;
    public int[] additionalFlags;
    public Integer audioAttributesUsage;
    public Boolean autoCancel;
    public String body;
    public Long calledAt;
    public String category;
    public NotificationChannelAction channelAction;
    public String channelDescription;
    public String channelId = "Default_Channel_Id";
    public String channelName;
    public Boolean channelShowBadge;
    public Boolean chronometerCountDown;
    public Integer color;
    public Boolean colorized;
    public Integer day;
    public Boolean enableLights;
    public Boolean enableVibration;
    public Boolean fullScreenIntent;
    public Integer groupAlertBehavior;
    public String groupKey;
    public String icon;
    public Integer iconResourceId;
    public Integer id;
    public Integer importance;
    public Boolean indeterminate;
    public Object largeIcon;
    public BitmapSource largeIconBitmapSource;
    public Integer ledColor;
    public Integer ledOffMs;
    public Integer ledOnMs;
    public DateTimeComponents matchDateTimeComponents;
    public Integer maxProgress;
    public Long millisecondsSinceEpoch;
    public Integer number;
    public Boolean ongoing;
    public Boolean onlyAlertOnce;
    public String payload;
    public Boolean playSound;
    public Integer priority;
    public Integer progress;
    public RepeatInterval repeatInterval;
    public Integer repeatIntervalMilliseconds;
    public Time repeatTime;
    @c(alternate = {"allowWhileIdle"}, value = "scheduleMode")
    public ScheduleMode scheduleMode;
    public String scheduledDateTime;
    public ScheduledNotificationRepeatFrequency scheduledNotificationRepeatFrequency;
    public Boolean setAsGroupSummary;
    public String shortcutId;
    public Boolean showProgress;
    public Boolean showWhen;
    public Boolean silent;
    public String sound;
    public SoundSource soundSource;
    public NotificationStyle style;
    public StyleInformation styleInformation;
    public String subText;
    public String tag;
    public String ticker;
    public String timeZoneName;
    public Long timeoutAfter;
    public String title;
    public Boolean usesChronometer;
    public long[] vibrationPattern;
    public Integer visibility;
    public Long when;

    public static NotificationDetails from(Map<String, Object> map) {
        NotificationDetails notificationDetails = new NotificationDetails();
        notificationDetails.payload = (String) map.get(PAYLOAD);
        notificationDetails.id = (Integer) map.get(ID);
        notificationDetails.title = (String) map.get(TITLE);
        notificationDetails.body = (String) map.get(BODY);
        notificationDetails.scheduledDateTime = (String) map.get(SCHEDULED_DATE_TIME);
        notificationDetails.timeZoneName = (String) map.get(TIME_ZONE_NAME);
        if (map.containsKey(SCHEDULED_NOTIFICATION_REPEAT_FREQUENCY)) {
            notificationDetails.scheduledNotificationRepeatFrequency = ScheduledNotificationRepeatFrequency.values()[((Integer) map.get(SCHEDULED_NOTIFICATION_REPEAT_FREQUENCY)).intValue()];
        }
        if (map.containsKey(MATCH_DATE_TIME_COMPONENTS)) {
            notificationDetails.matchDateTimeComponents = DateTimeComponents.values()[((Integer) map.get(MATCH_DATE_TIME_COMPONENTS)).intValue()];
        }
        if (map.containsKey(MILLISECONDS_SINCE_EPOCH)) {
            notificationDetails.millisecondsSinceEpoch = (Long) map.get(MILLISECONDS_SINCE_EPOCH);
        }
        if (map.containsKey(CALLED_AT)) {
            notificationDetails.calledAt = (Long) map.get(CALLED_AT);
        }
        if (map.containsKey(REPEAT_INTERVAL)) {
            notificationDetails.repeatInterval = RepeatInterval.values()[((Integer) map.get(REPEAT_INTERVAL)).intValue()];
        }
        if (map.containsKey(REPEAT_INTERVAL_MILLISECONDS)) {
            notificationDetails.repeatIntervalMilliseconds = (Integer) map.get(REPEAT_INTERVAL_MILLISECONDS);
        }
        if (map.containsKey(REPEAT_TIME)) {
            notificationDetails.repeatTime = Time.from((Map) map.get(REPEAT_TIME));
        }
        if (map.containsKey(DAY)) {
            notificationDetails.day = (Integer) map.get(DAY);
        }
        readPlatformSpecifics(map, notificationDetails);
        return notificationDetails;
    }

    private static DefaultStyleInformation getDefaultStyleInformation(Map<String, Object> map) {
        return new DefaultStyleInformation((Boolean) map.get(HTML_FORMAT_TITLE), (Boolean) map.get(HTML_FORMAT_CONTENT));
    }

    private static void readBigPictureStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        notificationDetails.styleInformation = new BigPictureStyleInformation(defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody, (String) map.get(CONTENT_TITLE), (Boolean) map.get(HTML_FORMAT_CONTENT_TITLE), (String) map.get(SUMMARY_TEXT), (Boolean) map.get(HTML_FORMAT_SUMMARY_TEXT), map.get(LARGE_ICON), map.containsKey(LARGE_ICON_BITMAP_SOURCE) ? BitmapSource.values()[((Integer) map.get(LARGE_ICON_BITMAP_SOURCE)).intValue()] : null, map.get(BIG_PICTURE), BitmapSource.values()[((Integer) map.get(BIG_PICTURE_BITMAP_SOURCE)).intValue()], (Boolean) map.get(HIDE_EXPANDED_LARGE_ICON));
    }

    private static void readBigTextStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        notificationDetails.styleInformation = new BigTextStyleInformation(defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody, (String) map.get(BIG_TEXT), (Boolean) map.get(HTML_FORMAT_BIG_TEXT), (String) map.get(CONTENT_TITLE), (Boolean) map.get(HTML_FORMAT_CONTENT_TITLE), (String) map.get(SUMMARY_TEXT), (Boolean) map.get(HTML_FORMAT_SUMMARY_TEXT));
    }

    private static void readChannelInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.channelId = (String) map.get(CHANNEL_ID);
        notificationDetails.channelName = (String) map.get(CHANNEL_NAME);
        notificationDetails.channelDescription = (String) map.get(CHANNEL_DESCRIPTION);
        notificationDetails.importance = (Integer) map.get(IMPORTANCE);
        notificationDetails.channelShowBadge = (Boolean) map.get(CHANNEL_SHOW_BADGE);
        notificationDetails.channelAction = NotificationChannelAction.values()[((Integer) map.get(CHANNEL_ACTION)).intValue()];
    }

    private static void readColor(NotificationDetails notificationDetails, Map<String, Object> map) {
        Integer num = (Integer) map.get(COLOR_ALPHA);
        Integer num2 = (Integer) map.get(COLOR_RED);
        Integer num3 = (Integer) map.get(COLOR_GREEN);
        Integer num4 = (Integer) map.get(COLOR_BLUE);
        if (num != null && num2 != null && num3 != null && num4 != null) {
            notificationDetails.color = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
    }

    private static void readGroupingInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.groupKey = (String) map.get(GROUP_KEY);
        notificationDetails.setAsGroupSummary = (Boolean) map.get(SET_AS_GROUP_SUMMARY);
        notificationDetails.groupAlertBehavior = (Integer) map.get(GROUP_ALERT_BEHAVIOR);
    }

    private static void readInboxStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        notificationDetails.styleInformation = new InboxStyleInformation(defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody, (String) map.get(CONTENT_TITLE), (Boolean) map.get(HTML_FORMAT_CONTENT_TITLE), (String) map.get(SUMMARY_TEXT), (Boolean) map.get(HTML_FORMAT_SUMMARY_TEXT), (ArrayList) map.get(LINES), (Boolean) map.get(HTML_FORMAT_LINES));
    }

    private static void readLargeIconInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        Integer num;
        notificationDetails.largeIcon = map.get(LARGE_ICON);
        if (map.containsKey(LARGE_ICON_BITMAP_SOURCE) && (num = (Integer) map.get(LARGE_ICON_BITMAP_SOURCE)) != null) {
            notificationDetails.largeIconBitmapSource = BitmapSource.values()[num.intValue()];
        }
    }

    private static void readLedInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        Integer num = (Integer) map.get(LED_COLOR_ALPHA);
        Integer num2 = (Integer) map.get(LED_COLOR_RED);
        Integer num3 = (Integer) map.get(LED_COLOR_GREEN);
        Integer num4 = (Integer) map.get(LED_COLOR_BLUE);
        if (!(num == null || num2 == null || num3 == null || num4 == null)) {
            notificationDetails.ledColor = Integer.valueOf(Color.argb(num.intValue(), num2.intValue(), num3.intValue(), num4.intValue()));
        }
        notificationDetails.enableLights = (Boolean) map.get(ENABLE_LIGHTS);
        notificationDetails.ledOnMs = (Integer) map.get(LED_ON_MS);
        notificationDetails.ledOffMs = (Integer) map.get(LED_OFF_MS);
    }

    private static ArrayList<MessageDetails> readMessages(ArrayList<Map<String, Object>> arrayList) {
        ArrayList<MessageDetails> arrayList2 = new ArrayList<>();
        if (arrayList != null) {
            Iterator<Map<String, Object>> it = arrayList.iterator();
            while (it.hasNext()) {
                Map next = it.next();
                arrayList2.add(new MessageDetails((String) next.get(TEXT), C0800a.a(next.get(TIMESTAMP)), readPersonDetails((Map) next.get(PERSON)), (String) next.get(DATA_MIME_TYPE), (String) next.get(DATA_URI)));
            }
        }
        return arrayList2;
    }

    private static void readMessagingStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map, DefaultStyleInformation defaultStyleInformation) {
        notificationDetails.styleInformation = new MessagingStyleInformation(readPersonDetails((Map) map.get(PERSON)), (String) map.get(CONVERSATION_TITLE), (Boolean) map.get(GROUP_CONVERSATION), readMessages((ArrayList) map.get(MESSAGES)), defaultStyleInformation.htmlFormatTitle, defaultStyleInformation.htmlFormatBody);
    }

    private static PersonDetails readPersonDetails(Map<String, Object> map) {
        IconSource iconSource = null;
        if (map == null) {
            return null;
        }
        Boolean bool = (Boolean) map.get(BOT);
        Object obj = map.get(ICON);
        Integer num = (Integer) map.get(ICON_SOURCE);
        if (num != null) {
            iconSource = IconSource.values()[num.intValue()];
        }
        return new PersonDetails(bool, obj, iconSource, (Boolean) map.get(IMPORTANT), (String) map.get(KEY), (String) map.get(NAME), (String) map.get(URI));
    }

    private static void readPlatformSpecifics(Map<String, Object> map, NotificationDetails notificationDetails) {
        List<Map> list;
        Map map2 = (Map) map.get(PLATFORM_SPECIFICS);
        if (map2 != null) {
            notificationDetails.autoCancel = (Boolean) map2.get(AUTO_CANCEL);
            notificationDetails.ongoing = (Boolean) map2.get(ONGOING);
            notificationDetails.silent = (Boolean) map2.get(SILENT);
            notificationDetails.style = NotificationStyle.values()[((Integer) map2.get(STYLE)).intValue()];
            readStyleInformation(notificationDetails, map2);
            notificationDetails.icon = (String) map2.get(ICON);
            notificationDetails.priority = (Integer) map2.get(PRIORITY);
            readSoundInformation(notificationDetails, map2);
            notificationDetails.enableVibration = (Boolean) map2.get(ENABLE_VIBRATION);
            notificationDetails.vibrationPattern = (long[]) map2.get(VIBRATION_PATTERN);
            readGroupingInformation(notificationDetails, map2);
            notificationDetails.onlyAlertOnce = (Boolean) map2.get(ONLY_ALERT_ONCE);
            notificationDetails.showWhen = (Boolean) map2.get(SHOW_WHEN);
            notificationDetails.when = C0800a.a(map2.get(WHEN));
            notificationDetails.usesChronometer = (Boolean) map2.get(USES_CHRONOMETER);
            notificationDetails.chronometerCountDown = (Boolean) map2.get(CHRONOMETER_COUNT_DOWN);
            readProgressInformation(notificationDetails, map2);
            readColor(notificationDetails, map2);
            readChannelInformation(notificationDetails, map2);
            readLedInformation(notificationDetails, map2);
            readLargeIconInformation(notificationDetails, map2);
            notificationDetails.ticker = (String) map2.get(TICKER);
            notificationDetails.visibility = (Integer) map2.get(VISIBILITY);
            if (map2.containsKey(SCHEDULE_MODE)) {
                notificationDetails.scheduleMode = ScheduleMode.valueOf((String) map2.get(SCHEDULE_MODE));
            }
            notificationDetails.timeoutAfter = C0800a.a(map2.get(TIMEOUT_AFTER));
            notificationDetails.category = (String) map2.get(CATEGORY);
            notificationDetails.fullScreenIntent = (Boolean) map2.get(FULL_SCREEN_INTENT);
            notificationDetails.shortcutId = (String) map2.get(SHORTCUT_ID);
            notificationDetails.additionalFlags = (int[]) map2.get(ADDITIONAL_FLAGS);
            notificationDetails.subText = (String) map2.get(SUB_TEXT);
            notificationDetails.tag = (String) map2.get(TAG);
            notificationDetails.colorized = (Boolean) map2.get(COLORIZED);
            notificationDetails.number = (Integer) map2.get(NUMBER);
            notificationDetails.audioAttributesUsage = (Integer) map2.get(AUDIO_ATTRIBUTES_USAGE);
            if (map2.containsKey(ACTIONS) && (list = (List) map2.get(ACTIONS)) != null && !list.isEmpty()) {
                notificationDetails.actions = new ArrayList();
                for (Map notificationAction : list) {
                    notificationDetails.actions.add(new NotificationAction(notificationAction));
                }
            }
        }
    }

    private static void readProgressInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.showProgress = (Boolean) map.get(SHOW_PROGRESS);
        if (map.containsKey(MAX_PROGRESS)) {
            notificationDetails.maxProgress = (Integer) map.get(MAX_PROGRESS);
        }
        if (map.containsKey(PROGRESS)) {
            notificationDetails.progress = (Integer) map.get(PROGRESS);
        }
        if (map.containsKey(INDETERMINATE)) {
            notificationDetails.indeterminate = (Boolean) map.get(INDETERMINATE);
        }
    }

    private static void readSoundInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        notificationDetails.playSound = (Boolean) map.get(PLAY_SOUND);
        notificationDetails.sound = (String) map.get(SOUND);
        Integer num = (Integer) map.get(SOUND_SOURCE);
        if (num != null) {
            notificationDetails.soundSource = SoundSource.values()[num.intValue()];
        }
    }

    private static void readStyleInformation(NotificationDetails notificationDetails, Map<String, Object> map) {
        Map map2 = (Map) map.get(STYLE_INFORMATION);
        DefaultStyleInformation defaultStyleInformation = getDefaultStyleInformation(map2);
        NotificationStyle notificationStyle = notificationDetails.style;
        if (notificationStyle == NotificationStyle.Default) {
            notificationDetails.styleInformation = defaultStyleInformation;
        } else if (notificationStyle == NotificationStyle.BigPicture) {
            readBigPictureStyleInformation(notificationDetails, map2, defaultStyleInformation);
        } else if (notificationStyle == NotificationStyle.BigText) {
            readBigTextStyleInformation(notificationDetails, map2, defaultStyleInformation);
        } else if (notificationStyle == NotificationStyle.Inbox) {
            readInboxStyleInformation(notificationDetails, map2, defaultStyleInformation);
        } else if (notificationStyle == NotificationStyle.Messaging) {
            readMessagingStyleInformation(notificationDetails, map2, defaultStyleInformation);
        } else if (notificationStyle == NotificationStyle.Media) {
            notificationDetails.styleInformation = defaultStyleInformation;
        }
    }
}
