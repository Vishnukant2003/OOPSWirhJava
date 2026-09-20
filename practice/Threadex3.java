// import java.io.BufferedReader;
import java.io.*;

class WordCount  implements  Runnable{
     String path;

    public  WordCount(String path){
        this.path=path;
    }

    @Override 
    public void run(){
      int count= 0;

       try{
        BufferedReader br = new BufferedReader(new FileReader(path));

         String line;
        while ((line=br.readLine())!=null) {
            line = line.trim();
            if (!line.isEmpty()) {
                String[] word= line.split("\\s+");
                count+=word.length;
            }
            
        }

       }
       catch(IOException e){
             System.err.println(e);
       }
    System.err.println(count);

    
    }

}


class Threadex3 {
    public static void main(String[] args) {
        String file1 = "C:\\Users\\vishn\\OneDrive\\Desktop\\New folder (5)\\main.txt"; 
        String file2 = "C:\\Users\\vishn\\OneDrive\\Desktop\\New folder (5)\\main.txt"; 
        String file3 = "C:\\Users\\vishn\\OneDrive\\Desktop\\New folder (5)\\main.txt"; 
        
        WordCount test1 = new WordCount(file1);
        WordCount test2 = new WordCount(file2);

        Thread t1 = new Thread(test1);
        Thread t2 = new Thread(test2);

        t1.start();
        t2.start();

    
    
    
    }
}