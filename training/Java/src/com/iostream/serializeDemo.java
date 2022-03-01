package com.iostream;

        import java.io.FileNotFoundException;
        import java.io.FileOutputStream;
        import java.io.IOException;
        import java.io.ObjectOutputStream;

public class serializeDemo {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub

        Country c1=new Country("India",93849849);
        try {
            FileOutputStream fout=new FileOutputStream("country.txt");
            ObjectOutputStream obj=new ObjectOutputStream(fout);
            obj.writeObject(c1);
            obj.flush();
            obj.close();
            System.out.println("suceesfully serialized..");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
