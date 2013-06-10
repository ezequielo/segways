
package util;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mail {

    private static String FROM = "grupo06it@gmail.com";
    private static String PASSWORD= "upoepsit";

    public static void enviarMail(String to, String subject, String text) throws Exception {
        Properties props = new Properties();
        // Nombre del host de correo, es smtp.gmail.com
        props.setProperty("mail.smtp.host", "smtp.gmail.com");
        // TLS si está disponible
        props.setProperty("mail.smtp.starttls.enable", "true");
        // Puerto de gmail para envio de correos
        props.setProperty("mail.smtp.port", "587");
        // Nombre del usuario
        props.setProperty("mail.smtp.user", FROM);
        // Si requiere o no usuario y password para conectarse.
        props.setProperty("mail.smtp.auth", "true");

        Session session = Session.getDefaultInstance(props);
        session.setDebug(true);

        MimeMessage message = new MimeMessage(session);
        // Quien envia el correo
        message.setFrom(new InternetAddress(FROM));
        // A quien va dirigido
        message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
        message.setSubject(subject);
        message.setText(text);

        Transport t = session.getTransport("smtp");
        t.connect(FROM, PASSWORD);
        t.sendMessage(message, message.getAllRecipients());
        t.close();
    }
}
