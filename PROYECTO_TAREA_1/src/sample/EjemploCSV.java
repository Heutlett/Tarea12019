/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.FileNotFoundException;
import java.io.IOException;

public class EjemploCSV {

    public static void ImportarCSV(TableView tableView) {
        try{

            
            CsvReader leerUsuarios = new CsvReader("Usuarios.csv");

            int contador = 0;


            while(leerUsuarios.readRecord()) {

                while(!leerUsuarios.get(contador).equals("")){

                    System.out.print(leerUsuarios.get(contador) + ", ");



                    contador++;

                }

                System.out.println();
                contador = 0;


            }
            
            leerUsuarios.close(); // Cierra el archivo

            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
