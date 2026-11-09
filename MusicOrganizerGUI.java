
/**
 * Write a description of class MusicOrganizerGUI here.
 *
 * @author 
 * @version 
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MusicOrganizerGUI extends Application
{
    private MusicOrganizer organizer;

    @Override
    public void start(Stage stage)
    {
        organizer = new MusicOrganizer();

        Button playButton = new Button("Play Music");
        Button stopButton = new Button("Stop Music");
        
        playButton.setStyle("-fx-font-size: 16px;");
        stopButton.setStyle("-fx-font-size: 16px;");

        playButton.setOnAction(event -> organizer.playTrack(0));
        stopButton.setOnAction(event -> organizer.stopPlaying());

        VBox root = new VBox(10, playButton, stopButton);
        
        
        root.setAlignment(javafx.geometry.Pos.CENTER);
        root.setStyle("-fx-background-color: lightblue;");
        

        stage.setScene(new Scene(root, 300, 150));
        stage.setTitle("Music Organizer");
        stage.setOnCloseRequest(event -> organizer.stopPlaying());
        stage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
    }
}