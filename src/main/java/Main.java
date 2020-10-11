import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

public class Main {

    public  static  void  main(String[] args) throws IOException {

        Student student = new Student();
        student.setName("chitransh");
        student.setAge(9);
        student.setSkills(Arrays.asList("dancing", "singing", "debating", "poetry", "painting", "sports"));

        ObjectMapper mapper = new ObjectMapper();
        //Object to Map
        Map<String, Object> map = mapper.convertValue(student, Map.class);
        System.out.println(map);

        // java object to JSON
        mapper.writeValue(new File("/home/nidhi/MyProjects/test.txt"), student);

        //JSON string to Map
        String json = "{\"name\":\"chitransh\",\"age\":9,\"skills\":[\"dancing\",\"singing\",\"debating\",\"poetry\",\"painting\",\"sports\"]}";
        Map<String, Object> map2 = mapper.readValue(json, Map.class);
        System.out.println(map2);

    }
}

