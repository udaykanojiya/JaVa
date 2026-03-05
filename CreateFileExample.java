import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateFileExample {
    public static void main(String[] args) {
        try{
            File file = new File("new.txt");
            if(file.createNewFile()){
                System.out.println("File created: "+ file.getName());
            }else{
                System.out.println("File already exist.");
            }

        }catch(IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

         try{
            FileWriter writer = new FileWriter("new.txt");
            writer.write("Hello, this is a test message written.");
            writer.close();
        }catch(IOException e){
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}

// public class WriteToFile{
//     public static void main(String[] args) {
       
//     }
// }

// class ReadFromFile{
//     public static void main(String[] args) {
//         try{
//             File file = new File("example.txt");
//             Scanner scanner = new Scanner(file);
//             while(scanner.hasNextLine()){
//                 String data = scanner.nextLine();
//                 System.out.println(data);
//             }
//             scanner.close();
//         }catch(FileNotFoundException e){
//             System.out.println("An error occured.");
//             e.printStackTrace();
//         }
//     }
// }

//  class DeleteFile{
//     public static void main(String[] args) {
//         File file = new File("example.txt");
//         if(file.delete()){
//             System.out.println("Deleted the fiel: "+ file.getName());
//         }else{
//             System.out.println("Failed to delete the file");
//         }
//     }
// }