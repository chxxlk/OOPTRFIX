/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooptrfix;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author chvr__
 */
public class CariMahasiswa {

    public static List<Mahasiswa> cariMahasiswa(String nim) throws Exception {
        List<Mahasiswa> hasilPencarian = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa WHERE " + "nim LIKE ?";
        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql);) {

            String searchPattern = "%" + nim + "%";
            pstmt.setString(1, searchPattern);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Mahasiswa mahasiswa = new Mahasiswa(
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getString("prodi"),
                        rs.getString("angkatan"),
                        rs.getString("alamat")
                );
                hasilPencarian.add(mahasiswa);
            }
            return hasilPencarian;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
