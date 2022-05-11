<table>
 <tr>
    <td> <img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/></td>
    <td><h1>Games M4 UD20</h1></td>
  
 </tr>
</table>
 
 [comment]: <> (<img src="https://github.com/OctavioBernalGH/BTC_Reus2022_UD16/blob/main/dou_logo.png" alt="Team DOU"/><br>)
 
<hr>
 
[![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white&labelColor=101010)]()
[![GitHub](https://img.shields.io/badge/GITHUB-%20-yellow)]()
<br> 
 
Ejercicio tres en raya realizado por los miembros del equipo 1.

  [- J.Oriol López Bosch](https://github.com/mednologic)<br>
  [- Octavio Bernal](https://github.com/OctavioBernalGH)<br>
  [- David Dalmau](https://github.com/DavidDalmauDieguez)

 Este juego es una variante del tres en raya en la cual cabe la posibilidad de jugar las siguientes combinaciones:
  - Jugador vs Jugador.
  - Jugador vs Maquina.
  - Maquina vs Jugador.
  - Maquina vs Maquina (proxima mejora).

<p align="justify">El jugador o máquina solo podrá tener en campo un máximo de 3 fichas de forma simultánea, cuando se llegue a 3 fichas el jugador/máquina debera retirar una de sus fichas y posicionarla en otro lugar. Ambos jugadores podrán introducir su nombre y cuando alguno de los dos gane saldrá un mensaje indicando quién ha ganado.</p>

<p align="justify">El programa se ha estructurado de la siguiente forma, primero de todo se define el proyecto con Maven para tener un punto de partida, a continuación se crearan tres paquetes para dividir el código, el paquete class donde irán las clases de PersonaClass, CasillaClass y PartidaClass, el paquete view donde irá la vista y el paquete img donde estarán almacenadas las imagenes utilizadas en el proyecto.</p>

<p align="justify">Una vez estén las clases creada se procederá a generar el código en la vista, este proyecto comienza por aquí, se definirán sus componentes como en este caso son los JButtons, los textFields, los radioButtons y las JLabels. Una vez estén creados los componentes que formarán la vista, se les asignará un identificador descriptivo.</p>

En la siguiente imagen se puede visualizar el comienzo de una partida de ejemplo, el usuario pondrá su nombre y seleccionará contra máquina.

![image](https://user-images.githubusercontent.com/103035621/167817407-bd9ab7f5-d406-4ca8-bce1-e2743c72b2f0.png)

Se realizará un movimiento del jugador1 y automáticamente la CPU movera ficha:

![image](https://user-images.githubusercontent.com/103035621/167817808-7913c25e-09fb-44d9-8b99-772efff42960.png)

Y por último el jugador1 gana la partida con un movimiento decisivo.

![image](https://user-images.githubusercontent.com/103035621/167818039-9e5ef6ee-e902-4c5f-9181-26123ce7780d.png)

