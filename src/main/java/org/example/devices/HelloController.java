package org.example.devices;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private ListView<Device> listView;
    @FXML
    private TextField smartphoneName, smartphoneWeight, smartphonePrice, screenSize, cameraResolution;
    @FXML
    private TextField tabletName, tabletWeight, tabletPrice, batteryLife;
    @FXML
    private TextField laptopName, laptopWeight, laptopPrice, ramSize, processorType;
    @FXML
    private Button addButton, removeButton;
    @FXML
    private CheckBox hasStylus;

    @FXML
    public void initialize() {
        addButton.setOnAction(e -> addDevice());
        removeButton.setOnAction(e -> {
            int selectedIndex = listView.getSelectionModel().getSelectedIndex();
            if (selectedIndex >= 0) {
                listView.getItems().remove(selectedIndex);
            }
        });
    }

    private void addDevice() {
        Device device = null;

        if (!smartphoneName.getText().isEmpty()) {

            device = new Smartphone(
                    smartphoneName.getText(),
                    Double.parseDouble(smartphonePrice.getText()),
                    Double.parseDouble(smartphoneWeight.getText()),
                    Double.parseDouble(screenSize.getText()),
                    cameraResolution.getText()
            );
        } else if (!tabletName.getText().isEmpty()) {
            device = new Tablet(
                    tabletName.getText(),
                    Double.parseDouble(tabletPrice.getText()),
                    Double.parseDouble(tabletWeight.getText()),
                    Double.parseDouble(batteryLife.getText()),
                    hasStylus.isSelected()
            );
        } else if (!laptopName.getText().isEmpty()) {

            device = new Laptop(
                    laptopName.getText(),
                    Double.parseDouble(laptopPrice.getText()),
                    Double.parseDouble(laptopWeight.getText()),
                    Integer.parseInt(ramSize.getText()),
                    processorType.getText()
            );
        }

        if (device != null) {
            listView.getItems().add(device);
        }

        clearFields();
    }

    private void clearFields() {
        smartphoneName.clear();
        smartphoneWeight.clear();
        smartphonePrice.clear();
        screenSize.clear();
        cameraResolution.clear();

        tabletName.clear();
        tabletWeight.clear();
        tabletPrice.clear();
        batteryLife.clear();

        laptopName.clear();
        laptopWeight.clear();
        laptopPrice.clear();
        ramSize.clear();
        processorType.clear();
    }
}
