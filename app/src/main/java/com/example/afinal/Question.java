package com.example.afinal;

public class Question {
    public static String question[] = {
            "1. Para obtener una secuencia de fibonacci, ¿Cuál implementación es más eficiente?",
            "2. La empresa Grupo Élite está diseñando un proyecto para la Universidad Nacional de Panamá. Este proyecto consiste en poder implementar reconocimiento facial en las entradas del campus principal. El líder del proyecto solicita a los desarrolladores que puedan identificar el flujo del algoritmo. ¿Cuáles considera usted que son las entradas del algoritmo que van a identificar antes de desarrollar el proyecto? ",
            "3. Inicio \n" +
                    "  Mostrar \"Ingrese el topping de la pizza:\" \n" +

                    "  Leer topping \n" +

                    "  Mostrar \"Preparando la masa y agregando salsa y queso...\" \n" +

                    "  Si topping == \"pepperoni\" Entonces \n" +

                    "    Mostrar \"Pizza de Pepperoni.\" \n" +

                    "  Sino Si topping == \"piña\" Entonces \n" +

                    "    Mostrar \"Pizza Hawaiana.\" \n" +

                    "  Sino Si topping == \"pollo\" Entonces \n" +

                    "    Mostrar \"Pizza de Pollo.\" \n" +

                    "  Fin Si \n" +

                    "  Mostrar \"Horneando la pizza y listo para disfrutar.\" \n" +

                    "Fin \n" +
                    "\n" +
                    "¿Cuál es la función principal de la declaración \"Si topping == 'pepperoni' Entonces\" en el algoritmo? ",
            "4. ¿Qué hace este pseudocódigo? \n" +
                    "\n" +
                    "Start \n" +
                    "\n" +
                    "String var = “Diego Burgos, Luis Carreyó, Rocio Cortez, Chantal De Gracia, Eivar Morales.” \n" +
                    "\n" +
                    "Print (var) \n" +
                    "\n" +
                    "End \n" +
                    "\n" +
                    "Bullet ",
            "5. Inicio\n" +
                    "Variables mes, día \n" +
                    "Mostrar \"Bienvenido virgos\"\n" +
                    "Mostrar \"Introduce tu mes\"\n" +
                    "Leer mes\n" +
                    "Mostrar \"Introduce tu día\"\n" +
                    "Leer día \n" +
                    "Si (día>22 AND día<=31) entonces\n" +
                    "Si (mes = 8) entonces\n" +
                    "Imprimir \"Eres virgo de Agosto\"\n" +
                    "Si (día>0 AND día<=22) entonces\n" +
                    "Si (mes = 9) entonces\n" +
                    "Imprimir \"Eres virgo de Septiembre\"\n" +
                    "SiNo entonces\n" +
                    "imprimir \"No perteneces al signo virgo\"\n" +
                    "FinSi\n" +
                    "Fin\n" +
                    "¿Cuál es el output si los inputs son mes=8, día=1?\n"
    };
    public static String choices[][] = {
            {"Método iterativo", "Método recursivo", "Todas las anteriores", "Ninguna de las anteriores" },
            {"Imágenes faciales de los usuarios finales, base de datos de los rostros, modelado de las características faciales extraídas, parámetros de configuración (nivel de confianza, sensibilidad), información básica de los usuarios finales.",
                    "Comparación de características, clasificación de usuarios, comportamiento del usuario ante el sistema, procesamiento de imágenes y visión, registro y seguimiento de los usuarios finales, análisis de datos de los usuarios.",
                    "Todas las anteriores.", "Ninguna de las anteriores"},
            {"Verificar si el topping es igual a 'pepperoni'.", "Agregar pepperoni a la pizza.", "Mostrar el tipo de pizza como 'Pizza de Pepperoni'.", "Determinar si la pizza está lista para disfrutar."},
            {"Imprime el mensaje \"Diego Burgos, Luis Carreyó, Rocio Cortez, Chantal De Gracia, Eivar Morales.\" en la consola.",
                    "Declara una variable llamada \"var\" pero no realiza ninguna acción con ella.",
                    "No realiza ninguna acción, es un pseudocódigo incorrecto.",
                    "Declara una variable llamada \"var\" e imprime su valor en la consola."},
            {"No perteneces al signo virgo", "Eres virgo de septiembre", "Eres virgo de agosto", "Eres leo de agosto"}

    };
    public static String answers[] = {
            "Método iterativo",
            "Imágenes faciales de los usuarios finales, base de datos de los rostros, modelado de las características faciales extraídas, parámetros de configuración (nivel de confianza, sensibilidad), información básica de los usuarios finales.",
            "Mostrar el tipo de pizza como 'Pizza de Pepperoni'.",
            "2",
            "No perteneces al signo virgo"
    };
}