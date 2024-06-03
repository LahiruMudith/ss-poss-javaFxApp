package org.resturant.Controllers;//import package.name.MFXTextField;import io.github.palexdev.materialfx.controls.MFXContextMenuItem;import io.github.palexdev.materialfx.controls.MFXPasswordField;import io.github.palexdev.materialfx.controls.MFXTextField;import javafx.event.ActionEvent;import javafx.fxml.FXML;import javafx.fxml.FXMLLoader;import javafx.fxml.Initializable;import javafx.scene.Scene;import javafx.scene.control.Alert;import javafx.scene.control.ButtonType;import javafx.scene.input.MouseEvent;import javafx.scene.layout.AnchorPane;import javafx.stage.Stage;import javafx.stage.StageStyle;import org.resturant.HelloApplication;import org.resturant.Model.EmployerLoginModel;import java.io.IOException;import java.net.URL;import java.util.ResourceBundle;public class LoginMenuController implements Initializable {    @FXML    private AnchorPane root;    @FXML    private MFXPasswordField txtEmployerNum;    @FXML    void btn0(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_0 = 0;        txtEmployerNum.setText(String.valueOf(getNum+ num_0));    }    @FXML    void btn1(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_1 = 1;        txtEmployerNum.setText(String.valueOf(getNum+ num_1));    }    @FXML    void btn2(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_2 = 2;        txtEmployerNum.setText(String.valueOf(getNum+ num_2));    }    @FXML    void btn3(ActionEvent event) {        int num_3 = 3;        String text = txtEmployerNum.getText();        txtEmployerNum.setText(text + String.valueOf(num_3));    }    @FXML    void btn4(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_4 = 4;        txtEmployerNum.setText(String.valueOf(getNum+ num_4));    }    @FXML    void btn5(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_5 = 5;        txtEmployerNum.setText(String.valueOf(getNum+ num_5));    }    @FXML    void btn6(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_6 = 6;        txtEmployerNum.setText(String.valueOf(getNum+ num_6));    }    @FXML    void btn7(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_7 = 7;        txtEmployerNum.setText(String.valueOf(getNum+ num_7));    }    @FXML    void btn8(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_8 = 8;        txtEmployerNum.setText(String.valueOf(getNum+ num_8));    }    @FXML    void btn9(ActionEvent event) {        String getNum = txtEmployerNum.getText();        int num_9 = 9;        txtEmployerNum.setText(String.valueOf(getNum+ num_9));    }    @FXML    void btnClear(ActionEvent event) {        String getNumString = txtEmployerNum.getText();        int getNum = Integer.parseInt(getNumString);        int withoutLastDigit = getNum / 10;        txtEmployerNum.setText(String.valueOf(withoutLastDigit));    }    @FXML    void btnExit(ActionEvent event) {        System.exit(0);    }    @FXML    void btnLogin(ActionEvent event) throws IOException {        String empNum = txtEmployerNum.getText();        boolean b = EmployerLoginModel.loginCustomer(empNum);        if (true) {            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/main-menu-view.fxml"));            Scene scene = new Scene(fxmlLoader.load());            Stage stage = (Stage) this.root.getScene().getWindow();            stage.setScene(scene);            stage.setFullScreen(true);            stage.show();        }    }    @FXML    void btnRest(ActionEvent event) {        txtEmployerNum.setText("");    }    @FXML    void clearImg(MouseEvent event) {        String getNumString = txtEmployerNum.getText();        int getNum = Integer.parseInt(getNumString);        int withoutLastDigit = getNum / 10;        txtEmployerNum.setText(String.valueOf(withoutLastDigit));    }    @FXML    void exitImg(MouseEvent event) {        System.exit(0);    }    @FXML    void loginImg(MouseEvent event) throws IOException {        String empNum = txtEmployerNum.getText();        boolean b = EmployerLoginModel.loginCustomer(empNum);        if (true) {            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("view/main-menu-view.fxml"));            Scene scene = new Scene(fxmlLoader.load());            Stage stage = (Stage) this.root.getScene().getWindow();            stage.setScene(scene);            stage.setFullScreen(true);            stage.show();        }    }    @FXML    void restImg(MouseEvent event) {        txtEmployerNum.setText("");    }    @Override    public void initialize(URL url, ResourceBundle resourceBundle) {        txtEmployerNum.getStyleClass().remove("floating");    }}