package HW3;

import com.sun.xml.internal.ws.addressing.WsaTubeHelper;
import com.sun.xml.internal.ws.util.StringUtils;

import java.io.*;
import java.util.Scanner;

public class StudentToFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fileName = "students.txt";
        String studentName;
        do{
            System.out.println("Введіть ПІБ студента:");
            studentName = StringUtils.capitalize(scan.nextLine());
        }while(studentName.split(" ", -2).length<3 || studentName.substring(0, studentName.indexOf(' ')).length()<3);
        String surname = studentName.substring(0, studentName.indexOf(' '));

        File file = getFile(fileName);
        boolean exists = ifExists(surname, file);
        if(exists == false) appendName(studentName, fileName);
    }
    static File getFile(String name){
        File file = new File(name);
        if(!file.exists()){
            try{
                file.createNewFile();
            } catch (IOException e)
            {
                System.out.println("Sorry, could not create file\n");
            }
        }
        return file;
    }
     static boolean ifExists(String studentSurname, File file){
        boolean exists = false;
         try (BufferedReader reader = new BufferedReader(new FileReader(file))){
             String line;
             while((line=reader.readLine()) !=null){
                 if(line.contains(studentSurname+' ')) {
                     exists = true;
                     break;
                 }
             }
         } catch (Exception e){
             System.out.println("Sorry, could not read the file\n");
         }
         System.out.println(exists);
         return exists;
     }
     static void appendName(String studentName, String fileName){
         try {
             FileWriter fw =  new FileWriter(fileName, true);
             fw.write(studentName+"\n");
             fw.close();
         }
         catch (IOException e) {
             System.out.println("Sorry, could not write to file\n");
         }


     }


}
