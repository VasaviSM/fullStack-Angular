/*      there are two classes
        One class is FileWriter==
        Input Stream Reader
        Other is FileReader
        ==On console
        =======
        Task is
        Unless the fileWriting operation not gets over, the fileRead wont happen
*/

package com.threads;

import java.io.*;

class FileWrite{
    public synchronized void filewrite() {
        File f = new File("E:\\Capgemini\\Training\\Java\\src\\com\\threads\\task.txt");
        {

            String f1 = "Hey  I am from Task file how u are doing";
            try {
                FileWriter fw = new FileWriter(f);
                fw.write(f1);
                fw.close();
                FileInputStream fis1 = new FileInputStream(f);
                fis1.close();


            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
class FileRead {
    public  synchronized void fileread() {
        File f = new File("E:\\Capgemini\\Training\\Java\\src\\com\\threads\\task.txt");
        {

            char[] words = new char[43];
            try {

                InputStreamReader isr1 = new InputStreamReader(new FileInputStream(f));
                isr1.read(words);
                System.out.println(words);
                isr1.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

public class SyncTask {
    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {


            @Override
            public synchronized  void run() {
                for (int i = 1; i <=2; i++) {
                    new FileWrite().filewrite();
                    System.out.println("first run filewrite");
                }
            }

        });
        Thread t2 = new Thread(new Runnable() {

            @Override
            public synchronized void run() {
                for (int i = 1; i <= 2; i++) {
                    new FileRead().fileread();
                    System.out.println("then run fileread");
                }
            }
        });
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
    }
}


   /* FileReader fr=new FileReader(f);   //Creation of File Reader object
    BufferedReader br=new BufferedReader(fr);  //Creation of BufferedReader object
    int c = 0;
      while((c = br.read()) != -1)         //Read char by Char
              {
              char character = (char) c;          //converting integer to char
              System.out.println(character);        //Display the Character
              }

              }*/

