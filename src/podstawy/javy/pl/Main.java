package podstawy.javy.pl;

import com.google.common.base.Splitter;
import org.apache.commons.mail.EmailException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, EmailException {


        Integer[][] data = new Integer[][]{{1, 2},{3, 4}};

        CSV.saveArraytoCSV(data, "test.csv");

        MailSender.sendMain("javandwro1@gmail.com", "Mail od Daniela", "To moj spam");
    }
}
