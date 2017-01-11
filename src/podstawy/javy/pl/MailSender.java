package podstawy.javy.pl;

import org.apache.commons.mail.*;

/**
 * Created by RENT on 2017-01-10.
 */
public class MailSender {
    public static void sendMain(String address, String title, String content) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthentication("javandwro1@gmail.com", "javand1wro");
        email.setSSLOnConnect(true);
        email.setFrom("javandwro1@gmail.com");
        email.setSubject(title);
        email.setMsg(content);
        email.addTo(address);
        email.send();

    }
    public static void sendMailAttachment(String address, String title, String content) throws EmailException {
        // Create the attachment
        EmailAttachment attachment = new EmailAttachment();
        attachment.setPath("c://koala.jpg");
        attachment.setDisposition(EmailAttachment.ATTACHMENT);
        attachment.setDescription("Picture of John");
        attachment.setName("John");

        // Create the email message
        MultiPartEmail email = new MultiPartEmail();
        email.setHostName("mail.myserver.com");
        email.addTo("jdoe@somewhere.org", "John Doe");
        email.setFrom("me@apache.org", "Me");
        email.setSubject("The picture");
        email.setMsg("Here is the picture you wanted");

        // add the attachment
        email.attach(attachment);

    }

}