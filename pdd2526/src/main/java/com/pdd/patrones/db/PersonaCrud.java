package com.pdd.patrones.db;

import com.pdd.patrones.modelo.Persona;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Optional;

public class PersonaCrud {

    public Optional<Persona> buscar(Integer id) {
        try (Connection con = ConexionDb.getConnection()) {
            String sql = "select * from personas where id = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Persona p = new Persona();
                p.setId(rs.getInt("id"));
                p.setNombre(rs.getString("nombre"));
                p.setEdad(rs.getInt("edad"));
                p.setDireccion(rs.getString("direccion"));

                return Optional.of(p);
            }
            return Optional.empty();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Persona> listar() {


    }
}
