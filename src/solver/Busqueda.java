package solver;

/**
 *
 * @author ronny12301
 */
public class Busqueda {
    
    public boolean validarPalabra(char[][] tablero, String palabra) {
        for (int fila = 0; fila<tablero.length; fila++) {
            for (int columna = 0; columna<tablero[fila].length; columna++) {
                if (tablero[fila][fila] == palabra.charAt(0) 
                        && buscarPalabra(tablero, fila, columna, 0, palabra)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    
    public boolean buscarPalabra(char[][] tablero, int fila, int columna, int indice, String palabra) {
        if (indice == palabra.length())
            return true;
        
        if (fila<0 || fila>=tablero.length || columna<0 || columna>= tablero.length 
                || tablero[fila][columna] != palabra.charAt(indice)) {
            return false;
        }
        
        char letra = tablero[fila][columna];      
        tablero[fila][columna] = ' ';           // Descartamos donde ya pasamos
        
        boolean resultado = buscarPalabra(tablero, fila+1, columna, indice+1, palabra)  // Abajo
                || buscarPalabra(tablero, fila+1, columna+1, indice+1, palabra)
                || buscarPalabra(tablero, fila+1, columna-1, indice+1, palabra)
                || buscarPalabra(tablero, fila-1, columna, indice+1, palabra)           // Arriba
                || buscarPalabra(tablero, fila-1, columna+1, indice+1, palabra)
                || buscarPalabra(tablero, fila-1, columna-1, indice+1, palabra)
                || buscarPalabra(tablero, fila, columna+1, indice+1, palabra)           // Derecha
                || buscarPalabra(tablero, fila, columna-1, indice+1, palabra);          // Izquierda
        
        tablero[fila][columna] = letra;
        return resultado;
    }
    
}
