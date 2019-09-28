import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;

//program by Katie McCarver and Charlie Repaci, for SharkHack2019, to prevent headaches for musicians everywhere!
//the program converts different musical clefs to one another

public class Conversion extends Application
{

   private TextField noteField;
   private Label resultLabel;
   private RadioButton [] radioButtons = new RadioButton[6];
   private ToggleGroup radioGroup; 
   
   public static void main(String[]args)
   {
   
      launch(args);
   }
      
   @Override
   public void start(Stage firstStage)
   {
      //le label
      Label promptLabel = new Label("Select your conversion and enter your music notes: ");
      
      //le textfield
      noteField = new TextField();
      
      //radiobuttons!
      radioButtons[0] = new RadioButton("Treble to Bass");
      radioButtons[1] = new RadioButton("Bass to Treble");
      radioButtons[2] = new RadioButton("Treble to Alto");
      radioButtons[3] = new RadioButton("Alto to Treble");
      radioButtons[4] = new RadioButton("Bass to Alto");
      radioButtons[5] = new RadioButton("Alto to Bass");
      
      //set a pre-selected radio button
      radioButtons[0].setSelected(true);
      
      //ToggleGroup
      radioGroup = new ToggleGroup();
      for (int i=0;i<4;i++)
         radioButtons[i].setToggleGroup(radioGroup);
      
      //convert button
      Button noteButton = new Button("Convert");
      
      //register Event Handler 
      noteButton.setOnAction(new NoteButtonHandler());
      
      // Create an empty Label to display the result.
      resultLabel = new Label();
      
      // Put the promptLabel and the noteField in an HBox.
      VBox promptVBox = new VBox(10, promptLabel, noteField);
      
      // Put the RadioButtons in an box.
      VBox radioVBoxWt = new VBox(20, radioButtons[0], radioButtons[1],
                                radioButtons[2], radioButtons[3], radioButtons[4], radioButtons[5]);
      
      //Put em all in a bigger box
      VBox mainVBox = new VBox(10, promptVBox, radioVBoxWt,noteButton,
                               resultLabel);
      
      // Set the VBox's alignment to center.
      mainVBox.setAlignment(Pos.CENTER);
      
      // Set the VBox's padding to 10 pixels.
      mainVBox.setPadding(new Insets(10));
      
      // Create a Scene.
      Scene scene = new Scene(mainVBox);
   
      // Add the Scene to the Stage.
      firstStage.setScene(scene);
      
      // Set the stage title.
      firstStage.setTitle("Musical Clef Converter!");
      
      // Show the window.
      firstStage.show();   
   }

 /*
    * Event handler class for noteButton
    */
    
   class NoteButtonHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent event)
      {
                  
         // Get the note.
         double a = Double.parseDouble(noteField.getText());
         
      // gets the selected button and extracts its name
         RadioButton selectedRadioButton = (RadioButton) radioGroup.getSelectedToggle();
       
      
         for(int i=0;i<6;i++){
            if(selectedRadioButton.equals(radioButtons[i]))
               //conversion? 
               }      
            
             String[] result = new String[50];
             result = getNotes(a);
            
            // Display the results.
             resultLabel.setText("Equivalent to " + result);
         }
      
        
      }
   }      










}