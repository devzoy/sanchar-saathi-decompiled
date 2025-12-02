package com.dexterous.flutterlocalnotifications.models.styles;

import java.util.ArrayList;

public class InboxStyleInformation extends DefaultStyleInformation {
    public String contentTitle;
    public Boolean htmlFormatContentTitle;
    public Boolean htmlFormatLines;
    public Boolean htmlFormatSummaryText;
    public ArrayList<String> lines;
    public String summaryText;

    public InboxStyleInformation(Boolean bool, Boolean bool2, String str, Boolean bool3, String str2, Boolean bool4, ArrayList<String> arrayList, Boolean bool5) {
        super(bool, bool2);
        this.contentTitle = str;
        this.htmlFormatContentTitle = bool3;
        this.summaryText = str2;
        this.htmlFormatSummaryText = bool4;
        this.lines = arrayList;
        this.htmlFormatLines = bool5;
    }
}
