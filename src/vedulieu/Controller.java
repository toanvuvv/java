package vedulieu;

import ShowData.TouristDescription;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.Math;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.event.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller extends TouristDescription implements Initializable {

   /* @FXML
    private ImageView imageView;

    FileInputStream inputStream = new FileInputStream("/vedulieu/food.jpg");

    private Image image = new Image(inputStream);*/

    @FXML
    private ComboBox<String> comBoBox;
    @FXML
    private TableView<DuLieuDuLich> table;
    @FXML
    private TableColumn<DuLieuDuLich,String> linkClolumn;
    @FXML
    private TableColumn<DuLieuDuLich,String> abtractClolumn;
    @FXML
    private TableColumn<DuLieuDuLich,String> thumbClolumn;

    private ObservableList<DuLieuDuLich> touristList;
    @FXML
    public Label label;
    DuLieuDuLich Data=new DuLieuDuLich();
    ObservableList<String> list= FXCollections.observableArrayList("TouristPlace","TouristFood","TouristFestival","City");

    public Controller() throws IOException {
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comBoBox.setItems(list);
        try {
            putData("a");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void comBoBoxChanged(ActionEvent actionEvent) throws IOException {
        label.setText(comBoBox.getValue());
        if(comBoBox.getValue()=="TouristPlace")
        {
            putData(0);
        }
        if(comBoBox.getValue()=="TouristFood")
        {
           // this.imageView.setImage(this.image);
            putData(1);
        }
        if(comBoBox.getValue()=="TouristFestival")
        {
            putData(2);
        }
        if(comBoBox.getValue()=="City")
        {
            putData(3);
        }
    }

    private void putData(int qu) throws IOException {
        touristList = FXCollections.observableArrayList();
        for (int i = 0; i < Data.getDem(); i++)
        {
            touristList.add(new DuLieuDuLich(i,qu));
            System.out.println(Data.getLinkDulieu()+"\n"+Data.getAbtractDulieu()+"\n"+Data.getThumnailDulieu());
        }
        linkClolumn.setCellValueFactory(new PropertyValueFactory<DuLieuDuLich, String>("linkDulieu"));
        abtractClolumn.setCellValueFactory(new PropertyValueFactory<DuLieuDuLich, String>("abtractDulieu"));
        thumbClolumn.setCellValueFactory(new PropertyValueFactory<DuLieuDuLich, String>("thumnailDulieu"));
        table.setItems(touristList);
    }
    private void putData(String a) throws IOException {
        touristList = FXCollections.observableArrayList();
        touristList.add(new DuLieuDuLich("Welcome","This is a javaFX function","To see information"));
        touristList.add(new DuLieuDuLich("Choose","The ComboBox to see more","Thank You"));

        linkClolumn.setCellValueFactory(new PropertyValueFactory<DuLieuDuLich, String>("linkDulieu"));
        abtractClolumn.setCellValueFactory(new PropertyValueFactory<DuLieuDuLich, String>("abtractDulieu"));
        thumbClolumn.setCellValueFactory(new PropertyValueFactory<DuLieuDuLich, String>("thumnailDulieu"));
        table.setItems(touristList);
    }
}

