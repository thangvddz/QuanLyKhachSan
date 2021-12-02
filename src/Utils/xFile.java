/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import Entities.Config;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.Buffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author you have to better
 */
public class xFile {

    public static Object readFile() {
        try {

            FileInputStream fileIn = new FileInputStream("src/Config/config.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Object obj = objectIn.readObject();

            System.out.println("The Object has been read from the file");
            objectIn.close();
            return obj;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public static void writeFile(Object config) {
        try {
            try (FileOutputStream fout = new FileOutputStream("src/Config/config.txt")) {
                ObjectOutputStream oos = new ObjectOutputStream(fout);
                oos.writeObject(config);

                oos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
