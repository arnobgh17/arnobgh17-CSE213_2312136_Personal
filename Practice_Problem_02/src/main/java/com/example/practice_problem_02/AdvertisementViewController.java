package com.example.practice_problem_02;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.print.DocFlavor;
import java.time.LocalDate;
import java.util.ArrayList;

public class AdvertisementViewController
{
    @javafx.fxml.FXML
    private TextField AdvIDtextfield;
    @javafx.fxml.FXML
    private TextField filterClientIdTextField;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, String> AdvIdTC;
    @javafx.fxml.FXML
    private CheckBox isforCharityCheckBox;
    @javafx.fxml.FXML
    private DatePicker DeliveryDateDP;
    @javafx.fxml.FXML
    private TextField ClientIDTextField;
    @javafx.fxml.FXML
    private TextField BillAmountTextField;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, LocalDate> DeliveryDateTC;
    @javafx.fxml.FXML
    private ComboBox<String> FilterAdvTypeComboBox;
    @javafx.fxml.FXML
    private TextField VatpercentTextField;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, String> AdvTypeTC;
    @javafx.fxml.FXML
    private ComboBox<String> AdvTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<Advertisement,String> ClientIdTC;
    @javafx.fxml.FXML
    private TableColumn<Advertisement, Float> BillAmountTC;
    @javafx.fxml.FXML
    private Label AdvertisementLable;
    @javafx.fxml.FXML
    private TableView<Advertisement> TableView;

    ArrayList<Advertisement> advList;
    Alert a;

    @javafx.fxml.FXML
    public void initialize() {
        advList= new ArrayList<>();
        a = new Alert(Alert.AlertType.ERROR);


        AdvTypeComboBox.getItems().addAll("Print", "Audio", "Video", "BillBoard,");
        FilterAdvTypeComboBox.getItems().addAll("Print", "Audio", "Video", "BillBoard,");

        AdvIdTC.setCellValueFactory(new PropertyValueFactory<>("advID"));
        AdvTypeTC.setCellValueFactory(new PropertyValueFactory<>("advType"));
        BillAmountTC.setCellValueFactory(new PropertyValueFactory<>("billAmount"));
        ClientIdTC.setCellValueFactory(new PropertyValueFactory<>("clientID"));
        DeliveryDateTC.setCellValueFactory(new PropertyValueFactory<>("delivaeryDate"));
    }

    @javafx.fxml.FXML
    public void FilterAndLoadTableOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ShowNOofAdvertisementMadeForCharityOA(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void ValidateAndAddNewAdvertisementToArrayListOA(ActionEvent actionEvent) {

        int vatper = Integer.parseInt(VatpercentTextField.getText());
        boolean selected = isforCharityCheckBox.isSelected();
        String advT = AdvTypeComboBox.getValue();
        LocalDate dd= DeliveryDateDP.getValue();
        LocalDate dateNow= LocalDate.now();

        if (vatper==0 && ! selected){
            a.setContentText("If Vat percentage is 0 then it has to be for charity");
            a.showAndWait();
            return;
        }
        if (vatper!=5 && !selected && advT.equals("Print")){
            a.setContentText("Validation 2");
            a.showAndWait();
            return;
        }
        if (vatper!=10 && !selected && (advT.equals("Audio") || (advT.equals("Video")))){
            a.setContentText("Validation 3");
            a.showAndWait();
            return;
        }
        if (vatper!=15 && !selected && advT.equals("Billboard")){
            a.setContentText("Validation 4");
            a.showAndWait();
            return;
        }
        if (dd.isBefore(dateNow)){
            a.setContentText("Validation 5");
            a.showAndWait();
            return;
        }



        Advertisement obj1 =new Advertisement(
                AdvIDtextfield.getText(),
                AdvTypeComboBox.getValue(),
                ClientIDTextField.getText(),
                Float.parseFloat(BillAmountTextField.getText()),
                Integer.parseInt(VatpercentTextField.getText()),
                DeliveryDateDP.getValue(),
                isforCharityCheckBox.isSelected()

        );

        advList.add(obj1);



    }
}