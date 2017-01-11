package podstawy.javy.pl;

import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-01-10.
 */
public class CSV {
    public static void saveArraytoCSV(Integer[][] data, String filepath) {
        Integer[] array = data[0];

        List<String> stringList = new ArrayList<>();

//        for (int i = 0; i < data.length; i++) {
//            Integer[] row = data[i];
//            String text2 = Joiner.on(",").join(row);
//            stringList.add(text2);
//
//        }
        Joiner joiner = Joiner.on(",");
        for (Integer[] row : data){
            String text2 = joiner.join(row);
            stringList.add(text2);
        }

            File file = new File(filepath);

        for (String line : stringList) {
            try {
                Files.append(line + System.lineSeparator(), file, Charsets.UTF_8);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


//        String text = Joiner.on(",").join(array);
//
//        System.out.println(text);


    }
}
