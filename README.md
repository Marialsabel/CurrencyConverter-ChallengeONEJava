# CurrencyConverter-ChallengeONEJava

**Introducción:**
Este programa de Convertidor de Moneda permite a los usuarios convertir sus Pesos Colombianos (COP) a varias monedas, incluyendo USD, EUR, GBP, JPY y KRW. Además, los usuarios también pueden realizar conversiones desde estas monedas nuevamente a Pesos Colombianos. El programa utiliza `javax.swing.JOptionPane` para mostrar cuadros de diálogo para la interacción con el usuario.

**Cómo Usar:**

1. Ejecuta la clase `CurrencyConverterDialog` para iniciar el programa.
2. El menú principal se mostrará en un cuadro de diálogo. Selecciona "Convertidor de Moneda" para iniciar una conversión de moneda.
3. Luego, elige la moneda a la que deseas convertir tus Pesos Colombianos, o selecciona "Volver al Menú" para regresar al menú principal.
4. Si decides realizar una conversión de moneda, ingresa la cantidad de Pesos Colombianos que deseas convertir. Asegúrate de ingresar un valor numérico válido.
5. El programa calculará el valor convertido según la tasa de cambio proporcionada y te mostrará el resultado en otro cuadro de diálogo.
6. Después de ver el resultado, se te preguntará si deseas continuar utilizando el programa. Si seleccionas "Sí", volverás al menú principal para realizar otra conversión o elegir otra función.
7. Si seleccionas "No", el programa mostrará un mensaje de despedida "Programa Terminado" y finalizará.

**Otra Función:**

Además de la función de "Convertidor de Moneda", el programa también ofrece la opción "Otra Función" en el menú principal. Sin embargo, actualmente esta opción solo muestra un cuadro de diálogo con el mensaje "Implementación de otra función". Puedes agregar tu propia lógica y funcionalidad en el método `anotherFunction()` para ampliar las capacidades del programa.

**Tasas de Conversión:**

El programa actualmente utiliza tasas de conversión de ejemplo para realizar las conversiones. Si deseas obtener resultados precisos, asegúrate de reemplazar el método `getConversionRate(selectedCurrency)` con las tasas de cambio reales de las monedas que deseas utilizar. Las tasas de conversión deben estar en relación con el valor de 1 Peso Colombiano a la moneda seleccionada.

**Requisitos:**
- Java SE Development Kit (JDK) instalado en tu computadora.
- Un IDE de Java (Eclipse, IntelliJ, NetBeans, etc.) para ejecutar el programa.

**Nota:**
Este programa ha sido creado con fines educativos y como una demostración básica de un convertidor de moneda.
