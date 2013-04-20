/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.voder.presentfx.elements;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;

/**
 *
 * @author Volker Aufschild <mail@volker-aufschild.de>
 */
public class Slide extends AnchorPane implements Initializable {

    public Slide(String slide) {

        try {
            AnchorPane root = FXMLLoader.load(getClass().getResource(slide));
//            this.add(root);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }
        
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
    
}
