/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.voder.presentfx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import de.voder.presentfx.elements.Presentation;

/**
 *
 * @author Volker Aufschild <mail@volker-aufschild.de>
 */
public class PresentFX extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        final Presentation presentation = new Presentation();
        presentation.addSlide(FXMLLoader.load(getClass().getResource("slide1.fxml")));
        presentation.addSlide(FXMLLoader.load(getClass().getResource("slide2.fxml")));
 
        final Scene scene = new Scene(presentation);
        primaryStage.setScene(scene);
        primaryStage.setFullScreen(true);
        presentation.start();
        
        primaryStage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
