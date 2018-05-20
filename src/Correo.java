
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Correo {
    String para;
    String asunto;
    String usuario;
    String contrasena;
    String contrasen;

    public Correo(String to, String Subject, String Username, String PassWord, String contrasen) {
       
        this.para = to;
        this.asunto = Subject;
        this.usuario = Username;
        this.contrasena = PassWord;
        this.contrasen = contrasen;
    }
    
   
      public void SendMail(String coda) throws IOException {
        String Mensage = "¡Hola!: Es una pena que hayas olvidado tu contraseña, pero no te preocupes, digita el siguiente código en el programa para recuperar tu contraseña: "
                + "  "
                + "  " + coda + "  "
                + " Recuerda: cambiar tu contraseña a menudo permite que tengas mayor seguridad.";
        String respuesta;
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            @Override
            protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
                return new javax.mail.PasswordAuthentication(usuario, contrasena);
            }
        });

        try {

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(usuario));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(para));
            message.setSubject(asunto);
            message.setText(Mensage);
            Transport.send(message);
            JOptionPane.showMessageDialog(null, "Se ha enviado un número de autenticación a tu correo electrónico : "+para);
            respuesta = JOptionPane.showInputDialog(null, "Digite el código de autenticación enviado:");
            confirm(respuesta, coda);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    public void confirm(String respuesta, String coda) throws IOException {
        if (respuesta != null) {
            if (respuesta.equals(coda)) {
                JOptionPane.showMessageDialog(null, "Su contraseña es: " + contrasen);
            } else {
                JOptionPane.showMessageDialog(null, "Código incorrecto, vuelva a intentarlo", "Error de Atenticación", JOptionPane.ERROR_MESSAGE);
            }

        } else {
             JOptionPane.showMessageDialog(null, "Autenticación cancelada.");
        }

    }
}
