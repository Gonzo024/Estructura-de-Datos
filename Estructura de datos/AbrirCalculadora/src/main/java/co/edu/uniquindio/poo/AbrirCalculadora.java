package co.edu.uniquindio.poo;



    import java.io.IOException;

    public class AbrirCalculadora {
        public static void main(String[] args) {
            // Detectamos el sistema operativo
            String sistemaOperativo = System.getProperty("os.name").toLowerCase();

            ProcessBuilder processBuilder = null;

            try {
                if (sistemaOperativo.contains("win")) {
                    // Comando para Windows
                    System.out.println("Detectado Windows. Abriendo calculadora...");
                    processBuilder = new ProcessBuilder("calc.exe");

                } else if (sistemaOperativo.contains("nux") || sistemaOperativo.contains("nix")) {
                    // Comando para Linux (probamos con gnome-calculator, el más común)
                    System.out.println("Detectado Linux. Abriendo calculadora...");
                    processBuilder = new ProcessBuilder("gnome-calculator");

                } else {
                    System.out.println("Sistema operativo no soportado para este ejercicio.");
                    return;
                }

                // Iniciamos el proceso
                processBuilder.start();
                System.out.println("Calculadora abierta exitosamente.");

            } catch (IOException e) {
                System.err.println("Error al intentar abrir la calculadora.");
                System.err.println("Asegúrate de tener el comando instalado (ej. en Linux: sudo apt install gnome-calculator)");
                e.printStackTrace();
            }
        }
    }


