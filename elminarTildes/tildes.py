import re
from unicodedata import normalize

# Script que utilicé para normalizar las palabras del diccionario en español que encontré

alfabeto = ["a", "á", "b", "c", "d", "e", "é", "f", "g", "h", "i", "í", "j", "k", "l", "m", "n", "o", "ó", "p", "q", "r", "s", "t", "u", "ú", "v", "w", "x", "y", "z", "ñ"]

for letra in alfabeto:
    archivo = open(letra + " copy", "r")		# respaldo por si acaso
    escribir = open(letra, "w")	

    a = archivo.readlines()		# array de cada parrafo del archivo

    for linea in a:
        # -> NFD y eliminar diacríticos
        linea = re.sub(
            r"([^n\u0300-\u036f]|n(?!\u0303(?![\u0300-\u036f])))[\u0300-\u036f]+", r"\1", 
            normalize( "NFD", linea), 0, re.I
        )

        # -> NFC
        linea = normalize( 'NFC', linea)
        escribir.write(linea.lower())


archivo.close()
escribir.close()
