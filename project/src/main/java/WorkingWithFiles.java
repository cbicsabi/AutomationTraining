import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WorkingWithFiles {
    public static void main(String[] args) {

        File plumb = new File(WorkingWithFiles.class.getResource("plumb.txt").getFile());

        try {
            List<String> lines = Files.readAllLines(plumb.toPath());
            for(String line: lines){
                System.out.println(line);
            }
        } catch (IOException e){
            System.out.println("Exception: " + e);
            System.out.println(plumb.toPath());
        }

        try {
            writeToFile();
            System.out.println("\n--File was created");
        } catch (IOException e) {
            System.out.println("\nException: " + e);
            System.out.println(plumb.toPath());
        }
    }

    private static void writeToFile() throws IOException {

        File newFile = new File(
                "D:/CDB/02_Trainings/06_AutomationTraining/Shared_AutomationTraining/AutomationTraining/project/src/main/resources/output.txt");
        List<String> lines = Arrays.asList("first", "second", "etc");

        Files.write(newFile.toPath(), lines, StandardOpenOption.CREATE);
    }
}