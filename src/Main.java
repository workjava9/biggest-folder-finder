import java.io.File;

public class Main
{
   public static void main(String[] args)
   {
       String folderPath = "D:\\Yandex";
       File file = new File(folderPath);

       System.out.println(getFolderSize(file));

    }
    public static long getFolderSize(File folder)
    {
        if(folder.isFile()) {
            return folder.length();
        }
        long sum = 0;
        File[] file1= folder.listFiles();
        for(File file : file1) {
            sum+= getFolderSize(file);
        }
        return sum;
    }
}