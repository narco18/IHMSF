package com.example.ihmsf.Controllers.Receptionist;

import com.example.ihmsf.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class ReciptionistController implements Initializable {
    public BorderPane reciptionist_parent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Model.getInstance().getViewFactory().getRecipSelection().addListener((observableValue, oldVal, newVal) -> {
            switch (newVal) {
                case "Appointment" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getAppointmentView());
                case "Dashboard" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
                case "Patients" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getPatientsView());
                case "NewPatient" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getNewPatientView());
                case "SearchPatients" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getSearchPatientView());
                case "Attendance" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getAttendanceView());
                case "TakeAttendance" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getTakeAttendanceView());
                case "AttendanceHistory" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getAttendanceHistoryView());
                case "Profile" -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getProfileView());
                default -> reciptionist_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());
            }
        });
    }
}
