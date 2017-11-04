/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easyderby;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Pruebas {

    public static void main(String[] args) {

        Funciones f = new Funciones();
        int t = 80;
        ArrayList<String[]> gallosEnTorneo = f.gallosPorTorneo(39);
        ArrayList<String[]> restriccionesEntorneo = f.restriccionesPorTorneo(1);
        int tope = gallosEnTorneo.size();
        System.out.println("Gallos en torneo: " + tope);
        for (String[] strings : gallosEnTorneo) {
            System.out.println("Gallo " + strings[0]);
        }
        System.out.println("--------");
        ArrayList<Integer> rojos = new ArrayList<Integer>();
        ArrayList<Integer> verdes = new ArrayList<Integer>();
        ArrayList<String> obs = new ArrayList<String>();
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= 0) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        obs.add("");
                        System.out.println(rojo + " vs " + verde + " | ");
                    }
                }
            }
        }
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= t / 2) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        obs.add("");
                        System.out.println(rojo + " vs " + verde);
                    }
                }
            }
        }

        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= t) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);

                        obs.add("");
                        System.out.println(rojo + " 4vs " + verde);
                    }
                }
            }
        }
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= (t * (t / 2))) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        String observación = "La diferencia es " + ((Math.abs(pesoRojo - pesoVerde)));
                        obs.add(observación);
                        System.out.println(rojo + " 3vs " + verde);
                    }
                }
            }
        }
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= (t * 2)) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        String observación = "La diferencia es " + ((Math.abs(pesoRojo - pesoVerde)));
                        obs.add(observación);
                        System.out.println(rojo + " 2vs " + verde);
                    }
                }
            }
        }
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= (t * 2.5)) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        String observación = "La diferencia es " + ((Math.abs(pesoRojo - pesoVerde)));
                        obs.add(observación);
                        System.out.println(rojo + " 2.5vs " + verde);
                    }
                }
            }
        }
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= (t * 3)) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        String observación = "La diferencia es " + ((Math.abs(pesoRojo - pesoVerde)));
                        obs.add(observación);
                        System.out.println(rojo + " 3vs " + verde);
                    }
                }
            }
        }
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= (t * 3.5)) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        String observación = "La diferencia es " + ((Math.abs(pesoRojo - pesoVerde)));
                        obs.add(observación);
                        System.out.println(rojo + " 3.5vs " + verde);
                    }
                }
            }
        }
        for (int i = 0; i < tope; i++) {
            int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
            int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
            int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);
            if (tope / 2 == rojos.size()) {
                break;
            } else {
                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((partidoRojo != partidoVerde) && (rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= (t * 4)) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        String observación = "La diferencia es " + ((Math.abs(pesoRojo - pesoVerde)));
                        obs.add(observación);
                        System.out.println(rojo + " 4vs " + verde);
                    }
                }
            }
        }

        if (rojos.size() != (tope / 2)) {
            System.out.println("Incompleto");
            for (int i = 0; i < tope; i++) {
                int rojo = Integer.parseInt(gallosEnTorneo.get(i)[0]);
                int pesoRojo = Integer.parseInt(gallosEnTorneo.get(i)[2]);
                int partidoRojo = Integer.parseInt(gallosEnTorneo.get(i)[5]);

                for (int j = i; j < tope; j++) {
                    int verde = Integer.parseInt(gallosEnTorneo.get(j)[0]);
                    int pesoVerde = Integer.parseInt(gallosEnTorneo.get(j)[2]);
                    int partidoVerde = Integer.parseInt(gallosEnTorneo.get(j)[5]);

                    if ((rojo != verde) && ((Math.abs(pesoRojo - pesoVerde) <= (t * 4)) && !estaEnPeleas(rojos, verdes, rojo) && !estaEnPeleas(rojos, verdes, verde))) {
                        rojos.add(rojo);
                        verdes.add(verde);
                        String observación = "La diferencia es " + ((Math.abs(pesoRojo - pesoVerde)));
                        obs.add(observación);
                        System.out.println(rojo + " 4vs " + verde);
                    }
                }
            }

        }

        System.out.println("------------------");
        int num = 6;//Partidos participantes
        int numG = 4;
        int numR = (tope/2)/numG;
        for (int i = 0; i < tope / 2; i++) {

            int ronda = ((int) i / (numR)) + 1;
            System.out.println(rojos.get(i) + " vs " + verdes.get(i) + " Obs: " + obs.get(i) + " Ronda: " + ronda);
        }

        System.out.println("------- Nuevo orden ---------");
        ArrayList<String[]> peleas = f.peleasTorneoTablaAll(39);
        int numP = (peleas.size() * numG) / 2;
        System.out.println("Num peleas: " + numP);
        int[] arrayPartidosOld = new int[numP];
        int[] arrayNewPeleas = new int[peleas.size()];
        arrayPartidosOld[0] = Integer.parseInt(peleas.get(0)[17]);
        arrayPartidosOld[1] = Integer.parseInt(peleas.get(0)[20]);
        int index = 2;
        int aux = 0;
        arrayNewPeleas[0] = Integer.parseInt(peleas.get(0)[1]);
        for (int i = 1; i < ((peleas.size() + 1) / 2); i++) {
            int idRojo = Integer.parseInt(peleas.get(i)[17]);
            int idVerde = Integer.parseInt(peleas.get(i)[20]);
            if (estaArrra(arrayPartidosOld, idRojo)) {
                aux = Integer.parseInt(peleas.get(i + (peleas.size() / 2))[1]);
                arrayNewPeleas[i + (peleas.size() / 2)] = Integer.parseInt(peleas.get(i)[1]);
                arrayNewPeleas[i] = aux;
            } else if (estaArrra(arrayPartidosOld, idVerde)) {
                aux = Integer.parseInt(peleas.get(i + (peleas.size() / 2))[1]);
                arrayNewPeleas[i + (peleas.size() / 2)] = Integer.parseInt(peleas.get(i)[1]);
                arrayNewPeleas[i] = aux;
            } else {
                arrayNewPeleas[i] = Integer.parseInt(peleas.get(i)[1]);
            }
        }
        for (int i = 0; i < arrayNewPeleas.length; i++) {
            int id = Integer.parseInt(peleas.get(i)[1]);
            System.out.println("ID: " + id);
            if (!estaArrra(arrayNewPeleas, id)) {
                arrayNewPeleas[i] = id;
            }
        }
        System.out.println("---Ordenados---");
        for (int i = 0; i < arrayNewPeleas.length; i++) {
            int arrayNewPelea = arrayNewPeleas[i];
            System.out.println(arrayNewPelea);
        }
    }

    public static boolean estaArrra(int[] array, int index) {
        boolean esta = false;
        for (int i : array) {
            if (i == index) {
                esta = true;
                break;
            }
        }
        return esta;
    }

    public static boolean estaEnPeleas(ArrayList<Integer> l, ArrayList<Integer> v, int gallo) {
        boolean esta = false;
        for (Integer integer : l) {
            if (gallo == integer) {
                esta = true;
                break;
            }
        }
        if (!esta) {
            for (Integer integer : v) {
                if (gallo == integer) {
                    esta = true;
                    break;
                }
            }
        }
        return esta;
    }
}
