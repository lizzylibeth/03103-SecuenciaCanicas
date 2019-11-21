/* 
 * Copyright 2019 Elísabet Palomino .
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

/**
 *
 * @author Elísabet Palomino
 */
public class Main {

    public static void main(String[] args) {

        //Constantes
        final String NOMBRE_CANICA = "Ruperta";
        final int NUM_CANICAS = 5;
        final int NUM_FINAL_CANICAS = 1;

        //Variables
        int canicasPerdidas = NUM_CANICAS - NUM_FINAL_CANICAS;

        //Cabecera
        System.out.println("Secuencia de Canicas");
        System.out.println("====================");

        System.out.printf("Nombre de la canica ........: %s%n", NOMBRE_CANICA);

        //Separador 
        System.out.println("---");

        System.out.printf("Número de canicas inicial ..: %d%n", NUM_CANICAS);
        System.out.printf("Número de canicas final ....: %d%n", NUM_FINAL_CANICAS);

        //Separador 
        System.out.println("---");

        System.out.printf("Número de canicas perdidas .: %d%n", canicasPerdidas);

    }//main

}//class
