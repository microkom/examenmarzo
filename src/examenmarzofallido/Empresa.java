/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenmarzofallido;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author DAW
 */
public class Empresa {
    private String nombreEmpresa;
    private ArrayList<Producto> productos = new ArrayList<Producto>();
    
    
    

    public static void writeFile(File fileName, String texto) {
        //This method reads from one file and then writes its
        //content into another one without wiping its original content

        //necesario para crear un objeto del mismo tipo       
        FileWriter fileToWrite = null;
        BufferedWriter bufferWillWrite = null;

        try {
            //creacion de estructura de escritura
            fileToWrite = new FileWriter(fileName); //true: permite agregar info sin borrar el archivo

            bufferWillWrite = new BufferedWriter(fileToWrite);
            try {
                bufferWillWrite.write(texto + "\n");

            } catch (IOException e) {
                System.out.println(e.getMessage());
            } finally {
                try {
                    if (bufferWillWrite != null) {
                        bufferWillWrite.close();
                    }
                    if (fileToWrite != null) {
                        fileToWrite.close();
                    }
                } catch (IOException er) {
                    System.out.println(er.getMessage());
                }
            }
        } catch (IOException err) {
            System.out.println(err.getMessage());
        }
    }


}
