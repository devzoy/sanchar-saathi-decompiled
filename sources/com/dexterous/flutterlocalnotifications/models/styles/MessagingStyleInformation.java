package com.dexterous.flutterlocalnotifications.models.styles;

import com.dexterous.flutterlocalnotifications.models.MessageDetails;
import com.dexterous.flutterlocalnotifications.models.PersonDetails;
import java.util.ArrayList;

public class MessagingStyleInformation extends DefaultStyleInformation {
    public String conversationTitle;
    public Boolean groupConversation;
    public ArrayList<MessageDetails> messages;
    public PersonDetails person;

    public MessagingStyleInformation(PersonDetails personDetails, String str, Boolean bool, ArrayList<MessageDetails> arrayList, Boolean bool2, Boolean bool3) {
        super(bool2, bool3);
        this.person = personDetails;
        this.conversationTitle = str;
        this.groupConversation = bool;
        this.messages = arrayList;
    }
}
