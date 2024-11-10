Ajedrez JKE



Introducción
El juego de Ajedrez es un juego de estrategia entre dos jugadores, donde cada uno dispone de 16 piezas: un rey, una reina, dos alfiles, dos caballos, dos torres y ocho peones. El objetivo es dar jaque mate al rey adversario, o sea, colocar al rey en una posición donde no pueda evitar ser capturado.
Con este manual se tiene como propósito, guiar al usuario en el uso del sistema para jugar ajedrez en una interfaz gráfica creada con JavaFX en NetBeans con el lenguaje de Java. A continuación, se explican las instrucciones de uso, características del juego y cómo interactuar con el tablero y las piezas.



________________________________________
Requisitos del Sistema:
•	Sistema Operativo: Windows, macOS o Linux.

•	Java: Se requiere tener instalado Java 8 (preferiblemente esta versión) o superior.

•	NetBeans IDE: Recomendado para compilar el código si se desea ver el juego en desarrollo (versión 21

•	Requisitos de Hardware: El juego puede ejecutarse en cualquier máquina que soporte y tenga instalado Java.




________________________________________
Instalación y Ejecución
1.	Descarga e instalación: Descargar el archivo .ZIP que contiene el proyecto, ya sea de GitHub o del Aula Virtual. Una vez hecho eso, extraer el proyecto y abrirlo en NetBeans.
Una vez abierto en NetBeans, asegúrese de tener instalado JavaFX y ejecute el archivo “Main” (click derecho, Run file) del proyecto desde NetBeans.

2.	Ejecutar el juego: Al ejecutar el juego, verá la página de inicio con 3 botones, “Jugar, Reglas y Info nosotros” Los botones “Reglas e Info nosotros llevaban a las siguientes pantallas y se puede regresar a la página de inicio”


________________________________________
Instrucciones de Uso
1.	Pantalla de inicio:
o	Al iniciar el juego (dándole a Jugar), aparecerá una ventana que solicita los nombres de los jugadores y la selección de piezas (blancas o negras). El jugador 1 elegirá su color y el jugador 2 tomará el color restante.


2.	Tablero de Ajedrez:
-Al darle jugar en la pantalla anterior, será llevado al tablero:
o	El tablero está compuesto por 64 casillas, organizadas en 8 filas y 8 columnas, alternando colores blanco y negro.
o	Reglas del Tablero:
	En el primer turno, las piezas blancas estarán ubicadas en la parte inferior del tablero y las negras en la parte superior.
	En cada turno posterior, las posiciones de las piezas se intercambiarán.
3.	Movimiento de las piezas:
o	Para mover una pieza, seleccione la pieza y luego arrástrela a la casilla resaltada en el tablero. La casilla donde puede moverse estará destacada cuando la pieza sea seleccionada.
o	Las piezas tienen diferentes reglas de movimiento, según su tipo:
	Rey: Se mueve una casilla en cualquier dirección (horizontal, vertical, o diagonal).
	Reina: Se mueve cualquier número de casillas en cualquier dirección.
	Alfil: Se mueve en diagonal.
	Torre: Se mueve vertical u horizontalmente.
	Caballo: Se mueve en forma de ‘L’, avanzando dos casillas en una dirección y luego una en perpendicular.
	Peón: Se mueve una o dos casillas hacia adelante en su primer movimiento y una casilla después. Captura en diagonal.
4.	Reloj de ajedrez:
o	El juego cuenta con un reloj que mide el tiempo de cada jugador. Solo el reloj del jugador que está en su turno está en marcha. Cuando se realiza un movimiento, el reloj del jugador que acaba de mover se detiene y el reloj del otro jugador comienza.
5.	Piezas Capturadas:
o	Las piezas capturadas por cada jugador se muestran en la parte superior de la ventana. Podrá ver qué piezas ha perdido cada jugador.



________________________________________
Funciones Especiales

1.	Jaque y Jaque Mate:
o	Jaque: Si un rey está amenazado de captura, se muestra un aviso gráfico en el juego indicando que el rey está en jaque. El jugador debe eliminar la amenaza mediante una jugada legal.
o	Jaque Mate: Si un rey está en jaque y no puede evitar ser capturado, el juego anunciará que ha ocurrido un jaque mate, y el jugador que lo ha logrado será el ganador.
2.	Enroque:
o	El enroque se realiza moviendo el rey dos casillas hacia la torre correspondiente y luego moviendo la torre a la casilla sobre la que el rey cruzó. El enroque solo es válido si el rey y la torre no se han movido antes y las casillas entre ellos están desocupadas.
3.	Coronación:
o	Cuando un peón alcanza la fila final del tablero contrario, se coronará y se transformará en una reina, aumentando su poder en el juego.


________________________________________
Funciones Gráficas

1.	Animaciones:
o	El juego incluye animaciones para cuando se captura una pieza, se realiza un enroque o cuando un peón se corona en una reina. Estas animaciones mejoran la experiencia visual del juego.
2.	Redimensionado del Tablero:
o	El tamaño del tablero es ajustable en tiempo real. Si desea agrandar o reducir el tamaño del tablero, las casillas y las piezas se ajustarán automáticamente.


________________________________________
Solución de Problemas

1.	El juego no inicia:
o	Asegúrese de tener Java 8 instalado correctamente y que está ejecutando el archivo correcto “Main”.
o	Si está usando NetBeans, verifique que ha configurado JavaFX correctamente.
2.	El reloj no avanza:
o	Si el reloj no avanza correctamente, asegúrese de que está realizando un movimiento completo y de que está deteniendo su reloj correctamente para que el del oponente se active.
3.	El movimiento de las piezas no es permitido:
o	Recuerde que solo puede mover las piezas a las casillas resaltadas. Si no se resalta una casilla, el movimiento no es válido


________________________________________
Conclusión

Este manual proporciona las instrucciones básicas para jugar ajedrez en esta implementación. Si sigue estos pasos, podrá disfrutar de una experiencia completa con todas las funcionalidades del juego. ¡Buena suerte y que gane el mejor jugador!


