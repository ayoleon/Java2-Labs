import java.io.IOException;

public class twoAppThread implements Runnable{
    public void run() {
    String[] commands = {"notepad.exe", "calc.exe"};
    for (String command : commands){
        ProcessBuilder processBuilder = new ProcessBuilder(command);
        try {
            processBuilder.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }
}
