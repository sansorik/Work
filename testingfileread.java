package tesstingstuff;
import java.io.FileReader;
import java.lang.StringBuilder;
public class Test2 {
	public static void main(String[] args){
        try {
            FileReader read = new FileReader("C:\\Users\\Matt\\Desktop\\New Text Document (3).txt");
            StringBuilder sb = new StringBuilder();
            int i;
            while ((i=read.read()) != -1) {
                sb.append((char)i);
            }
            String test = sb.toString();
            System.out.println(test);
            System.out.print(test.substring(4));
            
            
            
        } catch (Exception e){

        }
    }
}

