package FileInformation;

import java.io.File;

public class getfile {
    public static void main(String[] args) {
        File myobj=new File("filename.txt");
        if (myobj.exists()) {
            System.out.println("file name:"+ myobj.getName());
            System.out.println(" Absolute path :" + myobj.getAbsolutePath());
            System.out.println("Writeable:"+myobj.canWrite());
            System.out.println("Readable"+myobj.canRead());
            System.out.println("File size in bytes "+myobj.length());

        }else{
            System.out.println("The file does not exist ");
        }
    }
}
