/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ooptrfix;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author chvr__
 */
public class AmbilMahasiswa {
    public List<Mahasiswa> ambilSemuaMahasiswa(){
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa ORDER BY nim";
        
        try (Connection conn = DatabaseConnection.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
            ){
            while (rs.next()) {                
                Mahasiswa mahasiswa = new Mahasiswa(
                        rs.getString("nim"),
                        rs.getString("nama"),
                        rs.getString("prodi"),
                        rs.getString("angkatan"),
                        rs.getString("alamat")
                );
                daftarMahasiswa.add(mahasiswa);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return daftarMahasiswa;
    }
}
