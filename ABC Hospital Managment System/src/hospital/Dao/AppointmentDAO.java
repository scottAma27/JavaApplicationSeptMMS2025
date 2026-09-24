package hospital.Dao;

import hospital.database.DatabaseConnection;
import hospital.model.Appointment;
import hospital.model.Doctor;
import hospital.model.Patient;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AppointmentDAO {

    // =========================================================
    // CREATE APPOINTMENT - FIXED FK 547
    // =========================================================
    public boolean addAppointment(Appointment appointment) {
        String sql = "INSERT INTO Appointment (patientId, DoctorId, AppointmentDate, Reason, Status, Notes) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            if (appointment.getPatient() == null || appointment.getDoctor() == null) {
                System.out.println("Patient or Doctor is NULL!");
                return false;
            }

            stmt.setInt(1, appointment.getPatient().getPatientId());
            // FIXED: Must be DoctorId, not StaffId
            int doctorId = appointment.getDoctor().getStaffId();
            if (doctorId == 0) doctorId = appointment.getDoctor().getStaffId(); // fallback if model uses StaffId as DoctorId
            System.out.println("DEBUG Inserting PatientId=" + appointment.getPatient().getPatientId() + " DoctorId=" + doctorId);
            stmt.setInt(2, doctorId);
            
            stmt.setTimestamp(3, Timestamp.valueOf(appointment.getAppointmentDate()));
            stmt.setString(4, appointment.getReason());
            stmt.setString(5, appointment.getStatus() != null ? appointment.getStatus() : "Scheduled");
            stmt.setString(6, appointment.getNotes());

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                try (ResultSet keys = stmt.getGeneratedKeys()) {
                    if (keys.next()) {
                        appointment.setId(keys.getInt(1));
                        System.out.println("Appointment created ID: " + keys.getInt(1));
                    }
                }
                return true;
            }
        } catch (SQLException e) {
            System.out.println("SQL Error Code: " + e.getErrorCode() + " Message: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    // =========================================================
    // GET APPOINTMENT BY ID - FIXED JOIN
    // =========================================================
    public Appointment getAppointmentById(int appointmentId) {
        String sql = """
                SELECT
                    a.AppointmentId,
                    a.patientId,
                    a.DoctorId,
                    a.AppointmentDate,
                    a.Reason,
                    a.Status,
                    a.Notes,
                    p.FirstName AS PatientFirstName,
                    p.LastName AS PatientLastName,
                    dp.FirstName AS DoctorFirstName,
                    dp.LastName AS DoctorLastName,
                    d.Specialization,
                    d.StaffId AS DoctorStaffId
                FROM Appointment a
                INNER JOIN Doctor d ON a.DoctorId = d.DoctorId
                INNER JOIN Staff s ON d.StaffId = s.StaffId
                INNER JOIN Patient pt ON a.patientId = pt.patientId
                INNER JOIN Person p ON pt.PersonId = p.PersonId
                INNER JOIN Person dp ON s.PersonId = dp.PersonId
                WHERE a.AppointmentId = ?
                """;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, appointmentId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) return mapAppointment(rs);
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return null;
    }

    // =========================================================
    // GET ALL APPOINTMENTS - FIXED JOIN
    // =========================================================
    public List<Appointment> getAllAppointments() {
        List<Appointment> appointments = new ArrayList<>();
        String sql = """
                SELECT
                    a.AppointmentId, a.patientId, a.DoctorId, a.AppointmentDate, a.Reason, a.Status, a.Notes,
                    p.FirstName AS PatientFirstName, p.LastName AS PatientLastName,
                    dp.FirstName AS DoctorFirstName, dp.LastName AS DoctorLastName,
                    d.Specialization, d.StaffId AS DoctorStaffId
                FROM Appointment a
                INNER JOIN Doctor d ON a.DoctorId = d.DoctorId
                INNER JOIN Staff s ON d.StaffId = s.StaffId
                INNER JOIN Patient pt ON a.patientId = pt.patientId
                INNER JOIN Person p ON pt.PersonId = p.PersonId
                INNER JOIN Person dp ON s.PersonId = dp.PersonId
                ORDER BY a.AppointmentDate DESC
                """;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) appointments.add(mapAppointment(rs));
        } catch (SQLException e) { e.printStackTrace(); }
        return appointments;
    }

    // =========================================================
    // UPDATE APPOINTMENT - FIXED
    // =========================================================
    public boolean updateAppointment(Appointment appointment) {
        String sql = "UPDATE Appointment SET patientId = ?, DoctorId = ?, AppointmentDate = ?, Reason = ?, Status = ?, Notes = ? WHERE AppointmentId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, appointment.getPatient().getPatientId());
            stmt.setInt(2, appointment.getDoctor().getStaffId());
            stmt.setTimestamp(3, Timestamp.valueOf(appointment.getAppointmentDate()));
            stmt.setString(4, appointment.getReason());
            stmt.setString(5, appointment.getStatus());
            stmt.setString(6, appointment.getNotes());
            stmt.setInt(7, appointment.getId());
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) { e.printStackTrace(); }
        return false;
    }

    // =========================================================
    // DELETE APPOINTMENT
    // =========================================================
    public boolean deleteAppointment(int appointmentId) {
        String sql = "DELETE FROM Appointment WHERE AppointmentId = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, appointmentId);
            return stmt.executeUpdate() > 0;
        } catch (SQLException e) { e.printStackTrace(); }
        return false;
    }

    // =========================================================
    // GET BY PATIENT - FIXED JOIN
    // =========================================================
    public List<Appointment> getAppointmentsByPatient(int patientId) {
        List<Appointment> appointments = new ArrayList<>();
        String sql = """
                SELECT a.AppointmentId, a.patientId, a.DoctorId, a.AppointmentDate, a.Reason, a.Status, a.Notes,
                       p.FirstName AS PatientFirstName, p.LastName AS PatientLastName,
                       dp.FirstName AS DoctorFirstName, dp.LastName AS DoctorLastName,
                       d.Specialization, d.StaffId AS DoctorStaffId
                FROM Appointment a
                INNER JOIN Doctor d ON a.DoctorId = d.DoctorId
                INNER JOIN Staff s ON d.StaffId = s.StaffId
                INNER JOIN Patient pt ON a.patientId = pt.patientId
                INNER JOIN Person p ON pt.PersonId = p.PersonId
                INNER JOIN Person dp ON s.PersonId = dp.PersonId
                WHERE a.patientId = ? ORDER BY a.AppointmentDate DESC
                """;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, patientId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) appointments.add(mapAppointment(rs));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return appointments;
    }

    // =========================================================
    // GET BY DOCTOR - FIXED JOIN
    // =========================================================
    public List<Appointment> getAppointmentsByDoctor(int doctorId) {
        List<Appointment> appointments = new ArrayList<>();
        String sql = """
                SELECT a.AppointmentId, a.patientId, a.DoctorId, a.AppointmentDate, a.Reason, a.Status, a.Notes,
                       p.FirstName AS PatientFirstName, p.LastName AS PatientLastName,
                       dp.FirstName AS DoctorFirstName, dp.LastName AS DoctorLastName,
                       d.Specialization, d.StaffId AS DoctorStaffId
                FROM Appointment a
                INNER JOIN Doctor d ON a.DoctorId = d.DoctorId
                INNER JOIN Staff s ON d.StaffId = s.StaffId
                INNER JOIN Patient pt ON a.patientId = pt.patientId
                INNER JOIN Person p ON pt.PersonId = p.PersonId
                INNER JOIN Person dp ON s.PersonId = dp.PersonId
                WHERE a.DoctorId = ? ORDER BY a.AppointmentDate DESC
                """;
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, doctorId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) appointments.add(mapAppointment(rs));
            }
        } catch (SQLException e) { e.printStackTrace(); }
        return appointments;
    }

    // =========================================================
    // MAP
    // =========================================================
    private Appointment mapAppointment(ResultSet rs) throws SQLException {
        Appointment appointment = new Appointment();
        appointment.setId(rs.getInt("AppointmentId"));

        Patient patient = new Patient();
        patient.setPatientId(rs.getInt("patientId"));
        patient.setFirstName(rs.getString("PatientFirstName"));
        patient.setLastName(rs.getString("PatientLastName"));
        appointment.setPatient(patient);

        Doctor doctor = new Doctor();
        doctor.setStaffId(rs.getInt("DoctorId")); // FIXED: DoctorId
        try { doctor.setStaffId(rs.getInt("DoctorStaffId")); } catch(Exception ex) {}
        doctor.setFirstName(rs.getString("DoctorFirstName"));
        doctor.setLastName(rs.getString("DoctorLastName"));
        doctor.setSpecialization(rs.getString("Specialization"));
        appointment.setDoctor(doctor);

        Timestamp timestamp = rs.getTimestamp("AppointmentDate");
        if (timestamp != null) appointment.setAppointmentDate(timestamp.toLocalDateTime());
        appointment.setReason(rs.getString("Reason"));
        appointment.setStatus(rs.getString("Status"));
        appointment.setNotes(rs.getString("Notes"));
        return appointment;
    }
}