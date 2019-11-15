def main():
    puerta_cerrada = False
    NIVEL_AGUA_OK = False
    SELECCION_AGUA_CALIENTE = False
    TIEMPO_CALENTAMIENTO = 5
    TIEMPO_LAVADO = 30

    while(True) :
        while (not puerta_cerrada):
            print("cerrar puerta")
        # Empezar con el llenado de agua
        while (not (NIVEL_AGUA_OK)) :
            if (puerta_cerrada) :
                print("abrir valvula de agua")
                print("abrir compartimientos de detergente")
            else:
                print("cerrar compartimientos de detergente")

        #Calentar el agua
        if (SELECCION_AGUA_CALIENTE) :
            while (tiempo <= TIEMPO_CALENTAMIENTO) :
                if (puerta_cerrada):
                    print("encender calentador")
                else:
                    print("apagar calentador")
                ++tiempo

        # Empezar ciclo de lavado
        tiempo = 0
        while (tiempo <= TIEMPO_LAVADO) :
            if (puerta_cerrada):
                print("encender ciclo de lavado")
            else:
                print("apagar ciclo de lavado")
            ++tiempo