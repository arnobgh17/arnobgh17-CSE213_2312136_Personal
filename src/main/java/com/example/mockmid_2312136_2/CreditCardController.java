package com.example.mockmid_2312136_2;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class CreditCardController
{
    @javafx.fxml.FXML
    private Label avglvl;
    @javafx.fxml.FXML
    private ComboBox<String> gatewaynameComboBox;
    @javafx.fxml.FXML
    private TableColumn<CreditCard, String> tablecolGatewayName;
    @javafx.fxml.FXML
    private TableColumn tablecolHoldername;
    @javafx.fxml.FXML
    private TextField CardlimitTFFIlter;
    @javafx.fxml.FXML
    private TextField cardnoTF;
    @javafx.fxml.FXML
    private DatePicker ExpDateDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String> gatewaynameComboBoxFIlter;
    @javafx.fxml.FXML
    private TableColumn tablecolCardNO;
    @javafx.fxml.FXML
    private TableColumn tablecolCardlimit;
    @javafx.fxml.FXML
    private TextField HoldernameTF;
    @javafx.fxml.FXML
    private TableView tableview;

    ArrayList<CreditCard>cardlist;
    @javafx.fxml.FXML
    private TextField CardlimitTF;
    @javafx.fxml.FXML
    private ComboBox CardtypeComboBox;

    @javafx.fxml.FXML
    public void initialize() {
        gatewaynameComboBox.getItems().addAll("Visa", "MasterCard");
        CardtypeComboBox.getItems().addAll("Silver","Gold", "Platinum","titanium");
        gatewaynameComboBoxFIlter.getItems().addAll("VIsa","MasterCard");
    }

    @javafx.fxml.FXML
    public void showaveragecreditlimitfromloadedtableviewButtonOA(ActionEvent actionEvent) {
        for(CreditCard C: cardlist){
            tableview.getItems().add(C);
        }
    }

    @javafx.fxml.FXML
    public void validateandaddnewcardtoarraylistbuttonOA(ActionEvent actionEvent) {
//        String cardNo, String holderName, LocalDate dateOfExpiry, String gatewayName,
//        float creditLimit, String cardType)


        cardlist.add(new CreditCard(cardnoTF.getText(), HoldernameTF.getText(),
                ExpDateDatePicker.getValue(), gatewaynameComboBox.getValue(),
                Float.parseFloat(CardlimitTF.getText()), CardtypeComboBox.getValue().toString()
        ));
    }

    @javafx.fxml.FXML
    public void ssearchandloadtableButtonOA(ActionEvent actionEvent) {
    }
}