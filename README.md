# JJOO 2024 App

El comité de los Juegos Olímpicos París 2024 lo  ha contratado a usted y su equipo para desarrollar la aplicación oficial de las olimpiadas. La misma debe brindar la posibilidad de los usuarios de comprar entradas para las distintas disciplinas como también ver información general de las competencias. 

## Requisitos

- Permitirle al usuario comprar entradas para los eventos deportivos
- Calcular correctamente el monto a pagar aplicando comisiones según corresponda
- Implementar un login mediante nickname y password
- El usuario tiene que ser capaz de ver el medallero de las olimpiadas y su historial de compras


## Cálculo del monto total a pagar

Para la compra de entradas, el comité opera con 3 intermediarios con los cuales el usuario puede realizar la compra de las entradas, donde cada uno tiene sus propias reglas de negocio:


| **Intermediario** | **Comisión**                                                                                                         | **Ejemplo**                                                                                                         |
|-------------------|----------------------------------------------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------|
| **Ticket Pro**    | Aplica una comisión del **2%**                                                                                       | Si compro una entrada por $100, el monto total a pagar es de **$102**                                               |
| **Elite**         | Si la compra se realiza entre las **20:00 hs y las 23:59 hs** aplica una comisión del **1%**, sino aplica **3%**      | * Si compro una entrada por $100 entre las 20:00 hs y las 23:59 hs, el monto total a pagar es de **$101** <br> * Si compro una entrada por $100 en un horario por fuera de las 20:00 hs y las 23:59 hs, el monto total a pagar es de **$103** |
| **Ultimate Event**| Si la compra se realiza un **sábado o domingo** se aplica una comisión del **3%**, sino aplica **0.75%**              | * Si compro una entrada por $100 un sábado o domingo, el monto total a pagar es de **$103** <br> * Si compro una entrada por $100 un día de semana, el monto total a pagar es de **$100,75** |
                                                                                                                                                      


### Notas
- No necesita implementar una interfaz grafica
- No necesita hacer uso de una base de datos
- Todas las reglas que la empresa usa para calcular el costo total fueron dadas anteriormente. No necesita aplicar ninguna otra regla

### Requisitos técnicos
- Hacer uso de dos o más tipos de clases diferentes.
- Hacer uso de herencia y polimorfismo.
- Hacer uso de funciones lambda y/o funciones acotadas.
- Crear y hacer uso de al menos una excepción.
