// package Multi_Threading;

// class FileDownload{
//     public void download(String file){
//         for(int i=1;i<=5;i++){
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {

//             }
//             System.out.println(file + " downloading.... "+(i*20)+"%");
            
//         }
//         System.out.println(file+" Done");
//     }
// }

// public class Main2 {
//     public static void main(String[] args) {
//         FileDownload obj = new FileDownload();
//         obj.download("File A");
//         obj.download("File B");
//     }
// }

class downloadFile extends Thread{
    String file;
    public downloadFile(String file){
        this.file=file;
    }
    public void run(){
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(2000);
            } catch (Exception e) {

            }
            System.out.println(file + " downloading.... "+(i*20)+"%");
        }
        System.out.println(file+" Done.");
    }
}

class Main2{
    public static void main(String[] args) {
        downloadFile t1 =  new downloadFile("File A");
        downloadFile t2 =  new downloadFile("File B");
        downloadFile t3 =  new downloadFile("File C");
        t1.start();
        t2.start();
        t3.start();
    }
}