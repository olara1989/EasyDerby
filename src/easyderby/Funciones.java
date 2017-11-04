/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyderby;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Omar
 */
public class Funciones {

    private Conexion c;

    public Funciones() {
        c = new Conexion();
    }

    // Metodo agregar nuevo metodo    
    public boolean agregarTorneo(String nombre, String fecha, String ubicacion, String organizador, String compania, int num_gallos, int tolerancia, int peso_minimo,
            int peso_max, int pts_victoria, int pts_empate, int pts_derrota) {
        try {

            String sql = "INSERT INTO torneo VALUES(NULL,'" + nombre + "','" + fecha + "','" + ubicacion + "','" + organizador + "','" + compania + "','"
                    + num_gallos + "','" + tolerancia + "','" + peso_minimo + "','" + peso_max + "','" + pts_victoria + "','" + pts_empate + "'"
                    + ",'" + pts_derrota + "',1)";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    // Agregar partido

    public boolean agregarPartido(String nombre, String origen) {
        try {
            String sql = "INSERT INTO partidos VALUES(NULL,'" + nombre + "','" + origen + "',1)";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Agregar peleas
    public boolean agregarPelea(int num, int resultado, String observaciones, int rojo, int verde, int ronda) {
        try {
            String sql = "INSERT INTO pelea VALUES(NULL,'" + num + "','" + resultado + "','" + observaciones + "','" + rojo + "','" + verde + "','" + ronda + "')";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean agregarRonda(int num, String fecha, int torneo) {
        try {
            String sql = "INSERT INTO ronda VALUES(NULL,'" + num + "',,'" + fecha + "','" + torneo + "')";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean agregarGallo(int anillo, int peso, int partido, int t) {
        try {
            String sql = "INSERT INTO gallo VALUES(NULL,'" + anillo + "','" + peso + "','" + partido + "','" + t + "')";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //Agregar en la tabla partido_torneo

    public boolean agregarPartidos_torneo(int partido, int torneo, int puntos) {
        try {
            String sql = "INSERT INTO partidos_torneo VALUES('" + partido + "','" + torneo + "','" + puntos + "')";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean agregarResultado(int pelea, int resultado) {
        try {
            String sql = "UPDATE pelea SET resultado = '" + resultado + "' WHERE id = " + pelea + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean agregarRestriccion(int torneo, int partido1, int partido2) {
        try {
            String sql = "INSERT INTO restricciones VALUES('" + torneo + "','" + partido1 + "','" + partido2 + "')";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean modificarGallo(int id, int anillo, int peso, int partido) {
        try {
            String sql = "UPDATE pelea SET anillo = '" + anillo + "',peso = '" + peso + "',partido = '" + partido + "', WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean modificarPartido(int id, String nombre, String origen) {
        try {
            String sql = "UPDATE partidos SET nombre = '" + nombre + "',origen = '" + origen + "' WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean modificarPelea(int id, int num, int resultado, String observaciones, int rojo, int verde, int ronda) {
        try {
            String sql = "UPDATE pelea SET numero = '" + num + "',resultado = '" + resultado + "',observaciones = '" + observaciones
                    + "',rojo = '" + rojo + "',verde = '" + verde + "',ronda = '" + ronda + "' WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean reordenarPelea(int id, int num,int ronda) {
        try {
            String sql = "UPDATE pelea SET numero = '" + num + "',ronda = '" + ronda + "' WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
public boolean reordenarRonda(int id,int ronda) {
        try {
            String sql = "UPDATE pelea SET ronda = '" + ronda + "' WHERE  id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean modificarRonda(int id, int num, String fecha, int torneo) {
        try {
            String sql = "UPDATE pelea SET numero = '" + num + "',fecha = '" + fecha + "',torneo = '" + torneo
                    + "' WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean modificarTorneo(int id, String nombre, String fecha, String ubicacion, String organizacion, int num_gallos, int tolerancia, int peso_min, int peso_max, int victoria, int empate, int derrota) {
        try {
            String sql = "UPDATE torneo SET nombre = '" + nombre + "',fecha = '" + fecha + "',ubicacion = '" + ubicacion + "',organizador = '" + organizacion
                    + "',num_gallos = '" + num_gallos + "',tolerancia = '" + tolerancia + "',peso_minimo = '" + peso_min + "',peso_maximo = '" + peso_max
                    + "',victoria = '" + victoria + "',empate = '" + empate + "',derrota = '" + derrota
                    + "' WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar los partidos
    public boolean eliminarPartido(int id) {
        try {
            String sql = "UPDATE partidos SET activo = 0 WHERE id = "+id+";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarTorneo(int id) {
        try {
            String sql = "DELETE FROM torneo WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Eliminar los partidos
    public boolean eliminarGallo(int id) {
        try {
            String sql = "DELETE FROM gallo WHERE id = " + id + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    // Lista de partidos ordenada por nombre
    /**
     *
     * @return
     */
    public ArrayList<String[]> getPartidos() {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM partidos WHERE activo = 1 ORDER BY  nombre;";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[3];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return partidos;
    }

    public ArrayList<String[]> getPartido(int id) {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM partidos WHERE id= " + id + " AND activo = 1 ORDER BY  nombre;";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[3];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return partidos;
    }

    public ArrayList<String[]> buscarPartido(String busqueda) {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM partidos WHERE nombre LIKE '%" + busqueda + "%'  AND ACTIVO = 1 ORDER BY  nombre;";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[3];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partidos;
    }

    public String[] getPartidoDetalle(int id) {

        String[] partido = new String[3];;
        try {
            String sql = "SELECT * FROM partidos WHERE id = " + id + "  AND ACTIVO = 1;";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {

                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);

            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partido;
    }
public String[] getTorneoDetalle(int id) {

        String[] partido = new String[14];;
        try {
            String sql = "SELECT * FROM torneo WHERE id = " + id + ";";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {

                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partido[3] = rs.getString(4);
                partido[4] = rs.getString(5);
                partido[5] = rs.getString(6);
                partido[6] = rs.getString(7);
                partido[7] = rs.getString(8);
                partido[8] = rs.getString(9);
                partido[9] = rs.getString(10);
                partido[10] = rs.getString(11);
                partido[11] = rs.getString(12);
                partido[12] = rs.getString(13);
                partido[13] = rs.getString(14);
                
                

            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partido;
    }

    public int getUltimoTorneo() {
        int id = 0;
        try {
            String sql = "SELECT MAX(id) FROM torneo;";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }

    public ArrayList<String[]> getTorneosActivos() {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM torneo WHERE activo = 1;";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[3];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partidos;
    }

    public ArrayList<String[]> gallosPorTorneo(int idTorneo) {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM gallo JOIN partidos ON gallo.partido=partidos.id  WHERE gallo.torneo = '" + idTorneo + "' ORDER BY gallo.peso, gallo.partido;";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[8];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partido[3] = rs.getString(4);
                partido[4] = rs.getString(5);
                partido[5] = rs.getString(6);
                partido[6] = rs.getString(7);
                partido[7] = rs.getString(8);
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partidos;
    }

    public ArrayList<String[]> peleasTorneoTabla(int idTorneo) {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM `pelea` JOIN gallo AS g_rojo JOIN gallo AS g_verde JOIN partidos AS p_rojo JOIN partidos AS p_verde "
                    + "ON pelea.rojo = g_rojo.id AND pelea.verde = g_verde.id AND g_rojo.partido = p_rojo.id AND g_verde.partido = p_verde.id "
                    + "WHERE g_verde.torneo = " + idTorneo + " AND g_rojo.torneo = " + idTorneo + " ORDER BY pelea.numero";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[7];
                partido[0] = rs.getString("pelea.numero");
                partido[1] = rs.getString("p_rojo.nombre");
                partido[2] = rs.getString("g_rojo.anillo") + " | " + rs.getString("g_rojo.peso") + " g";
                partido[3] = rs.getString("p_verde.nombre");
                partido[4] = rs.getString("g_verde.anillo") + " | " + rs.getString("g_verde.peso") + " g";
                partido[5] = rs.getString("pelea.ronda");
                partido[6] = rs.getString("pelea.id");
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partidos;
    }

    public ArrayList<String[]> peleasTorneoTablaAll(int idTorneo) {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM `pelea` JOIN gallo AS g_rojo JOIN gallo AS g_verde JOIN partidos AS p_rojo JOIN partidos AS p_verde "
                    + "ON pelea.rojo = g_rojo.id AND pelea.verde = g_verde.id AND g_rojo.partido = p_rojo.id AND g_verde.partido = p_verde.id "
                    + "WHERE g_verde.torneo = " + idTorneo + " AND g_rojo.torneo = " + idTorneo + " ORDER BY pelea.numero";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[22];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partido[3] = rs.getString(4);
                partido[4] = rs.getString(5);
                partido[5] = rs.getString(6);
                partido[6] = rs.getString(7);
                partido[7] = rs.getString(8);
                partido[8] = rs.getString(9);
                partido[9] = rs.getString(10);
                partido[10] = rs.getString(11);
                partido[11] = rs.getString(12);
                partido[12] = rs.getString(13);
                partido[13] = rs.getString(14);
                partido[14] = rs.getString(15);
                partido[15] = rs.getString(16);
                partido[16] = rs.getString(17);
                partido[17] = rs.getString(18);
                partido[18] = rs.getString(19);
                partido[19] = rs.getString(20);
                partido[20] = rs.getString(21);
                partido[21] = rs.getString(22);
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partidos;
    }

    public ArrayList<String[]> restriccionesPorTorneo(int idTorneo) {
        ArrayList<String[]> partidos = new ArrayList<String[]>();
        String[] partido;
        try {
            String sql = "SELECT * FROM restricciones WHERE torneo = '" + idTorneo + "';";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[3];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partidos.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partidos;
    }
    //Funciones genericas
    //Cargar información de un array list en una JTable

    public void actualizarTabla(javax.swing.JTable t, ArrayList<String[]> listaT) {
        this.LimpiarJTable(t);
        ArrayList<String> row = new ArrayList<String>();
        for (String[] prod : listaT) {
            for (String string : prod) {
                row.add(string);
            }
            ((DefaultTableModel) t.getModel()).addRow(row.toArray());
            row = new ArrayList<String>();
        }
    }

    // Limpiar tablas funcion para eliminar todos los registros en la tabla
    public void LimpiarJTable(javax.swing.JTable t) {
        DefaultTableModel mode = (DefaultTableModel) t.getModel();
        int rango = mode.getRowCount() - 1;
        for (int i = rango; i >= 0; i--) {
            mode.removeRow(i);
        }
    }

    public boolean modificarPelea(int idPeleaRow, int idVerde, String col) {
        try {
            String sql = "UPDATE pelea SET " + col + " = '" + idVerde + "' WHERE id = " + idPeleaRow + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
    
    public boolean cambiarPeleaPartidos(int id1, int id2, int verde1,int verde2) {
        try {
            System.out.println("--- Cambiando Partidos repetidos");
            String sql = "UPDATE pelea SET verde = '" + verde1 + "' WHERE id = " + id2 + ";";
            System.out.println(sql);
            c.stt.executeUpdate(sql);
            String sql2 = "UPDATE pelea SET verde = '" + verde2 + "' WHERE id = " + id1 + ";";
            System.out.println(sql2);
            c.stt.executeUpdate(sql2);
            
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }

    public String[] detailsGallo(int get) {
         String[] partido = new String[5];
        try {
            String sql = "SELECT * FROM `gallo` WHERE id = "+get+";";
            //System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                               
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                partido[2] = rs.getString(3);
                partido[3] = rs.getString(4);
                partido[4] = rs.getString(5);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return partido;
    }
    public ArrayList<String[]> getPartidosXTorneo(int idT){
        ArrayList<String[]> res = new ArrayList<String[]>();
         String[] partido;
        try {
            String sql = "SELECT * FROM partidos JOIN partidos_torneo JOIN torneo "
                    + "ON partidos.id = partidos_torneo.partido AND partidos_torneo.torneo = torneo.id WHERE torneo =  '" + idT + "';";
            System.out.println(sql);
            ResultSet rs = c.stt.executeQuery(sql);
            while (rs.next()) {
                partido = new String[2];
                partido[0] = rs.getString(1);
                partido[1] = rs.getString(2);
                res.add(partido);
            }
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        }          
        return res;
    }
}
