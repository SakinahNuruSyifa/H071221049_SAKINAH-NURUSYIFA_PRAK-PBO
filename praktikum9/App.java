package praktikum9;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
// import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class App extends Application {
    private Stage stage;

    @Override
    public void start(Stage mainStage) {
        //handling stage
        stage = mainStage;

        //stage
        stage.setTitle("Aplikasi Kalkulator");
        stage.setScene(getScene1());
        stage.setResizable(false);
        stage.show();
    }

    private Scene getScene1() {

        Text tTitle = new Text("KALKULATOR SEDERHANA");
        Button mulai = new Button("MULAI"); 
        VBox sectionRight = new VBox(tTitle, mulai);  
        sectionRight.setSpacing(30); 
        sectionRight.setAlignment(Pos.CENTER);

        mulai.setOnAction(v -> {
            stage.setScene(getScene2()); // Buat agar button pindah ke scene 2
        });

        //section
        // ImageView ivBanner = new ImageView("/kalkulator.JPG");
        // ivBanner.setFitWidth(260);
        // ivBanner.setFitHeight(300);
        // ivBanner.setPreserveRatio(true);

        //rootNode
        VBox rootNode = new VBox(sectionRight);
        rootNode.setAlignment(Pos.CENTER);

        Scene scene = new Scene(new StackPane(rootNode), 350, 500);
        return scene;
    }

    private Scene getScene2() {
        Text tTitle = new Text("PILIH MENU");
        Button bKalkulator1 = new Button("LUAS PERSEGI");
        Button bKalkulator2 = new Button("KELILING PERSEGI");
        Button bKalkulator3 = new Button("LUAS PERSEGI PANJANG");
        Button bKalkulator4 = new Button("KELILING PERSEGI PANJANG");
        VBox vBox = new VBox(tTitle, bKalkulator1, bKalkulator2, bKalkulator3, bKalkulator4);
        vBox.setSpacing(15);
        
        vBox.setAlignment(Pos.CENTER);
        vBox.setPrefWidth(15);

        //Action untuk Button
        bKalkulator1.setOnAction(v -> {
            stage.setScene(getScene3("Luas Persegi", true));
        });

        bKalkulator2.setOnAction(v -> {
            stage.setScene(getScene3("Keliling Persegi", true));
        });

        bKalkulator3.setOnAction(v -> {
            stage.setScene(getScene3("Luas Persegi Panjang", false));
        });

        bKalkulator4.setOnAction(v -> {
            stage.setScene(getScene3("Keliling Persegi Panjang", false));
        });

        //rootNode
        VBox rootNode = new VBox(vBox);
        Scene scene = new Scene(new StackPane(rootNode), 350, 500);
        return scene;

    }
    
    private Scene getScene3(String kalkulator, boolean LuasPersegi) {
        Text tTitle = new Text("Jenis Kalkulator : " + kalkulator);
        Label lInput1 = new Label("Sisi"); 
        TextField tInput1 = new TextField("0"); // Buat taruh tempat input
        Label lInput2 = new Label("Panjang");
        TextField tInput2 = new TextField("0");
        Label linput3 =  new Label("Lebar");
        TextField tinput3 = new TextField("0");
        Label lHasil = new Label();

        Button bClear = new Button("Clear");
        Button bCalculate = new Button("Calculate");
        Button bBackToHome = new Button("BACK TO HOME");

        VBox sectionRight;
        if (LuasPersegi) {
            sectionRight = new VBox(tTitle, lInput1, tInput1, lHasil, bClear, bCalculate, bBackToHome);

        } else  {
            sectionRight = new VBox(tTitle, lInput2, tInput2,linput3,tinput3, lHasil, bClear, bCalculate,
                    bBackToHome);
        }
        sectionRight.setSpacing(15);
        sectionRight.setAlignment(Pos.TOP_CENTER);
        sectionRight.setPrefWidth(15);
        //Action untuk Button
        bClear.setOnAction(v -> {
            tInput1.clear();
            tInput2.clear();
            tinput3.clear();
        });
         bCalculate.setOnAction(v -> {
            try {
                double sisi = Double.parseDouble(tInput1.getText());
                double panjang = Double.parseDouble(tInput2.getText());
                double lebar = Double.parseDouble(tinput3.getText());
                double hasil = 0;
                if (LuasPersegi) {
                    hasil = sisi * sisi;
                } else if (kalkulator.equals("Keliling Persegi")) {
                    hasil = 4 * sisi;
                } else if (kalkulator.equals("Keliling Persegi Panjang")) {
                    hasil = panjang*lebar;
                } else {
                    hasil = 2 * (panjang + lebar); 
                }
                 lHasil.setText("Hasil: " + hasil);              
             } catch (NumberFormatException e) {
                lHasil.setText("Input tidak Valid");         
            }
        });
        bBackToHome.setOnAction(v -> {
            stage.setScene(getScene2());
        });
        VBox rootNode = new VBox(sectionRight);
        Scene scene = new Scene(new StackPane(rootNode), 350, 500);
        return scene;
    }
    public static void main(String[] args) {
        launch();
    }
}