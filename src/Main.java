import java.time.LocalDate;

import br.com.dio.challenge.domain.Bootcamp;
import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentoring;

public class Main {
    public static void main(String[] args) {
        Course courseJava = new Course();
        courseJava.setTitle("Course Java");
        courseJava.setDescription("description course java");
        courseJava.setWorkload(8);

        Course courseJavaScript = new Course();
        courseJavaScript.setTitle("Course JavaScript");
        courseJavaScript.setDescription("description course JavaScript");
        courseJavaScript.setWorkload(8);

        Mentoring mentoring = new Mentoring();
        mentoring.setTitle("mentoring java");
        mentoring.setDescription("description mentoring java");
        mentoring.setDate(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Descrição Bootcamp Java Developer");
        bootcamp.getContents().add(courseJava);
        bootcamp.getContents().add(courseJavaScript);
        bootcamp.getContents().add(mentoring);

        Dev devRobson = new Dev();
        devRobson.setName("Robson");
        devRobson.subscribeBootcamp(bootcamp);
        System.out.println("Contents subscribed by Robson:\n\n" + devRobson.getSubscribesContent());
        devRobson.progress();
        devRobson.progress();

        System.out.println("-");

        System.out.println("Contents subscribed by Robson:\n\n" + devRobson.getSubscribesContent());
        System.out.println("Contents concluded by Robson:\n\n" + devRobson.getConcludedContent());
        System.out.println("XP:" + devRobson.calculateTotalXp());

        System.out.println("\n\n-------\n\n");

        Dev devLuana = new Dev();
        devLuana.setName("Luana");
        devLuana.subscribeBootcamp(bootcamp);
        System.out.println("Contents subscribed by Luana:\n\n" + devLuana.getSubscribesContent());
        devLuana.progress();
        devLuana.progress();

        System.out.println("-");

        System.out.println("Contents subscribed by Luana:\n\n" + devLuana.getSubscribesContent());
        System.out.println("Contents concluded by Luana:\n\n" + devLuana.getConcludedContent());
        System.out.println("XP:" + devLuana.calculateTotalXp());
    }
}