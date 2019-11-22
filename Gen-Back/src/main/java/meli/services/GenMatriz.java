package meli.services;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class GenMatriz {

    //    private char[][] matriz = {{'t', 'c', 'c', 'd', 't', 'a'},
//    {'g', 't', 'a', 't', 'd', 'a'},
//    {'d', 'c', 't', 'd', 'p', 'a'},
//    {'a', 'g', 't', 't', 't', 'a'},
//    {'a', 'd', 'c', 'a', 'c', 'c'},
//    {'d', 'd', 'g', 'g', 'g', 'g'}};
    private int n=0;
    private char[][] matriz;

    public void dimension(int dimension){
       // do {
            try {
                matriz = new char[dimension][dimension];
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
       // }while (n<=0);
    }
    public boolean cuadrar( String []secuencia) {

        boolean bandera = true;
        for (String s : secuencia) {
            if (secuencia.length != s.length()) {
                bandera = false;
            }
        }
        for (String s : secuencia) {

            for (int i = 0; i < s.length(); i++) {
                if (s.toUpperCase().charAt(i) != 'A' && s.charAt(i) != 'T' && s.charAt(i) != 'C' && s.charAt(i) != 'G') {
                    bandera = false;
                }
            }
        }
        return bandera;
    }

    public void mostrarMatriz(String [] cadena) {
        System.out.println("==== GEN MUTANTE ====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //int numRandom = (int) Math.round(Math.random() * 3);
                matriz[i][j]=cadena[i].charAt(j);
                //matriz[i][j] = letras[numRandom];
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.print("\r\n");
        }
    }

    public boolean resolver(String gen) {
        int contador=0;
        for (int[] pos : posiblesSolucionesDe(gen)) {

            // Buscar horizontalmente hacia derecha.
            String genEncontrado = genEnMatriz(pos, gen.length(), 0, 1);
            if (genEncontrado.equals(gen)) {
                System.out.println( "Gen '" + gen + "' encontrado en la posicion [" + pos[0] + "," + pos[1] + "] "
                        + "de la matriz en horizontal");
                contador++;
                if(contador>=2){
                    return true;
                }
            }

            // Buscar verticalmente hacia abajo.
            genEncontrado = genEnMatriz(pos, gen.length(), 1, 0);
            if (genEncontrado.equals(gen)) {
                System.out.println( "Gen '" + gen + "' encontrado en la posicion [" + pos[0] + "," + pos[1] + "] "
                        + "de la matriz en vertical");
                contador++;
                if(contador>=2){
                    return true;
                }
            }

            // Buscar diagonal superior derecha.
            genEncontrado = genEnMatriz(pos, gen.length(), -1, 1);
            if (genEncontrado.equals(gen)) {
                System.out.println( "Gen '" + gen + "' encontrado en la posicion [" + pos[0] + "," + pos[1] + "] "
                        + "de la matriz en su diagonal derecha");
                contador++;
                if(contador>=2){
                    return true;
                }
            }

            // Buscar diagonal superior izquierda.
            genEncontrado = genEnMatriz(pos, gen.length(), -1, -1);
            if (genEncontrado.equals(gen)) {
                System.out.println( "Gen '" + gen + "' encontrado en la posicion [" + pos[0] + "," + pos[1] + "] "
                        + "de la matriz en su diagonal izquierda");
                contador++;
                if(contador>=2){
                    return true;
                }
            }
        }

        System.out.println( "El Gen '" + gen + "' no fue encontrado en la matriz");
        return false;
    }

    /*
     * Retorna indice invertido de las posiciones donde puede
     * resolverse una gen buscada.
     */
    public int[][] posiblesSolucionesDe(String gen) {
        char primeraLetra = gen.charAt(0);
        List<int[]> indiceInvertido = new ArrayList<int[]>();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                //if (matriz[i][j] == primeraLetra) {
                    indiceInvertido.add(new int[]{i, j}); // Guardar la posicion de la letra en la matriz.
                //}
            }
        }
        return toArrayInt(indiceInvertido);
    }

    /*
     * Transforma un objeto List a un multi arreglo
     * de numeros enteros.
     * @param list la lista a transformar.
     */
    private int[][] toArrayInt(List<int[]> list) {
        return (int[][]) list.toArray(new int[list.size()][list.get(0).length]);
    }

    /*
     * Algoritmo que busca la cadena en la matriz de genes de forma
     * recursiva usando la tecnica de backtracking.
     */
    public String genEnMatriz(int[] posInicial, int numeroCaracteres, int moverEnFila, int moverEnColumna) {
        String gen = "";
        int recorrido = 0, fila = posInicial[0], columna = posInicial[1];

        while ((recorrido < numeroCaracteres)
                && (fila < matriz.length && columna < matriz.length)
                && (fila > -1 && columna > -1)) {

            gen += matriz[fila][columna];
            fila = fila + moverEnFila;
            columna = columna + moverEnColumna;
            recorrido++;
        }
        return gen;
    }



}
