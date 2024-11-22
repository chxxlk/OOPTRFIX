/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooptrfix;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author chvr__
 */
public class UpdateMahasiswa {

    /**
     *
     * @param mahasiswa
     * @return
     */
    public boolean updateMahasiswa(Mahasiswa mahasiswa) {
        String sql = "UPDATE mahasiswa SET nama = ?, prodi = ?, angkatan = ?, alamat = ? WHERE nim = ?";
        
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            
            pstmt.setString(5, mahasiswa.getNim());
            pstmt.setString(1, mahasiswa.getNama());
            pstmt.setString(2, mahasiswa.getProdi());
            pstmt.setString(3, mahasiswa.getAngkatan());
            pstmt.setString(4, mahasiswa.getAlamat());
            
            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
