package a.legacy.code;

public class MessageForwarder {

    private Message createForwardMessage(Session session, Message message) {
        MimeMessage forward = new MimeMessage(session);
        forward.setFrom(getFromAddress(message));
        forward.setReplyTo(new Adress[] {
                new internetAdress(listAdress)
        });
        forward.addRecipients(Message.RecipientType.TO, listAdress);
        forward.addRecipients(Message.RecipientType.BCC, getMailListAdress());
        forward.setSubject(transformedSubject(message.getSubject()));
        forward.setSentDate(message.getSentDate());
        forward.addHeader(LOOP_HEADER, listAdress);
        buildForwardContent(message, forward);

        return forward;
    }

    //blabla
}
